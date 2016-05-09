/**
 */
package edu.kit.ipd.sdq.cbsm.allocation;

import edu.kit.ipd.sdq.cbsm.assembly.AssemblyContext;

import edu.kit.ipd.sdq.cbsm.core.NamedElement;
import edu.kit.ipd.sdq.cbsm.environment.Container;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.allocation.AllocationContext#getAllocatedContainer <em>Allocated Container</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.allocation.AllocationContext#getAllocatedAssemblyContext <em>Allocated Assembly Context</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.cbsm.allocation.AllocationPackage#getAllocationContext()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OnlyTopLevelAssemblyContextsAllocated'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot OnlyTopLevelAssemblyContextsAllocated='self.allocatedAssemblyContext.parentCompositeElement.\n\t\t\t\toclIsTypeOf(assembly::System)'"
 * @generated
 */
public interface AllocationContext extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Allocated Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocated Container</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated Container</em>' reference.
	 * @see #setAllocatedContainer(Container)
	 * @see edu.kit.ipd.sdq.cbsm.allocation.AllocationPackage#getAllocationContext_AllocatedContainer()
	 * @model required="true"
	 * @generated
	 */
	Container getAllocatedContainer();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.cbsm.allocation.AllocationContext#getAllocatedContainer <em>Allocated Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocated Container</em>' reference.
	 * @see #getAllocatedContainer()
	 * @generated
	 */
	void setAllocatedContainer(Container value);

	/**
	 * Returns the value of the '<em><b>Allocated Assembly Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocated Assembly Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated Assembly Context</em>' reference.
	 * @see #setAllocatedAssemblyContext(AssemblyContext)
	 * @see edu.kit.ipd.sdq.cbsm.allocation.AllocationPackage#getAllocationContext_AllocatedAssemblyContext()
	 * @model required="true"
	 * @generated
	 */
	AssemblyContext getAllocatedAssemblyContext();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.cbsm.allocation.AllocationContext#getAllocatedAssemblyContext <em>Allocated Assembly Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocated Assembly Context</em>' reference.
	 * @see #getAllocatedAssemblyContext()
	 * @generated
	 */
	void setAllocatedAssemblyContext(AssemblyContext value);

} // AllocationContext
