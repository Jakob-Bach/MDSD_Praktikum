/**
 */
package edu.kit.ipd.sdq.cbsm.repository.behavior.impl;

import edu.kit.ipd.sdq.cbsm.repository.Component;
import edu.kit.ipd.sdq.cbsm.repository.RepositoryPackage;
import edu.kit.ipd.sdq.cbsm.repository.Signature;

import edu.kit.ipd.sdq.cbsm.repository.behavior.BehaviorPackage;
import edu.kit.ipd.sdq.cbsm.repository.behavior.ComponentBehaviorDescription;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Behavior Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.repository.behavior.impl.ComponentBehaviorDescriptionImpl#getProvidedService <em>Provided Service</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.repository.behavior.impl.ComponentBehaviorDescriptionImpl#getDescribedComponent <em>Described Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentBehaviorDescriptionImpl extends BehaviorDescriptionImpl implements ComponentBehaviorDescription {
	/**
	 * The cached value of the '{@link #getProvidedService() <em>Provided Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedService()
	 * @generated
	 * @ordered
	 */
	protected Signature providedService;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentBehaviorDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.COMPONENT_BEHAVIOR_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signature getProvidedService() {
		if (providedService != null && providedService.eIsProxy()) {
			InternalEObject oldProvidedService = (InternalEObject)providedService;
			providedService = (Signature)eResolveProxy(oldProvidedService);
			if (providedService != oldProvidedService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.COMPONENT_BEHAVIOR_DESCRIPTION__PROVIDED_SERVICE, oldProvidedService, providedService));
			}
		}
		return providedService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signature basicGetProvidedService() {
		return providedService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidedService(Signature newProvidedService) {
		Signature oldProvidedService = providedService;
		providedService = newProvidedService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.COMPONENT_BEHAVIOR_DESCRIPTION__PROVIDED_SERVICE, oldProvidedService, providedService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getDescribedComponent() {
		if (eContainerFeatureID() != BehaviorPackage.COMPONENT_BEHAVIOR_DESCRIPTION__DESCRIBED_COMPONENT) return null;
		return (Component)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescribedComponent(Component newDescribedComponent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDescribedComponent, BehaviorPackage.COMPONENT_BEHAVIOR_DESCRIPTION__DESCRIBED_COMPONENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescribedComponent(Component newDescribedComponent) {
		if (newDescribedComponent != eInternalContainer() || (eContainerFeatureID() != BehaviorPackage.COMPONENT_BEHAVIOR_DESCRIPTION__DESCRIBED_COMPONENT && newDescribedComponent != null)) {
			if (EcoreUtil.isAncestor(this, newDescribedComponent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDescribedComponent != null)
				msgs = ((InternalEObject)newDescribedComponent).eInverseAdd(this, RepositoryPackage.COMPONENT__BEHAVIOR_DESCRIPTIONS, Component.class, msgs);
			msgs = basicSetDescribedComponent(newDescribedComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.COMPONENT_BEHAVIOR_DESCRIPTION__DESCRIBED_COMPONENT, newDescribedComponent, newDescribedComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviorPackage.COMPONENT_BEHAVIOR_DESCRIPTION__DESCRIBED_COMPONENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDescribedComponent((Component)otherEnd, msgs);
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
			case BehaviorPackage.COMPONENT_BEHAVIOR_DESCRIPTION__DESCRIBED_COMPONENT:
				return basicSetDescribedComponent(null, msgs);
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
			case BehaviorPackage.COMPONENT_BEHAVIOR_DESCRIPTION__DESCRIBED_COMPONENT:
				return eInternalContainer().eInverseRemove(this, RepositoryPackage.COMPONENT__BEHAVIOR_DESCRIPTIONS, Component.class, msgs);
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
			case BehaviorPackage.COMPONENT_BEHAVIOR_DESCRIPTION__PROVIDED_SERVICE:
				if (resolve) return getProvidedService();
				return basicGetProvidedService();
			case BehaviorPackage.COMPONENT_BEHAVIOR_DESCRIPTION__DESCRIBED_COMPONENT:
				return getDescribedComponent();
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
			case BehaviorPackage.COMPONENT_BEHAVIOR_DESCRIPTION__PROVIDED_SERVICE:
				setProvidedService((Signature)newValue);
				return;
			case BehaviorPackage.COMPONENT_BEHAVIOR_DESCRIPTION__DESCRIBED_COMPONENT:
				setDescribedComponent((Component)newValue);
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
			case BehaviorPackage.COMPONENT_BEHAVIOR_DESCRIPTION__PROVIDED_SERVICE:
				setProvidedService((Signature)null);
				return;
			case BehaviorPackage.COMPONENT_BEHAVIOR_DESCRIPTION__DESCRIBED_COMPONENT:
				setDescribedComponent((Component)null);
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
			case BehaviorPackage.COMPONENT_BEHAVIOR_DESCRIPTION__PROVIDED_SERVICE:
				return providedService != null;
			case BehaviorPackage.COMPONENT_BEHAVIOR_DESCRIPTION__DESCRIBED_COMPONENT:
				return getDescribedComponent() != null;
		}
		return super.eIsSet(featureID);
	}

} //ComponentBehaviorDescriptionImpl
