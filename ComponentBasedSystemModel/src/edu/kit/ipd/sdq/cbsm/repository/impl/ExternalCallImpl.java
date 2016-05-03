/**
 */
package edu.kit.ipd.sdq.cbsm.repository.impl;

import edu.kit.ipd.sdq.cbsm.repository.ExternalCall;
import edu.kit.ipd.sdq.cbsm.repository.RepositoryPackage;
import edu.kit.ipd.sdq.cbsm.repository.Service;

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
 *   <li>{@link edu.kit.ipd.sdq.cbsm.repository.impl.ExternalCallImpl#getRequiredService <em>Required Service</em>}</li>
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
	protected Service requiredService;

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
		return RepositoryPackage.Literals.EXTERNAL_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service getRequiredService() {
		if (requiredService != null && requiredService.eIsProxy()) {
			InternalEObject oldRequiredService = (InternalEObject)requiredService;
			requiredService = (Service)eResolveProxy(oldRequiredService);
			if (requiredService != oldRequiredService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RepositoryPackage.EXTERNAL_CALL__REQUIRED_SERVICE, oldRequiredService, requiredService));
			}
		}
		return requiredService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service basicGetRequiredService() {
		return requiredService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredService(Service newRequiredService) {
		Service oldRequiredService = requiredService;
		requiredService = newRequiredService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.EXTERNAL_CALL__REQUIRED_SERVICE, oldRequiredService, requiredService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RepositoryPackage.EXTERNAL_CALL__REQUIRED_SERVICE:
				if (resolve) return getRequiredService();
				return basicGetRequiredService();
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
			case RepositoryPackage.EXTERNAL_CALL__REQUIRED_SERVICE:
				setRequiredService((Service)newValue);
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
			case RepositoryPackage.EXTERNAL_CALL__REQUIRED_SERVICE:
				setRequiredService((Service)null);
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
			case RepositoryPackage.EXTERNAL_CALL__REQUIRED_SERVICE:
				return requiredService != null;
		}
		return super.eIsSet(featureID);
	}

} //ExternalCallImpl
