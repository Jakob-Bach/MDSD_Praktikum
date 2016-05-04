/**
 */
package edu.kit.ipd.sdq.cbsm.repository.behavior;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.repository.behavior.Loop#getLoopActions <em>Loop Actions</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.BehaviorPackage#getLoop()
 * @model
 * @generated
 */
public interface Loop extends Action {
	/**
	 * Returns the value of the '<em><b>Loop Actions</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.cbsm.repository.behavior.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Actions</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.BehaviorPackage#getLoop_LoopActions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getLoopActions();

} // Loop
