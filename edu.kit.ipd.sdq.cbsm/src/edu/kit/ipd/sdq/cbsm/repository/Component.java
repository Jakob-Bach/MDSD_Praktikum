/**
 */
package edu.kit.ipd.sdq.cbsm.repository;

import edu.kit.ipd.sdq.cbsm.core.NamedElement;
import edu.kit.ipd.sdq.cbsm.repository.behavior.ComponentBehaviorDescription;
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
 *   <li>{@link edu.kit.ipd.sdq.cbsm.repository.Component#getBehaviorDescriptions <em>Behavior Descriptions</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.cbsm.repository.RepositoryPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends NamedElement, ProvidingAndRequiringElement {
	/**
	 * Returns the value of the '<em><b>Behavior Descriptions</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.cbsm.repository.behavior.ComponentBehaviorDescription}.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.cbsm.repository.behavior.ComponentBehaviorDescription#getDescribedComponent <em>Described Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior Descriptions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior Descriptions</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.cbsm.repository.RepositoryPackage#getComponent_BehaviorDescriptions()
	 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.ComponentBehaviorDescription#getDescribedComponent
	 * @model opposite="describedComponent" containment="true"
	 * @generated
	 */
	EList<ComponentBehaviorDescription> getBehaviorDescriptions();

} // Component
