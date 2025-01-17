/**
 */
package edu.kit.ipd.sdq.cbsm.repository.behavior.impl;

import edu.kit.ipd.sdq.cbsm.core.impl.NamedElementImpl;

import edu.kit.ipd.sdq.cbsm.repository.behavior.Action;
import edu.kit.ipd.sdq.cbsm.repository.behavior.BehaviorPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.repository.behavior.impl.ActionImpl#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.repository.behavior.impl.ActionImpl#getSuccessor <em>Successor</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ActionImpl extends NamedElementImpl implements Action {
	/**
	 * The cached value of the '{@link #getPredecessor() <em>Predecessor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredecessor()
	 * @generated
	 * @ordered
	 */
	protected Action predecessor;

	/**
	 * The cached value of the '{@link #getSuccessor() <em>Successor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessor()
	 * @generated
	 * @ordered
	 */
	protected Action successor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getPredecessor() {
		if (predecessor != null && predecessor.eIsProxy()) {
			InternalEObject oldPredecessor = (InternalEObject)predecessor;
			predecessor = (Action)eResolveProxy(oldPredecessor);
			if (predecessor != oldPredecessor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.ACTION__PREDECESSOR, oldPredecessor, predecessor));
			}
		}
		return predecessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetPredecessor() {
		return predecessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPredecessor(Action newPredecessor, NotificationChain msgs) {
		Action oldPredecessor = predecessor;
		predecessor = newPredecessor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.ACTION__PREDECESSOR, oldPredecessor, newPredecessor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredecessor(Action newPredecessor) {
		if (newPredecessor != predecessor) {
			NotificationChain msgs = null;
			if (predecessor != null)
				msgs = ((InternalEObject)predecessor).eInverseRemove(this, BehaviorPackage.ACTION__SUCCESSOR, Action.class, msgs);
			if (newPredecessor != null)
				msgs = ((InternalEObject)newPredecessor).eInverseAdd(this, BehaviorPackage.ACTION__SUCCESSOR, Action.class, msgs);
			msgs = basicSetPredecessor(newPredecessor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.ACTION__PREDECESSOR, newPredecessor, newPredecessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getSuccessor() {
		if (successor != null && successor.eIsProxy()) {
			InternalEObject oldSuccessor = (InternalEObject)successor;
			successor = (Action)eResolveProxy(oldSuccessor);
			if (successor != oldSuccessor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.ACTION__SUCCESSOR, oldSuccessor, successor));
			}
		}
		return successor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetSuccessor() {
		return successor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuccessor(Action newSuccessor, NotificationChain msgs) {
		Action oldSuccessor = successor;
		successor = newSuccessor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.ACTION__SUCCESSOR, oldSuccessor, newSuccessor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuccessor(Action newSuccessor) {
		if (newSuccessor != successor) {
			NotificationChain msgs = null;
			if (successor != null)
				msgs = ((InternalEObject)successor).eInverseRemove(this, BehaviorPackage.ACTION__PREDECESSOR, Action.class, msgs);
			if (newSuccessor != null)
				msgs = ((InternalEObject)newSuccessor).eInverseAdd(this, BehaviorPackage.ACTION__PREDECESSOR, Action.class, msgs);
			msgs = basicSetSuccessor(newSuccessor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.ACTION__SUCCESSOR, newSuccessor, newSuccessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviorPackage.ACTION__PREDECESSOR:
				if (predecessor != null)
					msgs = ((InternalEObject)predecessor).eInverseRemove(this, BehaviorPackage.ACTION__SUCCESSOR, Action.class, msgs);
				return basicSetPredecessor((Action)otherEnd, msgs);
			case BehaviorPackage.ACTION__SUCCESSOR:
				if (successor != null)
					msgs = ((InternalEObject)successor).eInverseRemove(this, BehaviorPackage.ACTION__PREDECESSOR, Action.class, msgs);
				return basicSetSuccessor((Action)otherEnd, msgs);
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
			case BehaviorPackage.ACTION__PREDECESSOR:
				return basicSetPredecessor(null, msgs);
			case BehaviorPackage.ACTION__SUCCESSOR:
				return basicSetSuccessor(null, msgs);
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
			case BehaviorPackage.ACTION__PREDECESSOR:
				if (resolve) return getPredecessor();
				return basicGetPredecessor();
			case BehaviorPackage.ACTION__SUCCESSOR:
				if (resolve) return getSuccessor();
				return basicGetSuccessor();
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
			case BehaviorPackage.ACTION__PREDECESSOR:
				setPredecessor((Action)newValue);
				return;
			case BehaviorPackage.ACTION__SUCCESSOR:
				setSuccessor((Action)newValue);
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
			case BehaviorPackage.ACTION__PREDECESSOR:
				setPredecessor((Action)null);
				return;
			case BehaviorPackage.ACTION__SUCCESSOR:
				setSuccessor((Action)null);
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
			case BehaviorPackage.ACTION__PREDECESSOR:
				return predecessor != null;
			case BehaviorPackage.ACTION__SUCCESSOR:
				return successor != null;
		}
		return super.eIsSet(featureID);
	}

} //ActionImpl
