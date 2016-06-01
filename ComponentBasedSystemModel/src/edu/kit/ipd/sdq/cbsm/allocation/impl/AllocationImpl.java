/**
 */
package edu.kit.ipd.sdq.cbsm.allocation.impl;

import edu.kit.ipd.sdq.cbsm.allocation.Allocation;
import edu.kit.ipd.sdq.cbsm.allocation.AllocationContext;
import edu.kit.ipd.sdq.cbsm.allocation.AllocationPackage;

import edu.kit.ipd.sdq.cbsm.core.impl.ViewTypeImpl;
import edu.kit.ipd.sdq.cbsm.environment.Environment;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.allocation.impl.AllocationImpl#getAllocationContexts <em>Allocation Contexts</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.allocation.impl.AllocationImpl#getAllocatedSystem <em>Allocated System</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.allocation.impl.AllocationImpl#getAllocationEnvironment <em>Allocation Environment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllocationImpl extends ViewTypeImpl implements Allocation {
	/**
	 * The cached value of the '{@link #getAllocationContexts() <em>Allocation Contexts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocationContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<AllocationContext> allocationContexts;

	/**
	 * The cached value of the '{@link #getAllocatedSystem() <em>Allocated System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedSystem()
	 * @generated
	 * @ordered
	 */
	protected edu.kit.ipd.sdq.cbsm.assembly.System allocatedSystem;

	/**
	 * The cached value of the '{@link #getAllocationEnvironment() <em>Allocation Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocationEnvironment()
	 * @generated
	 * @ordered
	 */
	protected Environment allocationEnvironment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AllocationPackage.Literals.ALLOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AllocationContext> getAllocationContexts() {
		if (allocationContexts == null) {
			allocationContexts = new EObjectContainmentEList<AllocationContext>(AllocationContext.class, this, AllocationPackage.ALLOCATION__ALLOCATION_CONTEXTS);
		}
		return allocationContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public edu.kit.ipd.sdq.cbsm.assembly.System getAllocatedSystem() {
		if (allocatedSystem != null && allocatedSystem.eIsProxy()) {
			InternalEObject oldAllocatedSystem = (InternalEObject)allocatedSystem;
			allocatedSystem = (edu.kit.ipd.sdq.cbsm.assembly.System)eResolveProxy(oldAllocatedSystem);
			if (allocatedSystem != oldAllocatedSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AllocationPackage.ALLOCATION__ALLOCATED_SYSTEM, oldAllocatedSystem, allocatedSystem));
			}
		}
		return allocatedSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public edu.kit.ipd.sdq.cbsm.assembly.System basicGetAllocatedSystem() {
		return allocatedSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllocatedSystem(edu.kit.ipd.sdq.cbsm.assembly.System newAllocatedSystem) {
		edu.kit.ipd.sdq.cbsm.assembly.System oldAllocatedSystem = allocatedSystem;
		allocatedSystem = newAllocatedSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocationPackage.ALLOCATION__ALLOCATED_SYSTEM, oldAllocatedSystem, allocatedSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Environment getAllocationEnvironment() {
		if (allocationEnvironment != null && allocationEnvironment.eIsProxy()) {
			InternalEObject oldAllocationEnvironment = (InternalEObject)allocationEnvironment;
			allocationEnvironment = (Environment)eResolveProxy(oldAllocationEnvironment);
			if (allocationEnvironment != oldAllocationEnvironment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AllocationPackage.ALLOCATION__ALLOCATION_ENVIRONMENT, oldAllocationEnvironment, allocationEnvironment));
			}
		}
		return allocationEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Environment basicGetAllocationEnvironment() {
		return allocationEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllocationEnvironment(Environment newAllocationEnvironment) {
		Environment oldAllocationEnvironment = allocationEnvironment;
		allocationEnvironment = newAllocationEnvironment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocationPackage.ALLOCATION__ALLOCATION_ENVIRONMENT, oldAllocationEnvironment, allocationEnvironment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AllocationPackage.ALLOCATION__ALLOCATION_CONTEXTS:
				return ((InternalEList<?>)getAllocationContexts()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AllocationPackage.ALLOCATION__ALLOCATION_CONTEXTS:
				return getAllocationContexts();
			case AllocationPackage.ALLOCATION__ALLOCATED_SYSTEM:
				if (resolve) return getAllocatedSystem();
				return basicGetAllocatedSystem();
			case AllocationPackage.ALLOCATION__ALLOCATION_ENVIRONMENT:
				if (resolve) return getAllocationEnvironment();
				return basicGetAllocationEnvironment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AllocationPackage.ALLOCATION__ALLOCATION_CONTEXTS:
				getAllocationContexts().clear();
				getAllocationContexts().addAll((Collection<? extends AllocationContext>)newValue);
				return;
			case AllocationPackage.ALLOCATION__ALLOCATED_SYSTEM:
				setAllocatedSystem((edu.kit.ipd.sdq.cbsm.assembly.System)newValue);
				return;
			case AllocationPackage.ALLOCATION__ALLOCATION_ENVIRONMENT:
				setAllocationEnvironment((Environment)newValue);
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
			case AllocationPackage.ALLOCATION__ALLOCATION_CONTEXTS:
				getAllocationContexts().clear();
				return;
			case AllocationPackage.ALLOCATION__ALLOCATED_SYSTEM:
				setAllocatedSystem((edu.kit.ipd.sdq.cbsm.assembly.System)null);
				return;
			case AllocationPackage.ALLOCATION__ALLOCATION_ENVIRONMENT:
				setAllocationEnvironment((Environment)null);
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
			case AllocationPackage.ALLOCATION__ALLOCATION_CONTEXTS:
				return allocationContexts != null && !allocationContexts.isEmpty();
			case AllocationPackage.ALLOCATION__ALLOCATED_SYSTEM:
				return allocatedSystem != null;
			case AllocationPackage.ALLOCATION__ALLOCATION_ENVIRONMENT:
				return allocationEnvironment != null;
		}
		return super.eIsSet(featureID);
	}

} //AllocationImpl
