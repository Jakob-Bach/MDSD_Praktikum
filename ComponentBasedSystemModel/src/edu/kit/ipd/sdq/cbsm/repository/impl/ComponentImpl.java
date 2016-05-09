/**
 */
package edu.kit.ipd.sdq.cbsm.repository.impl;

import edu.kit.ipd.sdq.cbsm.core.impl.NamedElementImpl;
import edu.kit.ipd.sdq.cbsm.repository.Component;
import edu.kit.ipd.sdq.cbsm.repository.ProvidedRole;
import edu.kit.ipd.sdq.cbsm.repository.ProvidingAndRequiringElement;
import edu.kit.ipd.sdq.cbsm.repository.RepositoryPackage;
import edu.kit.ipd.sdq.cbsm.repository.RequiredRole;
import edu.kit.ipd.sdq.cbsm.repository.behavior.BehaviorDescription;
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
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.repository.impl.ComponentImpl#getProvidedRoles <em>Provided Roles</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.repository.impl.ComponentImpl#getRequiredRoles <em>Required Roles</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.repository.impl.ComponentImpl#getBehaviorDescription <em>Behavior Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends NamedElementImpl implements Component {
	/**
	 * The cached value of the '{@link #getProvidedRoles() <em>Provided Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<ProvidedRole> providedRoles;

	/**
	 * The cached value of the '{@link #getRequiredRoles() <em>Required Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<RequiredRole> requiredRoles;

	/**
	 * The cached value of the '{@link #getBehaviorDescription() <em>Behavior Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviorDescription()
	 * @generated
	 * @ordered
	 */
	protected BehaviorDescription behaviorDescription;

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
	public EList<ProvidedRole> getProvidedRoles() {
		if (providedRoles == null) {
			providedRoles = new EObjectContainmentEList<ProvidedRole>(ProvidedRole.class, this, RepositoryPackage.COMPONENT__PROVIDED_ROLES);
		}
		return providedRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequiredRole> getRequiredRoles() {
		if (requiredRoles == null) {
			requiredRoles = new EObjectContainmentEList<RequiredRole>(RequiredRole.class, this, RepositoryPackage.COMPONENT__REQUIRED_ROLES);
		}
		return requiredRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorDescription getBehaviorDescription() {
		return behaviorDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBehaviorDescription(BehaviorDescription newBehaviorDescription, NotificationChain msgs) {
		BehaviorDescription oldBehaviorDescription = behaviorDescription;
		behaviorDescription = newBehaviorDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RepositoryPackage.COMPONENT__BEHAVIOR_DESCRIPTION, oldBehaviorDescription, newBehaviorDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehaviorDescription(BehaviorDescription newBehaviorDescription) {
		if (newBehaviorDescription != behaviorDescription) {
			NotificationChain msgs = null;
			if (behaviorDescription != null)
				msgs = ((InternalEObject)behaviorDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RepositoryPackage.COMPONENT__BEHAVIOR_DESCRIPTION, null, msgs);
			if (newBehaviorDescription != null)
				msgs = ((InternalEObject)newBehaviorDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RepositoryPackage.COMPONENT__BEHAVIOR_DESCRIPTION, null, msgs);
			msgs = basicSetBehaviorDescription(newBehaviorDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.COMPONENT__BEHAVIOR_DESCRIPTION, newBehaviorDescription, newBehaviorDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RepositoryPackage.COMPONENT__PROVIDED_ROLES:
				return ((InternalEList<?>)getProvidedRoles()).basicRemove(otherEnd, msgs);
			case RepositoryPackage.COMPONENT__REQUIRED_ROLES:
				return ((InternalEList<?>)getRequiredRoles()).basicRemove(otherEnd, msgs);
			case RepositoryPackage.COMPONENT__BEHAVIOR_DESCRIPTION:
				return basicSetBehaviorDescription(null, msgs);
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
			case RepositoryPackage.COMPONENT__PROVIDED_ROLES:
				return getProvidedRoles();
			case RepositoryPackage.COMPONENT__REQUIRED_ROLES:
				return getRequiredRoles();
			case RepositoryPackage.COMPONENT__BEHAVIOR_DESCRIPTION:
				return getBehaviorDescription();
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
			case RepositoryPackage.COMPONENT__PROVIDED_ROLES:
				getProvidedRoles().clear();
				getProvidedRoles().addAll((Collection<? extends ProvidedRole>)newValue);
				return;
			case RepositoryPackage.COMPONENT__REQUIRED_ROLES:
				getRequiredRoles().clear();
				getRequiredRoles().addAll((Collection<? extends RequiredRole>)newValue);
				return;
			case RepositoryPackage.COMPONENT__BEHAVIOR_DESCRIPTION:
				setBehaviorDescription((BehaviorDescription)newValue);
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
			case RepositoryPackage.COMPONENT__PROVIDED_ROLES:
				getProvidedRoles().clear();
				return;
			case RepositoryPackage.COMPONENT__REQUIRED_ROLES:
				getRequiredRoles().clear();
				return;
			case RepositoryPackage.COMPONENT__BEHAVIOR_DESCRIPTION:
				setBehaviorDescription((BehaviorDescription)null);
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
			case RepositoryPackage.COMPONENT__PROVIDED_ROLES:
				return providedRoles != null && !providedRoles.isEmpty();
			case RepositoryPackage.COMPONENT__REQUIRED_ROLES:
				return requiredRoles != null && !requiredRoles.isEmpty();
			case RepositoryPackage.COMPONENT__BEHAVIOR_DESCRIPTION:
				return behaviorDescription != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ProvidingAndRequiringElement.class) {
			switch (derivedFeatureID) {
				case RepositoryPackage.COMPONENT__PROVIDED_ROLES: return RepositoryPackage.PROVIDING_AND_REQUIRING_ELEMENT__PROVIDED_ROLES;
				case RepositoryPackage.COMPONENT__REQUIRED_ROLES: return RepositoryPackage.PROVIDING_AND_REQUIRING_ELEMENT__REQUIRED_ROLES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ProvidingAndRequiringElement.class) {
			switch (baseFeatureID) {
				case RepositoryPackage.PROVIDING_AND_REQUIRING_ELEMENT__PROVIDED_ROLES: return RepositoryPackage.COMPONENT__PROVIDED_ROLES;
				case RepositoryPackage.PROVIDING_AND_REQUIRING_ELEMENT__REQUIRED_ROLES: return RepositoryPackage.COMPONENT__REQUIRED_ROLES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ComponentImpl
