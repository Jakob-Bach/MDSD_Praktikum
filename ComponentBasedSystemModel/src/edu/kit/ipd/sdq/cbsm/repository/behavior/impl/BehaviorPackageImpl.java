/**
 */
package edu.kit.ipd.sdq.cbsm.repository.behavior.impl;

import edu.kit.ipd.sdq.cbsm.allocation.AllocationPackage;

import edu.kit.ipd.sdq.cbsm.allocation.impl.AllocationPackageImpl;

import edu.kit.ipd.sdq.cbsm.architecture.ArchitecturePackage;
import edu.kit.ipd.sdq.cbsm.architecture.impl.ArchitecturePackageImpl;
import edu.kit.ipd.sdq.cbsm.assembly.AssemblyPackage;

import edu.kit.ipd.sdq.cbsm.assembly.impl.AssemblyPackageImpl;

import edu.kit.ipd.sdq.cbsm.core.CorePackage;

import edu.kit.ipd.sdq.cbsm.core.impl.CorePackageImpl;

import edu.kit.ipd.sdq.cbsm.environment.EnvironmentPackage;

import edu.kit.ipd.sdq.cbsm.environment.impl.EnvironmentPackageImpl;

import edu.kit.ipd.sdq.cbsm.repository.RepositoryPackage;

import edu.kit.ipd.sdq.cbsm.repository.behavior.Action;
import edu.kit.ipd.sdq.cbsm.repository.behavior.BehaviorDescription;
import edu.kit.ipd.sdq.cbsm.repository.behavior.BehaviorFactory;
import edu.kit.ipd.sdq.cbsm.repository.behavior.BehaviorPackage;
import edu.kit.ipd.sdq.cbsm.repository.behavior.Branch;
import edu.kit.ipd.sdq.cbsm.repository.behavior.BranchPath;
import edu.kit.ipd.sdq.cbsm.repository.behavior.ExternalCall;
import edu.kit.ipd.sdq.cbsm.repository.behavior.InternalAction;
import edu.kit.ipd.sdq.cbsm.repository.behavior.Loop;

