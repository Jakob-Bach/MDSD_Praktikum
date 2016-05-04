/**
 */
package edu.kit.ipd.sdq.cbsm.allocation.tests;

import edu.kit.ipd.sdq.cbsm.allocation.AllocationContext;
import edu.kit.ipd.sdq.cbsm.allocation.AllocationFactory;

import edu.kit.ipd.sdq.cbsm.core.tests.NamedElementTest;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AllocationContextTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AllocationContextTest.class);
	}

	/**
	 * Constructs a new Context test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationContextTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Context test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AllocationContext getFixture() {
		return (AllocationContext)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AllocationFactory.eINSTANCE.createAllocationContext());
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

} //AllocationContextTest
