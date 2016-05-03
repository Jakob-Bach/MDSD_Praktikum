/**
 */
package edu.kit.ipd.sdq.cbsm.repository.tests;

import edu.kit.ipd.sdq.cbsm.repository.BehaviorDescription;
import edu.kit.ipd.sdq.cbsm.repository.RepositoryFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Behavior Description</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviorDescriptionTest extends TestCase {

	/**
	 * The fixture for this Behavior Description test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorDescription fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BehaviorDescriptionTest.class);
	}

	/**
	 * Constructs a new Behavior Description test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorDescriptionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Behavior Description test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(BehaviorDescription fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Behavior Description test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorDescription getFixture() {
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
		setFixture(RepositoryFactory.eINSTANCE.createBehaviorDescription());
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

} //BehaviorDescriptionTest
