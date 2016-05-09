/**
 */
package edu.kit.ipd.sdq.cbsm.environment.impl;

import edu.kit.ipd.sdq.cbsm.core.impl.NamedElementImpl;

import edu.kit.ipd.sdq.cbsm.environment.Environment;
import edu.kit.ipd.sdq.cbsm.environment.EnvironmentPackage;
import edu.kit.ipd.sdq.cbsm.environment.Link;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.environment.impl.LinkImpl#getParentEnvironment <em>Parent Environment</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.environment.impl.LinkImpl#getLinkedContainers <em>Linked Containers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkImpl extends NamedElementImpl implements Link {
	/**
	 * The cached value of the '{@link #getLinkedContainers() <em>Linked Containers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkedContainers()
	 * @generated
	 * @ordered
	 */
	protected EList<edu.kit.ipd.sdq.cbsm.environment.Container> linkedContainers;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnvironmentPackage.Literals.LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Environment getParentEnvironment() {
		if (eContainerFeatureID() != EnvironmentPackage.LINK__PARENT_ENVIRONMENT) return null;
		return (Environment)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentEnvironment(Environment newParentEnvironment, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentEnvironment, EnvironmentPackage.LINK__PARENT_ENVIRONMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentEnvironment(Environment newParentEnvironment) {
		if (newParentEnvironment != eInternalContainer() || (eContainerFeatureID() != EnvironmentPackage.LINK__PARENT_ENVIRONMENT && newParentEnvironment != null)) {
			if (EcoreUtil.isAncestor(this, newParentEnvironment))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentEnvironment != null)
				msgs = ((InternalEObject)newParentEnvironment).eInverseAdd(this, EnvironmentPackage.ENVIRONMENT__LINKS, Environment.class, msgs);
			msgs = basicSetParentEnvironment(newParentEnvironment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnvironmentPackage.LINK__PARENT_ENVIRONMENT, newParentEnvironment, newParentEnvironment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<edu.kit.ipd.sdq.cbsm.environment.Container> getLinkedContainers() {
		if (linkedContainers == null) {
			linkedContainers = new EObjectResolvingEList<edu.kit.ipd.sdq.cbsm.environment.Container>(edu.kit.ipd.sdq.cbsm.environment.Container.class, this, EnvironmentPackage.LINK__LINKED_CONTAINERS);
		}
		return linkedContainers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EnvironmentPackage.LINK__PARENT_ENVIRONMENT:
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
			case EnvironmentPackage.LINK__PARENT_ENVIRONMENT:
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
			case EnvironmentPackage.LINK__PARENT_ENVIRONMENT:
				return eInternalContainer().eInverseRemove(this, EnvironmentPackage.ENVIRONMENT__LINKS, Environment.class, msgs);
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
			case EnvironmentPackage.LINK__PARENT_ENVIRONMENT:
				return getParentEnvironment();
			case EnvironmentPackage.LINK__LINKED_CONTAINERS:
				return getLinkedContainers();
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
			case EnvironmentPackage.LINK__PARENT_ENVIRONMENT:
				setParentEnvironment((Environment)newValue);
				return;
			case EnvironmentPackage.LINK__LINKED_CONTAINERS:
				getLinkedContainers().clear();
				getLinkedContainers().addAll((Collection<? extends edu.kit.ipd.sdq.cbsm.environment.Container>)newValue);
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
			case EnvironmentPackage.LINK__PARENT_ENVIRONMENT:
				setParentEnvironment((Environment)null);
				return;
			case EnvironmentPackage.LINK__LINKED_CONTAINERS:
				getLinkedContainers().clear();
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
			case EnvironmentPackage.LINK__PARENT_ENVIRONMENT:
				return getParentEnvironment() != null;
			case EnvironmentPackage.LINK__LINKED_CONTAINERS:
				return linkedContainers != null && !linkedContainers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LinkImpl
