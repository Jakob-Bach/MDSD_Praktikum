package edu.kit.ipd.sdq.cbsm.codegen

import org.eclipse.emf.ecore.resource.Resource
import edu.kit.ipd.sdq.cbsm.repository.Interface
import edu.kit.ipd.sdq.cbsm.repository.Repository
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess

class CbsmRepositoryCodeGenerator implements IGenerator {
	
	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		EcoreUtil.resolveAll(resource)
		resource.contents.filter(Repository).forEach[repository|
			repository.interfaces.forEach[interfac|
				fsa.generateFile(interfac.name + '.java', interfac.compile)
			]
		]
	}
	
	def compile(Interface interfac) '''
		public interface «interfac.name» {
			
		}
	'''
}