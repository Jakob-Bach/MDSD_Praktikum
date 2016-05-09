/**
 */
package edu.kit.ipd.sdq.cbsm.assembly.impl;

import edu.kit.ipd.sdq.cbsm.assembly.AssemblyContext;
import edu.kit.ipd.sdq.cbsm.assembly.AssemblyPackage;
import edu.kit.ipd.sdq.cbsm.assembly.CompositeProvidingAndRequiringElement;
import edu.kit.ipd.sdq.cbsm.core.impl.NamedElementImpl;

import edu.kit.ipd.sdq.cbsm.repository.Component;

import edu.kit.ipd.sdq.cbsm.repository.ProvidedRole;
import edu.kit.ipd.sdq.cbsm.repository.RequiredRole;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.assembly.impl.AssemblyContextImpl#getInstantiatedComponent <em>Instantiated Component</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.assembly.impl.AssemblyContextImpl#getAssemblyContextProvidedRoles <em>Assembly Context Provided Roles</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.assembly.impl.AssemblyContextImpl#getAssemblyContextRequiredRoles <em>Assembly Context Required Roles</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.assembly.impl.AssemblyContextImpl#getParentCompositeElement <em>Parent Composite Element</em>}</li>
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
	 * The cached setting delegate for the '{@link #getAssemblyContextProvidedRoles() <em>Assembly Context Provided Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblyContextProvidedRoles()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ASSEMBLY_CONTEXT_PROVIDED_ROLES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)AssemblyPackage.Literals.ASSEMBLY_CONTEXT__ASSEMBLY_CONTEXT_PROVIDED_ROLES).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getAssemblyContextRequiredRoles() <em>Assembly Context Required Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblyContextRequiredRoles()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ASSEMBLY_CONTEXT_REQUIRED_ROLES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)AssemblyPackage.Literals.ASSEMBLY_CONTEXT__ASSEMBLY_CONTEXT_REQUIRED_ROLES).getSettingDelegate();

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
	@SuppressWarnings("unchecked")
	public EList<ProvidedRole> getAssemblyContextProvidedRoles() {
		return (EList<ProvidedRole>)ASSEMBLY_CONTEXT_PROVIDED_ROLES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<RequiredRole> getAssemblyContextRequiredRoles() {
		return (EList<RequiredRole>)ASSEMBLY_CONTEXT_REQUIRED_ROLES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeProvidingAndRequiringElement getParentCompositeElement() {
		if (eContainerFeatureID() != AssemblyPackage.ASSEMBLY_CONTEXT__PARENT_COMPOSITE_ELEMENT) return null;
		return (CompositeProvidingAndRequiringElement)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentCompositeElement(CompositeProvidingAndRequiringElement newParentCompositeElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentCompositeElement, AssemblyPackage.ASSEMBLY_CONTEXT__PARENT_COMPOSITE_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentCompositeElement(CompositeProvidingAndRequiringElement newParentCompositeElement) {
		if (newParentCompositeElement != eInternalContainer() || (eContainerFeatureID() != AssemblyPackage.ASSEMBLY_CONTEXT__PARENT_COMPOSITE_ELEMENT && newParentCompositeElement != null)) {
			if (EcoreUtil.isAncestor(this, newParentCompositeElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentCompositeElement != null)
				msgs = ((InternalEObject)newParentCompositeElement).eInverseAdd(this, AssemblyPackage.COMPOSITE_PROVIDING_AND_REQUIRING_ELEMENT__CONTAINED_ASSEMBLY_CONTEXTS, CompositeProvidingAndRequiringElement.class, msgs);
			msgs = basicSetParentCompositeElement(newParentCompositeElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyPackage.ASSEMBLY_CONTEXT__PARENT_COMPOSITE_ELEMENT, newParentCompositeElement, newParentCompositeElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssemblyPackage.ASSEMBLY_CONTEXT__PARENT_COMPOSITE_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentCompositeElement((CompositeProvidingAndRequiringElement)otherEnd, msgs);
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
			case AssemblyPackage.ASSEMBLY_CONTEXT__PARENT_COMPOSITE_ELEMENT:
				return basicSetParentCompositeElement(null, msgs);
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
			case AssemblyPackage.ASSEMBLY_CONTEXT__PARENT_COMPOSITE_ELEMENT:
				return eInternalContainer().eInverseRemove(this, AssemblyPackage.COMPOSITE_PROVIDING_AND_REQUIRING_ELEMENT__CONTAINED_ASSEMBLY_CONTEXTS, CompositeProvidingAndRequiringElement.class, msgs);
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
			case AssemblyPackage.ASSEMBLY_CONTEXT__INSTANTIATED_COMPONENT:
				if (resolve) return getInstantiatedComponent();
				return basicGetInstantiatedComponent();
			case AssemblyPackage.ASSEMBLY_CONTEXT__ASSEMBLY_CONTEXT_PROVIDED_ROLES:
				return getAssemblyContextProvidedRoles();
			case AssemblyPackage.ASSEMBLY_CONTEXT__ASSEMBLY_CONTEXT_REQUIRED_ROLES:
				return getAssemblyContextRequiredRoles();
			case AssemblyPackage.ASSEMBLY_CONTEXT__PARENT_COMPOSITE_ELEMENT:
				return getParentCompositeElement();
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
			case AssemblyPackage.ASSEMBLY_CONTEXT__ASSEMBLY_CONTEXT_PROVIDED_ROLES:
				getAssemblyContextProvidedRoles().clear();
				getAssemblyContextProvidedRoles().addAll((Collection<? extends ProvidedRole>)newValue);
				return;
			case AssemblyPackage.ASSEMBLY_CONTEXT__ASSEMBLY_CONTEXT_REQUIRED_ROLES:
				getAssemblyContextRequiredRoles().clear();
				getAssemblyContextRequiredRoles().addAll((Collection<? extends RequiredRole>)newValue);
				return;
			case AssemblyPackage.ASSEMBLY_CONTEXT__PARENT_COMPOSITE_ELEMENT:
				setParentCompositeElement((CompositeProvidingAndRequiringElement)newValue);
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
			case AssemblyPackage.ASSEMBLY_CONTEXT__ASSEMBLY_CONTEXT_PROVIDED_ROLES:
				getAssemblyContextProvidedRoles().clear();
				return;
			case AssemblyPackage.ASSEMBLY_CONTEXT__ASSEMBLY_CONTEXT_REQUIRED_ROLES:
				getAssemblyContextRequiredRoles().clear();
				return;
			case AssemblyPackage.ASSEMBLY_CONTEXT__PARENT_COMPOSITE_ELEMENT:
				setParentCompositeElement((CompositeProvidingAndRequiringElement)null);
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
			case AssemblyPackage.ASSEMBLY_CONTEXT__ASSEMBLY_CONTEXT_PROVIDED_ROLES:
				return ASSEMBLY_CONTEXT_PROVIDED_ROLES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case AssemblyPackage.ASSEMBLY_CONTEXT__ASSEMBLY_CONTEXT_REQUIRED_ROLES:
				return ASSEMBLY_CONTEXT_REQUIRED_ROLES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case AssemblyPackage.ASSEMBLY_CONTEXT__PARENT_COMPOSITE_ELEMENT:
				return getParentCompositeElement() != null;
		}
		return super.eIsSet(featureID);
	}

} //AssemblyContextImpl
