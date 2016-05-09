/**
 */
package edu.kit.ipd.sdq.cbsm.allocation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.allocation.Allocation#getAllocationContexts <em>Allocation Contexts</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.cbsm.allocation.AllocationPackage#getAllocation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AssemblyContextsConnectedByAssemblyConnectorAllocatedOnSameOrLinkedContainers'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot AssemblyContextsConnectedByAssemblyConnectorAllocatedOnSameOrLinkedContainers='\n\t\t\t\t-- get all AssemblyConnectors from System (assuming that only top-level\n\t\t\t\t-- AssemblyContexts are allocated\n\t\t\t\tself.allocationContexts->first().allocatedAssemblyContext.parentCompositeElement.\n\t\t\t\toclAsType(assembly::System).systemConnectors->select(connector|\n\t\t\t\t\tconnector.oclIsKindOf(assembly::AssemblyConnector))->forAll(assemblyConnector|\n\t\t\t\t\t\t-- get AllocationContexts for the two connected AssemblyContexts, check if\n\t\t\t\t\t\t-- same Container\n\t\t\t\t\t\tself.allocationContexts->select(allocationContext|\n\t\t\t\t\t\t\tallocationContext.allocatedAssemblyContext = assemblyConnector.oclAsType(\n\t\t\t\t\t\t\t\tassembly::AssemblyConnector).connectedProvidedAssemblyContext \n\t\t\t\t\t\t\tor allocationContext.allocatedAssemblyContext = assemblyConnector.oclAsType(\n\t\t\t\t\t\t\t\tassembly::AssemblyConnector).connectedRequiredAssemblyContext\n\t\t\t\t\t\t).allocatedContainer->asSet()->size() = 1 \n\t\t\t\t\t\t-- get all Links, check if there is one whose Containers contain both of the two\n\t\t\t\t\t\t-- connected AssemblyContexts\n\t\t\t\t\t\tor self.allocationContexts->first().allocatedContainer.parentEnvironment.links->exists(link|\n\t\t\t\t\t\t\t\tlink.linkedContainers->includes(assemblyConnector.\n\t\t\t\t\t\t\t\t\toclAsType(assembly::AssemblyConnector).connectedProvidedAssemblyContext\n\t\t\t\t\t\t\t\t)\n\t\t\t\t\t\t\t\tand link.linkedContainers->includes(assemblyConnector.\n\t\t\t\t\t\t\t\t\toclAsType(assembly::AssemblyConnector).connectedRequiredAssemblyContext\n\t\t\t\t\t\t\t\t)\n\t\t\t\t\t\t\t)\n\t\t\t\t\t)'"
 * @generated
 */
public interface Allocation extends EObject {
	/**
	 * Returns the value of the '<em><b>Allocation Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.cbsm.allocation.AllocationContext}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocation Contexts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocation Contexts</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.cbsm.allocation.AllocationPackage#getAllocation_AllocationContexts()
	 * @model containment="true"
	 * @generated
	 */
	EList<AllocationContext> getAllocationContexts();

} // Allocation
