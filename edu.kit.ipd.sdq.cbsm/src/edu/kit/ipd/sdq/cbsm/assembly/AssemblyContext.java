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
 *   <li>{@link edu.kit.ipd.sdq.cbsm.assembly.AssemblyContext#getAssemblyContextProvidedRoles <em>Assembly Context Provided Roles</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.assembly.AssemblyContext#getAssemblyContextRequiredRoles <em>Assembly Context Required Roles</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.assembly.AssemblyContext#getParentCompositeElement <em>Parent Composite Element</em>}</li>
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
	 * Returns the value of the '<em><b>Assembly Context Provided Roles</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.cbsm.repository.ProvidedRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assembly Context Provided Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly Context Provided Roles</em>' reference list.
	 * @see edu.kit.ipd.sdq.cbsm.assembly.AssemblyPackage#getAssemblyContext_AssemblyContextProvidedRoles()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='self.instantiatedComponent.providedRoles'"
	 * @generated
	 */
	EList<ProvidedRole> getAssemblyContextProvidedRoles();

	/**
	 * Returns the value of the '<em><b>Assembly Context Required Roles</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.cbsm.repository.RequiredRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assembly Context Required Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly Context Required Roles</em>' reference list.
	 * @see edu.kit.ipd.sdq.cbsm.assembly.AssemblyPackage#getAssemblyContext_AssemblyContextRequiredRoles()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='self.instantiatedComponent.requiredRoles'"
	 * @generated
	 */
	EList<RequiredRole> getAssemblyContextRequiredRoles();

	/**
	 * Returns the value of the '<em><b>Parent Composite Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.cbsm.assembly.CompositeProvidingAndRequiringElement#getContainedAssemblyContexts <em>Contained Assembly Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Composite Element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Composite Element</em>' container reference.
	 * @see #setParentCompositeElement(CompositeProvidingAndRequiringElement)
	 * @see edu.kit.ipd.sdq.cbsm.assembly.AssemblyPackage#getAssemblyContext_ParentCompositeElement()
	 * @see edu.kit.ipd.sdq.cbsm.assembly.CompositeProvidingAndRequiringElement#getContainedAssemblyContexts
	 * @model opposite="containedAssemblyContexts" required="true" transient="false"
	 * @generated
	 */
	CompositeProvidingAndRequiringElement getParentCompositeElement();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.cbsm.assembly.AssemblyContext#getParentCompositeElement <em>Parent Composite Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Composite Element</em>' container reference.
	 * @see #getParentCompositeElement()
	 * @generated
	 */
	void setParentCompositeElement(CompositeProvidingAndRequiringElement value);

} // AssemblyContext
