/**
 */
package edu.kit.ipd.sdq.cbsm.repository.tests;

import edu.kit.ipd.sdq.cbsm.core.tests.NamedElementTest;

import edu.kit.ipd.sdq.cbsm.repository.ProvidedRole;
import edu.kit.ipd.sdq.cbsm.repository.RepositoryFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Provided Role</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProvidedRoleTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProvidedRoleTest.class);
	}

	/**
	 * Constructs a new Provided Role test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedRoleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Provided Role test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ProvidedRole getFixture() {
		return (ProvidedRole)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RepositoryFactory.eINSTANCE.createProvidedRole());
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

} //ProvidedRoleTest
