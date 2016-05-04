/**
 */
package edu.kit.ipd.sdq.cbsm.assembly.impl;

import edu.kit.ipd.sdq.cbsm.assembly.AssemblyPackage;
import edu.kit.ipd.sdq.cbsm.assembly.ProvidedDelegationConnector;

import edu.kit.ipd.sdq.cbsm.repository.ProvidedRole;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provided Delegation Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.assembly.impl.ProvidedDelegationConnectorImpl#getInnerProvidedRole <em>Inner Provided Role</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.assembly.impl.ProvidedDelegationConnectorImpl#getOuterProvidedRole <em>Outer Provided Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProvidedDelegationConnectorImpl extends DelegationConnectorImpl implements ProvidedDelegationConnector {
	/**
	 * The cached value of the '{@link #getInnerProvidedRole() <em>Inner Provided Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerProvidedRole()
	 * @generated
	 * @ordered
	 */
	protected ProvidedRole innerProvidedRole;

	/**
	 * The cached value of the '{@link #getOuterProvidedRole() <em>Outer Provided Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterProvidedRole()
	 * @generated
	 * @ordered
	 */
	protected ProvidedRole outerProvidedRole;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvidedDelegationConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyPackage.Literals.PROVIDED_DELEGATION_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedRole getInnerProvidedRole() {
		if (innerProvidedRole != null && innerProvidedRole.eIsProxy()) {
			InternalEObject oldInnerProvidedRole = (InternalEObject)innerProvidedRole;
			innerProvidedRole = (ProvidedRole)eResolveProxy(oldInnerProvidedRole);
			if (innerProvidedRole != oldInnerProvidedRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyPackage.PROVIDED_DELEGATION_CONNECTOR__INNER_PROVIDED_ROLE, oldInnerProvidedRole, innerProvidedRole));
			}
		}
		return innerProvidedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedRole basicGetInnerProvidedRole() {
		return innerProvidedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInnerProvidedRole(ProvidedRole newInnerProvidedRole) {
		ProvidedRole oldInnerProvidedRole = innerProvidedRole;
		innerProvidedRole = newInnerProvidedRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyPackage.PROVIDED_DELEGATION_CONNECTOR__INNER_PROVIDED_ROLE, oldInnerProvidedRole, innerProvidedRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedRole getOuterProvidedRole() {
		if (outerProvidedRole != null && outerProvidedRole.eIsProxy()) {
			InternalEObject oldOuterProvidedRole = (InternalEObject)outerProvidedRole;
			outerProvidedRole = (ProvidedRole)eResolveProxy(oldOuterProvidedRole);
			if (outerProvidedRole != oldOuterProvidedRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyPackage.PROVIDED_DELEGATION_CONNECTOR__OUTER_PROVIDED_ROLE, oldOuterProvidedRole, outerProvidedRole));
			}
		}
		return outerProvidedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedRole basicGetOuterProvidedRole() {
		return outerProvidedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOuterProvidedRole(ProvidedRole newOuterProvidedRole) {
		ProvidedRole oldOuterProvidedRole = outerProvidedRole;
		outerProvidedRole = newOuterProvidedRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyPackage.PROVIDED_DELEGATION_CONNECTOR__OUTER_PROVIDED_ROLE, oldOuterProvidedRole, outerProvidedRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssemblyPackage.PROVIDED_DELEGATION_CONNECTOR__INNER_PROVIDED_ROLE:
				if (resolve) return getInnerProvidedRole();
				return basicGetInnerProvidedRole();
			case AssemblyPackage.PROVIDED_DELEGATION_CONNECTOR__OUTER_PROVIDED_ROLE:
				if (resolve) return getOuterProvidedRole();
				return basicGetOuterProvidedRole();
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
			case AssemblyPackage.PROVIDED_DELEGATION_CONNECTOR__INNER_PROVIDED_ROLE:
				setInnerProvidedRole((ProvidedRole)newValue);
				return;
			case AssemblyPackage.PROVIDED_DELEGATION_CONNECTOR__OUTER_PROVIDED_ROLE:
				setOuterProvidedRole((ProvidedRole)newValue);
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
			case AssemblyPackage.PROVIDED_DELEGATION_CONNECTOR__INNER_PROVIDED_ROLE:
				setInnerProvidedRole((ProvidedRole)null);
				return;
			case AssemblyPackage.PROVIDED_DELEGATION_CONNECTOR__OUTER_PROVIDED_ROLE:
				setOuterProvidedRole((ProvidedRole)null);
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
			case AssemblyPackage.PROVIDED_DELEGATION_CONNECTOR__INNER_PROVIDED_ROLE:
				return innerProvidedRole != null;
			case AssemblyPackage.PROVIDED_DELEGATION_CONNECTOR__OUTER_PROVIDED_ROLE:
				return outerProvidedRole != null;
		}
		return super.eIsSet(featureID);
	}

} //ProvidedDelegationConnectorImpl
