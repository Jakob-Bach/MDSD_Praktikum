/**
 */
package edu.kit.ipd.sdq.cbsm.assembly;

import edu.kit.ipd.sdq.cbsm.repository.ProvidedRole;
import edu.kit.ipd.sdq.cbsm.repository.RequiredRole;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.assembly.AssemblyConnector#getConnectedProvidedRole <em>Connected Provided Role</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.assembly.AssemblyConnector#getConnectedRequiredRole <em>Connected Required Role</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.assembly.AssemblyConnector#getConnectedProvidedAssemblyContext <em>Connected Provided Assembly Context</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.assembly.AssemblyConnector#getConnectedRequiredAssemblyContext <em>Connected Required Assembly Context</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.cbsm.assembly.AssemblyPackage#getAssemblyConnector()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ProvidedRoleBelongsToProvidedAssemblyContext RequiredRoleBelongsToRequiredAssemblyContext SameInterfaceInConnectedRoles DifferentContextsOfConnectedRoles'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ProvidedRoleBelongsToProvidedAssemblyContext='self.connectedProvidedAssemblyContext.assemblyContextProvidedRoles\n\t\t\t\t->includes(self.connectedProvidedRole\n\t\t\t)' RequiredRoleBelongsToRequiredAssemblyContext='self.connectedRequiredAssemblyContext.assemblyContextRequiredRoles\n\t\t\t\t->includes(self.connectedRequiredRole\n\t\t\t)' SameInterfaceInConnectedRoles='self.connectedProvidedRole.providedInterface =\n\t\t\t\tself.connectedRequiredRole.requiredInterface' DifferentContextsOfConnectedRoles='self.connectedProvidedAssemblyContext <> \n\t\t\t\tself.connectedRequiredAssemblyContext'"
 * @generated
 */
public interface AssemblyConnector extends Connector {
	/**
	 * Returns the value of the '<em><b>Connected Provided Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected Provided Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected Provided Role</em>' reference.
	 * @see #setConnectedProvidedRole(ProvidedRole)
	 * @see edu.kit.ipd.sdq.cbsm.assembly.AssemblyPackage#getAssemblyConnector_ConnectedProvidedRole()
	 * @model required="true"
	 * @generated
	 */
	ProvidedRole getConnectedProvidedRole();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.cbsm.assembly.AssemblyConnector#getConnectedProvidedRole <em>Connected Provided Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connected Provided Role</em>' reference.
	 * @see #getConnectedProvidedRole()
	 * @generated
	 */
	void setConnectedProvidedRole(ProvidedRole value);

	/**
	 * Returns the value of the '<em><b>Connected Required Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected Required Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected Required Role</em>' reference.
	 * @see #setConnectedRequiredRole(RequiredRole)
	 * @see edu.kit.ipd.sdq.cbsm.assembly.AssemblyPackage#getAssemblyConnector_ConnectedRequiredRole()
	 * @model required="true"
	 * @generated
	 */
	RequiredRole getConnectedRequiredRole();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.cbsm.assembly.AssemblyConnector#getConnectedRequiredRole <em>Connected Required Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connected Required Role</em>' reference.
	 * @see #getConnectedRequiredRole()
	 * @generated
	 */
	void setConnectedRequiredRole(RequiredRole value);

	/**
	 * Returns the value of the '<em><b>Connected Provided Assembly Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected Provided Assembly Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected Provided Assembly Context</em>' reference.
	 * @see #setConnectedProvidedAssemblyContext(AssemblyContext)
	 * @see edu.kit.ipd.sdq.cbsm.assembly.AssemblyPackage#getAssemblyConnector_ConnectedProvidedAssemblyContext()
	 * @model required="true"
	 * @generated
	 */
	AssemblyContext getConnectedProvidedAssemblyContext();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.cbsm.assembly.AssemblyConnector#getConnectedProvidedAssemblyContext <em>Connected Provided Assembly Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connected Provided Assembly Context</em>' reference.
	 * @see #getConnectedProvidedAssemblyContext()
	 * @generated
	 */
	void setConnectedProvidedAssemblyContext(AssemblyContext value);

	/**
	 * Returns the value of the '<em><b>Connected Required Assembly Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected Required Assembly Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected Required Assembly Context</em>' reference.
	 * @see #setConnectedRequiredAssemblyContext(AssemblyContext)
	 * @see edu.kit.ipd.sdq.cbsm.assembly.AssemblyPackage#getAssemblyConnector_ConnectedRequiredAssemblyContext()
	 * @model required="true"
	 * @generated
	 */
	AssemblyContext getConnectedRequiredAssemblyContext();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.cbsm.assembly.AssemblyConnector#getConnectedRequiredAssemblyContext <em>Connected Required Assembly Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connected Required Assembly Context</em>' reference.
	 * @see #getConnectedRequiredAssemblyContext()
	 * @generated
	 */
	void setConnectedRequiredAssemblyContext(AssemblyContext value);

} // AssemblyConnector
