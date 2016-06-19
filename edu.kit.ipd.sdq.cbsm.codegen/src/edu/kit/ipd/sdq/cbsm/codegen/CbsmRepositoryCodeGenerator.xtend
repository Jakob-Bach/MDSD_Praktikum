package edu.kit.ipd.sdq.cbsm.codegen

import edu.kit.ipd.sdq.cbsm.repository.ComplexType
import edu.kit.ipd.sdq.cbsm.repository.Interface
import edu.kit.ipd.sdq.cbsm.repository.Repository
import edu.kit.ipd.sdq.cbsm.repository.SimpleType
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import edu.kit.ipd.sdq.cbsm.repository.Signature
import edu.kit.ipd.sdq.cbsm.repository.Component
import edu.kit.ipd.sdq.cbsm.repository.DataType
import edu.kit.ipd.sdq.cbsm.repository.Parameter

class CbsmRepositoryCodeGenerator implements IGenerator {
	
	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		EcoreUtil.resolveAll(resource)
		resource.contents.filter(Repository).forEach[repository|
			repository.interfaces.forEach[interfac|
				fsa.generateFile(repository.name + '/' + interfac.name + '.java',
					interfac.compile(repository.name))
			]
		]
	}
	
	def compile(Component component)  '''
	
	'''
	
	def compile(Interface interfac, String repositoryName) '''
		package «repositoryName»;
		
		public interface «interfac.name» {
			
			«FOR signature: interfac.signatures»
				«signature.compile»
				
			«ENDFOR»
		}
	'''
	
	def compile(Signature signature) '''
		«signature.returnType.compile» «signature.name»(«FOR parameter: signature.parameters SEPARATOR ', '»«parameter.compile»«ENDFOR»);
	'''
	
	def compile(Parameter parameter) '''
		«parameter.type.compile» «parameter.name»'''
	
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
				case LIST: 'java.util.List'
				case LONG: 'long'
				case MAP: 'java.util.Map'
				case STRING: 'String'
			}
		}
	}
}