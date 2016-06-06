/**
 */
package edu.kit.ipd.sdq.cbsm.repository.behavior;

import edu.kit.ipd.sdq.cbsm.core.CorePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.BehaviorFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface BehaviorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "behavior";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.kit.edu/componentBasedSystemModel/repository/behavior";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "behavior";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BehaviorPackage eINSTANCE = edu.kit.ipd.sdq.cbsm.repository.behavior.impl.BehaviorPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.cbsm.repository.behavior.impl.BehaviorDescriptionImpl <em>Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.impl.BehaviorDescriptionImpl
	 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.impl.BehaviorPackageImpl#getBehaviorDescription()
	 * @generated
	 */
	int BEHAVIOR_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_DESCRIPTION__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_DESCRIPTION__ACTIONS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_DESCRIPTION_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_DESCRIPTION_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.cbsm.repository.behavior.impl.ComponentBehaviorDescriptionImpl <em>Component Behavior Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.impl.ComponentBehaviorDescriptionImpl
	 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.impl.BehaviorPackageImpl#getComponentBehaviorDescription()
	 * @generated
	 */
	int COMPONENT_BEHAVIOR_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_BEHAVIOR_DESCRIPTION__NAME = BEHAVIOR_DESCRIPTION__NAME;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_BEHAVIOR_DESCRIPTION__ACTIONS = BEHAVIOR_DESCRIPTION__ACTIONS;

	/**
	 * The feature id for the '<em><b>Provided Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_BEHAVIOR_DESCRIPTION__PROVIDED_SERVICE = BEHAVIOR_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Described Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_BEHAVIOR_DESCRIPTION__DESCRIBED_COMPONENT = BEHAVIOR_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Component Behavior Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_BEHAVIOR_DESCRIPTION_FEATURE_COUNT = BEHAVIOR_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Component Behavior Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_BEHAVIOR_DESCRIPTION_OPERATION_COUNT = BEHAVIOR_DESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.cbsm.repository.behavior.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.impl.ActionImpl
	 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.impl.BehaviorPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__PREDECESSOR = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Successor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__SUCCESSOR = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.cbsm.repository.behavior.impl.InternalActionImpl <em>Internal Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.impl.InternalActionImpl
	 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.impl.BehaviorPackageImpl#getInternalAction()
	 * @generated
	 */
	int INTERNAL_ACTION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION__PREDECESSOR = ACTION__PREDECESSOR;

	/**
	 * The feature id for the '<em><b>Successor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION__SUCCESSOR = ACTION__SUCCESSOR;

	/**
	 * The number of structural features of the '<em>Internal Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Internal Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.cbsm.repository.behavior.impl.ExternalCallImpl <em>External Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.impl.ExternalCallImpl
	 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.impl.BehaviorPackageImpl#getExternalCall()
	 * @generated
	 */
	int EXTERNAL_CALL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL__PREDECESSOR = ACTION__PREDECESSOR;

	/**
	 * The feature id for the '<em><b>Successor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL__SUCCESSOR = ACTION__SUCCESSOR;

	/**
	 * The feature id for the '<em><b>Required Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL__REQUIRED_SERVICE = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Role Of Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL__REQUIRED_ROLE_OF_SERVICE = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>External Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>External Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.cbsm.repository.behavior.impl.LoopImpl <em>Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.impl.LoopImpl
	 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.impl.BehaviorPackageImpl#getLoop()
	 * @generated
	 */
	int LOOP = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__PREDECESSOR = ACTION__PREDECESSOR;

	/**
	 * The feature id for the '<em><b>Successor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__SUCCESSOR = ACTION__SUCCESSOR;

	/**
	 * The feature id for the '<em><b>Loop Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__LOOP_BEHAVIOR = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.cbsm.repository.behavior.impl.BranchImpl <em>Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.impl.BranchImpl
	 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.impl.BehaviorPackageImpl#getBranch()
	 * @generated
	 */
	int BRANCH = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__PREDECESSOR = ACTION__PREDECESSOR;

	/**
	 * The feature id for the '<em><b>Successor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__SUCCESSOR = ACTION__SUCCESSOR;

	/**
	 * The feature id for the '<em><b>Branch Paths</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__BRANCH_PATHS = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.cbsm.repository.behavior.impl.BranchPathImpl <em>Branch Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.impl.BranchPathImpl
	 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.impl.BehaviorPackageImpl#getBranchPath()
	 * @generated
	 */
	int BRANCH_PATH = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_PATH__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Branch Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_PATH__BRANCH_BEHAVIOR = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Branch Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_PATH_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Branch Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_PATH_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.cbsm.repository.behavior.BehaviorDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description</em>'.
	 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.BehaviorDescription
	 * @generated
	 */
	EClass getBehaviorDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.cbsm.repository.behavior.BehaviorDescription#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.BehaviorDescription#getActions()
	 * @see #getBehaviorDescription()
	 * @generated
	 */
	EReference getBehaviorDescription_Actions();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.cbsm.repository.behavior.ComponentBehaviorDescription <em>Component Behavior Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Behavior Description</em>'.
	 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.ComponentBehaviorDescription
	 * @generated
	 */
	EClass getComponentBehaviorDescription();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.cbsm.repository.behavior.ComponentBehaviorDescription#getProvidedService <em>Provided Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provided Service</em>'.
	 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.ComponentBehaviorDescription#getProvidedService()
	 * @see #getComponentBehaviorDescription()
	 * @generated
	 */
	EReference getComponentBehaviorDescription_ProvidedService();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.cbsm.repository.behavior.ComponentBehaviorDescription#getDescribedComponent <em>Described Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Described Component</em>'.
	 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.ComponentBehaviorDescription#getDescribedComponent()
	 * @see #getComponentBehaviorDescription()
	 * @generated
	 */
	EReference getComponentBehaviorDescription_DescribedComponent();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.cbsm.repository.behavior.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.cbsm.repository.behavior.Action#getPredecessor <em>Predecessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Predecessor</em>'.
	 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.Action#getPredecessor()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Predecessor();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.cbsm.repository.behavior.Action#getSuccessor <em>Successor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Successor</em>'.
	 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.Action#getSuccessor()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Successor();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.cbsm.repository.behavior.InternalAction <em>Internal Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Action</em>'.
	 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.InternalAction
	 * @generated
	 */
	EClass getInternalAction();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.cbsm.repository.behavior.ExternalCall <em>External Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Call</em>'.
	 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.ExternalCall
	 * @generated
	 */
	EClass getExternalCall();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.cbsm.repository.behavior.ExternalCall#getRequiredService <em>Required Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Required Service</em>'.
	 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.ExternalCall#getRequiredService()
	 * @see #getExternalCall()
	 * @generated
	 */
	EReference getExternalCall_RequiredService();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.cbsm.repository.behavior.ExternalCall#getRequiredRoleOfService <em>Required Role Of Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Required Role Of Service</em>'.
	 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.ExternalCall#getRequiredRoleOfService()
	 * @see #getExternalCall()
	 * @generated
	 */
	EReference getExternalCall_RequiredRoleOfService();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.cbsm.repository.behavior.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop</em>'.
	 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.Loop
	 * @generated
	 */
	EClass getLoop();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.cbsm.repository.behavior.Loop#getLoopBehavior <em>Loop Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Loop Behavior</em>'.
	 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.Loop#getLoopBehavior()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_LoopBehavior();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.cbsm.repository.behavior.Branch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch</em>'.
	 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.Branch
	 * @generated
	 */
	EClass getBranch();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.cbsm.repository.behavior.Branch#getBranchPaths <em>Branch Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Branch Paths</em>'.
	 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.Branch#getBranchPaths()
	 * @see #getBranch()
	 * @generated
	 */
	EReference getBranch_BranchPaths();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.cbsm.repository.behavior.BranchPath <em>Branch Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch Path</em>'.
	 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.BranchPath
	 * @generated
	 */
	EClass getBranchPath();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.cbsm.repository.behavior.BranchPath#getBranchBehavior <em>Branch Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Branch Behavior</em>'.
	 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.BranchPath#getBranchBehavior()
	 * @see #getBranchPath()
	 * @generated
	 */
	EReference getBranchPath_BranchBehavior();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BehaviorFactory getBehaviorFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.cbsm.repository.behavior.impl.BehaviorDescriptionImpl <em>Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.impl.BehaviorDescriptionImpl
		 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.impl.BehaviorPackageImpl#getBehaviorDescription()
		 * @generated
		 */
		EClass BEHAVIOR_DESCRIPTION = eINSTANCE.getBehaviorDescription();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_DESCRIPTION__ACTIONS = eINSTANCE.getBehaviorDescription_Actions();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.cbsm.repository.behavior.impl.ComponentBehaviorDescriptionImpl <em>Component Behavior Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.impl.ComponentBehaviorDescriptionImpl
		 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.impl.BehaviorPackageImpl#getComponentBehaviorDescription()
		 * @generated
		 */
		EClass COMPONENT_BEHAVIOR_DESCRIPTION = eINSTANCE.getComponentBehaviorDescription();

		/**
		 * The meta object literal for the '<em><b>Provided Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_BEHAVIOR_DESCRIPTION__PROVIDED_SERVICE = eINSTANCE.getComponentBehaviorDescription_ProvidedService();

		/**
		 * The meta object literal for the '<em><b>Described Component</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_BEHAVIOR_DESCRIPTION__DESCRIBED_COMPONENT = eINSTANCE.getComponentBehaviorDescription_DescribedComponent();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.cbsm.repository.behavior.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.impl.ActionImpl
		 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.impl.BehaviorPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Predecessor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__PREDECESSOR = eINSTANCE.getAction_Predecessor();

		/**
		 * The meta object literal for the '<em><b>Successor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__SUCCESSOR = eINSTANCE.getAction_Successor();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.cbsm.repository.behavior.impl.InternalActionImpl <em>Internal Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.impl.InternalActionImpl
		 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.impl.BehaviorPackageImpl#getInternalAction()
		 * @generated
		 */
		EClass INTERNAL_ACTION = eINSTANCE.getInternalAction();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.cbsm.repository.behavior.impl.ExternalCallImpl <em>External Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.impl.ExternalCallImpl
		 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.impl.BehaviorPackageImpl#getExternalCall()
		 * @generated
		 */
		EClass EXTERNAL_CALL = eINSTANCE.getExternalCall();

		/**
		 * The meta object literal for the '<em><b>Required Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_CALL__REQUIRED_SERVICE = eINSTANCE.getExternalCall_RequiredService();

		/**
		 * The meta object literal for the '<em><b>Required Role Of Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_CALL__REQUIRED_ROLE_OF_SERVICE = eINSTANCE.getExternalCall_RequiredRoleOfService();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.cbsm.repository.behavior.impl.LoopImpl <em>Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.impl.LoopImpl
		 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.impl.BehaviorPackageImpl#getLoop()
		 * @generated
		 */
		EClass LOOP = eINSTANCE.getLoop();

		/**
		 * The meta object literal for the '<em><b>Loop Behavior</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP__LOOP_BEHAVIOR = eINSTANCE.getLoop_LoopBehavior();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.cbsm.repository.behavior.impl.BranchImpl <em>Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.impl.BranchImpl
		 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.impl.BehaviorPackageImpl#getBranch()
		 * @generated
		 */
		EClass BRANCH = eINSTANCE.getBranch();

		/**
		 * The meta object literal for the '<em><b>Branch Paths</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH__BRANCH_PATHS = eINSTANCE.getBranch_BranchPaths();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.cbsm.repository.behavior.impl.BranchPathImpl <em>Branch Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.impl.BranchPathImpl
		 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.impl.BehaviorPackageImpl#getBranchPath()
		 * @generated
		 */
		EClass BRANCH_PATH = eINSTANCE.getBranchPath();

		/**
		 * The meta object literal for the '<em><b>Branch Behavior</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH_PATH__BRANCH_BEHAVIOR = eINSTANCE.getBranchPath_BranchBehavior();

	}

} //BehaviorPackage
