/**
 */
package edu.kit.ipd.sdq.cbsm.repository.behavior.impl;

import edu.kit.ipd.sdq.cbsm.core.impl.NamedElementImpl;
import edu.kit.ipd.sdq.cbsm.repository.behavior.BehaviorDescription;
import edu.kit.ipd.sdq.cbsm.repository.behavior.BehaviorPackage;
import edu.kit.ipd.sdq.cbsm.repository.behavior.BranchPath;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Branch Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.repository.behavior.impl.BranchPathImpl#getBranchBehavior <em>Branch Behavior</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BranchPathImpl extends NamedElementImpl implements BranchPath {
	/**
	 * The cached value of the '{@link #getBranchBehavior() <em>Branch Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranchBehavior()
	 * @generated
	 * @ordered
	 */
	protected BehaviorDescription branchBehavior;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BranchPathImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.BRANCH_PATH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorDescription getBranchBehavior() {
		return branchBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBranchBehavior(BehaviorDescription newBranchBehavior, NotificationChain msgs) {
		BehaviorDescription oldBranchBehavior = branchBehavior;
		branchBehavior = newBranchBehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.BRANCH_PATH__BRANCH_BEHAVIOR, oldBranchBehavior, newBranchBehavior);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBranchBehavior(BehaviorDescription newBranchBehavior) {
		if (newBranchBehavior != branchBehavior) {
			NotificationChain msgs = null;
			if (branchBehavior != null)
				msgs = ((InternalEObject)branchBehavior).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.BRANCH_PATH__BRANCH_BEHAVIOR, null, msgs);
			if (newBranchBehavior != null)
				msgs = ((InternalEObject)newBranchBehavior).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.BRANCH_PATH__BRANCH_BEHAVIOR, null, msgs);
			msgs = basicSetBranchBehavior(newBranchBehavior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.BRANCH_PATH__BRANCH_BEHAVIOR, newBranchBehavior, newBranchBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviorPackage.BRANCH_PATH__BRANCH_BEHAVIOR:
				return basicSetBranchBehavior(null, msgs);
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
			case BehaviorPackage.BRANCH_PATH__BRANCH_BEHAVIOR:
				return getBranchBehavior();
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
			case BehaviorPackage.BRANCH_PATH__BRANCH_BEHAVIOR:
				setBranchBehavior((BehaviorDescription)newValue);
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
			case BehaviorPackage.BRANCH_PATH__BRANCH_BEHAVIOR:
				setBranchBehavior((BehaviorDescription)null);
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
			case BehaviorPackage.BRANCH_PATH__BRANCH_BEHAVIOR:
				return branchBehavior != null;
		}
		return super.eIsSet(featureID);
	}

} //BranchPathImpl
