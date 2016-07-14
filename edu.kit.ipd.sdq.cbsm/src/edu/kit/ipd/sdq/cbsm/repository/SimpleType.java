/**
 */
package edu.kit.ipd.sdq.cbsm.repository;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.repository.SimpleType#getTypeInstance <em>Type Instance</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.cbsm.repository.RepositoryPackage#getSimpleType()
 * @model
 * @generated
 */
public interface SimpleType extends DataType {
	/**
	 * Returns the value of the '<em><b>Type Instance</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.kit.ipd.sdq.cbsm.repository.SimpleTypeInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Instance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Instance</em>' attribute.
	 * @see edu.kit.ipd.sdq.cbsm.repository.SimpleTypeInstance
	 * @see #setTypeInstance(SimpleTypeInstance)
	 * @see edu.kit.ipd.sdq.cbsm.repository.RepositoryPackage#getSimpleType_TypeInstance()
	 * @model required="true"
	 * @generated
	 */
	SimpleTypeInstance getTypeInstance();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.cbsm.repository.SimpleType#getTypeInstance <em>Type Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Instance</em>' attribute.
	 * @see edu.kit.ipd.sdq.cbsm.repository.SimpleTypeInstance
	 * @see #getTypeInstance()
	 * @generated
	 */
	void setTypeInstance(SimpleTypeInstance value);

} // SimpleType
