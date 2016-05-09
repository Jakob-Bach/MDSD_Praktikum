/**
 */
package edu.kit.ipd.sdq.cbsm.environment;

import edu.kit.ipd.sdq.cbsm.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.environment.Container#getParentEnvironment <em>Parent Environment</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.cbsm.environment.EnvironmentPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Parent Environment</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.cbsm.environment.Environment#getContainers <em>Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Environment</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Environment</em>' container reference.
	 * @see #setParentEnvironment(Environment)
	 * @see edu.kit.ipd.sdq.cbsm.environment.EnvironmentPackage#getContainer_ParentEnvironment()
	 * @see edu.kit.ipd.sdq.cbsm.environment.Environment#getContainers
	 * @model opposite="containers" required="true" transient="false"
	 * @generated
	 */
	Environment getParentEnvironment();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.cbsm.environment.Container#getParentEnvironment <em>Parent Environment</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Environment</em>' container reference.
	 * @see #getParentEnvironment()
	 * @generated
	 */
	void setParentEnvironment(Environment value);
} // Container
