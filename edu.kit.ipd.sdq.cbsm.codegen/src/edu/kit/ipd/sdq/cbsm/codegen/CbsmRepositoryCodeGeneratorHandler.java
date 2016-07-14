package edu.kit.ipd.sdq.cbsm.codegen;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Handles the context menu action defined in "plugin.xml" and delegates to
 * {@link CbsmRepositoryCodeGenerator} which performs the code generation.
 */
public class CbsmRepositoryCodeGeneratorHandler extends AbstractHandler {
	
	private CbsmRepositoryCodeGenerator generator;
	private JavaIoFileSystemAccess fsa;
	private ResourceSet resourceSet;
	
	public CbsmRepositoryCodeGeneratorHandler() {
		Injector injector = Guice.createInjector(new CbsmRepositoryCodeGeneratorModule());
		generator = injector.getInstance(CbsmRepositoryCodeGenerator.class);
		fsa = injector.getInstance(JavaIoFileSystemAccess.class);
		resourceSet = injector.getInstance(ResourceSet.class);
	}
	
	// based on a blog post and a forum thread by Christian Dietrich
	// https://christiandietrich.wordpress.com/2011/10/15/xtext-calling-the-generator-from-a-context-menu/
	// https://www.eclipse.org/forums/index.php/t/628292/
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// Get the .repository file on which the generation action was triggered.
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
            Object firstElement = structuredSelection.getFirstElement();
            if (firstElement instanceof IFile) {
                IFile file = (IFile) firstElement;
                // Generate code to a sub-directory "src-gen" which is located in the
                // same directory as the input file.
                fsa.setOutputPath(file.getLocation().removeLastSegments(1).
                		append("/src-gen/").toPortableString());
                URI uri = URI.createPlatformResourceURI(file.getFullPath().
                		toPortableString(), true);
                // Remove older version of file from resource set (file might be 
                // changed since the last code generation).
                resourceSet.getResources().clear();
                Resource resource = resourceSet.getResource(uri, true);
                // actual code generation
                generator.doGenerate(resource, fsa);
                try {
                	// "F5" action for project
                	file.getProject().refreshLocal(IResource.DEPTH_INFINITE, null);
                } catch (CoreException e) {
                	e.printStackTrace();
                }
            }
        }
        return null;
    }

}
