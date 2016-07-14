/**
 */
package edu.kit.ipd.sdq.cbsm.repository.behavior.tests;

import edu.kit.ipd.sdq.cbsm.repository.behavior.BehaviorFactory;
import edu.kit.ipd.sdq.cbsm.repository.behavior.InternalAction;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Internal Action</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InternalActionTest extends ActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InternalActionTest.class);
	}

	/**
	 * Constructs a new Internal Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Internal Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InternalAction getFixture() {
		return (InternalAction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BehaviorFactory.eINSTANCE.createInternalAction());
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

} //InternalActionTest
