/**
 */
package edu.kit.ipd.sdq.cbsm.repository.impl;

import edu.kit.ipd.sdq.cbsm.repository.RepositoryPackage;
import edu.kit.ipd.sdq.cbsm.repository.SimpleType;
import edu.kit.ipd.sdq.cbsm.repository.SimpleTypeInstance;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.repository.impl.SimpleTypeImpl#getTypeInstance <em>Type Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleTypeImpl extends MinimalEObjectImpl.Container implements SimpleType {
	/**
	 * The default value of the '{@link #getTypeInstance() <em>Type Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeInstance()
	 * @generated
	 * @ordered
	 */
	protected static final SimpleTypeInstance TYPE_INSTANCE_EDEFAULT = SimpleTypeInstance.BOOLEAN;

	/**
	 * The cached value of the '{@link #getTypeInstance() <em>Type Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeInstance()
	 * @generated
	 * @ordered
	 */
	protected SimpleTypeInstance typeInstance = TYPE_INSTANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RepositoryPackage.Literals.SIMPLE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleTypeInstance getTypeInstance() {
		return typeInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeInstance(SimpleTypeInstance newTypeInstance) {
		SimpleTypeInstance oldTypeInstance = typeInstance;
		typeInstance = newTypeInstance == null ? TYPE_INSTANCE_EDEFAULT : newTypeInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.SIMPLE_TYPE__TYPE_INSTANCE, oldTypeInstance, typeInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RepositoryPackage.SIMPLE_TYPE__TYPE_INSTANCE:
				return getTypeInstance();
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
			case RepositoryPackage.SIMPLE_TYPE__TYPE_INSTANCE:
				setTypeInstance((SimpleTypeInstance)newValue);
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
			case RepositoryPackage.SIMPLE_TYPE__TYPE_INSTANCE:
				setTypeInstance(TYPE_INSTANCE_EDEFAULT);
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
			case RepositoryPackage.SIMPLE_TYPE__TYPE_INSTANCE:
				return typeInstance != TYPE_INSTANCE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (typeInstance: ");
		result.append(typeInstance);
		result.append(')');
		return result.toString();
	}

} //SimpleTypeImpl
