/**
 */
package edu.kit.ipd.sdq.cbsm.repository.behavior;

import edu.kit.ipd.sdq.cbsm.core.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branch Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.repository.behavior.BranchPath#getPathActions <em>Path Actions</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.BehaviorPackage#getBranchPath()
 * @model
 * @generated
 */
public interface BranchPath extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Path Actions</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.cbsm.repository.behavior.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Actions</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.BehaviorPackage#getBranchPath_PathActions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getPathActions();

} // BranchPath
