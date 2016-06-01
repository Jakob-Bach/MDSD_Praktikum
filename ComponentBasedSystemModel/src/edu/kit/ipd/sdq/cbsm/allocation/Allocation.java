/**
 */
package edu.kit.ipd.sdq.cbsm.allocation;

import edu.kit.ipd.sdq.cbsm.core.ViewType;
import edu.kit.ipd.sdq.cbsm.environment.Environment;
import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link edu.kit.ipd.sdq.cbsm.allocation.Allocation#getAllocatedSystem <em>Allocated System</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.allocation.Allocation#getAllocationEnvironment <em>Allocation Environment</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.cbsm.allocation.AllocationPackage#getAllocation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AssemblyContextsConnectedByAssemblyConnectorAllocatedOnSameOrLinkedContainers AssemblyContextsOfAllocationContextsBelongToAllocatedSystem ContainersOfAllocationContextsBelongToAllocationEnvironment'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot AssemblyContextsConnectedByAssemblyConnectorAllocatedOnSameOrLinkedContainers='\n\t\t\t\tself.allocationContexts->isEmpty()\n\t\t\t\t-- get all AssemblyConnectors from System (assuming that only top-level\n\t\t\t\t-- AssemblyContexts are allocated)\n\t\t\t\tor self.allocatedSystem.connectors->select(connector|\n\t\t\t\t\tconnector.oclIsKindOf(assembly::AssemblyConnector))->forAll(assemblyConnector|\n\t\t\t\t\t\t-- get AllocationContexts for the two connected AssemblyContexts, check if\n\t\t\t\t\t\t-- same Container\n\t\t\t\t\t\tself.allocationContexts->select(allocationContext|\n\t\t\t\t\t\t\tallocationContext.allocatedAssemblyContext = assemblyConnector.oclAsType(\n\t\t\t\t\t\t\t\tassembly::AssemblyConnector).connectedProvidedAssemblyContext \n\t\t\t\t\t\t\tor allocationContext.allocatedAssemblyContext = assemblyConnector.oclAsType(\n\t\t\t\t\t\t\t\tassembly::AssemblyConnector).connectedRequiredAssemblyContext\n\t\t\t\t\t\t).allocatedContainer->asSet()->size() = 1 \n\t\t\t\t\t\t-- get all Links, check if there is one whose Containers contain both of the two\n\t\t\t\t\t\t-- connected AssemblyContexts\n\t\t\t\t\t\tor self.allocationEnvironment.links->exists(link|\n\t\t\t\t\t\t\tlink.linkedContainers->includesAll(self.allocationContexts->select(allocationContext|\n\t\t\t\t\t\t\t\tallocationContext.allocatedAssemblyContext = assemblyConnector.oclAsType(\n\t\t\t\t\t\t\t\t\tassembly::AssemblyConnector).connectedProvidedAssemblyContext \n\t\t\t\t\t\t\t\tor allocationContext.allocatedAssemblyContext = assemblyConnector.oclAsType(\n\t\t\t\t\t\t\t\t\tassembly::AssemblyConnector).connectedRequiredAssemblyContext\n\t\t\t\t\t\t\t).allocatedContainer)\n\t\t\t\t\t\t)\n\t\t\t\t\t)' AssemblyContextsOfAllocationContextsBelongToAllocatedSystem='self.allocatedSystem.\n\t\t\t\tcontainedAssemblyContexts->includesAll(self.allocationContexts.allocatedAssemblyContext)' ContainersOfAllocationContextsBelongToAllocationEnvironment='\n\t\t\t\tself.allocationEnvironment.containers->includesAll(self.allocationContexts.allocatedContainer)'"
 * @generated
 */
public interface Allocation extends ViewType {
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

	/**
	 * Returns the value of the '<em><b>Allocated System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocated System</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated System</em>' reference.
	 * @see #setAllocatedSystem(edu.kit.ipd.sdq.cbsm.assembly.System)
	 * @see edu.kit.ipd.sdq.cbsm.allocation.AllocationPackage#getAllocation_AllocatedSystem()
	 * @model required="true"
	 * @generated
	 */
	edu.kit.ipd.sdq.cbsm.assembly.System getAllocatedSystem();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.cbsm.allocation.Allocation#getAllocatedSystem <em>Allocated System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocated System</em>' reference.
	 * @see #getAllocatedSystem()
	 * @generated
	 */
	void setAllocatedSystem(edu.kit.ipd.sdq.cbsm.assembly.System value);

	/**
	 * Returns the value of the '<em><b>Allocation Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocation Environment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocation Environment</em>' reference.
	 * @see #setAllocationEnvironment(Environment)
	 * @see edu.kit.ipd.sdq.cbsm.allocation.AllocationPackage#getAllocation_AllocationEnvironment()
	 * @model required="true"
	 * @generated
	 */
	Environment getAllocationEnvironment();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.cbsm.allocation.Allocation#getAllocationEnvironment <em>Allocation Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocation Environment</em>' reference.
	 * @see #getAllocationEnvironment()
	 * @generated
	 */
	void setAllocationEnvironment(Environment value);

} // Allocation
