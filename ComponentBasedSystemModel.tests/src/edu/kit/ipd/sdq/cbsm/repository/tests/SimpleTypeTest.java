/**
 */
package edu.kit.ipd.sdq.cbsm.repository.tests;

import edu.kit.ipd.sdq.cbsm.repository.RepositoryFactory;
import edu.kit.ipd.sdq.cbsm.repository.SimpleType;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Simple Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleTypeTest extends TestCase {

	/**
	 * The fixture for this Simple Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SimpleTypeTest.class);
	}

	/**
	 * Constructs a new Simple Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Simple Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SimpleType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Simple Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleType getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RepositoryFactory.eINSTANCE.createSimpleType());
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

} //SimpleTypeTest
