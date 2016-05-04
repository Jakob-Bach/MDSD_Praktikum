/**
 */
package edu.kit.ipd.sdq.cbsm.assembly.impl;

import edu.kit.ipd.sdq.cbsm.assembly.AssemblyPackage;
import edu.kit.ipd.sdq.cbsm.assembly.RequiredDelegationConnector;

import edu.kit.ipd.sdq.cbsm.repository.RequiredRole;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Required Delegation Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.assembly.impl.RequiredDelegationConnectorImpl#getInnerRequiredRole <em>Inner Required Role</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.assembly.impl.RequiredDelegationConnectorImpl#getOuterRequiredRole <em>Outer Required Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequiredDelegationConnectorImpl extends DelegationConnectorImpl implements RequiredDelegationConnector {
	/**
	 * The cached value of the '{@link #getInnerRequiredRole() <em>Inner Required Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerRequiredRole()
	 * @generated
	 * @ordered
	 */
	protected RequiredRole innerRequiredRole;

	/**
	 * The cached value of the '{@link #getOuterRequiredRole() <em>Outer Required Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterRequiredRole()
	 * @generated
	 * @ordered
	 */
	protected RequiredRole outerRequiredRole;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequiredDelegationConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyPackage.Literals.REQUIRED_DELEGATION_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredRole getInnerRequiredRole() {
		if (innerRequiredRole != null && innerRequiredRole.eIsProxy()) {
			InternalEObject oldInnerRequiredRole = (InternalEObject)innerRequiredRole;
			innerRequiredRole = (RequiredRole)eResolveProxy(oldInnerRequiredRole);
			if (innerRequiredRole != oldInnerRequiredRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyPackage.REQUIRED_DELEGATION_CONNECTOR__INNER_REQUIRED_ROLE, oldInnerRequiredRole, innerRequiredRole));
			}
		}
		return innerRequiredRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredRole basicGetInnerRequiredRole() {
		return innerRequiredRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInnerRequiredRole(RequiredRole newInnerRequiredRole) {
		RequiredRole oldInnerRequiredRole = innerRequiredRole;
		innerRequiredRole = newInnerRequiredRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyPackage.REQUIRED_DELEGATION_CONNECTOR__INNER_REQUIRED_ROLE, oldInnerRequiredRole, innerRequiredRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredRole getOuterRequiredRole() {
		if (outerRequiredRole != null && outerRequiredRole.eIsProxy()) {
			InternalEObject oldOuterRequiredRole = (InternalEObject)outerRequiredRole;
			outerRequiredRole = (RequiredRole)eResolveProxy(oldOuterRequiredRole);
			if (outerRequiredRole != oldOuterRequiredRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyPackage.REQUIRED_DELEGATION_CONNECTOR__OUTER_REQUIRED_ROLE, oldOuterRequiredRole, outerRequiredRole));
			}
		}
		return outerRequiredRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredRole basicGetOuterRequiredRole() {
		return outerRequiredRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOuterRequiredRole(RequiredRole newOuterRequiredRole) {
		RequiredRole oldOuterRequiredRole = outerRequiredRole;
		outerRequiredRole = newOuterRequiredRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyPackage.REQUIRED_DELEGATION_CONNECTOR__OUTER_REQUIRED_ROLE, oldOuterRequiredRole, outerRequiredRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssemblyPackage.REQUIRED_DELEGATION_CONNECTOR__INNER_REQUIRED_ROLE:
				if (resolve) return getInnerRequiredRole();
				return basicGetInnerRequiredRole();
			case AssemblyPackage.REQUIRED_DELEGATION_CONNECTOR__OUTER_REQUIRED_ROLE:
				if (resolve) return getOuterRequiredRole();
				return basicGetOuterRequiredRole();
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
			case AssemblyPackage.REQUIRED_DELEGATION_CONNECTOR__INNER_REQUIRED_ROLE:
				setInnerRequiredRole((RequiredRole)newValue);
				return;
			case AssemblyPackage.REQUIRED_DELEGATION_CONNECTOR__OUTER_REQUIRED_ROLE:
				setOuterRequiredRole((RequiredRole)newValue);
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
			case AssemblyPackage.REQUIRED_DELEGATION_CONNECTOR__INNER_REQUIRED_ROLE:
				setInnerRequiredRole((RequiredRole)null);
				return;
			case AssemblyPackage.REQUIRED_DELEGATION_CONNECTOR__OUTER_REQUIRED_ROLE:
				setOuterRequiredRole((RequiredRole)null);
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
			case AssemblyPackage.REQUIRED_DELEGATION_CONNECTOR__INNER_REQUIRED_ROLE:
				return innerRequiredRole != null;
			case AssemblyPackage.REQUIRED_DELEGATION_CONNECTOR__OUTER_REQUIRED_ROLE:
				return outerRequiredRole != null;
		}
		return super.eIsSet(featureID);
	}

} //RequiredDelegationConnectorImpl
