/**
 */
package edu.kit.ipd.sdq.cbsm.repository;

import edu.kit.ipd.sdq.cbsm.core.NamedElement;
import edu.kit.ipd.sdq.cbsm.repository.behavior.BehaviorDescription;
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
 *   <li>{@link edu.kit.ipd.sdq.cbsm.repository.Component#getProvidedRoles <em>Provided Roles</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.repository.Component#getRequiredRole <em>Required Role</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.repository.Component#getBehaviorDescription <em>Behavior Description</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.cbsm.repository.RepositoryPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Provided Roles</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.cbsm.repository.ProvidedRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Roles</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.cbsm.repository.RepositoryPackage#getComponent_ProvidedRoles()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProvidedRole> getProvidedRoles();

	/**
	 * Returns the value of the '<em><b>Required Role</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.cbsm.repository.RequiredRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Role</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Role</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.cbsm.repository.RepositoryPackage#getComponent_RequiredRole()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequiredRole> getRequiredRole();

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
