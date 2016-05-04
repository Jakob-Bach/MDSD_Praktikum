/**
 */
package edu.kit.ipd.sdq.cbsm.repository.behavior;

import edu.kit.ipd.sdq.cbsm.repository.Signature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.repository.behavior.ExternalCall#getRequiredService <em>Required Service</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.BehaviorPackage#getExternalCall()
 * @model
 * @generated
 */
public interface ExternalCall extends Action {
	/**
	 * Returns the value of the '<em><b>Required Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Service</em>' reference.
	 * @see #setRequiredService(Signature)
	 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.BehaviorPackage#getExternalCall_RequiredService()
	 * @model required="true"
	 * @generated
	 */
	Signature getRequiredService();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.cbsm.repository.behavior.ExternalCall#getRequiredService <em>Required Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Service</em>' reference.
	 * @see #getRequiredService()
	 * @generated
	 */
	void setRequiredService(Signature value);

} // ExternalCall
