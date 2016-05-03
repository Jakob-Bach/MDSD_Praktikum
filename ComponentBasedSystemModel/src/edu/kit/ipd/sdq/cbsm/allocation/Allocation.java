/**
 */
package edu.kit.ipd.sdq.cbsm.allocation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.allocation.Allocation#getAllocationContexts <em>Allocation Contexts</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.cbsm.allocation.AllocationPackage#getAllocation()
 * @model
 * @generated
 */
public interface Allocation extends EObject {
	/**
	 * Returns the value of the '<em><b>Allocation Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.cbsm.allocation.AllocationContext}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocation Contexts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocation Contexts</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.cbsm.allocation.AllocationPackage#getAllocation_AllocationContexts()
	 * @model containment="true"
	 * @generated
	 */
	EList<AllocationContext> getAllocationContexts();

} // Allocation
