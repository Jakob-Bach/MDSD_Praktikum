/**
 */
package edu.kit.ipd.sdq.cbsm.repository;

import edu.kit.ipd.sdq.cbsm.core.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.repository.Signature#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.repository.Signature#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.cbsm.repository.RepositoryPackage#getSignature()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NoParameterWithSameName'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot NoParameterWithSameName='self.parameters->forAll(parameter1|\n\t\t\t\tnot(self.parameters->exists(parameter2|\n\t\t\t\t\tparameter1 <> parameter2 and \n\t\t\t\t\tparameter1.name = parameter2.name\n\t\t\t\t))\n\t\t\t)'"
 * @generated
 */
public interface Signature extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' reference.
	 * @see #setReturnType(DataType)
	 * @see edu.kit.ipd.sdq.cbsm.repository.RepositoryPackage#getSignature_ReturnType()
	 * @model required="true"
	 * @generated
	 */
	DataType getReturnType();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.cbsm.repository.Signature#getReturnType <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(DataType value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.cbsm.repository.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.cbsm.repository.RepositoryPackage#getSignature_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

} // Signature
