/**
 */
package edu.kit.ipd.sdq.cbsm.assembly.impl;

import edu.kit.ipd.sdq.cbsm.assembly.AssemblyConnector;
import edu.kit.ipd.sdq.cbsm.assembly.AssemblyContext;
import edu.kit.ipd.sdq.cbsm.assembly.AssemblyPackage;
import edu.kit.ipd.sdq.cbsm.repository.ProvidedRole;
import edu.kit.ipd.sdq.cbsm.repository.RequiredRole;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.assembly.impl.AssemblyConnectorImpl#getConnectedProvidedRole <em>Connected Provided Role</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.assembly.impl.AssemblyConnectorImpl#getConnectedRequiredRole <em>Connected Required Role</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.assembly.impl.AssemblyConnectorImpl#getConnectedProvidedAssemblyContext <em>Connected Provided Assembly Context</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.assembly.impl.AssemblyConnectorImpl#getConnectedRequiredAssemblyContext <em>Connected Required Assembly Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssemblyConnectorImpl extends ConnectorImpl implements AssemblyConnector {
	/**
	 * The cached value of the '{@link #getConnectedProvidedRole() <em>Connected Provided Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedProvidedRole()
	 * @generated
	 * @ordered
	 */
	protected ProvidedRole connectedProvidedRole;

	/**
	 * The cached value of the '{@link #getConnectedRequiredRole() <em>Connected Required Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedRequiredRole()
	 * @generated
	 * @ordered
	 */
	protected RequiredRole connectedRequiredRole;

	/**
	 * The cached value of the '{@link #getConnectedProvidedAssemblyContext() <em>Connected Provided Assembly Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedProvidedAssemblyContext()
	 * @generated
	 * @ordered
	 */
	protected AssemblyContext connectedProvidedAssemblyContext;

	/**
	 * The cached value of the '{@link #getConnectedRequiredAssemblyContext() <em>Connected Required Assembly Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedRequiredAssemblyContext()
	 * @generated
	 * @ordered
	 */
	protected AssemblyContext connectedRequiredAssemblyContext;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyPackage.Literals.ASSEMBLY_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedRole getConnectedProvidedRole() {
		if (connectedProvidedRole != null && connectedProvidedRole.eIsProxy()) {
			InternalEObject oldConnectedProvidedRole = (InternalEObject)connectedProvidedRole;
			connectedProvidedRole = (ProvidedRole)eResolveProxy(oldConnectedProvidedRole);
			if (connectedProvidedRole != oldConnectedProvidedRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyPackage.ASSEMBLY_CONNECTOR__CONNECTED_PROVIDED_ROLE, oldConnectedProvidedRole, connectedProvidedRole));
			}
		}
		return connectedProvidedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedRole basicGetConnectedProvidedRole() {
		return connectedProvidedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectedProvidedRole(ProvidedRole newConnectedProvidedRole) {
		ProvidedRole oldConnectedProvidedRole = connectedProvidedRole;
		connectedProvidedRole = newConnectedProvidedRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyPackage.ASSEMBLY_CONNECTOR__CONNECTED_PROVIDED_ROLE, oldConnectedProvidedRole, connectedProvidedRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredRole getConnectedRequiredRole() {
		if (connectedRequiredRole != null && connectedRequiredRole.eIsProxy()) {
			InternalEObject oldConnectedRequiredRole = (InternalEObject)connectedRequiredRole;
			connectedRequiredRole = (RequiredRole)eResolveProxy(oldConnectedRequiredRole);
			if (connectedRequiredRole != oldConnectedRequiredRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyPackage.ASSEMBLY_CONNECTOR__CONNECTED_REQUIRED_ROLE, oldConnectedRequiredRole, connectedRequiredRole));
			}
		}
		return connectedRequiredRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredRole basicGetConnectedRequiredRole() {
		return connectedRequiredRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectedRequiredRole(RequiredRole newConnectedRequiredRole) {
		RequiredRole oldConnectedRequiredRole = connectedRequiredRole;
		connectedRequiredRole = newConnectedRequiredRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyPackage.ASSEMBLY_CONNECTOR__CONNECTED_REQUIRED_ROLE, oldConnectedRequiredRole, connectedRequiredRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext getConnectedProvidedAssemblyContext() {
		if (connectedProvidedAssemblyContext != null && connectedProvidedAssemblyContext.eIsProxy()) {
			InternalEObject oldConnectedProvidedAssemblyContext = (InternalEObject)connectedProvidedAssemblyContext;
			connectedProvidedAssemblyContext = (AssemblyContext)eResolveProxy(oldConnectedProvidedAssemblyContext);
			if (connectedProvidedAssemblyContext != oldConnectedProvidedAssemblyContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyPackage.ASSEMBLY_CONNECTOR__CONNECTED_PROVIDED_ASSEMBLY_CONTEXT, oldConnectedProvidedAssemblyContext, connectedProvidedAssemblyContext));
			}
		}
		return connectedProvidedAssemblyContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext basicGetConnectedProvidedAssemblyContext() {
		return connectedProvidedAssemblyContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectedProvidedAssemblyContext(AssemblyContext newConnectedProvidedAssemblyContext) {
		AssemblyContext oldConnectedProvidedAssemblyContext = connectedProvidedAssemblyContext;
		connectedProvidedAssemblyContext = newConnectedProvidedAssemblyContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyPackage.ASSEMBLY_CONNECTOR__CONNECTED_PROVIDED_ASSEMBLY_CONTEXT, oldConnectedProvidedAssemblyContext, connectedProvidedAssemblyContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext getConnectedRequiredAssemblyContext() {
		if (connectedRequiredAssemblyContext != null && connectedRequiredAssemblyContext.eIsProxy()) {
			InternalEObject oldConnectedRequiredAssemblyContext = (InternalEObject)connectedRequiredAssemblyContext;
			connectedRequiredAssemblyContext = (AssemblyContext)eResolveProxy(oldConnectedRequiredAssemblyContext);
			if (connectedRequiredAssemblyContext != oldConnectedRequiredAssemblyContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyPackage.ASSEMBLY_CONNECTOR__CONNECTED_REQUIRED_ASSEMBLY_CONTEXT, oldConnectedRequiredAssemblyContext, connectedRequiredAssemblyContext));
			}
		}
		return connectedRequiredAssemblyContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext basicGetConnectedRequiredAssemblyContext() {
		return connectedRequiredAssemblyContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectedRequiredAssemblyContext(AssemblyContext newConnectedRequiredAssemblyContext) {
		AssemblyContext oldConnectedRequiredAssemblyContext = connectedRequiredAssemblyContext;
		connectedRequiredAssemblyContext = newConnectedRequiredAssemblyContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyPackage.ASSEMBLY_CONNECTOR__CONNECTED_REQUIRED_ASSEMBLY_CONTEXT, oldConnectedRequiredAssemblyContext, connectedRequiredAssemblyContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssemblyPackage.ASSEMBLY_CONNECTOR__CONNECTED_PROVIDED_ROLE:
				if (resolve) return getConnectedProvidedRole();
				return basicGetConnectedProvidedRole();
			case AssemblyPackage.ASSEMBLY_CONNECTOR__CONNECTED_REQUIRED_ROLE:
				if (resolve) return getConnectedRequiredRole();
				return basicGetConnectedRequiredRole();
			case AssemblyPackage.ASSEMBLY_CONNECTOR__CONNECTED_PROVIDED_ASSEMBLY_CONTEXT:
				if (resolve) return getConnectedProvidedAssemblyContext();
				return basicGetConnectedProvidedAssemblyContext();
			case AssemblyPackage.ASSEMBLY_CONNECTOR__CONNECTED_REQUIRED_ASSEMBLY_CONTEXT:
				if (resolve) return getConnectedRequiredAssemblyContext();
				return basicGetConnectedRequiredAssemblyContext();
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
			case AssemblyPackage.ASSEMBLY_CONNECTOR__CONNECTED_PROVIDED_ROLE:
				setConnectedProvidedRole((ProvidedRole)newValue);
				return;
			case AssemblyPackage.ASSEMBLY_CONNECTOR__CONNECTED_REQUIRED_ROLE:
				setConnectedRequiredRole((RequiredRole)newValue);
				return;
			case AssemblyPackage.ASSEMBLY_CONNECTOR__CONNECTED_PROVIDED_ASSEMBLY_CONTEXT:
				setConnectedProvidedAssemblyContext((AssemblyContext)newValue);
				return;
			case AssemblyPackage.ASSEMBLY_CONNECTOR__CONNECTED_REQUIRED_ASSEMBLY_CONTEXT:
				setConnectedRequiredAssemblyContext((AssemblyContext)newValue);
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
			case AssemblyPackage.ASSEMBLY_CONNECTOR__CONNECTED_PROVIDED_ROLE:
				setConnectedProvidedRole((ProvidedRole)null);
				return;
			case AssemblyPackage.ASSEMBLY_CONNECTOR__CONNECTED_REQUIRED_ROLE:
				setConnectedRequiredRole((RequiredRole)null);
				return;
			case AssemblyPackage.ASSEMBLY_CONNECTOR__CONNECTED_PROVIDED_ASSEMBLY_CONTEXT:
				setConnectedProvidedAssemblyContext((AssemblyContext)null);
				return;
			case AssemblyPackage.ASSEMBLY_CONNECTOR__CONNECTED_REQUIRED_ASSEMBLY_CONTEXT:
				setConnectedRequiredAssemblyContext((AssemblyContext)null);
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
			case AssemblyPackage.ASSEMBLY_CONNECTOR__CONNECTED_PROVIDED_ROLE:
				return connectedProvidedRole != null;
			case AssemblyPackage.ASSEMBLY_CONNECTOR__CONNECTED_REQUIRED_ROLE:
				return connectedRequiredRole != null;
			case AssemblyPackage.ASSEMBLY_CONNECTOR__CONNECTED_PROVIDED_ASSEMBLY_CONTEXT:
				return connectedProvidedAssemblyContext != null;
			case AssemblyPackage.ASSEMBLY_CONNECTOR__CONNECTED_REQUIRED_ASSEMBLY_CONTEXT:
				return connectedRequiredAssemblyContext != null;
		}
		return super.eIsSet(featureID);
	}

} //AssemblyConnectorImpl
