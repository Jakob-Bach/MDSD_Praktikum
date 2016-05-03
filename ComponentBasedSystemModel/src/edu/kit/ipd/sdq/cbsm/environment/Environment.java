/**
 */
package edu.kit.ipd.sdq.cbsm.environment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.environment.Environment#getContainers <em>Containers</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.environment.Environment#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.cbsm.environment.EnvironmentPackage#getEnvironment()
 * @model
 * @generated
 */
public interface Environment extends EObject {
	/**
	 * Returns the value of the '<em><b>Containers</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.cbsm.environment.Container}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containers</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.cbsm.environment.EnvironmentPackage#getEnvironment_Containers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Container> getContainers();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.cbsm.environment.Link}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.cbsm.environment.EnvironmentPackage#getEnvironment_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLinks();

} // Environment