import edu.kit.ipd.sdq.cbsm.repository.behavior.util.BehaviorValidator;
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
public class BehaviorPackageImpl extends EPackageImpl implements BehaviorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass branchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass branchPathEClass = null;

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
	 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.BehaviorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BehaviorPackageImpl() {
		super(eNS_URI, BehaviorFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BehaviorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BehaviorPackage init() {
		if (isInited) return (BehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI);

		// Obtain or create and register package
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BehaviorPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		RepositoryPackageImpl theRepositoryPackage = (RepositoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI) instanceof RepositoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI) : RepositoryPackage.eINSTANCE);
		AssemblyPackageImpl theAssemblyPackage = (AssemblyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AssemblyPackage.eNS_URI) instanceof AssemblyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AssemblyPackage.eNS_URI) : AssemblyPackage.eINSTANCE);
		EnvironmentPackageImpl theEnvironmentPackage = (EnvironmentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnvironmentPackage.eNS_URI) instanceof EnvironmentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnvironmentPackage.eNS_URI) : EnvironmentPackage.eINSTANCE);
		AllocationPackageImpl theAllocationPackage = (AllocationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AllocationPackage.eNS_URI) instanceof AllocationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AllocationPackage.eNS_URI) : AllocationPackage.eINSTANCE);
		ArchitecturePackageImpl theArchitecturePackage = (ArchitecturePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArchitecturePackage.eNS_URI) instanceof ArchitecturePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArchitecturePackage.eNS_URI) : ArchitecturePackage.eINSTANCE);

		// Create package meta-data objects
		theBehaviorPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theRepositoryPackage.createPackageContents();
		theAssemblyPackage.createPackageContents();
		theEnvironmentPackage.createPackageContents();
		theAllocationPackage.createPackageContents();
		theArchitecturePackage.createPackageContents();

		// Initialize created meta-data
		theBehaviorPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theRepositoryPackage.initializePackageContents();
		theAssemblyPackage.initializePackageContents();
		theEnvironmentPackage.initializePackageContents();
		theAllocationPackage.initializePackageContents();
		theArchitecturePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theBehaviorPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return BehaviorValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theBehaviorPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BehaviorPackage.eNS_URI, theBehaviorPackage);
		return theBehaviorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehaviorDescription() {
		return behaviorDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviorDescription_Actions() {
		return (EReference)behaviorDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_Predecessor() {
		return (EReference)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_Successor() {
		return (EReference)actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalAction() {
		return internalActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalCall() {
		return externalCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalCall_RequiredService() {
		return (EReference)externalCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalCall_RequiredRoleOfService() {
		return (EReference)externalCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoop() {
		return loopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoop_LoopActions() {
		return (EReference)loopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBranch() {
		return branchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBranch_BranchPaths() {
		return (EReference)branchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBranchPath() {
		return branchPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBranchPath_PathActions() {
		return (EReference)branchPathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorFactory getBehaviorFactory() {
		return (BehaviorFactory)getEFactoryInstance();
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
		behaviorDescriptionEClass = createEClass(BEHAVIOR_DESCRIPTION);
		createEReference(behaviorDescriptionEClass, BEHAVIOR_DESCRIPTION__ACTIONS);

		actionEClass = createEClass(ACTION);
		createEReference(actionEClass, ACTION__PREDECESSOR);
		createEReference(actionEClass, ACTION__SUCCESSOR);

		internalActionEClass = createEClass(INTERNAL_ACTION);

		externalCallEClass = createEClass(EXTERNAL_CALL);
		createEReference(externalCallEClass, EXTERNAL_CALL__REQUIRED_SERVICE);
		createEReference(externalCallEClass, EXTERNAL_CALL__REQUIRED_ROLE_OF_SERVICE);

		loopEClass = createEClass(LOOP);
		createEReference(loopEClass, LOOP__LOOP_ACTIONS);

		branchEClass = createEClass(BRANCH);
		createEReference(branchEClass, BRANCH__BRANCH_PATHS);

		branchPathEClass = createEClass(BRANCH_PATH);
		createEReference(branchPathEClass, BRANCH_PATH__PATH_ACTIONS);
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
		RepositoryPackage theRepositoryPackage = (RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		actionEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		internalActionEClass.getESuperTypes().add(this.getAction());
		externalCallEClass.getESuperTypes().add(this.getAction());
		loopEClass.getESuperTypes().add(this.getAction());
		branchEClass.getESuperTypes().add(this.getAction());
		branchPathEClass.getESuperTypes().add(theCorePackage.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(behaviorDescriptionEClass, BehaviorDescription.class, "BehaviorDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehaviorDescription_Actions(), this.getAction(), null, "actions", null, 0, -1, BehaviorDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAction_Predecessor(), this.getAction(), null, "predecessor", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAction_Successor(), this.getAction(), null, "successor", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internalActionEClass, InternalAction.class, "InternalAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(externalCallEClass, ExternalCall.class, "ExternalCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExternalCall_RequiredService(), theRepositoryPackage.getSignature(), null, "requiredService", null, 1, 1, ExternalCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExternalCall_RequiredRoleOfService(), theRepositoryPackage.getRequiredRole(), null, "requiredRoleOfService", null, 1, 1, ExternalCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loopEClass, Loop.class, "Loop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoop_LoopActions(), this.getAction(), null, "loopActions", null, 0, -1, Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(branchEClass, Branch.class, "Branch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBranch_BranchPaths(), this.getBranchPath(), null, "branchPaths", null, 0, -1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(branchPathEClass, BranchPath.class, "BranchPath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBranchPath_PathActions(), this.getAction(), null, "pathActions", null, 0, -1, BranchPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (externalCallEClass, 
		   source, 
		   new String[] {
			 "constraints", "RequiredRolesInterfaceContainsSignature"
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
		  (externalCallEClass, 
		   source, 
		   new String[] {
			 "RequiredRolesInterfaceContainsSignature", "\n\t\t\t\t\tself.requiredRoleOfService.requiredInterface.signatures->exists(signature|\n\t\t\t\t\t\tsignature = self.requiredService\n\t\t\t\t\t)"
		   });
	}

} //BehaviorPackageImpl
