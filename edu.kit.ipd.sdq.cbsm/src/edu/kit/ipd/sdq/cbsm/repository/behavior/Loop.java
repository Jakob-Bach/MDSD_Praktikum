/**
 */
package edu.kit.ipd.sdq.cbsm.repository.behavior;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.repository.behavior.Loop#getLoopBehavior <em>Loop Behavior</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.BehaviorPackage#getLoop()
 * @model
 * @generated
 */
public interface Loop extends Action {
	/**
	 * Returns the value of the '<em><b>Loop Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop Behavior</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Behavior</em>' containment reference.
	 * @see #setLoopBehavior(BehaviorDescription)
	 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.BehaviorPackage#getLoop_LoopBehavior()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BehaviorDescription getLoopBehavior();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.cbsm.repository.behavior.Loop#getLoopBehavior <em>Loop Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Behavior</em>' containment reference.
	 * @see #getLoopBehavior()
	 * @generated
	 */
	void setLoopBehavior(BehaviorDescription value);

} // Loop
