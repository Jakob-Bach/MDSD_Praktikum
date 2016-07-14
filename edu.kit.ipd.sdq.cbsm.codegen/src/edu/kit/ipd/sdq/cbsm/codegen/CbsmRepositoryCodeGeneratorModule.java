package edu.kit.ipd.sdq.cbsm.codegen;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule;

/**
 * Contains some configuration stuff which is used for dependency injection
 * in {@link CbsmRepositoryCodeGeneratorHandler}.
 */
public class CbsmRepositoryCodeGeneratorModule extends AbstractGenericResourceRuntimeModule {

	@Override
    protected String getLanguageName() {
        return "edu.kit.ipd.sdq.cbsm.repository.presentation.RepositoryEditorID";
    }
 
    @Override
    protected String getFileExtensions() {
        return "repository";
    }
 
    public Class<? extends IGenerator> bindIGenerator() {
        return CbsmRepositoryCodeGenerator.class;
    }
 
    public Class<? extends ResourceSet> bindResourceSet() {
        return ResourceSetImpl.class;
    }
}
