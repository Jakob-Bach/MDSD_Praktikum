/**
 */
package edu.kit.ipd.sdq.cbsm.repository.behavior.tests;

import edu.kit.ipd.sdq.cbsm.repository.behavior.BehaviorFactory;
import edu.kit.ipd.sdq.cbsm.repository.behavior.ComponentBehaviorDescription;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Component Behavior Description</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentBehaviorDescriptionTest extends BehaviorDescriptionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ComponentBehaviorDescriptionTest.class);
	}

	/**
	 * Constructs a new Component Behavior Description test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentBehaviorDescriptionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Component Behavior Description test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ComponentBehaviorDescription getFixture() {
		return (ComponentBehaviorDescription)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BehaviorFactory.eINSTANCE.createComponentBehaviorDescription());
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

} //ComponentBehaviorDescriptionTest
