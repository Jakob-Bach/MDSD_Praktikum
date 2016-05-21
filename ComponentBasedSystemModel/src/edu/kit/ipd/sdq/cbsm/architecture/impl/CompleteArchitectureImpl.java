/**
 */
package edu.kit.ipd.sdq.cbsm.architecture.impl;

import edu.kit.ipd.sdq.cbsm.allocation.Allocation;

import edu.kit.ipd.sdq.cbsm.architecture.ArchitecturePackage;
import edu.kit.ipd.sdq.cbsm.architecture.CompleteArchitecture;

import edu.kit.ipd.sdq.cbsm.environment.Environment;

import edu.kit.ipd.sdq.cbsm.repository.Repository;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complete Architecture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.architecture.impl.CompleteArchitectureImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.architecture.impl.CompleteArchitectureImpl#getSystem <em>System</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.architecture.impl.CompleteArchitectureImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.architecture.impl.CompleteArchitectureImpl#getAllocation <em>Allocation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompleteArchitectureImpl extends MinimalEObjectImpl.Container implements CompleteArchitecture {
	/**
	 * The cached value of the '{@link #getRepository() <em>Repository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepository()
	 * @generated
	 * @ordered
	 */
	protected Repository repository;

	/**
	 * The cached value of the '{@link #getSystem() <em>System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected edu.kit.ipd.sdq.cbsm.assembly.System system;

	/**
	 * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected Environment environment;

	/**
	 * The cached value of the '{@link #getAllocation() <em>Allocation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocation()
	 * @generated
	 * @ordered
	 */
	protected Allocation allocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompleteArchitectureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturePackage.Literals.COMPLETE_ARCHITECTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repository getRepository() {
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepository(Repository newRepository, NotificationChain msgs) {
		Repository oldRepository = repository;
		repository = newRepository;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArchitecturePackage.COMPLETE_ARCHITECTURE__REPOSITORY, oldRepository, newRepository);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepository(Repository newRepository) {
		if (newRepository != repository) {
			NotificationChain msgs = null;
			if (repository != null)
				msgs = ((InternalEObject)repository).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArchitecturePackage.COMPLETE_ARCHITECTURE__REPOSITORY, null, msgs);
			if (newRepository != null)
				msgs = ((InternalEObject)newRepository).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArchitecturePackage.COMPLETE_ARCHITECTURE__REPOSITORY, null, msgs);
			msgs = basicSetRepository(newRepository, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.COMPLETE_ARCHITECTURE__REPOSITORY, newRepository, newRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public edu.kit.ipd.sdq.cbsm.assembly.System getSystem() {
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystem(edu.kit.ipd.sdq.cbsm.assembly.System newSystem, NotificationChain msgs) {
		edu.kit.ipd.sdq.cbsm.assembly.System oldSystem = system;
		system = newSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArchitecturePackage.COMPLETE_ARCHITECTURE__SYSTEM, oldSystem, newSystem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(edu.kit.ipd.sdq.cbsm.assembly.System newSystem) {
		if (newSystem != system) {
			NotificationChain msgs = null;
			if (system != null)
				msgs = ((InternalEObject)system).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArchitecturePackage.COMPLETE_ARCHITECTURE__SYSTEM, null, msgs);
			if (newSystem != null)
				msgs = ((InternalEObject)newSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArchitecturePackage.COMPLETE_ARCHITECTURE__SYSTEM, null, msgs);
			msgs = basicSetSystem(newSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.COMPLETE_ARCHITECTURE__SYSTEM, newSystem, newSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Environment getEnvironment() {
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvironment(Environment newEnvironment, NotificationChain msgs) {
		Environment oldEnvironment = environment;
		environment = newEnvironment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArchitecturePackage.COMPLETE_ARCHITECTURE__ENVIRONMENT, oldEnvironment, newEnvironment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvironment(Environment newEnvironment) {
		if (newEnvironment != environment) {
			NotificationChain msgs = null;
			if (environment != null)
				msgs = ((InternalEObject)environment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArchitecturePackage.COMPLETE_ARCHITECTURE__ENVIRONMENT, null, msgs);
			if (newEnvironment != null)
				msgs = ((InternalEObject)newEnvironment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArchitecturePackage.COMPLETE_ARCHITECTURE__ENVIRONMENT, null, msgs);
			msgs = basicSetEnvironment(newEnvironment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.COMPLETE_ARCHITECTURE__ENVIRONMENT, newEnvironment, newEnvironment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Allocation getAllocation() {
		return allocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllocation(Allocation newAllocation, NotificationChain msgs) {
		Allocation oldAllocation = allocation;
		allocation = newAllocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArchitecturePackage.COMPLETE_ARCHITECTURE__ALLOCATION, oldAllocation, newAllocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllocation(Allocation newAllocation) {
		if (newAllocation != allocation) {
			NotificationChain msgs = null;
			if (allocation != null)
				msgs = ((InternalEObject)allocation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArchitecturePackage.COMPLETE_ARCHITECTURE__ALLOCATION, null, msgs);
			if (newAllocation != null)
				msgs = ((InternalEObject)newAllocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArchitecturePackage.COMPLETE_ARCHITECTURE__ALLOCATION, null, msgs);
			msgs = basicSetAllocation(newAllocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.COMPLETE_ARCHITECTURE__ALLOCATION, newAllocation, newAllocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArchitecturePackage.COMPLETE_ARCHITECTURE__REPOSITORY:
				return basicSetRepository(null, msgs);
			case ArchitecturePackage.COMPLETE_ARCHITECTURE__SYSTEM:
				return basicSetSystem(null, msgs);
			case ArchitecturePackage.COMPLETE_ARCHITECTURE__ENVIRONMENT:
				return basicSetEnvironment(null, msgs);
			case ArchitecturePackage.COMPLETE_ARCHITECTURE__ALLOCATION:
				return basicSetAllocation(null, msgs);
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
			case ArchitecturePackage.COMPLETE_ARCHITECTURE__REPOSITORY:
				return getRepository();
			case ArchitecturePackage.COMPLETE_ARCHITECTURE__SYSTEM:
				return getSystem();
			case ArchitecturePackage.COMPLETE_ARCHITECTURE__ENVIRONMENT:
				return getEnvironment();
			case ArchitecturePackage.COMPLETE_ARCHITECTURE__ALLOCATION:
				return getAllocation();
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
			case ArchitecturePackage.COMPLETE_ARCHITECTURE__REPOSITORY:
				setRepository((Repository)newValue);
				return;
			case ArchitecturePackage.COMPLETE_ARCHITECTURE__SYSTEM:
				setSystem((edu.kit.ipd.sdq.cbsm.assembly.System)newValue);
				return;
			case ArchitecturePackage.COMPLETE_ARCHITECTURE__ENVIRONMENT:
				setEnvironment((Environment)newValue);
				return;
			case ArchitecturePackage.COMPLETE_ARCHITECTURE__ALLOCATION:
				setAllocation((Allocation)newValue);
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
			case ArchitecturePackage.COMPLETE_ARCHITECTURE__REPOSITORY:
				setRepository((Repository)null);
				return;
			case ArchitecturePackage.COMPLETE_ARCHITECTURE__SYSTEM:
				setSystem((edu.kit.ipd.sdq.cbsm.assembly.System)null);
				return;
			case ArchitecturePackage.COMPLETE_ARCHITECTURE__ENVIRONMENT:
				setEnvironment((Environment)null);
				return;
			case ArchitecturePackage.COMPLETE_ARCHITECTURE__ALLOCATION:
				setAllocation((Allocation)null);
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
			case ArchitecturePackage.COMPLETE_ARCHITECTURE__REPOSITORY:
				return repository != null;
			case ArchitecturePackage.COMPLETE_ARCHITECTURE__SYSTEM:
				return system != null;
			case ArchitecturePackage.COMPLETE_ARCHITECTURE__ENVIRONMENT:
				return environment != null;
			case ArchitecturePackage.COMPLETE_ARCHITECTURE__ALLOCATION:
				return allocation != null;
		}
		return super.eIsSet(featureID);
	}

} //CompleteArchitectureImpl
