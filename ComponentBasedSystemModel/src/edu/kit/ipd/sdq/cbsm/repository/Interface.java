/**
 */
package edu.kit.ipd.sdq.cbsm.repository;

import edu.kit.ipd.sdq.cbsm.core.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.repository.Interface#getSignatures <em>Signatures</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.cbsm.repository.RepositoryPackage#getInterface()
 * @model
 * @generated
 */
public interface Interface extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Signatures</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.cbsm.repository.Signature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signatures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signatures</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.cbsm.repository.RepositoryPackage#getInterface_Signatures()
	 * @model containment="true"
	 * @generated
	 */
	EList<Signature> getSignatures();

} // Interface
