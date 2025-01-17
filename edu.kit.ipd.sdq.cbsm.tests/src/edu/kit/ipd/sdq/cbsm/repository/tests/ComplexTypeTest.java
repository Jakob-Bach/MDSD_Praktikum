/**
 */
package edu.kit.ipd.sdq.cbsm.repository.tests;

import edu.kit.ipd.sdq.cbsm.core.tests.NamedElementTest;
import edu.kit.ipd.sdq.cbsm.repository.ComplexType;
import edu.kit.ipd.sdq.cbsm.repository.RepositoryFactory;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Complex Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComplexTypeTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ComplexTypeTest.class);
	}

	/**
	 * Constructs a new Complex Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Complex Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ComplexType getFixture() {
		return (ComplexType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RepositoryFactory.eINSTANCE.createComplexType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ComplexTypeTest
