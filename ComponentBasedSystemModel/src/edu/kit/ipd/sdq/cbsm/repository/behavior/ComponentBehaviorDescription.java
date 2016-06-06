/**
 */
package edu.kit.ipd.sdq.cbsm.repository.behavior;

import edu.kit.ipd.sdq.cbsm.repository.Component;
import edu.kit.ipd.sdq.cbsm.repository.Signature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Behavior Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.repository.behavior.ComponentBehaviorDescription#getProvidedService <em>Provided Service</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.repository.behavior.ComponentBehaviorDescription#getDescribedComponent <em>Described Component</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.BehaviorPackage#getComponentBehaviorDescription()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ProvidedServiceMustBelongToComponentsProvidedInterfaces'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ProvidedServiceMustBelongToComponentsProvidedInterfaces='\n\t\t\t\t\tself.describedComponent.providedRoles.providedInterface.signatures\n\t\t\t\t\t\t->includes(self.providedService)'"
 * @generated
 */
public interface ComponentBehaviorDescription extends BehaviorDescription {
	/**
	 * Returns the value of the '<em><b>Provided Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Service</em>' reference.
	 * @see #setProvidedService(Signature)
	 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.BehaviorPackage#getComponentBehaviorDescription_ProvidedService()
	 * @model required="true"
	 * @generated
	 */
	Signature getProvidedService();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.cbsm.repository.behavior.ComponentBehaviorDescription#getProvidedService <em>Provided Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Service</em>' reference.
	 * @see #getProvidedService()
	 * @generated
	 */
	void setProvidedService(Signature value);

	/**
	 * Returns the value of the '<em><b>Described Component</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.cbsm.repository.Component#getBehaviorDescriptions <em>Behavior Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Described Component</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Described Component</em>' container reference.
	 * @see #setDescribedComponent(Component)
	 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.BehaviorPackage#getComponentBehaviorDescription_DescribedComponent()
	 * @see edu.kit.ipd.sdq.cbsm.repository.Component#getBehaviorDescriptions
	 * @model opposite="behaviorDescriptions" required="true" transient="false"
	 * @generated
	 */
	Component getDescribedComponent();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.cbsm.repository.behavior.ComponentBehaviorDescription#getDescribedComponent <em>Described Component</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Described Component</em>' container reference.
	 * @see #getDescribedComponent()
	 * @generated
	 */
	void setDescribedComponent(Component value);

} // ComponentBehaviorDescription
