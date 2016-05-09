/**
 */
package edu.kit.ipd.sdq.cbsm.assembly.impl;

import edu.kit.ipd.sdq.cbsm.assembly.AssemblyContext;
import edu.kit.ipd.sdq.cbsm.assembly.AssemblyPackage;
import edu.kit.ipd.sdq.cbsm.assembly.DelegationConnector;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delegation Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.assembly.impl.DelegationConnectorImpl#getInnerAssemblyContext <em>Inner Assembly Context</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.assembly.impl.DelegationConnectorImpl#getOuterAssemblyContext <em>Outer Assembly Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DelegationConnectorImpl extends ConnectorImpl implements DelegationConnector {
	/**
	 * The cached value of the '{@link #getInnerAssemblyContext() <em>Inner Assembly Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerAssemblyContext()
	 * @generated
	 * @ordered
	 */
	protected AssemblyContext innerAssemblyContext;
	/**
	 * The cached value of the '{@link #getOuterAssemblyContext() <em>Outer Assembly Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterAssemblyContext()
	 * @generated
	 * @ordered
	 */
	protected AssemblyContext outerAssemblyContext;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelegationConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyPackage.Literals.DELEGATION_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext getInnerAssemblyContext() {
		if (innerAssemblyContext != null && innerAssemblyContext.eIsProxy()) {
			InternalEObject oldInnerAssemblyContext = (InternalEObject)innerAssemblyContext;
			innerAssemblyContext = (AssemblyContext)eResolveProxy(oldInnerAssemblyContext);
			if (innerAssemblyContext != oldInnerAssemblyContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyPackage.DELEGATION_CONNECTOR__INNER_ASSEMBLY_CONTEXT, oldInnerAssemblyContext, innerAssemblyContext));
			}
		}
		return innerAssemblyContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext basicGetInnerAssemblyContext() {
		return innerAssemblyContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInnerAssemblyContext(AssemblyContext newInnerAssemblyContext) {
		AssemblyContext oldInnerAssemblyContext = innerAssemblyContext;
		innerAssemblyContext = newInnerAssemblyContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyPackage.DELEGATION_CONNECTOR__INNER_ASSEMBLY_CONTEXT, oldInnerAssemblyContext, innerAssemblyContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext getOuterAssemblyContext() {
		if (outerAssemblyContext != null && outerAssemblyContext.eIsProxy()) {
			InternalEObject oldOuterAssemblyContext = (InternalEObject)outerAssemblyContext;
			outerAssemblyContext = (AssemblyContext)eResolveProxy(oldOuterAssemblyContext);
			if (outerAssemblyContext != oldOuterAssemblyContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyPackage.DELEGATION_CONNECTOR__OUTER_ASSEMBLY_CONTEXT, oldOuterAssemblyContext, outerAssemblyContext));
			}
		}
		return outerAssemblyContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext basicGetOuterAssemblyContext() {
		return outerAssemblyContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOuterAssemblyContext(AssemblyContext newOuterAssemblyContext) {
		AssemblyContext oldOuterAssemblyContext = outerAssemblyContext;
		outerAssemblyContext = newOuterAssemblyContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyPackage.DELEGATION_CONNECTOR__OUTER_ASSEMBLY_CONTEXT, oldOuterAssemblyContext, outerAssemblyContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssemblyPackage.DELEGATION_CONNECTOR__INNER_ASSEMBLY_CONTEXT:
				if (resolve) return getInnerAssemblyContext();
				return basicGetInnerAssemblyContext();
			case AssemblyPackage.DELEGATION_CONNECTOR__OUTER_ASSEMBLY_CONTEXT:
				if (resolve) return getOuterAssemblyContext();
				return basicGetOuterAssemblyContext();
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
			case AssemblyPackage.DELEGATION_CONNECTOR__INNER_ASSEMBLY_CONTEXT:
				setInnerAssemblyContext((AssemblyContext)newValue);
				return;
			case AssemblyPackage.DELEGATION_CONNECTOR__OUTER_ASSEMBLY_CONTEXT:
				setOuterAssemblyContext((AssemblyContext)newValue);
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
			case AssemblyPackage.DELEGATION_CONNECTOR__INNER_ASSEMBLY_CONTEXT:
				setInnerAssemblyContext((AssemblyContext)null);
				return;
			case AssemblyPackage.DELEGATION_CONNECTOR__OUTER_ASSEMBLY_CONTEXT:
				setOuterAssemblyContext((AssemblyContext)null);
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
			case AssemblyPackage.DELEGATION_CONNECTOR__INNER_ASSEMBLY_CONTEXT:
				return innerAssemblyContext != null;
			case AssemblyPackage.DELEGATION_CONNECTOR__OUTER_ASSEMBLY_CONTEXT:
				return outerAssemblyContext != null;
		}
		return super.eIsSet(featureID);
	}

} //DelegationConnectorImpl
