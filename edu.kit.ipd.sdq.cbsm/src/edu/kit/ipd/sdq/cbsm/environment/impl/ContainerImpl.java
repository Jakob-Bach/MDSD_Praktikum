/**
 */
package edu.kit.ipd.sdq.cbsm.environment.impl;

import edu.kit.ipd.sdq.cbsm.core.impl.NamedElementImpl;

import edu.kit.ipd.sdq.cbsm.environment.Environment;
import edu.kit.ipd.sdq.cbsm.environment.EnvironmentPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.environment.impl.ContainerImpl#getParentEnvironment <em>Parent Environment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerImpl extends NamedElementImpl implements edu.kit.ipd.sdq.cbsm.environment.Container {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnvironmentPackage.Literals.CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Environment getParentEnvironment() {
		if (eContainerFeatureID() != EnvironmentPackage.CONTAINER__PARENT_ENVIRONMENT) return null;
		return (Environment)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentEnvironment(Environment newParentEnvironment, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentEnvironment, EnvironmentPackage.CONTAINER__PARENT_ENVIRONMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentEnvironment(Environment newParentEnvironment) {
		if (newParentEnvironment != eInternalContainer() || (eContainerFeatureID() != EnvironmentPackage.CONTAINER__PARENT_ENVIRONMENT && newParentEnvironment != null)) {
			if (EcoreUtil.isAncestor(this, newParentEnvironment))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentEnvironment != null)
				msgs = ((InternalEObject)newParentEnvironment).eInverseAdd(this, EnvironmentPackage.ENVIRONMENT__CONTAINERS, Environment.class, msgs);
			msgs = basicSetParentEnvironment(newParentEnvironment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnvironmentPackage.CONTAINER__PARENT_ENVIRONMENT, newParentEnvironment, newParentEnvironment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EnvironmentPackage.CONTAINER__PARENT_ENVIRONMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentEnvironment((Environment)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EnvironmentPackage.CONTAINER__PARENT_ENVIRONMENT:
				return basicSetParentEnvironment(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case EnvironmentPackage.CONTAINER__PARENT_ENVIRONMENT:
				return eInternalContainer().eInverseRemove(this, EnvironmentPackage.ENVIRONMENT__CONTAINERS, Environment.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EnvironmentPackage.CONTAINER__PARENT_ENVIRONMENT:
				return getParentEnvironment();
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
			case EnvironmentPackage.CONTAINER__PARENT_ENVIRONMENT:
				setParentEnvironment((Environment)newValue);
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
			case EnvironmentPackage.CONTAINER__PARENT_ENVIRONMENT:
				setParentEnvironment((Environment)null);
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
			case EnvironmentPackage.CONTAINER__PARENT_ENVIRONMENT:
				return getParentEnvironment() != null;
		}
		return super.eIsSet(featureID);
	}

} //ContainerImpl
