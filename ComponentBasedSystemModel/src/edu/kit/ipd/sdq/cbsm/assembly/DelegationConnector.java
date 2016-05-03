/**
 */
package edu.kit.ipd.sdq.cbsm.assembly;

import edu.kit.ipd.sdq.cbsm.repository.Interface;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delegation Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.assembly.DelegationConnector#getProvidedRole <em>Provided Role</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.assembly.DelegationConnector#getProvidedInterface <em>Provided Interface</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.assembly.DelegationConnector#getRequiredInterface <em>Required Interface</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.assembly.DelegationConnector#getRequiredRole <em>Required Role</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.cbsm.assembly.AssemblyPackage#getDelegationConnector()
 * @model
 * @generated
 */
public interface DelegationConnector extends EObject {
	/**
	 * Returns the value of the '<em><b>Provided Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Role</em>' reference.
	 * @see #setProvidedRole(ProvidedRole)
	 * @see edu.kit.ipd.sdq.cbsm.assembly.AssemblyPackage#getDelegationConnector_ProvidedRole()
	 * @model
	 * @generated
	 */
	ProvidedRole getProvidedRole();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.cbsm.assembly.DelegationConnector#getProvidedRole <em>Provided Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Role</em>' reference.
	 * @see #getProvidedRole()
	 * @generated
	 */
	void setProvidedRole(ProvidedRole value);

	/**
	 * Returns the value of the '<em><b>Provided Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Interface</em>' reference.
	 * @see #setProvidedInterface(Interface)
	 * @see edu.kit.ipd.sdq.cbsm.assembly.AssemblyPackage#getDelegationConnector_ProvidedInterface()
	 * @model
	 * @generated
	 */
	Interface getProvidedInterface();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.cbsm.assembly.DelegationConnector#getProvidedInterface <em>Provided Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Interface</em>' reference.
	 * @see #getProvidedInterface()
	 * @generated
	 */
	void setProvidedInterface(Interface value);

	/**
	 * Returns the value of the '<em><b>Required Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Interface</em>' reference.
	 * @see #setRequiredInterface(Interface)
	 * @see edu.kit.ipd.sdq.cbsm.assembly.AssemblyPackage#getDelegationConnector_RequiredInterface()
	 * @model
	 * @generated
	 */
	Interface getRequiredInterface();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.cbsm.assembly.DelegationConnector#getRequiredInterface <em>Required Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Interface</em>' reference.
	 * @see #getRequiredInterface()
	 * @generated
	 */
	void setRequiredInterface(Interface value);

	/**
	 * Returns the value of the '<em><b>Required Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Role</em>' reference.
	 * @see #setRequiredRole(RequiredRole)
	 * @see edu.kit.ipd.sdq.cbsm.assembly.AssemblyPackage#getDelegationConnector_RequiredRole()
	 * @model
	 * @generated
	 */
	RequiredRole getRequiredRole();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.cbsm.assembly.DelegationConnector#getRequiredRole <em>Required Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Role</em>' reference.
	 * @see #getRequiredRole()
	 * @generated
	 */
	void setRequiredRole(RequiredRole value);

} // DelegationConnector
