/**
 */
package edu.kit.ipd.sdq.cbsm.environment;

import edu.kit.ipd.sdq.cbsm.core.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.environment.Link#getParentEnvironment <em>Parent Environment</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.environment.Link#getLinkedContainers <em>Linked Containers</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.cbsm.environment.EnvironmentPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Parent Environment</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.cbsm.environment.Environment#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Environment</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Environment</em>' container reference.
	 * @see #setParentEnvironment(Environment)
	 * @see edu.kit.ipd.sdq.cbsm.environment.EnvironmentPackage#getLink_ParentEnvironment()
	 * @see edu.kit.ipd.sdq.cbsm.environment.Environment#getLinks
	 * @model opposite="links" required="true" transient="false"
	 * @generated
	 */
	Environment getParentEnvironment();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.cbsm.environment.Link#getParentEnvironment <em>Parent Environment</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Environment</em>' container reference.
	 * @see #getParentEnvironment()
	 * @generated
	 */
	void setParentEnvironment(Environment value);

	/**
	 * Returns the value of the '<em><b>Linked Containers</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.cbsm.environment.Container}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linked Containers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linked Containers</em>' reference list.
	 * @see edu.kit.ipd.sdq.cbsm.environment.EnvironmentPackage#getLink_LinkedContainers()
	 * @model lower="2"
	 * @generated
	 */
	EList<Container> getLinkedContainers();

} // Link
