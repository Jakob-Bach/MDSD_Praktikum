/**
 */
package edu.kit.ipd.sdq.cbsm.assembly;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delegation Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.assembly.DelegationConnector#getInnerAssemblyContext <em>Inner Assembly Context</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.cbsm.assembly.DelegationConnector#getOuterAssemblyContext <em>Outer Assembly Context</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.cbsm.assembly.AssemblyPackage#getDelegationConnector()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ConnectsOuterAndInnerAssemblyContextOfSameCompositeElement'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ConnectsOuterAndInnerAssemblyContextOfSameCompositeElement='\n\t\t\t\tself.innerAssemblyContext.parentCompositeElement = self.outerAssemblyContext.instantiatedComponent'"
 * @generated
 */
public interface DelegationConnector extends Connector {

	/**
	 * Returns the value of the '<em><b>Inner Assembly Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inner Assembly Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Assembly Context</em>' reference.
	 * @see #setInnerAssemblyContext(AssemblyContext)
	 * @see edu.kit.ipd.sdq.cbsm.assembly.AssemblyPackage#getDelegationConnector_InnerAssemblyContext()
	 * @model required="true"
	 * @generated
	 */
	AssemblyContext getInnerAssemblyContext();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.cbsm.assembly.DelegationConnector#getInnerAssemblyContext <em>Inner Assembly Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Assembly Context</em>' reference.
	 * @see #getInnerAssemblyContext()
	 * @generated
	 */
	void setInnerAssemblyContext(AssemblyContext value);

	/**
	 * Returns the value of the '<em><b>Outer Assembly Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outer Assembly Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer Assembly Context</em>' reference.
	 * @see #setOuterAssemblyContext(AssemblyContext)
	 * @see edu.kit.ipd.sdq.cbsm.assembly.AssemblyPackage#getDelegationConnector_OuterAssemblyContext()
	 * @model required="true"
	 * @generated
	 */
	AssemblyContext getOuterAssemblyContext();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.cbsm.assembly.DelegationConnector#getOuterAssemblyContext <em>Outer Assembly Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer Assembly Context</em>' reference.
	 * @see #getOuterAssemblyContext()
	 * @generated
	 */
	void setOuterAssemblyContext(AssemblyContext value);

} // DelegationConnector
