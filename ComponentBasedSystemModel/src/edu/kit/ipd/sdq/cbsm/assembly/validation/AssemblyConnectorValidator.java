/**
 *
 * $Id$
 */
package edu.kit.ipd.sdq.cbsm.assembly.validation;

import edu.kit.ipd.sdq.cbsm.assembly.AssemblyContext;

import edu.kit.ipd.sdq.cbsm.repository.ProvidedRole;
import edu.kit.ipd.sdq.cbsm.repository.RequiredRole;

/**
 * A sample validator interface for {@link edu.kit.ipd.sdq.cbsm.assembly.AssemblyConnector}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AssemblyConnectorValidator {
	boolean validate();

	boolean validateConnectedProvidedRole(ProvidedRole value);
	boolean validateConnectedRequiredRole(RequiredRole value);
	boolean validateConnectedProvidedAssemblyContext(AssemblyContext value);
	boolean validateConnectedRequiredAssemblyContext(AssemblyContext value);
}
