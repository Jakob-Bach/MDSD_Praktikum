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
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NoSignaturesEquivalent'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot NoSignaturesEquivalent='self.signatures->forAll(signature1|\n\t\t\t\tnot(self.signatures->exists(signature2|\n\t\t\t\t\tsignature1 <> signature2 and \n\t\t\t\t\tsignature1.name = signature2.name and\n\t\t\t\t\tsignature1.parameters->size() = signature2.parameters->size() and\n\t\t\t\t\tsignature1.parameters->forAll(parameter1|\n\t\t\t\t\t\tsignature2.parameters->at(signature1.parameters->indexOf(parameter1)).type = parameter1.type)\n\t\t\t\t))\n\t\t\t)'"
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
