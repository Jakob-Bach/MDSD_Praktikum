/**
 */
package edu.kit.ipd.sdq.cbsm.repository;

import edu.kit.ipd.sdq.cbsm.core.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.repository.Component#getProvidedInterfaces <em>Provided Interfaces</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.repository.Component#getRequiredInterfaces <em>Required Interfaces</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.repository.Component#getProvidedServices <em>Provided Services</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.repository.Component#getBehaviorDescriptions <em>Behavior Descriptions</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.cbsm.repository.RepositoryPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Provided Interfaces</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.cbsm.repository.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Interfaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Interfaces</em>' reference list.
	 * @see edu.kit.ipd.sdq.cbsm.repository.RepositoryPackage#getComponent_ProvidedInterfaces()
	 * @model
	 * @generated
	 */
	EList<Interface> getProvidedInterfaces();

	/**
	 * Returns the value of the '<em><b>Required Interfaces</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.cbsm.repository.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Interfaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Interfaces</em>' reference list.
	 * @see edu.kit.ipd.sdq.cbsm.repository.RepositoryPackage#getComponent_RequiredInterfaces()
	 * @model
	 * @generated
	 */
	EList<Interface> getRequiredInterfaces();

	/**
	 * Returns the value of the '<em><b>Provided Services</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.cbsm.repository.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Services</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.cbsm.repository.RepositoryPackage#getComponent_ProvidedServices()
	 * @model containment="true"
	 * @generated
	 */
	EList<Service> getProvidedServices();

	/**
	 * Returns the value of the '<em><b>Behavior Descriptions</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.cbsm.repository.BehaviorDescription}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior Descriptions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior Descriptions</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.cbsm.repository.RepositoryPackage#getComponent_BehaviorDescriptions()
	 * @model containment="true"
	 * @generated
	 */
	EList<BehaviorDescription> getBehaviorDescriptions();

} // Component
