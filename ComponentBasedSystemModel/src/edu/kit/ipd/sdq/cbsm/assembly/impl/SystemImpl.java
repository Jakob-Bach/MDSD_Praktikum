/**
 */
package edu.kit.ipd.sdq.cbsm.assembly.impl;

import edu.kit.ipd.sdq.cbsm.assembly.AssemblyContext;
import edu.kit.ipd.sdq.cbsm.assembly.AssemblyPackage;

import edu.kit.ipd.sdq.cbsm.assembly.Connector;
import edu.kit.ipd.sdq.cbsm.repository.ProvidedRole;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.assembly.impl.SystemImpl#getContainedAssemblyContexts <em>Contained Assembly Contexts</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.assembly.impl.SystemImpl#getProvidedRoles <em>Provided Roles</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.assembly.impl.SystemImpl#getConnectors <em>Connectors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends MinimalEObjectImpl.Container implements edu.kit.ipd.sdq.cbsm.assembly.System {
	/**
	 * The cached value of the '{@link #getContainedAssemblyContexts() <em>Contained Assembly Contexts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedAssemblyContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<AssemblyContext> containedAssemblyContexts;

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
	 * The cached value of the '{@link #getConnectors() <em>Connectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> connectors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyPackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssemblyContext> getContainedAssemblyContexts() {
		if (containedAssemblyContexts == null) {
			containedAssemblyContexts = new EObjectContainmentEList<AssemblyContext>(AssemblyContext.class, this, AssemblyPackage.SYSTEM__CONTAINED_ASSEMBLY_CONTEXTS);
		}
		return containedAssemblyContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProvidedRole> getProvidedRoles() {
		if (providedRoles == null) {
			providedRoles = new EObjectResolvingEList<ProvidedRole>(ProvidedRole.class, this, AssemblyPackage.SYSTEM__PROVIDED_ROLES);
		}
		return providedRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getConnectors() {
		if (connectors == null) {
			connectors = new EObjectContainmentEList<Connector>(Connector.class, this, AssemblyPackage.SYSTEM__CONNECTORS);
		}
		return connectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssemblyPackage.SYSTEM__CONTAINED_ASSEMBLY_CONTEXTS:
				return ((InternalEList<?>)getContainedAssemblyContexts()).basicRemove(otherEnd, msgs);
			case AssemblyPackage.SYSTEM__CONNECTORS:
				return ((InternalEList<?>)getConnectors()).basicRemove(otherEnd, msgs);
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
			case AssemblyPackage.SYSTEM__CONTAINED_ASSEMBLY_CONTEXTS:
				return getContainedAssemblyContexts();
			case AssemblyPackage.SYSTEM__PROVIDED_ROLES:
				return getProvidedRoles();
			case AssemblyPackage.SYSTEM__CONNECTORS:
				return getConnectors();
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
			case AssemblyPackage.SYSTEM__CONTAINED_ASSEMBLY_CONTEXTS:
				getContainedAssemblyContexts().clear();
				getContainedAssemblyContexts().addAll((Collection<? extends AssemblyContext>)newValue);
				return;
			case AssemblyPackage.SYSTEM__PROVIDED_ROLES:
				getProvidedRoles().clear();
				getProvidedRoles().addAll((Collection<? extends ProvidedRole>)newValue);
				return;
			case AssemblyPackage.SYSTEM__CONNECTORS:
				getConnectors().clear();
				getConnectors().addAll((Collection<? extends Connector>)newValue);
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
			case AssemblyPackage.SYSTEM__CONTAINED_ASSEMBLY_CONTEXTS:
				getContainedAssemblyContexts().clear();
				return;
			case AssemblyPackage.SYSTEM__PROVIDED_ROLES:
				getProvidedRoles().clear();
				return;
			case AssemblyPackage.SYSTEM__CONNECTORS:
				getConnectors().clear();
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
			case AssemblyPackage.SYSTEM__CONTAINED_ASSEMBLY_CONTEXTS:
				return containedAssemblyContexts != null && !containedAssemblyContexts.isEmpty();
			case AssemblyPackage.SYSTEM__PROVIDED_ROLES:
				return providedRoles != null && !providedRoles.isEmpty();
			case AssemblyPackage.SYSTEM__CONNECTORS:
				return connectors != null && !connectors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemImpl
