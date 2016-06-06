/**
 */
package edu.kit.ipd.sdq.cbsm.repository.behavior.impl;

import edu.kit.ipd.sdq.cbsm.repository.behavior.BehaviorDescription;
import edu.kit.ipd.sdq.cbsm.repository.behavior.BehaviorPackage;
import edu.kit.ipd.sdq.cbsm.repository.behavior.Loop;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.repository.behavior.impl.LoopImpl#getLoopBehavior <em>Loop Behavior</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoopImpl extends ActionImpl implements Loop {
	/**
	 * The cached value of the '{@link #getLoopBehavior() <em>Loop Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopBehavior()
	 * @generated
	 * @ordered
	 */
	protected BehaviorDescription loopBehavior;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.LOOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorDescription getLoopBehavior() {
		return loopBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoopBehavior(BehaviorDescription newLoopBehavior, NotificationChain msgs) {
		BehaviorDescription oldLoopBehavior = loopBehavior;
		loopBehavior = newLoopBehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.LOOP__LOOP_BEHAVIOR, oldLoopBehavior, newLoopBehavior);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopBehavior(BehaviorDescription newLoopBehavior) {
		if (newLoopBehavior != loopBehavior) {
			NotificationChain msgs = null;
			if (loopBehavior != null)
				msgs = ((InternalEObject)loopBehavior).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.LOOP__LOOP_BEHAVIOR, null, msgs);
			if (newLoopBehavior != null)
				msgs = ((InternalEObject)newLoopBehavior).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.LOOP__LOOP_BEHAVIOR, null, msgs);
			msgs = basicSetLoopBehavior(newLoopBehavior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.LOOP__LOOP_BEHAVIOR, newLoopBehavior, newLoopBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviorPackage.LOOP__LOOP_BEHAVIOR:
				return basicSetLoopBehavior(null, msgs);
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
			case BehaviorPackage.LOOP__LOOP_BEHAVIOR:
				return getLoopBehavior();
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
			case BehaviorPackage.LOOP__LOOP_BEHAVIOR:
				setLoopBehavior((BehaviorDescription)newValue);
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
			case BehaviorPackage.LOOP__LOOP_BEHAVIOR:
				setLoopBehavior((BehaviorDescription)null);
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
			case BehaviorPackage.LOOP__LOOP_BEHAVIOR:
				return loopBehavior != null;
		}
		return super.eIsSet(featureID);
	}

} //LoopImpl
