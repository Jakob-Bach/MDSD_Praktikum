/**
 */
package edu.kit.ipd.sdq.cbsm.allocation.impl;

import edu.kit.ipd.sdq.cbsm.allocation.AllocationContext;
import edu.kit.ipd.sdq.cbsm.allocation.AllocationPackage;

import edu.kit.ipd.sdq.cbsm.assembly.AssemblyContext;

import edu.kit.ipd.sdq.cbsm.core.impl.NamedElementImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.allocation.impl.AllocationContextImpl#getAllocatedContainer <em>Allocated Container</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.allocation.impl.AllocationContextImpl#getAllocatedAssemblyContext <em>Allocated Assembly Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllocationContextImpl extends NamedElementImpl implements AllocationContext {
	/**
	 * The cached value of the '{@link #getAllocatedContainer() <em>Allocated Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedContainer()
	 * @generated
	 * @ordered
	 */
	protected edu.kit.ipd.sdq.cbsm.environment.Container allocatedContainer;

	/**
	 * The cached value of the '{@link #getAllocatedAssemblyContext() <em>Allocated Assembly Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedAssemblyContext()
	 * @generated
	 * @ordered
	 */
	protected AssemblyContext allocatedAssemblyContext;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllocationContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AllocationPackage.Literals.ALLOCATION_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public edu.kit.ipd.sdq.cbsm.environment.Container getAllocatedContainer() {
		if (allocatedContainer != null && allocatedContainer.eIsProxy()) {
			InternalEObject oldAllocatedContainer = (InternalEObject)allocatedContainer;
			allocatedContainer = (edu.kit.ipd.sdq.cbsm.environment.Container)eResolveProxy(oldAllocatedContainer);
			if (allocatedContainer != oldAllocatedContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AllocationPackage.ALLOCATION_CONTEXT__ALLOCATED_CONTAINER, oldAllocatedContainer, allocatedContainer));
			}
		}
		return allocatedContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public edu.kit.ipd.sdq.cbsm.environment.Container basicGetAllocatedContainer() {
		return allocatedContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllocatedContainer(edu.kit.ipd.sdq.cbsm.environment.Container newAllocatedContainer) {
		edu.kit.ipd.sdq.cbsm.environment.Container oldAllocatedContainer = allocatedContainer;
		allocatedContainer = newAllocatedContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocationPackage.ALLOCATION_CONTEXT__ALLOCATED_CONTAINER, oldAllocatedContainer, allocatedContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext getAllocatedAssemblyContext() {
		if (allocatedAssemblyContext != null && allocatedAssemblyContext.eIsProxy()) {
			InternalEObject oldAllocatedAssemblyContext = (InternalEObject)allocatedAssemblyContext;
			allocatedAssemblyContext = (AssemblyContext)eResolveProxy(oldAllocatedAssemblyContext);
			if (allocatedAssemblyContext != oldAllocatedAssemblyContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AllocationPackage.ALLOCATION_CONTEXT__ALLOCATED_ASSEMBLY_CONTEXT, oldAllocatedAssemblyContext, allocatedAssemblyContext));
			}
		}
		return allocatedAssemblyContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext basicGetAllocatedAssemblyContext() {
		return allocatedAssemblyContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllocatedAssemblyContext(AssemblyContext newAllocatedAssemblyContext) {
		AssemblyContext oldAllocatedAssemblyContext = allocatedAssemblyContext;
		allocatedAssemblyContext = newAllocatedAssemblyContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocationPackage.ALLOCATION_CONTEXT__ALLOCATED_ASSEMBLY_CONTEXT, oldAllocatedAssemblyContext, allocatedAssemblyContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AllocationPackage.ALLOCATION_CONTEXT__ALLOCATED_CONTAINER:
				if (resolve) return getAllocatedContainer();
				return basicGetAllocatedContainer();
			case AllocationPackage.ALLOCATION_CONTEXT__ALLOCATED_ASSEMBLY_CONTEXT:
				if (resolve) return getAllocatedAssemblyContext();
				return basicGetAllocatedAssemblyContext();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AllocationPackage.ALLOCATION_CONTEXT__ALLOCATED_CONTAINER:
				setAllocatedContainer((edu.kit.ipd.sdq.cbsm.environment.Container)newValue);
				return;
			case AllocationPackage.ALLOCATION_CONTEXT__ALLOCATED_ASSEMBLY_CONTEXT:
				setAllocatedAssemblyContext((AssemblyContext)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AllocationPackage.ALLOCATION_CONTEXT__ALLOCATED_CONTAINER:
				setAllocatedContainer((edu.kit.ipd.sdq.cbsm.environment.Container)null);
				return;
			case AllocationPackage.ALLOCATION_CONTEXT__ALLOCATED_ASSEMBLY_CONTEXT:
				setAllocatedAssemblyContext((AssemblyContext)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AllocationPackage.ALLOCATION_CONTEXT__ALLOCATED_CONTAINER:
				return allocatedContainer != null;
			case AllocationPackage.ALLOCATION_CONTEXT__ALLOCATED_ASSEMBLY_CONTEXT:
				return allocatedAssemblyContext != null;
		}
		return super.eIsSet(featureID);
	}

} //AllocationContextImpl
