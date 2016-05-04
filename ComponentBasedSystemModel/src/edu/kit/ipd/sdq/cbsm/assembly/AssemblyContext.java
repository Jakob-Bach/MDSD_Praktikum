/**
 */
package edu.kit.ipd.sdq.cbsm.assembly;

import edu.kit.ipd.sdq.cbsm.core.NamedElement;

import edu.kit.ipd.sdq.cbsm.repository.Component;

import edu.kit.ipd.sdq.cbsm.repository.ProvidedRole;
import edu.kit.ipd.sdq.cbsm.repository.RequiredRole;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.assembly.AssemblyContext#getInstantiatedComponent <em>Instantiated Component</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.assembly.AssemblyContext#getProvidedRoles <em>Provided Roles</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.assembly.AssemblyContext#getRequiredRoles <em>Required Roles</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.cbsm.assembly.AssemblyPackage#getAssemblyContext()
 * @model
 * @generated
 */
public interface AssemblyContext extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Instantiated Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instantiated Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantiated Component</em>' reference.
	 * @see #setInstantiatedComponent(Component)
	 * @see edu.kit.ipd.sdq.cbsm.assembly.AssemblyPackage#getAssemblyContext_InstantiatedComponent()
	 * @model required="true"
	 * @generated
	 */
	Component getInstantiatedComponent();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.cbsm.assembly.AssemblyContext#getInstantiatedComponent <em>Instantiated Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instantiated Component</em>' reference.
	 * @see #getInstantiatedComponent()
	 * @generated
	 */
	void setInstantiatedComponent(Component value);

	/**
	 * Returns the value of the '<em><b>Provided Roles</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.cbsm.repository.ProvidedRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Roles</em>' reference list.
	 * @see edu.kit.ipd.sdq.cbsm.assembly.AssemblyPackage#getAssemblyContext_ProvidedRoles()
	 * @model
	 * @generated
	 */
	EList<ProvidedRole> getProvidedRoles();

	/**
	 * Returns the value of the '<em><b>Required Roles</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.cbsm.repository.RequiredRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Roles</em>' reference list.
	 * @see edu.kit.ipd.sdq.cbsm.assembly.AssemblyPackage#getAssemblyContext_RequiredRoles()
	 * @model
	 * @generated
	 */
	EList<RequiredRole> getRequiredRoles();

} // AssemblyContext
