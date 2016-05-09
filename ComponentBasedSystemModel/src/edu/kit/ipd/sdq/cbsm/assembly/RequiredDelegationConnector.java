/**
 */
package edu.kit.ipd.sdq.cbsm.assembly;

import edu.kit.ipd.sdq.cbsm.repository.RequiredRole;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Delegation Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.assembly.RequiredDelegationConnector#getInnerRequiredRole <em>Inner Required Role</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.assembly.RequiredDelegationConnector#getOuterRequiredRole <em>Outer Required Role</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.cbsm.assembly.AssemblyPackage#getRequiredDelegationConnector()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='InnerRoleBelongsToInnerAssemblyContext OuterRoleBelongsToOuterAssemblyContext SameInterfaceIsDelegatedAsRequired'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot InnerRoleBelongsToInnerAssemblyContext='self.innerAssemblyContext.assemblyContextRequiredRoles->exists(role| \n\t\t\t\trole = self.innerRequiredRole\n\t\t\t)' OuterRoleBelongsToOuterAssemblyContext='self.outerAssemblyContext.assemblyContextRequiredRoles->exists(role| \n\t\t\t\trole = self.outerRequiredRole\n\t\t\t)' SameInterfaceIsDelegatedAsRequired='self.outerRequiredRole.requiredInterface = \n\t\t\t\tself.innerRequiredRole.requiredInterface'"
 * @generated
 */
public interface RequiredDelegationConnector extends DelegationConnector {
	/**
	 * Returns the value of the '<em><b>Inner Required Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inner Required Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Required Role</em>' reference.
	 * @see #setInnerRequiredRole(RequiredRole)
	 * @see edu.kit.ipd.sdq.cbsm.assembly.AssemblyPackage#getRequiredDelegationConnector_InnerRequiredRole()
	 * @model required="true"
	 * @generated
	 */
	RequiredRole getInnerRequiredRole();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.cbsm.assembly.RequiredDelegationConnector#getInnerRequiredRole <em>Inner Required Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Required Role</em>' reference.
	 * @see #getInnerRequiredRole()
	 * @generated
	 */
	void setInnerRequiredRole(RequiredRole value);

	/**
	 * Returns the value of the '<em><b>Outer Required Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outer Required Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer Required Role</em>' reference.
	 * @see #setOuterRequiredRole(RequiredRole)
	 * @see edu.kit.ipd.sdq.cbsm.assembly.AssemblyPackage#getRequiredDelegationConnector_OuterRequiredRole()
	 * @model required="true"
	 * @generated
	 */
	RequiredRole getOuterRequiredRole();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.cbsm.assembly.RequiredDelegationConnector#getOuterRequiredRole <em>Outer Required Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer Required Role</em>' reference.
	 * @see #getOuterRequiredRole()
	 * @generated
	 */
	void setOuterRequiredRole(RequiredRole value);

} // RequiredDelegationConnector
