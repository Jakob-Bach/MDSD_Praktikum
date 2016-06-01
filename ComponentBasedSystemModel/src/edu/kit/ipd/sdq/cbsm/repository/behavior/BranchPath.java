/**
 */
package edu.kit.ipd.sdq.cbsm.repository.behavior;

import edu.kit.ipd.sdq.cbsm.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branch Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.repository.behavior.BranchPath#getBranchBehavior <em>Branch Behavior</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.BehaviorPackage#getBranchPath()
 * @model
 * @generated
 */
public interface BranchPath extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Branch Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Branch Behavior</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch Behavior</em>' containment reference.
	 * @see #setBranchBehavior(BehaviorDescription)
	 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.BehaviorPackage#getBranchPath_BranchBehavior()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BehaviorDescription getBranchBehavior();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.cbsm.repository.behavior.BranchPath#getBranchBehavior <em>Branch Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branch Behavior</em>' containment reference.
	 * @see #getBranchBehavior()
	 * @generated
	 */
	void setBranchBehavior(BehaviorDescription value);

} // BranchPath
