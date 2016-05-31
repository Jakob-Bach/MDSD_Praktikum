/**
 *
 * $Id$
 */
package edu.kit.ipd.sdq.cbsm.assembly.validation;

import edu.kit.ipd.sdq.cbsm.assembly.Connector;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link edu.kit.ipd.sdq.cbsm.assembly.System}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SystemValidator {
	boolean validate();

	boolean validateSystemConnectors(EList<Connector> value);
}
