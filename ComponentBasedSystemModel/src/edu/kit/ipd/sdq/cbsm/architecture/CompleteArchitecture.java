/**
 */
package edu.kit.ipd.sdq.cbsm.architecture;

import edu.kit.ipd.sdq.cbsm.allocation.Allocation;

import edu.kit.ipd.sdq.cbsm.environment.Environment;

import edu.kit.ipd.sdq.cbsm.repository.Repository;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complete Architecture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.architecture.CompleteArchitecture#getRepository <em>Repository</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.architecture.CompleteArchitecture#getSystem <em>System</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.architecture.CompleteArchitecture#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.architecture.CompleteArchitecture#getAllocation <em>Allocation</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.cbsm.architecture.ArchitecturePackage#getCompleteArchitecture()
 * @model
 * @generated
 */
public interface CompleteArchitecture extends EObject {
	/**
	 * Returns the value of the '<em><b>Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' containment reference.
	 * @see #setRepository(Repository)
	 * @see edu.kit.ipd.sdq.cbsm.architecture.ArchitecturePackage#getCompleteArchitecture_Repository()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Repository getRepository();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.cbsm.architecture.CompleteArchitecture#getRepository <em>Repository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' containment reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(Repository value);

	/**
	 * Returns the value of the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' containment reference.
	 * @see #setSystem(edu.kit.ipd.sdq.cbsm.assembly.System)
	 * @see edu.kit.ipd.sdq.cbsm.architecture.ArchitecturePackage#getCompleteArchitecture_System()
	 * @model containment="true" required="true"
	 * @generated
	 */
	edu.kit.ipd.sdq.cbsm.assembly.System getSystem();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.cbsm.architecture.CompleteArchitecture#getSystem <em>System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' containment reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(edu.kit.ipd.sdq.cbsm.assembly.System value);

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Environment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' containment reference.
	 * @see #setEnvironment(Environment)
	 * @see edu.kit.ipd.sdq.cbsm.architecture.ArchitecturePackage#getCompleteArchitecture_Environment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Environment getEnvironment();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.cbsm.architecture.CompleteArchitecture#getEnvironment <em>Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' containment reference.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(Environment value);

	/**
	 * Returns the value of the '<em><b>Allocation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocation</em>' containment reference.
	 * @see #setAllocation(Allocation)
	 * @see edu.kit.ipd.sdq.cbsm.architecture.ArchitecturePackage#getCompleteArchitecture_Allocation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Allocation getAllocation();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.cbsm.architecture.CompleteArchitecture#getAllocation <em>Allocation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocation</em>' containment reference.
	 * @see #getAllocation()
	 * @generated
	 */
	void setAllocation(Allocation value);

} // CompleteArchitecture
