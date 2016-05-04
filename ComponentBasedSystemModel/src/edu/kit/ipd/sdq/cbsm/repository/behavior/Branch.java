/**
 */
package edu.kit.ipd.sdq.cbsm.repository.behavior;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.repository.behavior.Branch#getBranchPaths <em>Branch Paths</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.BehaviorPackage#getBranch()
 * @model
 * @generated
 */
public interface Branch extends Action {
	/**
	 * Returns the value of the '<em><b>Branch Paths</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.cbsm.repository.behavior.BranchPath}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Branch Paths</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch Paths</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.BehaviorPackage#getBranch_BranchPaths()
	 * @model containment="true"
	 * @generated
	 */
	EList<BranchPath> getBranchPaths();

} // Branch
