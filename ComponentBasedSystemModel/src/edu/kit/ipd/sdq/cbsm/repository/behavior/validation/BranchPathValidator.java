/**
 *
 * $Id$
 */
package edu.kit.ipd.sdq.cbsm.repository.behavior.validation;

import edu.kit.ipd.sdq.cbsm.repository.behavior.Action;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link edu.kit.ipd.sdq.cbsm.repository.behavior.BranchPath}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface BranchPathValidator {
	boolean validate();

	boolean validatePathActions(EList<Action> value);
}
