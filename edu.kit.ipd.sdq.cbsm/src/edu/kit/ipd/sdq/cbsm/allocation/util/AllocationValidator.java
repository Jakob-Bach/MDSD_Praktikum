/**
 */
package edu.kit.ipd.sdq.cbsm.allocation.util;

import edu.kit.ipd.sdq.cbsm.allocation.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.cbsm.allocation.AllocationPackage
 * @generated
 */
public class AllocationValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AllocationValidator INSTANCE = new AllocationValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "edu.kit.ipd.sdq.cbsm.allocation";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return AllocationPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case AllocationPackage.ALLOCATION:
				return validateAllocation((Allocation)value, diagnostics, context);
			case AllocationPackage.ALLOCATION_CONTEXT:
				return validateAllocationContext((AllocationContext)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllocation(Allocation allocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(allocation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(allocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(allocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(allocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(allocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(allocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(allocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(allocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(allocation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAllocation_AssemblyContextsConnectedByAssemblyConnectorAllocatedOnSameOrLinkedContainers(allocation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAllocation_AssemblyContextsOfAllocationContextsBelongToAllocatedSystem(allocation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAllocation_ContainersOfAllocationContextsBelongToAllocationEnvironment(allocation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the AssemblyContextsConnectedByAssemblyConnectorAllocatedOnSameOrLinkedContainers constraint of '<em>Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ALLOCATION__ASSEMBLY_CONTEXTS_CONNECTED_BY_ASSEMBLY_CONNECTOR_ALLOCATED_ON_SAME_OR_LINKED_CONTAINERS__EEXPRESSION = "\n" +
		"\t\t\t\tself.allocationContexts->isEmpty()\n" +
		"\t\t\t\t-- get all AssemblyConnectors from System (assuming that only top-level\n" +
		"\t\t\t\t-- AssemblyContexts are allocated)\n" +
		"\t\t\t\tor self.allocatedSystem.connectors->select(connector|\n" +
		"\t\t\t\t\tconnector.oclIsKindOf(assembly::AssemblyConnector))->forAll(assemblyConnector|\n" +
		"\t\t\t\t\t\t-- get AllocationContexts for the two connected AssemblyContexts, check if\n" +
		"\t\t\t\t\t\t-- same Container\n" +
		"\t\t\t\t\t\tself.allocationContexts->select(allocationContext|\n" +
		"\t\t\t\t\t\t\tallocationContext.allocatedAssemblyContext = assemblyConnector.oclAsType(\n" +
		"\t\t\t\t\t\t\t\tassembly::AssemblyConnector).connectedProvidedAssemblyContext \n" +
		"\t\t\t\t\t\t\tor allocationContext.allocatedAssemblyContext = assemblyConnector.oclAsType(\n" +
		"\t\t\t\t\t\t\t\tassembly::AssemblyConnector).connectedRequiredAssemblyContext\n" +
		"\t\t\t\t\t\t).allocatedContainer->asSet()->size() = 1 \n" +
		"\t\t\t\t\t\t-- get all Links, check if there is one whose Containers contain both of the two\n" +
		"\t\t\t\t\t\t-- connected AssemblyContexts\n" +
		"\t\t\t\t\t\tor self.allocationEnvironment.links->exists(link|\n" +
		"\t\t\t\t\t\t\tlink.linkedContainers->includesAll(self.allocationContexts->select(allocationContext|\n" +
		"\t\t\t\t\t\t\t\tallocationContext.allocatedAssemblyContext = assemblyConnector.oclAsType(\n" +
		"\t\t\t\t\t\t\t\t\tassembly::AssemblyConnector).connectedProvidedAssemblyContext \n" +
		"\t\t\t\t\t\t\t\tor allocationContext.allocatedAssemblyContext = assemblyConnector.oclAsType(\n" +
		"\t\t\t\t\t\t\t\t\tassembly::AssemblyConnector).connectedRequiredAssemblyContext\n" +
		"\t\t\t\t\t\t\t).allocatedContainer)\n" +
		"\t\t\t\t\t\t)\n" +
		"\t\t\t\t\t)";

	/**
	 * Validates the AssemblyContextsConnectedByAssemblyConnectorAllocatedOnSameOrLinkedContainers constraint of '<em>Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllocation_AssemblyContextsConnectedByAssemblyConnectorAllocatedOnSameOrLinkedContainers(Allocation allocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AllocationPackage.Literals.ALLOCATION,
				 allocation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "AssemblyContextsConnectedByAssemblyConnectorAllocatedOnSameOrLinkedContainers",
				 ALLOCATION__ASSEMBLY_CONTEXTS_CONNECTED_BY_ASSEMBLY_CONNECTOR_ALLOCATED_ON_SAME_OR_LINKED_CONTAINERS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the AssemblyContextsOfAllocationContextsBelongToAllocatedSystem constraint of '<em>Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ALLOCATION__ASSEMBLY_CONTEXTS_OF_ALLOCATION_CONTEXTS_BELONG_TO_ALLOCATED_SYSTEM__EEXPRESSION = "self.allocatedSystem.\n" +
		"\t\t\t\tcontainedAssemblyContexts->includesAll(self.allocationContexts.allocatedAssemblyContext)";

	/**
	 * Validates the AssemblyContextsOfAllocationContextsBelongToAllocatedSystem constraint of '<em>Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllocation_AssemblyContextsOfAllocationContextsBelongToAllocatedSystem(Allocation allocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AllocationPackage.Literals.ALLOCATION,
				 allocation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "AssemblyContextsOfAllocationContextsBelongToAllocatedSystem",
				 ALLOCATION__ASSEMBLY_CONTEXTS_OF_ALLOCATION_CONTEXTS_BELONG_TO_ALLOCATED_SYSTEM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ContainersOfAllocationContextsBelongToAllocationEnvironment constraint of '<em>Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ALLOCATION__CONTAINERS_OF_ALLOCATION_CONTEXTS_BELONG_TO_ALLOCATION_ENVIRONMENT__EEXPRESSION = "\n" +
		"\t\t\t\tself.allocationEnvironment.containers->includesAll(self.allocationContexts.allocatedContainer)";

	/**
	 * Validates the ContainersOfAllocationContextsBelongToAllocationEnvironment constraint of '<em>Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllocation_ContainersOfAllocationContextsBelongToAllocationEnvironment(Allocation allocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AllocationPackage.Literals.ALLOCATION,
				 allocation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ContainersOfAllocationContextsBelongToAllocationEnvironment",
				 ALLOCATION__CONTAINERS_OF_ALLOCATION_CONTEXTS_BELONG_TO_ALLOCATION_ENVIRONMENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllocationContext(AllocationContext allocationContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(allocationContext, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(allocationContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(allocationContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(allocationContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(allocationContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(allocationContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(allocationContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(allocationContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(allocationContext, diagnostics, context);
		if (result || diagnostics != null) result &= validateAllocationContext_OnlyTopLevelAssemblyContextsAllocated(allocationContext, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the OnlyTopLevelAssemblyContextsAllocated constraint of '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ALLOCATION_CONTEXT__ONLY_TOP_LEVEL_ASSEMBLY_CONTEXTS_ALLOCATED__EEXPRESSION = "self.allocatedAssemblyContext.parentCompositeElement.\n" +
		"\t\t\t\toclIsTypeOf(assembly::System)";

	/**
	 * Validates the OnlyTopLevelAssemblyContextsAllocated constraint of '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllocationContext_OnlyTopLevelAssemblyContextsAllocated(AllocationContext allocationContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AllocationPackage.Literals.ALLOCATION_CONTEXT,
				 allocationContext,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "OnlyTopLevelAssemblyContextsAllocated",
				 ALLOCATION_CONTEXT__ONLY_TOP_LEVEL_ASSEMBLY_CONTEXTS_ALLOCATED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //AllocationValidator
