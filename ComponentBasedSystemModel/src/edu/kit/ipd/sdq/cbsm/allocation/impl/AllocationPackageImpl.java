/**
 */
package edu.kit.ipd.sdq.cbsm.allocation.impl;

import edu.kit.ipd.sdq.cbsm.allocation.Allocation;
import edu.kit.ipd.sdq.cbsm.allocation.AllocationContext;
import edu.kit.ipd.sdq.cbsm.allocation.AllocationFactory;
import edu.kit.ipd.sdq.cbsm.allocation.AllocationPackage;

import edu.kit.ipd.sdq.cbsm.allocation.util.AllocationValidator;
import edu.kit.ipd.sdq.cbsm.assembly.AssemblyPackage;

import edu.kit.ipd.sdq.cbsm.assembly.impl.AssemblyPackageImpl;

import edu.kit.ipd.sdq.cbsm.core.CorePackage;

import edu.kit.ipd.sdq.cbsm.core.impl.CorePackageImpl;

import edu.kit.ipd.sdq.cbsm.environment.EnvironmentPackage;

import edu.kit.ipd.sdq.cbsm.environment.impl.EnvironmentPackageImpl;

import edu.kit.ipd.sdq.cbsm.repository.RepositoryPackage;

import edu.kit.ipd.sdq.cbsm.repository.behavior.BehaviorPackage;
import edu.kit.ipd.sdq.cbsm.repository.behavior.impl.BehaviorPackageImpl;
import edu.kit.ipd.sdq.cbsm.repository.impl.RepositoryPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AllocationPackageImpl extends EPackageImpl implements AllocationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocationContextEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see edu.kit.ipd.sdq.cbsm.allocation.AllocationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AllocationPackageImpl() {
		super(eNS_URI, AllocationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AllocationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AllocationPackage init() {
		if (isInited) return (AllocationPackage)EPackage.Registry.INSTANCE.getEPackage(AllocationPackage.eNS_URI);

		// Obtain or create and register package
		AllocationPackageImpl theAllocationPackage = (AllocationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AllocationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AllocationPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		RepositoryPackageImpl theRepositoryPackage = (RepositoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI) instanceof RepositoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI) : RepositoryPackage.eINSTANCE);
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);
		AssemblyPackageImpl theAssemblyPackage = (AssemblyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AssemblyPackage.eNS_URI) instanceof AssemblyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AssemblyPackage.eNS_URI) : AssemblyPackage.eINSTANCE);
		EnvironmentPackageImpl theEnvironmentPackage = (EnvironmentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnvironmentPackage.eNS_URI) instanceof EnvironmentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnvironmentPackage.eNS_URI) : EnvironmentPackage.eINSTANCE);

		// Create package meta-data objects
		theAllocationPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theRepositoryPackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		theAssemblyPackage.createPackageContents();
		theEnvironmentPackage.createPackageContents();

		// Initialize created meta-data
		theAllocationPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theRepositoryPackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		theAssemblyPackage.initializePackageContents();
		theEnvironmentPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theAllocationPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return AllocationValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theAllocationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AllocationPackage.eNS_URI, theAllocationPackage);
		return theAllocationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllocation() {
		return allocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocation_AllocationContexts() {
		return (EReference)allocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllocationContext() {
		return allocationContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocationContext_AllocatedContainer() {
		return (EReference)allocationContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocationContext_AllocatedAssemblyContext() {
		return (EReference)allocationContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationFactory getAllocationFactory() {
		return (AllocationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		allocationEClass = createEClass(ALLOCATION);
		createEReference(allocationEClass, ALLOCATION__ALLOCATION_CONTEXTS);

		allocationContextEClass = createEClass(ALLOCATION_CONTEXT);
		createEReference(allocationContextEClass, ALLOCATION_CONTEXT__ALLOCATED_CONTAINER);
		createEReference(allocationContextEClass, ALLOCATION_CONTEXT__ALLOCATED_ASSEMBLY_CONTEXT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		EnvironmentPackage theEnvironmentPackage = (EnvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(EnvironmentPackage.eNS_URI);
		AssemblyPackage theAssemblyPackage = (AssemblyPackage)EPackage.Registry.INSTANCE.getEPackage(AssemblyPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		allocationEClass.getESuperTypes().add(theCorePackage.getViewType());
		allocationContextEClass.getESuperTypes().add(theCorePackage.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(allocationEClass, Allocation.class, "Allocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAllocation_AllocationContexts(), this.getAllocationContext(), null, "allocationContexts", null, 0, -1, Allocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allocationContextEClass, AllocationContext.class, "AllocationContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAllocationContext_AllocatedContainer(), theEnvironmentPackage.getContainer(), null, "allocatedContainer", null, 1, 1, AllocationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllocationContext_AllocatedAssemblyContext(), theAssemblyPackage.getAssemblyContext(), null, "allocatedAssemblyContext", null, 1, 1, AllocationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (allocationEClass, 
		   source, 
		   new String[] {
			 "constraints", "AssemblyContextsConnectedByAssemblyConnectorAllocatedOnSameOrLinkedContainers"
		   });	
		addAnnotation
		  (allocationContextEClass, 
		   source, 
		   new String[] {
			 "constraints", "OnlyTopLevelAssemblyContextsAllocated"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (allocationEClass, 
		   source, 
		   new String[] {
			 "AssemblyContextsConnectedByAssemblyConnectorAllocatedOnSameOrLinkedContainers", "\n\t\t\t\tself.allocationContexts->isEmpty()\n\t\t\t\t-- get all AssemblyConnectors from System (assuming that only top-level\n\t\t\t\t-- AssemblyContexts are allocated\n\t\t\t\tor self.allocationContexts->first().allocatedAssemblyContext.parentCompositeElement.\n\t\t\t\toclAsType(assembly::System).systemConnectors->select(connector|\n\t\t\t\t\tconnector.oclIsKindOf(assembly::AssemblyConnector))->forAll(assemblyConnector|\n\t\t\t\t\t\t-- get AllocationContexts for the two connected AssemblyContexts, check if\n\t\t\t\t\t\t-- same Container\n\t\t\t\t\t\tself.allocationContexts->select(allocationContext|\n\t\t\t\t\t\t\tallocationContext.allocatedAssemblyContext = assemblyConnector.oclAsType(\n\t\t\t\t\t\t\t\tassembly::AssemblyConnector).connectedProvidedAssemblyContext \n\t\t\t\t\t\t\tor allocationContext.allocatedAssemblyContext = assemblyConnector.oclAsType(\n\t\t\t\t\t\t\t\tassembly::AssemblyConnector).connectedRequiredAssemblyContext\n\t\t\t\t\t\t).allocatedContainer->asSet()->size() = 1 \n\t\t\t\t\t\t-- get all Links, check if there is one whose Containers contain both of the two\n\t\t\t\t\t\t-- connected AssemblyContexts\n\t\t\t\t\t\tor self.allocationContexts->first().allocatedContainer.parentEnvironment.links->exists(link|\n\t\t\t\t\t\t\tlink.linkedContainers->includesAll(self.allocationContexts->select(allocationContext|\n\t\t\t\t\t\t\t\tallocationContext.allocatedAssemblyContext = assemblyConnector.oclAsType(\n\t\t\t\t\t\t\t\t\tassembly::AssemblyConnector).connectedProvidedAssemblyContext \n\t\t\t\t\t\t\t\tor allocationContext.allocatedAssemblyContext = assemblyConnector.oclAsType(\n\t\t\t\t\t\t\t\t\tassembly::AssemblyConnector).connectedRequiredAssemblyContext\n\t\t\t\t\t\t\t).allocatedContainer)\n\t\t\t\t\t\t)\n\t\t\t\t\t)"
		   });	
		addAnnotation
		  (allocationContextEClass, 
		   source, 
		   new String[] {
			 "OnlyTopLevelAssemblyContextsAllocated", "self.allocatedAssemblyContext.parentCompositeElement.\n\t\t\t\toclIsTypeOf(assembly::System)"
		   });
	}

} //AllocationPackageImpl
