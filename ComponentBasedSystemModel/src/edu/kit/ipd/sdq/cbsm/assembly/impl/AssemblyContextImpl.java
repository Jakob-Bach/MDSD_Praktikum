/**
 */
package edu.kit.ipd.sdq.cbsm.assembly.impl;

import edu.kit.ipd.sdq.cbsm.assembly.AssemblyContext;
import edu.kit.ipd.sdq.cbsm.assembly.AssemblyPackage;
import edu.kit.ipd.sdq.cbsm.core.impl.NamedElementImpl;

import edu.kit.ipd.sdq.cbsm.repository.Component;

import edu.kit.ipd.sdq.cbsm.repository.ProvidedRole;
import edu.kit.ipd.sdq.cbsm.repository.RequiredRole;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.assembly.impl.AssemblyContextImpl#getInstantiatedComponent <em>Instantiated Component</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.assembly.impl.AssemblyContextImpl#getProvidedRoles <em>Provided Roles</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.assembly.impl.AssemblyContextImpl#getRequiredRoles <em>Required Roles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssemblyContextImpl extends NamedElementImpl implements AssemblyContext {
	/**
	 * The cached value of the '{@link #getInstantiatedComponent() <em>Instantiated Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiatedComponent()
	 * @generated
	 * @ordered
	 */
	protected Component instantiatedComponent;

	/**
	 * The cached value of the '{@link #getProvidedRoles() <em>Provided Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<ProvidedRole> providedRoles;

	/**
	 * The cached value of the '{@link #getRequiredRoles() <em>Required Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<RequiredRole> requiredRoles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyPackage.Literals.ASSEMBLY_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getInstantiatedComponent() {
		if (instantiatedComponent != null && instantiatedComponent.eIsProxy()) {
			InternalEObject oldInstantiatedComponent = (InternalEObject)instantiatedComponent;
			instantiatedComponent = (Component)eResolveProxy(oldInstantiatedComponent);
			if (instantiatedComponent != oldInstantiatedComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyPackage.ASSEMBLY_CONTEXT__INSTANTIATED_COMPONENT, oldInstantiatedComponent, instantiatedComponent));
			}
		}
		return instantiatedComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetInstantiatedComponent() {
		return instantiatedComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstantiatedComponent(Component newInstantiatedComponent) {
		Component oldInstantiatedComponent = instantiatedComponent;
		instantiatedComponent = newInstantiatedComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyPackage.ASSEMBLY_CONTEXT__INSTANTIATED_COMPONENT, oldInstantiatedComponent, instantiatedComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProvidedRole> getProvidedRoles() {
		if (providedRoles == null) {
			providedRoles = new EObjectResolvingEList<ProvidedRole>(ProvidedRole.class, this, AssemblyPackage.ASSEMBLY_CONTEXT__PROVIDED_ROLES);
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
			requiredRoles = new EObjectResolvingEList<RequiredRole>(RequiredRole.class, this, AssemblyPackage.ASSEMBLY_CONTEXT__REQUIRED_ROLES);
		}
		return requiredRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssemblyPackage.ASSEMBLY_CONTEXT__INSTANTIATED_COMPONENT:
				if (resolve) return getInstantiatedComponent();
				return basicGetInstantiatedComponent();
			case AssemblyPackage.ASSEMBLY_CONTEXT__PROVIDED_ROLES:
				return getProvidedRoles();
			case AssemblyPackage.ASSEMBLY_CONTEXT__REQUIRED_ROLES:
				return getRequiredRoles();
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
			case AssemblyPackage.ASSEMBLY_CONTEXT__INSTANTIATED_COMPONENT:
				setInstantiatedComponent((Component)newValue);
				return;
			case AssemblyPackage.ASSEMBLY_CONTEXT__PROVIDED_ROLES:
				getProvidedRoles().clear();
				getProvidedRoles().addAll((Collection<? extends ProvidedRole>)newValue);
				return;
			case AssemblyPackage.ASSEMBLY_CONTEXT__REQUIRED_ROLES:
				getRequiredRoles().clear();
				getRequiredRoles().addAll((Collection<? extends RequiredRole>)newValue);
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
			case AssemblyPackage.ASSEMBLY_CONTEXT__INSTANTIATED_COMPONENT:
				setInstantiatedComponent((Component)null);
				return;
			case AssemblyPackage.ASSEMBLY_CONTEXT__PROVIDED_ROLES:
				getProvidedRoles().clear();
				return;
			case AssemblyPackage.ASSEMBLY_CONTEXT__REQUIRED_ROLES:
				getRequiredRoles().clear();
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
			case AssemblyPackage.ASSEMBLY_CONTEXT__INSTANTIATED_COMPONENT:
				return instantiatedComponent != null;
			case AssemblyPackage.ASSEMBLY_CONTEXT__PROVIDED_ROLES:
				return providedRoles != null && !providedRoles.isEmpty();
			case AssemblyPackage.ASSEMBLY_CONTEXT__REQUIRED_ROLES:
				return requiredRoles != null && !requiredRoles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AssemblyContextImpl
