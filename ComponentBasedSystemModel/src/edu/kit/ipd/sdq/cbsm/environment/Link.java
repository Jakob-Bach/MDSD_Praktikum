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
 *   <li>{@link edu.kit.ipd.sdq.cbsm.environment.Link#getContainers <em>Containers</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.cbsm.environment.EnvironmentPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Containers</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.cbsm.environment.Container}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containers</em>' reference list.
	 * @see edu.kit.ipd.sdq.cbsm.environment.EnvironmentPackage#getLink_Containers()
	 * @model lower="2"
	 * @generated
	 */
	EList<Container> getContainers();

} // Link
