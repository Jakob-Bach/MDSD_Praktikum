/**
 *
 * $Id$
 */
package edu.kit.ipd.sdq.cbsm.repository.validation;

import edu.kit.ipd.sdq.cbsm.repository.Interface;

/**
 * A sample validator interface for {@link edu.kit.ipd.sdq.cbsm.repository.ProvidedRole}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ProvidedRoleValidator {
	boolean validate();

	boolean validateProvidedInterface(Interface value);
}
