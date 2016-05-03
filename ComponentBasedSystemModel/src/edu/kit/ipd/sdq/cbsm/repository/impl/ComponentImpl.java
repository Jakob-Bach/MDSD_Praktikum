/**
 */
package edu.kit.ipd.sdq.cbsm.repository.impl;

import edu.kit.ipd.sdq.cbsm.core.impl.NamedElementImpl;

import edu.kit.ipd.sdq.cbsm.repository.BehaviorDescription;
import edu.kit.ipd.sdq.cbsm.repository.Component;
import edu.kit.ipd.sdq.cbsm.repository.Interface;
import edu.kit.ipd.sdq.cbsm.repository.RepositoryPackage;
import edu.kit.ipd.sdq.cbsm.repository.Service;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.repository.impl.ComponentImpl#getProvidedInterfaces <em>Provided Interfaces</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.repository.impl.ComponentImpl#getRequiredInterfaces <em>Required Interfaces</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.repository.impl.ComponentImpl#getProvidedServices <em>Provided Services</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.repository.impl.ComponentImpl#getBehaviorDescriptions <em>Behavior Descriptions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends NamedElementImpl implements Component {
	/**
	 * The cached value of the '{@link #getProvidedInterfaces() <em>Provided Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> providedInterfaces;

	/**
	 * The cached value of the '{@link #getRequiredInterfaces() <em>Required Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> requiredInterfaces;

	/**
	 * The cached value of the '{@link #getProvidedServices() <em>Provided Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> providedServices;

	/**
	 * The cached value of the '{@link #getBehaviorDescriptions() <em>Behavior Descriptions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviorDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<BehaviorDescription> behaviorDescriptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RepositoryPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getProvidedInterfaces() {
		if (providedInterfaces == null) {
			providedInterfaces = new EObjectResolvingEList<Interface>(Interface.class, this, RepositoryPackage.COMPONENT__PROVIDED_INTERFACES);
		}
		return providedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getRequiredInterfaces() {
		if (requiredInterfaces == null) {
			requiredInterfaces = new EObjectResolvingEList<Interface>(Interface.class, this, RepositoryPackage.COMPONENT__REQUIRED_INTERFACES);
		}
		return requiredInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getProvidedServices() {
		if (providedServices == null) {
			providedServices = new EObjectContainmentEList<Service>(Service.class, this, RepositoryPackage.COMPONENT__PROVIDED_SERVICES);
		}
		return providedServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BehaviorDescription> getBehaviorDescriptions() {
		if (behaviorDescriptions == null) {
			behaviorDescriptions = new EObjectContainmentEList<BehaviorDescription>(BehaviorDescription.class, this, RepositoryPackage.COMPONENT__BEHAVIOR_DESCRIPTIONS);
		}
		return behaviorDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RepositoryPackage.COMPONENT__PROVIDED_SERVICES:
				return ((InternalEList<?>)getProvidedServices()).basicRemove(otherEnd, msgs);
			case RepositoryPackage.COMPONENT__BEHAVIOR_DESCRIPTIONS:
				return ((InternalEList<?>)getBehaviorDescriptions()).basicRemove(otherEnd, msgs);
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
			case RepositoryPackage.COMPONENT__PROVIDED_INTERFACES:
				return getProvidedInterfaces();
			case RepositoryPackage.COMPONENT__REQUIRED_INTERFACES:
				return getRequiredInterfaces();
			case RepositoryPackage.COMPONENT__PROVIDED_SERVICES:
				return getProvidedServices();
			case RepositoryPackage.COMPONENT__BEHAVIOR_DESCRIPTIONS:
				return getBehaviorDescriptions();
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
			case RepositoryPackage.COMPONENT__PROVIDED_INTERFACES:
				getProvidedInterfaces().clear();
				getProvidedInterfaces().addAll((Collection<? extends Interface>)newValue);
				return;
			case RepositoryPackage.COMPONENT__REQUIRED_INTERFACES:
				getRequiredInterfaces().clear();
				getRequiredInterfaces().addAll((Collection<? extends Interface>)newValue);
				return;
			case RepositoryPackage.COMPONENT__PROVIDED_SERVICES:
				getProvidedServices().clear();
				getProvidedServices().addAll((Collection<? extends Service>)newValue);
				return;
			case RepositoryPackage.COMPONENT__BEHAVIOR_DESCRIPTIONS:
				getBehaviorDescriptions().clear();
				getBehaviorDescriptions().addAll((Collection<? extends BehaviorDescription>)newValue);
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
			case RepositoryPackage.COMPONENT__PROVIDED_INTERFACES:
				getProvidedInterfaces().clear();
				return;
			case RepositoryPackage.COMPONENT__REQUIRED_INTERFACES:
				getRequiredInterfaces().clear();
				return;
			case RepositoryPackage.COMPONENT__PROVIDED_SERVICES:
				getProvidedServices().clear();
				return;
			case RepositoryPackage.COMPONENT__BEHAVIOR_DESCRIPTIONS:
				getBehaviorDescriptions().clear();
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
			case RepositoryPackage.COMPONENT__PROVIDED_INTERFACES:
				return providedInterfaces != null && !providedInterfaces.isEmpty();
			case RepositoryPackage.COMPONENT__REQUIRED_INTERFACES:
				return requiredInterfaces != null && !requiredInterfaces.isEmpty();
			case RepositoryPackage.COMPONENT__PROVIDED_SERVICES:
				return providedServices != null && !providedServices.isEmpty();
			case RepositoryPackage.COMPONENT__BEHAVIOR_DESCRIPTIONS:
				return behaviorDescriptions != null && !behaviorDescriptions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentImpl
