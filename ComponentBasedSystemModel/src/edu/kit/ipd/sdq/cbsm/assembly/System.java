/**
 */
package edu.kit.ipd.sdq.cbsm.assembly;

import edu.kit.ipd.sdq.cbsm.repository.Interface;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.assembly.System#getContainedAssemblyContexts <em>Contained Assembly Contexts</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.assembly.System#getProvidedInterfaces <em>Provided Interfaces</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.cbsm.assembly.AssemblyPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends EObject {
	/**
	 * Returns the value of the '<em><b>Contained Assembly Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.cbsm.assembly.AssemblyContext}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Assembly Contexts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Assembly Contexts</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.cbsm.assembly.AssemblyPackage#getSystem_ContainedAssemblyContexts()
	 * @model containment="true"
	 * @generated
	 */
	EList<AssemblyContext> getContainedAssemblyContexts();

	/**
	 * Returns the value of the '<em><b>Provided Interfaces</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.cbsm.repository.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Interfaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Interfaces</em>' reference list.
	 * @see edu.kit.ipd.sdq.cbsm.assembly.AssemblyPackage#getSystem_ProvidedInterfaces()
	 * @model required="true"
	 * @generated
	 */
	EList<Interface> getProvidedInterfaces();

} // System
