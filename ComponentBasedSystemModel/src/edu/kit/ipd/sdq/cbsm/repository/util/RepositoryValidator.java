/**
 */
package edu.kit.ipd.sdq.cbsm.repository.util;

import edu.kit.ipd.sdq.cbsm.repository.*;

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
 * @see edu.kit.ipd.sdq.cbsm.repository.RepositoryPackage
 * @generated
 */
public class RepositoryValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RepositoryValidator INSTANCE = new RepositoryValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "edu.kit.ipd.sdq.cbsm.repository";

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
	public RepositoryValidator() {
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
	  return RepositoryPackage.eINSTANCE;
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
			case RepositoryPackage.REPOSITORY:
				return validateRepository((Repository)value, diagnostics, context);
			case RepositoryPackage.INTERFACE:
				return validateInterface((Interface)value, diagnostics, context);
			case RepositoryPackage.ROLE:
				return validateRole((Role)value, diagnostics, context);
			case RepositoryPackage.PROVIDED_ROLE:
				return validateProvidedRole((ProvidedRole)value, diagnostics, context);
			case RepositoryPackage.REQUIRED_ROLE:
				return validateRequiredRole((RequiredRole)value, diagnostics, context);
			case RepositoryPackage.PROVIDING_AND_REQUIRING_ELEMENT:
				return validateProvidingAndRequiringElement((ProvidingAndRequiringElement)value, diagnostics, context);
			case RepositoryPackage.COMPONENT:
				return validateComponent((Component)value, diagnostics, context);
			case RepositoryPackage.SIGNATURE:
				return validateSignature((Signature)value, diagnostics, context);
			case RepositoryPackage.DATA_TYPE:
				return validateDataType((DataType)value, diagnostics, context);
			case RepositoryPackage.PARAMETER:
				return validateParameter((Parameter)value, diagnostics, context);
			case RepositoryPackage.COMPLEX_TYPE:
				return validateComplexType((ComplexType)value, diagnostics, context);
			case RepositoryPackage.SIMPLE_TYPE:
				return validateSimpleType((SimpleType)value, diagnostics, context);
			case RepositoryPackage.SIMPLE_TYPE_INSTANCE:
				return validateSimpleTypeInstance((SimpleTypeInstance)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepository(Repository repository, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(repository, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterface(Interface interface_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interface_, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validateInterface_NoSignaturesEquivalent(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validateInterface_InterfacesDoesNotInheritItself(interface_, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NoSignaturesEquivalent constraint of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INTERFACE__NO_SIGNATURES_EQUIVALENT__EEXPRESSION = "self.signatures->forAll(signature1|\n" +
		"\t\t\t\tnot(self.signatures->exists(signature2|\n" +
		"\t\t\t\t\tsignature1 <> signature2 and \n" +
		"\t\t\t\t\tsignature1.name = signature2.name and\n" +
		"\t\t\t\t\tsignature1.parameters->size() = signature2.parameters->size() and\n" +
		"\t\t\t\t\tsignature1.parameters->forAll(parameter1|\n" +
		"\t\t\t\t\t\tsignature2.parameters->at(signature1.parameters->indexOf(parameter1)).type = parameter1.type)\n" +
		"\t\t\t\t))\n" +
		"\t\t\t)";

	/**
	 * Validates the NoSignaturesEquivalent constraint of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterface_NoSignaturesEquivalent(Interface interface_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RepositoryPackage.Literals.INTERFACE,
				 interface_,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NoSignaturesEquivalent",
				 INTERFACE__NO_SIGNATURES_EQUIVALENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the InterfacesDoesNotInheritItself constraint of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INTERFACE__INTERFACES_DOES_NOT_INHERIT_ITSELF__EEXPRESSION = "not (self.superInterfaces->includes(self))";

	/**
	 * Validates the InterfacesDoesNotInheritItself constraint of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterface_InterfacesDoesNotInheritItself(Interface interface_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RepositoryPackage.Literals.INTERFACE,
				 interface_,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InterfacesDoesNotInheritItself",
				 INTERFACE__INTERFACES_DOES_NOT_INHERIT_ITSELF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRole(Role role, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(role, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvidedRole(ProvidedRole providedRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(providedRole, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequiredRole(RequiredRole requiredRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requiredRole, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvidingAndRequiringElement(ProvidingAndRequiringElement providingAndRequiringElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(providingAndRequiringElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent(Component component, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(component, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignature(Signature signature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(signature, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(signature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(signature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(signature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(signature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(signature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(signature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(signature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(signature, diagnostics, context);
		if (result || diagnostics != null) result &= validateSignature_NoParameterWithSameName(signature, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NoParameterWithSameName constraint of '<em>Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SIGNATURE__NO_PARAMETER_WITH_SAME_NAME__EEXPRESSION = "self.parameters->forAll(parameter1|\n" +
		"\t\t\t\tnot(self.parameters->exists(parameter2|\n" +
		"\t\t\t\t\tparameter1 <> parameter2 and \n" +
		"\t\t\t\t\tparameter1.name = parameter2.name\n" +
		"\t\t\t\t))\n" +
		"\t\t\t)";

	/**
	 * Validates the NoParameterWithSameName constraint of '<em>Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignature_NoParameterWithSameName(Signature signature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RepositoryPackage.Literals.SIGNATURE,
				 signature,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NoParameterWithSameName",
				 SIGNATURE__NO_PARAMETER_WITH_SAME_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType(DataType dataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexType(ComplexType complexType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(complexType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleType(SimpleType simpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(simpleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleTypeInstance(SimpleTypeInstance simpleTypeInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
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

} //RepositoryValidator
