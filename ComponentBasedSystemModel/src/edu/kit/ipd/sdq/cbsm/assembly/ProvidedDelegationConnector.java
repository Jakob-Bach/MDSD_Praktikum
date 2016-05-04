/**
 */
package edu.kit.ipd.sdq.cbsm.assembly;

import edu.kit.ipd.sdq.cbsm.repository.ProvidedRole;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provided Delegation Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.assembly.ProvidedDelegationConnector#getInnerProvidedRole <em>Inner Provided Role</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.assembly.ProvidedDelegationConnector#getOuterProvidedRole <em>Outer Provided Role</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.cbsm.assembly.AssemblyPackage#getProvidedDelegationConnector()
 * @model
 * @generated
 */
public interface ProvidedDelegationConnector extends DelegationConnector {
	/**
	 * Returns the value of the '<em><b>Inner Provided Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inner Provided Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Provided Role</em>' reference.
	 * @see #setInnerProvidedRole(ProvidedRole)
	 * @see edu.kit.ipd.sdq.cbsm.assembly.AssemblyPackage#getProvidedDelegationConnector_InnerProvidedRole()
	 * @model required="true"
	 * @generated
	 */
	ProvidedRole getInnerProvidedRole();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.cbsm.assembly.ProvidedDelegationConnector#getInnerProvidedRole <em>Inner Provided Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Provided Role</em>' reference.
	 * @see #getInnerProvidedRole()
	 * @generated
	 */
	void setInnerProvidedRole(ProvidedRole value);

	/**
	 * Returns the value of the '<em><b>Outer Provided Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outer Provided Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer Provided Role</em>' reference.
	 * @see #setOuterProvidedRole(ProvidedRole)
	 * @see edu.kit.ipd.sdq.cbsm.assembly.AssemblyPackage#getProvidedDelegationConnector_OuterProvidedRole()
	 * @model required="true"
	 * @generated
	 */
	ProvidedRole getOuterProvidedRole();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.cbsm.assembly.ProvidedDelegationConnector#getOuterProvidedRole <em>Outer Provided Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer Provided Role</em>' reference.
	 * @see #getOuterProvidedRole()
	 * @generated
	 */
	void setOuterProvidedRole(ProvidedRole value);

} // ProvidedDelegationConnector
