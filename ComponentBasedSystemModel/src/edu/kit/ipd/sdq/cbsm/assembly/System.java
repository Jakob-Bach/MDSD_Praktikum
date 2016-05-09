/**
 */
package edu.kit.ipd.sdq.cbsm.assembly;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.assembly.System#getSystemConnectors <em>System Connectors</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.cbsm.assembly.AssemblyPackage#getSystem()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ProvidesAtLeastOneInterface'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ProvidesAtLeastOneInterface='not self.providedRoles->isEmpty()'"
 * @generated
 */
public interface System extends CompositeProvidingAndRequiringElement {
	/**
	 * Returns the value of the '<em><b>System Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.cbsm.assembly.Connector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Connectors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Connectors</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.cbsm.assembly.AssemblyPackage#getSystem_SystemConnectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connector> getSystemConnectors();

} // System
