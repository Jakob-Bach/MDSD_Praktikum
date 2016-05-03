/**
 */
package edu.kit.ipd.sdq.cbsm.repository;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.repository.Service#getSignatures <em>Signatures</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.cbsm.repository.RepositoryPackage#getService()
 * @model
 * @generated
 */
public interface Service extends EObject {
	/**
	 * Returns the value of the '<em><b>Signatures</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.cbsm.repository.Signature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signatures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signatures</em>' reference list.
	 * @see edu.kit.ipd.sdq.cbsm.repository.RepositoryPackage#getService_Signatures()
	 * @model
	 * @generated
	 */
	EList<Signature> getSignatures();

} // Service
