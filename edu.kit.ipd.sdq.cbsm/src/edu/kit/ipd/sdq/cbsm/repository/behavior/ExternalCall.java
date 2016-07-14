/**
 */
package edu.kit.ipd.sdq.cbsm.repository.behavior;

import edu.kit.ipd.sdq.cbsm.repository.RequiredRole;
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
 *   <li>{@link edu.kit.ipd.sdq.cbsm.repository.behavior.ExternalCall#getRequiredRoleOfService <em>Required Role Of Service</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.BehaviorPackage#getExternalCall()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='RequiredRolesInterfaceContainsSignature'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot RequiredRolesInterfaceContainsSignature='\n\t\t\t\t\tself.requiredRoleOfService.requiredInterface.signatures->exists(signature|\n\t\t\t\t\t\tsignature = self.requiredService\n\t\t\t\t\t)'"
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

	/**
	 * Returns the value of the '<em><b>Required Role Of Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Role Of Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Role Of Service</em>' reference.
	 * @see #setRequiredRoleOfService(RequiredRole)
	 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.BehaviorPackage#getExternalCall_RequiredRoleOfService()
	 * @model required="true"
	 * @generated
	 */
	RequiredRole getRequiredRoleOfService();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.cbsm.repository.behavior.ExternalCall#getRequiredRoleOfService <em>Required Role Of Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Role Of Service</em>' reference.
	 * @see #getRequiredRoleOfService()
	 * @generated
	 */
	void setRequiredRoleOfService(RequiredRole value);

} // ExternalCall
