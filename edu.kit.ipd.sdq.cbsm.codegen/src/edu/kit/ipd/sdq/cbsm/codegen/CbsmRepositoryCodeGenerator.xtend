package edu.kit.ipd.sdq.cbsm.codegen

import edu.kit.ipd.sdq.cbsm.repository.ComplexType
import edu.kit.ipd.sdq.cbsm.repository.Component
import edu.kit.ipd.sdq.cbsm.repository.DataType
import edu.kit.ipd.sdq.cbsm.repository.Interface
import edu.kit.ipd.sdq.cbsm.repository.Parameter
import edu.kit.ipd.sdq.cbsm.repository.ProvidedRole
import edu.kit.ipd.sdq.cbsm.repository.Repository
import edu.kit.ipd.sdq.cbsm.repository.Signature
import edu.kit.ipd.sdq.cbsm.repository.SimpleType
import java.util.Collection
import java.util.LinkedList
import java.util.TreeSet
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

class CbsmRepositoryCodeGenerator implements IGenerator {
	
	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		EcoreUtil.resolveAll(resource)
		resource.contents.filter(Repository).forEach[repository|
			// Transform the contents of the repository.
			// Data types are transformed where they are used as parameters
			// and ComplexTypes should not be considered.
			repository.interfaces.forEach[interfac|
				fsa.generateFile(repository.name + '/' + interfac.name + '.java',
					interfac.compile(repository.name))
			]
			repository.components.forEach[component|
				fsa.generateFile(component.name + '/' + component.name + 'Impl.java',
					component.compile(repository.name))
			]
			// One helper class per repository that provides null-check routines
			// for the attributes related to required roles.
			fsa.generateFile(repository.name + '/Helper.java', repository.compile)
		]
	}
	
	def compile(Repository repository) '''
		package �repository.name�;
		
		public class Helper {
			
			public static void assertNull(Object object) {
				assert object == null;
			}
			
			public static void assertNotNull(Object object) {
				assert object != null;
			}
			
		}
	'''
	
	def compile(Component component, String repositoryName)  '''
		package �component.name�;
		
		�FOR interfaceName: component.uniqueSortedInterfaceNames�
			import �repositoryName�.�interfaceName�;
		�ENDFOR�
		�IF !component.requiredRoles.empty�
			import �repositoryName�.Helper;
		�ENDIF�
		
		public class �component.name�Impl �IF !component.providedRoles.empty�implements �FOR providedRole: component.providedRoles SEPARATOR ', '��providedRole.providedInterface.name��ENDFOR� �ENDIF�{
			
			�FOR requiredRole: component.requiredRoles�
				private �requiredRole.requiredInterface.name� �requiredRole.requiredInterface.name.toFirstLower�;
			�ENDFOR�
			
			�FOR requiredRole: component.requiredRoles SEPARATOR '\n'�
				public void set�requiredRole.requiredInterface.name�(�requiredRole.requiredInterface.name� �requiredRole.requiredInterface.name.toFirstLower�) {
					Helper.assertNull(this.�requiredRole.requiredInterface.name.toFirstLower�);
					this.�requiredRole.requiredInterface.name.toFirstLower� = �requiredRole.requiredInterface.name.toFirstLower�;
				}
			�ENDFOR�
			
			�FOR providedInterface: component.providedRoles.providedInterfacesAndSignaturesRecursive SEPARATOR '\n'�
				�FOR signature: providedInterface.signatures SEPARATOR '\n'�
					//Implementing �signature.name� from interface �providedInterface.name�
					@Override
					public �signature.compile� {
						�FOR requiredRole: component.requiredRoles�
							Helper.assertNotNull(this.�requiredRole.requiredInterface.name.toFirstLower�);
						�ENDFOR�
						// TODO: Insert code here
						�IF signature.returnType != null�
							return �signature.returnType.defaultReturnValue�;
						�ENDIF�
					}
				�ENDFOR�
			�ENDFOR�
		}
	'''
	
	/**
	 * Removes duplicates from the combined list of provided and required interfaces
	 * (an interface might be both provided and required) and sorts the result.
	 */
	def uniqueSortedInterfaceNames(Component component) {
		val result = new TreeSet<String>
		component.providedRoles.forEach[providedRole|
			result += providedRole.providedInterface.name
		]
		component.requiredRoles.forEach[requiredRole|
			result += requiredRole.requiredInterface.name
		]
		return result
	}
	
	/**
	 * Returns a list with all provided interfaces, considering that provided interfaces 
	 * might have super-interfaces (transitive closure).
	 */
	def providedInterfacesAndSignaturesRecursive(Collection<ProvidedRole> providedRoles) {
		val result = new LinkedList<Interface>
		val interfacesToAnalyze = new LinkedList<Interface>
		providedRoles.forEach[providedRole|
			interfacesToAnalyze += providedRole.providedInterface
		]
		while (!interfacesToAnalyze.empty) {
			val interfac = interfacesToAnalyze.remove
			if (!result.contains(interfac)) {
				result += interfac
			}
			interfacesToAnalyze += interfac.superInterfaces
		}
		return result
	}

	def compile(Interface interfac, String repositoryName) '''
		package �repositoryName�;
		
		public interface �interfac.name� �IF !interfac.superInterfaces.empty�extends �FOR superInterface: interfac.superInterfaces SEPARATOR ', '��superInterface.name��ENDFOR� �ENDIF�{
			
			�FOR signature: interfac.signatures�
				�signature.compile�;
				
			�ENDFOR�
		}
	'''
	
	def compile(Signature signature) '''
		�signature.returnType.compile� �signature.name�(�FOR parameter: signature.parameters SEPARATOR ', '��parameter.compile��ENDFOR�)'''
	
	def compile(Parameter parameter) '''
		�parameter.type.compile� �parameter.name�'''
	
	def compile(DataType dataType) {
		if (dataType == null) {
			return 'void'
		} else if (dataType instanceof ComplexType) {
			return 'Object'
		} else if (dataType instanceof SimpleType) {
			switch dataType.typeInstance {
				case BOOLEAN: 'boolean'
				case CHAR: 'char'
				case DATE: 'java.util.Date'
				case DOUBLE: 'double'
				case FLOAT: 'float'
				case INT: 'int'
				case LIST: 'java.util.List<?>'
				case LONG: 'long'
				case MAP: 'java.util.Map<?,?>'
				case STRING: 'java.lang.String'
			}
		}
	}
	
	def defaultReturnValue(DataType dataType) {
		if (dataType == null) {
			return '' // void methods can have a return; statement
		} else if (dataType instanceof ComplexType) {
			return 'null'
		} else if (dataType instanceof SimpleType) {
			switch dataType.typeInstance {
				case BOOLEAN: 'false'
				case CHAR: '0'
				case DATE: 'null'
				case DOUBLE: '0.0'
				case FLOAT: '0.0f'
				case INT: '0'
				case LIST: 'null'
				case LONG: '0L'
				case MAP: 'null'
				case STRING: 'null'
			}
		}
	}
}