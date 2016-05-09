/**
 */
package edu.kit.ipd.sdq.cbsm.core.tests;

import edu.kit.ipd.sdq.cbsm.assembly.tests.AssemblyTests;
import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>ComponentBasedSystemModel</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentBasedSystemModelAllTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new ComponentBasedSystemModelAllTests("ComponentBasedSystemModel Tests");
		suite.addTest(AssemblyTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentBasedSystemModelAllTests(String name) {
		super(name);
	}

} //ComponentBasedSystemModelAllTests
