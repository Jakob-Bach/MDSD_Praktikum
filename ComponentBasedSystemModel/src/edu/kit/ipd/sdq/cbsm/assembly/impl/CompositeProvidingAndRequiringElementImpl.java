/**
 */
package edu.kit.ipd.sdq.cbsm.assembly.impl;

import edu.kit.ipd.sdq.cbsm.assembly.AssemblyContext;
import edu.kit.ipd.sdq.cbsm.assembly.AssemblyPackage;
import edu.kit.ipd.sdq.cbsm.assembly.CompositeProvidingAndRequiringElement;

import edu.kit.ipd.sdq.cbsm.assembly.Connector;
import edu.kit.ipd.sdq.cbsm.repository.impl.ProvidingAndRequiringElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Providing And Requiring Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.assembly.impl.CompositeProvidingAndRequiringElementImpl#getContainedAssemblyContexts <em>Contained Assembly Contexts</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.assembly.impl.CompositeProvidingAndRequiringElementImpl#getConnectors <em>Connectors</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CompositeProvidingAndRequiringElementImpl extends ProvidingAndRequiringElementImpl implements CompositeProvidingAndRequiringElement {
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
	protected CompositeProvidingAndRequiringElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyPackage.Literals.COMPOSITE_PROVIDING_AND_REQUIRING_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssemblyContext> getContainedAssemblyContexts() {
		if (containedAssemblyContexts == null) {
			containedAssemblyContexts = new EObjectContainmentWithInverseEList<AssemblyContext>(AssemblyContext.class, this, AssemblyPackage.COMPOSITE_PROVIDING_AND_REQUIRING_ELEMENT__CONTAINED_ASSEMBLY_CONTEXTS, AssemblyPackage.ASSEMBLY_CONTEXT__PARENT_COMPOSITE_ELEMENT);
		}
		return containedAssemblyContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getConnectors() {
		if (connectors == null) {
			connectors = new EObjectContainmentEList<Connector>(Connector.class, this, AssemblyPackage.COMPOSITE_PROVIDING_AND_REQUIRING_ELEMENT__CONNECTORS);
		}
		return connectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssemblyPackage.COMPOSITE_PROVIDING_AND_REQUIRING_ELEMENT__CONTAINED_ASSEMBLY_CONTEXTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContainedAssemblyContexts()).basicAdd(otherEnd, msgs);
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
			case AssemblyPackage.COMPOSITE_PROVIDING_AND_REQUIRING_ELEMENT__CONTAINED_ASSEMBLY_CONTEXTS:
				return ((InternalEList<?>)getContainedAssemblyContexts()).basicRemove(otherEnd, msgs);
			case AssemblyPackage.COMPOSITE_PROVIDING_AND_REQUIRING_ELEMENT__CONNECTORS:
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
			case AssemblyPackage.COMPOSITE_PROVIDING_AND_REQUIRING_ELEMENT__CONTAINED_ASSEMBLY_CONTEXTS:
				return getContainedAssemblyContexts();
			case AssemblyPackage.COMPOSITE_PROVIDING_AND_REQUIRING_ELEMENT__CONNECTORS:
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
			case AssemblyPackage.COMPOSITE_PROVIDING_AND_REQUIRING_ELEMENT__CONTAINED_ASSEMBLY_CONTEXTS:
				getContainedAssemblyContexts().clear();
				getContainedAssemblyContexts().addAll((Collection<? extends AssemblyContext>)newValue);
				return;
			case AssemblyPackage.COMPOSITE_PROVIDING_AND_REQUIRING_ELEMENT__CONNECTORS:
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
			case AssemblyPackage.COMPOSITE_PROVIDING_AND_REQUIRING_ELEMENT__CONTAINED_ASSEMBLY_CONTEXTS:
				getContainedAssemblyContexts().clear();
				return;
			case AssemblyPackage.COMPOSITE_PROVIDING_AND_REQUIRING_ELEMENT__CONNECTORS:
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
			case AssemblyPackage.COMPOSITE_PROVIDING_AND_REQUIRING_ELEMENT__CONTAINED_ASSEMBLY_CONTEXTS:
				return containedAssemblyContexts != null && !containedAssemblyContexts.isEmpty();
			case AssemblyPackage.COMPOSITE_PROVIDING_AND_REQUIRING_ELEMENT__CONNECTORS:
				return connectors != null && !connectors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompositeProvidingAndRequiringElementImpl
