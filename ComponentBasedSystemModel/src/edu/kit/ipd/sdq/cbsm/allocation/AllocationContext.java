/**
 */
package edu.kit.ipd.sdq.cbsm.allocation;

import edu.kit.ipd.sdq.cbsm.assembly.AssemblyContext;

import edu.kit.ipd.sdq.cbsm.environment.Container;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.allocation.AllocationContext#getContainer <em>Container</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.allocation.AllocationContext#getAssemblyContext <em>Assembly Context</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.cbsm.allocation.AllocationPackage#getAllocationContext()
 * @model
 * @generated
 */
public interface AllocationContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' reference.
	 * @see #setContainer(Container)
	 * @see edu.kit.ipd.sdq.cbsm.allocation.AllocationPackage#getAllocationContext_Container()
	 * @model required="true"
	 * @generated
	 */
	Container getContainer();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.cbsm.allocation.AllocationContext#getContainer <em>Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(Container value);

	/**
	 * Returns the value of the '<em><b>Assembly Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assembly Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly Context</em>' reference.
	 * @see #setAssemblyContext(AssemblyContext)
	 * @see edu.kit.ipd.sdq.cbsm.allocation.AllocationPackage#getAllocationContext_AssemblyContext()
	 * @model required="true"
	 * @generated
	 */
	AssemblyContext getAssemblyContext();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.cbsm.allocation.AllocationContext#getAssemblyContext <em>Assembly Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assembly Context</em>' reference.
	 * @see #getAssemblyContext()
	 * @generated
	 */
	void setAssemblyContext(AssemblyContext value);

} // AllocationContext
