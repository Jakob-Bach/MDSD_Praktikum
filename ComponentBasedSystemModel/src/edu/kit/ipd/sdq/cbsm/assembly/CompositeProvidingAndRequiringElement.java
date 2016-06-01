/**
 */
package edu.kit.ipd.sdq.cbsm.assembly;

import edu.kit.ipd.sdq.cbsm.repository.ProvidingAndRequiringElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Providing And Requiring Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.assembly.CompositeProvidingAndRequiringElement#getContainedAssemblyContexts <em>Contained Assembly Contexts</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.assembly.CompositeProvidingAndRequiringElement#getConnectors <em>Connectors</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.cbsm.assembly.AssemblyPackage#getCompositeProvidingAndRequiringElement()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='CompositeElementDoesNotContainItself'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot CompositeElementDoesNotContainItself='self.containedAssemblyContexts->forAll(assemblyContext|\n\t\t\t\tassemblyContext.instantiatedComponent <> self\n\t\t\t)'"
 * @generated
 */
public interface CompositeProvidingAndRequiringElement extends ProvidingAndRequiringElement {
	/**
	 * Returns the value of the '<em><b>Contained Assembly Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.cbsm.assembly.AssemblyContext}.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.cbsm.assembly.AssemblyContext#getParentCompositeElement <em>Parent Composite Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Assembly Contexts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Assembly Contexts</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.cbsm.assembly.AssemblyPackage#getCompositeProvidingAndRequiringElement_ContainedAssemblyContexts()
	 * @see edu.kit.ipd.sdq.cbsm.assembly.AssemblyContext#getParentCompositeElement
	 * @model opposite="parentCompositeElement" containment="true"
	 * @generated
	 */
	EList<AssemblyContext> getContainedAssemblyContexts();

	/**
	 * Returns the value of the '<em><b>Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.cbsm.assembly.Connector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectors</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.cbsm.assembly.AssemblyPackage#getCompositeProvidingAndRequiringElement_Connectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connector> getConnectors();

} // CompositeProvidingAndRequiringElement
