/**
 */
package edu.kit.ipd.sdq.cbsm.assembly;

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
 * @see edu.kit.ipd.sdq.cbsm.assembly.AssemblyFactory
 * @model kind="package"
 * @generated
 */
public interface AssemblyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "assembly";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.kit.edu/componentBasedSystemModel/assembly";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "assembly";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AssemblyPackage eINSTANCE = edu.kit.ipd.sdq.cbsm.assembly.impl.AssemblyPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.cbsm.assembly.impl.AssemblyContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.cbsm.assembly.impl.AssemblyContextImpl
	 * @see edu.kit.ipd.sdq.cbsm.assembly.impl.AssemblyPackageImpl#getAssemblyContext()
	 * @generated
	 */
	int ASSEMBLY_CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Instantiated Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT__INSTANTIATED_COMPONENT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provided Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT__PROVIDED_ROLES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Required Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT__REQUIRED_ROLES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.cbsm.assembly.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.cbsm.assembly.impl.SystemImpl
	 * @see edu.kit.ipd.sdq.cbsm.assembly.impl.AssemblyPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 1;

	/**
	 * The feature id for the '<em><b>Contained Assembly Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__CONTAINED_ASSEMBLY_CONTEXTS = 0;

	/**
	 * The feature id for the '<em><b>Provided Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__PROVIDED_ROLES = 1;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__CONNECTORS = 2;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.cbsm.assembly.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.cbsm.assembly.impl.ConnectorImpl
	 * @see edu.kit.ipd.sdq.cbsm.assembly.impl.AssemblyPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.cbsm.assembly.impl.DelegationConnectorImpl <em>Delegation Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.cbsm.assembly.impl.DelegationConnectorImpl
	 * @see edu.kit.ipd.sdq.cbsm.assembly.impl.AssemblyPackageImpl#getDelegationConnector()
	 * @generated
	 */
	int DELEGATION_CONNECTOR = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR__NAME = CONNECTOR__NAME;

	/**
	 * The number of structural features of the '<em>Delegation Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Delegation Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.cbsm.assembly.impl.ProvidedDelegationConnectorImpl <em>Provided Delegation Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.cbsm.assembly.impl.ProvidedDelegationConnectorImpl
	 * @see edu.kit.ipd.sdq.cbsm.assembly.impl.AssemblyPackageImpl#getProvidedDelegationConnector()
	 * @generated
	 */
	int PROVIDED_DELEGATION_CONNECTOR = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_DELEGATION_CONNECTOR__NAME = DELEGATION_CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Inner Provided Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_DELEGATION_CONNECTOR__INNER_PROVIDED_ROLE = DELEGATION_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outer Provided Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_DELEGATION_CONNECTOR__OUTER_PROVIDED_ROLE = DELEGATION_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Provided Delegation Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_DELEGATION_CONNECTOR_FEATURE_COUNT = DELEGATION_CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Provided Delegation Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_DELEGATION_CONNECTOR_OPERATION_COUNT = DELEGATION_CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.cbsm.assembly.impl.RequiredDelegationConnectorImpl <em>Required Delegation Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.cbsm.assembly.impl.RequiredDelegationConnectorImpl
	 * @see edu.kit.ipd.sdq.cbsm.assembly.impl.AssemblyPackageImpl#getRequiredDelegationConnector()
	 * @generated
	 */
	int REQUIRED_DELEGATION_CONNECTOR = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_DELEGATION_CONNECTOR__NAME = DELEGATION_CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Inner Required Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_DELEGATION_CONNECTOR__INNER_REQUIRED_ROLE = DELEGATION_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outer Required Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_DELEGATION_CONNECTOR__OUTER_REQUIRED_ROLE = DELEGATION_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Required Delegation Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_DELEGATION_CONNECTOR_FEATURE_COUNT = DELEGATION_CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Required Delegation Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_DELEGATION_CONNECTOR_OPERATION_COUNT = DELEGATION_CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.cbsm.assembly.impl.AssemblyConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.cbsm.assembly.impl.AssemblyConnectorImpl
	 * @see edu.kit.ipd.sdq.cbsm.assembly.impl.AssemblyPackageImpl#getAssemblyConnector()
	 * @generated
	 */
	int ASSEMBLY_CONNECTOR = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR__NAME = CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Provided Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR__PROVIDED_ROLE = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR__REQUIRED_ROLE = CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.cbsm.assembly.AssemblyContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see edu.kit.ipd.sdq.cbsm.assembly.AssemblyContext
	 * @generated
	 */
	EClass getAssemblyContext();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.cbsm.assembly.AssemblyContext#getInstantiatedComponent <em>Instantiated Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instantiated Component</em>'.
	 * @see edu.kit.ipd.sdq.cbsm.assembly.AssemblyContext#getInstantiatedComponent()
	 * @see #getAssemblyContext()
	 * @generated
	 */
	EReference getAssemblyContext_InstantiatedComponent();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.cbsm.assembly.AssemblyContext#getProvidedRoles <em>Provided Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provided Roles</em>'.
	 * @see edu.kit.ipd.sdq.cbsm.assembly.AssemblyContext#getProvidedRoles()
	 * @see #getAssemblyContext()
	 * @generated
	 */
	EReference getAssemblyContext_ProvidedRoles();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.cbsm.assembly.AssemblyContext#getRequiredRoles <em>Required Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Roles</em>'.
	 * @see edu.kit.ipd.sdq.cbsm.assembly.AssemblyContext#getRequiredRoles()
	 * @see #getAssemblyContext()
	 * @generated
	 */
	EReference getAssemblyContext_RequiredRoles();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.cbsm.assembly.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see edu.kit.ipd.sdq.cbsm.assembly.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.cbsm.assembly.System#getContainedAssemblyContexts <em>Contained Assembly Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained Assembly Contexts</em>'.
	 * @see edu.kit.ipd.sdq.cbsm.assembly.System#getContainedAssemblyContexts()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_ContainedAssemblyContexts();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.cbsm.assembly.System#getProvidedRoles <em>Provided Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provided Roles</em>'.
	 * @see edu.kit.ipd.sdq.cbsm.assembly.System#getProvidedRoles()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_ProvidedRoles();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.cbsm.assembly.System#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connectors</em>'.
	 * @see edu.kit.ipd.sdq.cbsm.assembly.System#getConnectors()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Connectors();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.cbsm.assembly.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see edu.kit.ipd.sdq.cbsm.assembly.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.cbsm.assembly.DelegationConnector <em>Delegation Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delegation Connector</em>'.
	 * @see edu.kit.ipd.sdq.cbsm.assembly.DelegationConnector
	 * @generated
	 */
	EClass getDelegationConnector();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.cbsm.assembly.ProvidedDelegationConnector <em>Provided Delegation Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Delegation Connector</em>'.
	 * @see edu.kit.ipd.sdq.cbsm.assembly.ProvidedDelegationConnector
	 * @generated
	 */
	EClass getProvidedDelegationConnector();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.cbsm.assembly.ProvidedDelegationConnector#getInnerProvidedRole <em>Inner Provided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inner Provided Role</em>'.
	 * @see edu.kit.ipd.sdq.cbsm.assembly.ProvidedDelegationConnector#getInnerProvidedRole()
	 * @see #getProvidedDelegationConnector()
	 * @generated
	 */
	EReference getProvidedDelegationConnector_InnerProvidedRole();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.cbsm.assembly.ProvidedDelegationConnector#getOuterProvidedRole <em>Outer Provided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outer Provided Role</em>'.
	 * @see edu.kit.ipd.sdq.cbsm.assembly.ProvidedDelegationConnector#getOuterProvidedRole()
	 * @see #getProvidedDelegationConnector()
	 * @generated
	 */
	EReference getProvidedDelegationConnector_OuterProvidedRole();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.cbsm.assembly.RequiredDelegationConnector <em>Required Delegation Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Delegation Connector</em>'.
	 * @see edu.kit.ipd.sdq.cbsm.assembly.RequiredDelegationConnector
	 * @generated
	 */
	EClass getRequiredDelegationConnector();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.cbsm.assembly.RequiredDelegationConnector#getInnerRequiredRole <em>Inner Required Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inner Required Role</em>'.
	 * @see edu.kit.ipd.sdq.cbsm.assembly.RequiredDelegationConnector#getInnerRequiredRole()
	 * @see #getRequiredDelegationConnector()
	 * @generated
	 */
	EReference getRequiredDelegationConnector_InnerRequiredRole();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.cbsm.assembly.RequiredDelegationConnector#getOuterRequiredRole <em>Outer Required Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outer Required Role</em>'.
	 * @see edu.kit.ipd.sdq.cbsm.assembly.RequiredDelegationConnector#getOuterRequiredRole()
	 * @see #getRequiredDelegationConnector()
	 * @generated
	 */
	EReference getRequiredDelegationConnector_OuterRequiredRole();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.cbsm.assembly.AssemblyConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see edu.kit.ipd.sdq.cbsm.assembly.AssemblyConnector
	 * @generated
	 */
	EClass getAssemblyConnector();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.cbsm.assembly.AssemblyConnector#getProvidedRole <em>Provided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provided Role</em>'.
	 * @see edu.kit.ipd.sdq.cbsm.assembly.AssemblyConnector#getProvidedRole()
	 * @see #getAssemblyConnector()
	 * @generated
	 */
	EReference getAssemblyConnector_ProvidedRole();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.cbsm.assembly.AssemblyConnector#getRequiredRole <em>Required Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Required Role</em>'.
	 * @see edu.kit.ipd.sdq.cbsm.assembly.AssemblyConnector#getRequiredRole()
	 * @see #getAssemblyConnector()
	 * @generated
	 */
	EReference getAssemblyConnector_RequiredRole();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AssemblyFactory getAssemblyFactory();

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
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.cbsm.assembly.impl.AssemblyContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.cbsm.assembly.impl.AssemblyContextImpl
		 * @see edu.kit.ipd.sdq.cbsm.assembly.impl.AssemblyPackageImpl#getAssemblyContext()
		 * @generated
		 */
		EClass ASSEMBLY_CONTEXT = eINSTANCE.getAssemblyContext();

		/**
		 * The meta object literal for the '<em><b>Instantiated Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONTEXT__INSTANTIATED_COMPONENT = eINSTANCE.getAssemblyContext_InstantiatedComponent();

		/**
		 * The meta object literal for the '<em><b>Provided Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONTEXT__PROVIDED_ROLES = eINSTANCE.getAssemblyContext_ProvidedRoles();

		/**
		 * The meta object literal for the '<em><b>Required Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONTEXT__REQUIRED_ROLES = eINSTANCE.getAssemblyContext_RequiredRoles();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.cbsm.assembly.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.cbsm.assembly.impl.SystemImpl
		 * @see edu.kit.ipd.sdq.cbsm.assembly.impl.AssemblyPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Contained Assembly Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__CONTAINED_ASSEMBLY_CONTEXTS = eINSTANCE.getSystem_ContainedAssemblyContexts();

		/**
		 * The meta object literal for the '<em><b>Provided Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__PROVIDED_ROLES = eINSTANCE.getSystem_ProvidedRoles();

		/**
		 * The meta object literal for the '<em><b>Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__CONNECTORS = eINSTANCE.getSystem_Connectors();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.cbsm.assembly.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.cbsm.assembly.impl.ConnectorImpl
		 * @see edu.kit.ipd.sdq.cbsm.assembly.impl.AssemblyPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.cbsm.assembly.impl.DelegationConnectorImpl <em>Delegation Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.cbsm.assembly.impl.DelegationConnectorImpl
		 * @see edu.kit.ipd.sdq.cbsm.assembly.impl.AssemblyPackageImpl#getDelegationConnector()
		 * @generated
		 */
		EClass DELEGATION_CONNECTOR = eINSTANCE.getDelegationConnector();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.cbsm.assembly.impl.ProvidedDelegationConnectorImpl <em>Provided Delegation Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.cbsm.assembly.impl.ProvidedDelegationConnectorImpl
		 * @see edu.kit.ipd.sdq.cbsm.assembly.impl.AssemblyPackageImpl#getProvidedDelegationConnector()
		 * @generated
		 */
		EClass PROVIDED_DELEGATION_CONNECTOR = eINSTANCE.getProvidedDelegationConnector();

		/**
		 * The meta object literal for the '<em><b>Inner Provided Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDED_DELEGATION_CONNECTOR__INNER_PROVIDED_ROLE = eINSTANCE.getProvidedDelegationConnector_InnerProvidedRole();

		/**
		 * The meta object literal for the '<em><b>Outer Provided Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDED_DELEGATION_CONNECTOR__OUTER_PROVIDED_ROLE = eINSTANCE.getProvidedDelegationConnector_OuterProvidedRole();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.cbsm.assembly.impl.RequiredDelegationConnectorImpl <em>Required Delegation Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.cbsm.assembly.impl.RequiredDelegationConnectorImpl
		 * @see edu.kit.ipd.sdq.cbsm.assembly.impl.AssemblyPackageImpl#getRequiredDelegationConnector()
		 * @generated
		 */
		EClass REQUIRED_DELEGATION_CONNECTOR = eINSTANCE.getRequiredDelegationConnector();

		/**
		 * The meta object literal for the '<em><b>Inner Required Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_DELEGATION_CONNECTOR__INNER_REQUIRED_ROLE = eINSTANCE.getRequiredDelegationConnector_InnerRequiredRole();

		/**
		 * The meta object literal for the '<em><b>Outer Required Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_DELEGATION_CONNECTOR__OUTER_REQUIRED_ROLE = eINSTANCE.getRequiredDelegationConnector_OuterRequiredRole();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.cbsm.assembly.impl.AssemblyConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.cbsm.assembly.impl.AssemblyConnectorImpl
		 * @see edu.kit.ipd.sdq.cbsm.assembly.impl.AssemblyPackageImpl#getAssemblyConnector()
		 * @generated
		 */
		EClass ASSEMBLY_CONNECTOR = eINSTANCE.getAssemblyConnector();

		/**
		 * The meta object literal for the '<em><b>Provided Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONNECTOR__PROVIDED_ROLE = eINSTANCE.getAssemblyConnector_ProvidedRole();

		/**
		 * The meta object literal for the '<em><b>Required Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONNECTOR__REQUIRED_ROLE = eINSTANCE.getAssemblyConnector_RequiredRole();

	}

} //AssemblyPackage
