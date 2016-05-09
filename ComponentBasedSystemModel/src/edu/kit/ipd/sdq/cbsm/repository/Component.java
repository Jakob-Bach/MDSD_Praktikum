/**
 */
package edu.kit.ipd.sdq.cbsm.repository;

import edu.kit.ipd.sdq.cbsm.core.NamedElement;
import edu.kit.ipd.sdq.cbsm.repository.behavior.BehaviorDescription;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.repository.Component#getBehaviorDescription <em>Behavior Description</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.cbsm.repository.RepositoryPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends NamedElement, ProvidingAndRequiringElement {
	/**
	 * Returns the value of the '<em><b>Behavior Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior Description</em>' containment reference.
	 * @see #setBehaviorDescription(BehaviorDescription)
	 * @see edu.kit.ipd.sdq.cbsm.repository.RepositoryPackage#getComponent_BehaviorDescription()
	 * @model containment="true"
	 * @generated
	 */
	BehaviorDescription getBehaviorDescription();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.cbsm.repository.Component#getBehaviorDescription <em>Behavior Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior Description</em>' containment reference.
	 * @see #getBehaviorDescription()
	 * @generated
	 */
	void setBehaviorDescription(BehaviorDescription value);

} // Component
