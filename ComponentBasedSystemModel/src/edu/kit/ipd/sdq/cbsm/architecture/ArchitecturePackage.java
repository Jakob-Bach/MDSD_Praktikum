/**
 */
package edu.kit.ipd.sdq.cbsm.architecture;

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
 * @see edu.kit.ipd.sdq.cbsm.architecture.ArchitectureFactory
 * @model kind="package"
 * @generated
 */
public interface ArchitecturePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "architecture";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.kit.edu/componentBasedSystemModel/architecture";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "architecture";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArchitecturePackage eINSTANCE = edu.kit.ipd.sdq.cbsm.architecture.impl.ArchitecturePackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.cbsm.architecture.impl.CompleteArchitectureImpl <em>Complete Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.cbsm.architecture.impl.CompleteArchitectureImpl
	 * @see edu.kit.ipd.sdq.cbsm.architecture.impl.ArchitecturePackageImpl#getCompleteArchitecture()
	 * @generated
	 */
	int COMPLETE_ARCHITECTURE = 0;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_ARCHITECTURE__REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_ARCHITECTURE__SYSTEM = 1;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_ARCHITECTURE__ENVIRONMENT = 2;

	/**
	 * The feature id for the '<em><b>Allocation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_ARCHITECTURE__ALLOCATION = 3;

	/**
	 * The number of structural features of the '<em>Complete Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_ARCHITECTURE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Complete Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_ARCHITECTURE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.cbsm.architecture.CompleteArchitecture <em>Complete Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complete Architecture</em>'.
	 * @see edu.kit.ipd.sdq.cbsm.architecture.CompleteArchitecture
	 * @generated
	 */
	EClass getCompleteArchitecture();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.cbsm.architecture.CompleteArchitecture#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repository</em>'.
	 * @see edu.kit.ipd.sdq.cbsm.architecture.CompleteArchitecture#getRepository()
	 * @see #getCompleteArchitecture()
	 * @generated
	 */
	EReference getCompleteArchitecture_Repository();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.cbsm.architecture.CompleteArchitecture#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>System</em>'.
	 * @see edu.kit.ipd.sdq.cbsm.architecture.CompleteArchitecture#getSystem()
	 * @see #getCompleteArchitecture()
	 * @generated
	 */
	EReference getCompleteArchitecture_System();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.cbsm.architecture.CompleteArchitecture#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Environment</em>'.
	 * @see edu.kit.ipd.sdq.cbsm.architecture.CompleteArchitecture#getEnvironment()
	 * @see #getCompleteArchitecture()
	 * @generated
	 */
	EReference getCompleteArchitecture_Environment();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.cbsm.architecture.CompleteArchitecture#getAllocation <em>Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Allocation</em>'.
	 * @see edu.kit.ipd.sdq.cbsm.architecture.CompleteArchitecture#getAllocation()
	 * @see #getCompleteArchitecture()
	 * @generated
	 */
	EReference getCompleteArchitecture_Allocation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ArchitectureFactory getArchitectureFactory();

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
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.cbsm.architecture.impl.CompleteArchitectureImpl <em>Complete Architecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.cbsm.architecture.impl.CompleteArchitectureImpl
		 * @see edu.kit.ipd.sdq.cbsm.architecture.impl.ArchitecturePackageImpl#getCompleteArchitecture()
		 * @generated
		 */
		EClass COMPLETE_ARCHITECTURE = eINSTANCE.getCompleteArchitecture();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLETE_ARCHITECTURE__REPOSITORY = eINSTANCE.getCompleteArchitecture_Repository();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLETE_ARCHITECTURE__SYSTEM = eINSTANCE.getCompleteArchitecture_System();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLETE_ARCHITECTURE__ENVIRONMENT = eINSTANCE.getCompleteArchitecture_Environment();

		/**
		 * The meta object literal for the '<em><b>Allocation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLETE_ARCHITECTURE__ALLOCATION = eINSTANCE.getCompleteArchitecture_Allocation();

	}

} //ArchitecturePackage
