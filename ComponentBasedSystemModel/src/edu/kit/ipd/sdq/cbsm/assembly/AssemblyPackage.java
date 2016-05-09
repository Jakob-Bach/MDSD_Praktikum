/**
 */
package edu.kit.ipd.sdq.cbsm.assembly;

import edu.kit.ipd.sdq.cbsm.core.CorePackage;
import edu.kit.ipd.sdq.cbsm.repository.RepositoryPackage;
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
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
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
	 * The feature id for the '<em><b>Assembly Context Provided Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT__ASSEMBLY_CONTEXT_PROVIDED_ROLES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Assembly Context Required Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT__ASSEMBLY_CONTEXT_REQUIRED_ROLES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Composite Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT__PARENT_COMPOSITE_ELEMENT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.cbsm.assembly.impl.CompositeProvidingAndRequiringElementImpl <em>Composite Providing And Requiring Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.cbsm.assembly.impl.CompositeProvidingAndRequiringElementImpl
	 * @see edu.kit.ipd.sdq.cbsm.assembly.impl.AssemblyPackageImpl#getCompositeProvidingAndRequiringElement()
	 * @generated
	 */
	int COMPOSITE_PROVIDING_AND_REQUIRING_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Provided Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PROVIDING_AND_REQUIRING_ELEMENT__PROVIDED_ROLES = RepositoryPackage.PROVIDING_AND_REQUIRING_ELEMENT__PROVIDED_ROLES;

	/**
	 * The feature id for the '<em><b>Required Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PROVIDING_AND_REQUIRING_ELEMENT__REQUIRED_ROLES = RepositoryPackage.PROVIDING_AND_REQUIRING_ELEMENT__REQUIRED_ROLES;

	/**
	 * The feature id for the '<em><b>Contained Assembly Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PROVIDING_AND_REQUIRING_ELEMENT__CONTAINED_ASSEMBLY_CONTEXTS = RepositoryPackage.PROVIDING_AND_REQUIRING_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Providing And Requiring Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PROVIDING_AND_REQUIRING_ELEMENT_FEATURE_COUNT = RepositoryPackage.PROVIDING_AND_REQUIRING_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composite Providing And Requiring Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PROVIDING_AND_REQUIRING_ELEMENT_OPERATION_COUNT = RepositoryPackage.PROVIDING_AND_REQUIRING_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.cbsm.assembly.impl.CompositeComponentImpl <em>Composite Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.cbsm.assembly.impl.CompositeComponentImpl
	 * @see edu.kit.ipd.sdq.cbsm.assembly.impl.AssemblyPackageImpl#getCompositeComponent()
	 * @generated
	 */
	int COMPOSITE_COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__NAME = RepositoryPackage.COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Provided Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__PROVIDED_ROLES = RepositoryPackage.COMPONENT__PROVIDED_ROLES;

	/**
	 * The feature id for the '<em><b>Required Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__REQUIRED_ROLES = RepositoryPackage.COMPONENT__REQUIRED_ROLES;

	/**
	 * The feature id for the '<em><b>Behavior Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__BEHAVIOR_DESCRIPTION = RepositoryPackage.COMPONENT__BEHAVIOR_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Contained Assembly Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__CONTAINED_ASSEMBLY_CONTEXTS = RepositoryPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT_FEATURE_COUNT = RepositoryPackage.COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composite Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT_OPERATION_COUNT = RepositoryPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.cbsm.assembly.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.cbsm.assembly.impl.SystemImpl
	 * @see edu.kit.ipd.sdq.cbsm.assembly.impl.AssemblyPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 3;

	/**
	 * The feature id for the '<em><b>Provided Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__PROVIDED_ROLES = COMPOSITE_PROVIDING_AND_REQUIRING_ELEMENT__PROVIDED_ROLES;

	/**
	 * The feature id for the '<em><b>Required Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__REQUIRED_ROLES = COMPOSITE_PROVIDING_AND_REQUIRING_ELEMENT__REQUIRED_ROLES;

	/**
	 * The feature id for the '<em><b>Contained Assembly Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__CONTAINED_ASSEMBLY_CONTEXTS = COMPOSITE_PROVIDING_AND_REQUIRING_ELEMENT__CONTAINED_ASSEMBLY_CONTEXTS;

	/**
	 * The feature id for the '<em><b>System Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SYSTEM_CONNECTORS = COMPOSITE_PROVIDING_AND_REQUIRING_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = COMPOSITE_PROVIDING_AND_REQUIRING_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = COMPOSITE_PROVIDING_AND_REQUIRING_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.cbsm.assembly.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.cbsm.assembly.impl.ConnectorImpl
	 * @see edu.kit.ipd.sdq.cbsm.assembly.impl.AssemblyPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 4;

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
	int DELEGATION_CONNECTOR = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR__NAME = CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Inner Assembly Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR__INNER_ASSEMBLY_CONTEXT = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outer Assembly Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR__OUTER_ASSEMBLY_CONTEXT = CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Delegation Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 2;

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
	int PROVIDED_DELEGATION_CONNECTOR = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_DELEGATION_CONNECTOR__NAME = DELEGATION_CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Inner Assembly Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_DELEGATION_CONNECTOR__INNER_ASSEMBLY_CONTEXT = DELEGATION_CONNECTOR__INNER_ASSEMBLY_CONTEXT;

	/**
	 * The feature id for the '<em><b>Outer Assembly Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_DELEGATION_CONNECTOR__OUTER_ASSEMBLY_CONTEXT = DELEGATION_CONNECTOR__OUTER_ASSEMBLY_CONTEXT;

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
	int REQUIRED_DELEGATION_CONNECTOR = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_DELEGATION_CONNECTOR__NAME = DELEGATION_CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Inner Assembly Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_DELEGATION_CONNECTOR__INNER_ASSEMBLY_CONTEXT = DELEGATION_CONNECTOR__INNER_ASSEMBLY_CONTEXT;

	/**
	 * The feature id for the '<em><b>Outer Assembly Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_DELEGATION_CONNECTOR__OUTER_ASSEMBLY_CONTEXT = DELEGATION_CONNECTOR__OUTER_ASSEMBLY_CONTEXT;

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
	int ASSEMBLY_CONNECTOR = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR__NAME = CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Connected Provided Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR__CONNECTED_PROVIDED_ROLE = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connected Required Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR__CONNECTED_REQUIRED_ROLE = CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connected Provided Assembly Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR__CONNECTED_PROVIDED_ASSEMBLY_CONTEXT = CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Connected Required Assembly Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR__CONNECTED_REQUIRED_ASSEMBLY_CONTEXT = CONNECTOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 4;

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
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.cbsm.assembly.AssemblyContext#getAssemblyContextProvidedRoles <em>Assembly Context Provided Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assembly Context Provided Roles</em>'.
	 * @see edu.kit.ipd.sdq.cbsm.assembly.AssemblyContext#getAssemblyContextProvidedRoles()
	 * @see #getAssemblyContext()
	 * @generated
	 */
	EReference getAssemblyContext_AssemblyContextProvidedRoles();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.cbsm.assembly.AssemblyContext#getAssemblyContextRequiredRoles <em>Assembly Context Required Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assembly Context Required Roles</em>'.
	 * @see edu.kit.ipd.sdq.cbsm.assembly.AssemblyContext#getAssemblyContextRequiredRoles()
	 * @see #getAssemblyContext()
	 * @generated
	 */
	EReference getAssemblyContext_AssemblyContextRequiredRoles();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.cbsm.assembly.AssemblyContext#getParentCompositeElement <em>Parent Composite Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Composite Element</em>'.
	 * @see edu.kit.ipd.sdq.cbsm.assembly.AssemblyContext#getParentCompositeElement()
	 * @see #getAssemblyContext()
	 * @generated
	 */
	EReference getAssemblyContext_ParentCompositeElement();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.cbsm.assembly.CompositeProvidingAndRequiringElement <em>Composite Providing And Requiring Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Providing And Requiring Element</em>'.
	 * @see edu.kit.ipd.sdq.cbsm.assembly.CompositeProvidingAndRequiringElement
	 * @generated
	 */
	EClass getCompositeProvidingAndRequiringElement();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.cbsm.assembly.CompositeProvidingAndRequiringElement#getContainedAssemblyContexts <em>Contained Assembly Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained Assembly Contexts</em>'.
	 * @see edu.kit.ipd.sdq.cbsm.assembly.CompositeProvidingAndRequiringElement#getContainedAssemblyContexts()
	 * @see #getCompositeProvidingAndRequiringElement()
	 * @generated
	 */
	EReference getCompositeProvidingAndRequiringElement_ContainedAssemblyContexts();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.cbsm.assembly.CompositeComponent <em>Composite Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Component</em>'.
	 * @see edu.kit.ipd.sdq.cbsm.assembly.CompositeComponent
	 * @generated
	 */
	EClass getCompositeComponent();

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
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.cbsm.assembly.System#getSystemConnectors <em>System Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System Connectors</em>'.
	 * @see edu.kit.ipd.sdq.cbsm.assembly.System#getSystemConnectors()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_SystemConnectors();

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
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.cbsm.assembly.DelegationConnector#getInnerAssemblyContext <em>Inner Assembly Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inner Assembly Context</em>'.
	 * @see edu.kit.ipd.sdq.cbsm.assembly.DelegationConnector#getInnerAssemblyContext()
	 * @see #getDelegationConnector()
	 * @generated
	 */
	EReference getDelegationConnector_InnerAssemblyContext();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.cbsm.assembly.DelegationConnector#getOuterAssemblyContext <em>Outer Assembly Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outer Assembly Context</em>'.
	 * @see edu.kit.ipd.sdq.cbsm.assembly.DelegationConnector#getOuterAssemblyContext()
	 * @see #getDelegationConnector()
	 * @generated
	 */
	EReference getDelegationConnector_OuterAssemblyContext();

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
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.cbsm.assembly.AssemblyConnector#getConnectedProvidedRole <em>Connected Provided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connected Provided Role</em>'.
	 * @see edu.kit.ipd.sdq.cbsm.assembly.AssemblyConnector#getConnectedProvidedRole()
	 * @see #getAssemblyConnector()
	 * @generated
	 */
	EReference getAssemblyConnector_ConnectedProvidedRole();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.cbsm.assembly.AssemblyConnector#getConnectedRequiredRole <em>Connected Required Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connected Required Role</em>'.
	 * @see edu.kit.ipd.sdq.cbsm.assembly.AssemblyConnector#getConnectedRequiredRole()
	 * @see #getAssemblyConnector()
	 * @generated
	 */
	EReference getAssemblyConnector_ConnectedRequiredRole();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.cbsm.assembly.AssemblyConnector#getConnectedProvidedAssemblyContext <em>Connected Provided Assembly Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connected Provided Assembly Context</em>'.
	 * @see edu.kit.ipd.sdq.cbsm.assembly.AssemblyConnector#getConnectedProvidedAssemblyContext()
	 * @see #getAssemblyConnector()
	 * @generated
	 */
	EReference getAssemblyConnector_ConnectedProvidedAssemblyContext();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.cbsm.assembly.AssemblyConnector#getConnectedRequiredAssemblyContext <em>Connected Required Assembly Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connected Required Assembly Context</em>'.
	 * @see edu.kit.ipd.sdq.cbsm.assembly.AssemblyConnector#getConnectedRequiredAssemblyContext()
	 * @see #getAssemblyConnector()
	 * @generated
	 */
	EReference getAssemblyConnector_ConnectedRequiredAssemblyContext();

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
		 * The meta object literal for the '<em><b>Assembly Context Provided Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONTEXT__ASSEMBLY_CONTEXT_PROVIDED_ROLES = eINSTANCE.getAssemblyContext_AssemblyContextProvidedRoles();

		/**
		 * The meta object literal for the '<em><b>Assembly Context Required Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONTEXT__ASSEMBLY_CONTEXT_REQUIRED_ROLES = eINSTANCE.getAssemblyContext_AssemblyContextRequiredRoles();

		/**
		 * The meta object literal for the '<em><b>Parent Composite Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONTEXT__PARENT_COMPOSITE_ELEMENT = eINSTANCE.getAssemblyContext_ParentCompositeElement();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.cbsm.assembly.impl.CompositeProvidingAndRequiringElementImpl <em>Composite Providing And Requiring Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.cbsm.assembly.impl.CompositeProvidingAndRequiringElementImpl
		 * @see edu.kit.ipd.sdq.cbsm.assembly.impl.AssemblyPackageImpl#getCompositeProvidingAndRequiringElement()
		 * @generated
		 */
		EClass COMPOSITE_PROVIDING_AND_REQUIRING_ELEMENT = eINSTANCE.getCompositeProvidingAndRequiringElement();

		/**
		 * The meta object literal for the '<em><b>Contained Assembly Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_PROVIDING_AND_REQUIRING_ELEMENT__CONTAINED_ASSEMBLY_CONTEXTS = eINSTANCE.getCompositeProvidingAndRequiringElement_ContainedAssemblyContexts();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.cbsm.assembly.impl.CompositeComponentImpl <em>Composite Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.cbsm.assembly.impl.CompositeComponentImpl
		 * @see edu.kit.ipd.sdq.cbsm.assembly.impl.AssemblyPackageImpl#getCompositeComponent()
		 * @generated
		 */
		EClass COMPOSITE_COMPONENT = eINSTANCE.getCompositeComponent();

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
		 * The meta object literal for the '<em><b>System Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__SYSTEM_CONNECTORS = eINSTANCE.getSystem_SystemConnectors();

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
		 * The meta object literal for the '<em><b>Inner Assembly Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATION_CONNECTOR__INNER_ASSEMBLY_CONTEXT = eINSTANCE.getDelegationConnector_InnerAssemblyContext();

		/**
		 * The meta object literal for the '<em><b>Outer Assembly Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATION_CONNECTOR__OUTER_ASSEMBLY_CONTEXT = eINSTANCE.getDelegationConnector_OuterAssemblyContext();

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
		 * The meta object literal for the '<em><b>Connected Provided Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONNECTOR__CONNECTED_PROVIDED_ROLE = eINSTANCE.getAssemblyConnector_ConnectedProvidedRole();

		/**
		 * The meta object literal for the '<em><b>Connected Required Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONNECTOR__CONNECTED_REQUIRED_ROLE = eINSTANCE.getAssemblyConnector_ConnectedRequiredRole();

		/**
		 * The meta object literal for the '<em><b>Connected Provided Assembly Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONNECTOR__CONNECTED_PROVIDED_ASSEMBLY_CONTEXT = eINSTANCE.getAssemblyConnector_ConnectedProvidedAssemblyContext();

		/**
		 * The meta object literal for the '<em><b>Connected Required Assembly Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONNECTOR__CONNECTED_REQUIRED_ASSEMBLY_CONTEXT = eINSTANCE.getAssemblyConnector_ConnectedRequiredAssemblyContext();

	}

} //AssemblyPackage
