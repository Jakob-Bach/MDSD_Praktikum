/**
 */
package edu.kit.ipd.sdq.cbsm.architecture;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.cbsm.architecture.ArchitecturePackage
 * @generated
 */
public interface ArchitectureFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArchitectureFactory eINSTANCE = edu.kit.ipd.sdq.cbsm.architecture.impl.ArchitectureFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Complete Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complete Architecture</em>'.
	 * @generated
	 */
	CompleteArchitecture createCompleteArchitecture();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ArchitecturePackage getArchitecturePackage();

} //ArchitectureFactory
