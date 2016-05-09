/**
 */
package edu.kit.ipd.sdq.cbsm.repository.behavior.impl;

import edu.kit.ipd.sdq.cbsm.repository.RequiredRole;
import edu.kit.ipd.sdq.cbsm.repository.Signature;

import edu.kit.ipd.sdq.cbsm.repository.behavior.BehaviorPackage;
import edu.kit.ipd.sdq.cbsm.repository.behavior.ExternalCall;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.repository.behavior.impl.ExternalCallImpl#getRequiredService <em>Required Service</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.repository.behavior.impl.ExternalCallImpl#getRequiredRoleOfService <em>Required Role Of Service</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExternalCallImpl extends ActionImpl implements ExternalCall {
	/**
	 * The cached value of the '{@link #getRequiredService() <em>Required Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredService()
	 * @generated
	 * @ordered
	 */
	protected Signature requiredService;

	/**
	 * The cached value of the '{@link #getRequiredRoleOfService() <em>Required Role Of Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredRoleOfService()
	 * @generated
	 * @ordered
	 */
	protected RequiredRole requiredRoleOfService;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.EXTERNAL_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signature getRequiredService() {
		if (requiredService != null && requiredService.eIsProxy()) {
			InternalEObject oldRequiredService = (InternalEObject)requiredService;
			requiredService = (Signature)eResolveProxy(oldRequiredService);
			if (requiredService != oldRequiredService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.EXTERNAL_CALL__REQUIRED_SERVICE, oldRequiredService, requiredService));
			}
		}
		return requiredService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signature basicGetRequiredService() {
		return requiredService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredService(Signature newRequiredService) {
		Signature oldRequiredService = requiredService;
		requiredService = newRequiredService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.EXTERNAL_CALL__REQUIRED_SERVICE, oldRequiredService, requiredService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredRole getRequiredRoleOfService() {
		if (requiredRoleOfService != null && requiredRoleOfService.eIsProxy()) {
			InternalEObject oldRequiredRoleOfService = (InternalEObject)requiredRoleOfService;
			requiredRoleOfService = (RequiredRole)eResolveProxy(oldRequiredRoleOfService);
			if (requiredRoleOfService != oldRequiredRoleOfService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.EXTERNAL_CALL__REQUIRED_ROLE_OF_SERVICE, oldRequiredRoleOfService, requiredRoleOfService));
			}
		}
		return requiredRoleOfService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredRole basicGetRequiredRoleOfService() {
		return requiredRoleOfService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredRoleOfService(RequiredRole newRequiredRoleOfService) {
		RequiredRole oldRequiredRoleOfService = requiredRoleOfService;
		requiredRoleOfService = newRequiredRoleOfService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.EXTERNAL_CALL__REQUIRED_ROLE_OF_SERVICE, oldRequiredRoleOfService, requiredRoleOfService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviorPackage.EXTERNAL_CALL__REQUIRED_SERVICE:
				if (resolve) return getRequiredService();
				return basicGetRequiredService();
			case BehaviorPackage.EXTERNAL_CALL__REQUIRED_ROLE_OF_SERVICE:
				if (resolve) return getRequiredRoleOfService();
				return basicGetRequiredRoleOfService();
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
			case BehaviorPackage.EXTERNAL_CALL__REQUIRED_SERVICE:
				setRequiredService((Signature)newValue);
				return;
			case BehaviorPackage.EXTERNAL_CALL__REQUIRED_ROLE_OF_SERVICE:
				setRequiredRoleOfService((RequiredRole)newValue);
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
			case BehaviorPackage.EXTERNAL_CALL__REQUIRED_SERVICE:
				setRequiredService((Signature)null);
				return;
			case BehaviorPackage.EXTERNAL_CALL__REQUIRED_ROLE_OF_SERVICE:
				setRequiredRoleOfService((RequiredRole)null);
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
			case BehaviorPackage.EXTERNAL_CALL__REQUIRED_SERVICE:
				return requiredService != null;
			case BehaviorPackage.EXTERNAL_CALL__REQUIRED_ROLE_OF_SERVICE:
				return requiredRoleOfService != null;
		}
		return super.eIsSet(featureID);
	}

} //ExternalCallImpl
