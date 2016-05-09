/**
 */
package edu.kit.ipd.sdq.cbsm.repository.behavior.util;

import edu.kit.ipd.sdq.cbsm.repository.behavior.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.cbsm.repository.behavior.BehaviorPackage
 * @generated
 */
public class BehaviorValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final BehaviorValidator INSTANCE = new BehaviorValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "edu.kit.ipd.sdq.cbsm.repository.behavior";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return BehaviorPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case BehaviorPackage.BEHAVIOR_DESCRIPTION:
				return validateBehaviorDescription((BehaviorDescription)value, diagnostics, context);
			case BehaviorPackage.ACTION:
				return validateAction((Action)value, diagnostics, context);
			case BehaviorPackage.INTERNAL_ACTION:
				return validateInternalAction((InternalAction)value, diagnostics, context);
			case BehaviorPackage.EXTERNAL_CALL:
				return validateExternalCall((ExternalCall)value, diagnostics, context);
			case BehaviorPackage.LOOP:
				return validateLoop((Loop)value, diagnostics, context);
			case BehaviorPackage.BRANCH:
				return validateBranch((Branch)value, diagnostics, context);
			case BehaviorPackage.BRANCH_PATH:
				return validateBranchPath((BranchPath)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBehaviorDescription(BehaviorDescription behaviorDescription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(behaviorDescription, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAction(Action action, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(action, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalAction(InternalAction internalAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(internalAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalCall(ExternalCall externalCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(externalCall, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(externalCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(externalCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(externalCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(externalCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(externalCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(externalCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(externalCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(externalCall, diagnostics, context);
		if (result || diagnostics != null) result &= validateExternalCall_RequiredRolesInterfaceContainsSignature(externalCall, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the RequiredRolesInterfaceContainsSignature constraint of '<em>External Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EXTERNAL_CALL__REQUIRED_ROLES_INTERFACE_CONTAINS_SIGNATURE__EEXPRESSION = "\n" +
		"\t\t\t\t\tself.requiredRoleOfService.requiredInterface.signatures->exists(signature|\n" +
		"\t\t\t\t\t\tsignature = self.requiredService\n" +
		"\t\t\t\t\t)";

	/**
	 * Validates the RequiredRolesInterfaceContainsSignature constraint of '<em>External Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalCall_RequiredRolesInterfaceContainsSignature(ExternalCall externalCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(BehaviorPackage.Literals.EXTERNAL_CALL,
				 externalCall,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "RequiredRolesInterfaceContainsSignature",
				 EXTERNAL_CALL__REQUIRED_ROLES_INTERFACE_CONTAINS_SIGNATURE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoop(Loop loop, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(loop, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBranch(Branch branch, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(branch, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBranchPath(BranchPath branchPath, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(branchPath, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //BehaviorValidator
