/**
 */
package edu.kit.ipd.sdq.cbsm.assembly.util;

import edu.kit.ipd.sdq.cbsm.assembly.AssemblyConnector;
import edu.kit.ipd.sdq.cbsm.assembly.AssemblyContext;
import edu.kit.ipd.sdq.cbsm.assembly.AssemblyPackage;
import edu.kit.ipd.sdq.cbsm.assembly.CompositeComponent;
import edu.kit.ipd.sdq.cbsm.assembly.CompositeProvidingAndRequiringElement;
import edu.kit.ipd.sdq.cbsm.assembly.Connector;
import edu.kit.ipd.sdq.cbsm.assembly.DelegationConnector;
import edu.kit.ipd.sdq.cbsm.assembly.ProvidedDelegationConnector;
import edu.kit.ipd.sdq.cbsm.assembly.RequiredDelegationConnector;

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
 * @see edu.kit.ipd.sdq.cbsm.assembly.AssemblyPackage
 * @generated
 */
public class AssemblyValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AssemblyValidator INSTANCE = new AssemblyValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "edu.kit.ipd.sdq.cbsm.assembly";

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
	public AssemblyValidator() {
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
	  return AssemblyPackage.eINSTANCE;
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
			case AssemblyPackage.ASSEMBLY_CONTEXT:
				return validateAssemblyContext((AssemblyContext)value, diagnostics, context);
			case AssemblyPackage.COMPOSITE_PROVIDING_AND_REQUIRING_ELEMENT:
				return validateCompositeProvidingAndRequiringElement((CompositeProvidingAndRequiringElement)value, diagnostics, context);
			case AssemblyPackage.COMPOSITE_COMPONENT:
				return validateCompositeComponent((CompositeComponent)value, diagnostics, context);
			case AssemblyPackage.SYSTEM:
				return validateSystem((edu.kit.ipd.sdq.cbsm.assembly.System)value, diagnostics, context);
			case AssemblyPackage.CONNECTOR:
				return validateConnector((Connector)value, diagnostics, context);
			case AssemblyPackage.DELEGATION_CONNECTOR:
				return validateDelegationConnector((DelegationConnector)value, diagnostics, context);
			case AssemblyPackage.PROVIDED_DELEGATION_CONNECTOR:
				return validateProvidedDelegationConnector((ProvidedDelegationConnector)value, diagnostics, context);
			case AssemblyPackage.REQUIRED_DELEGATION_CONNECTOR:
				return validateRequiredDelegationConnector((RequiredDelegationConnector)value, diagnostics, context);
			case AssemblyPackage.ASSEMBLY_CONNECTOR:
				return validateAssemblyConnector((AssemblyConnector)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyContext(AssemblyContext assemblyContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assemblyContext, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeProvidingAndRequiringElement(CompositeProvidingAndRequiringElement compositeProvidingAndRequiringElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(compositeProvidingAndRequiringElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(compositeProvidingAndRequiringElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(compositeProvidingAndRequiringElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(compositeProvidingAndRequiringElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(compositeProvidingAndRequiringElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(compositeProvidingAndRequiringElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(compositeProvidingAndRequiringElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(compositeProvidingAndRequiringElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(compositeProvidingAndRequiringElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateCompositeProvidingAndRequiringElement_CompositeElementDoesNotContainItself(compositeProvidingAndRequiringElement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the CompositeElementDoesNotContainItself constraint of '<em>Composite Providing And Requiring Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPOSITE_PROVIDING_AND_REQUIRING_ELEMENT__COMPOSITE_ELEMENT_DOES_NOT_CONTAIN_ITSELF__EEXPRESSION = "self.containedAssemblyContexts->forAll(assemblyContext|\n" +
		"\t\t\t\tassemblyContext.instantiatedComponent <> self\n" +
		"\t\t\t)";

	/**
	 * Validates the CompositeElementDoesNotContainItself constraint of '<em>Composite Providing And Requiring Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeProvidingAndRequiringElement_CompositeElementDoesNotContainItself(CompositeProvidingAndRequiringElement compositeProvidingAndRequiringElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AssemblyPackage.Literals.COMPOSITE_PROVIDING_AND_REQUIRING_ELEMENT,
				 compositeProvidingAndRequiringElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "CompositeElementDoesNotContainItself",
				 COMPOSITE_PROVIDING_AND_REQUIRING_ELEMENT__COMPOSITE_ELEMENT_DOES_NOT_CONTAIN_ITSELF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeComponent(CompositeComponent compositeComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(compositeComponent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(compositeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(compositeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(compositeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(compositeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(compositeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(compositeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(compositeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(compositeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateCompositeProvidingAndRequiringElement_CompositeElementDoesNotContainItself(compositeComponent, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystem(edu.kit.ipd.sdq.cbsm.assembly.System system, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(system, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(system, diagnostics, context);
		if (result || diagnostics != null) result &= validateCompositeProvidingAndRequiringElement_CompositeElementDoesNotContainItself(system, diagnostics, context);
		if (result || diagnostics != null) result &= validateSystem_ProvidesAtLeastOneInterface(system, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ProvidesAtLeastOneInterface constraint of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SYSTEM__PROVIDES_AT_LEAST_ONE_INTERFACE__EEXPRESSION = "not self.providedRoles->isEmpty()";

	/**
	 * Validates the ProvidesAtLeastOneInterface constraint of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystem_ProvidesAtLeastOneInterface(edu.kit.ipd.sdq.cbsm.assembly.System system, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AssemblyPackage.Literals.SYSTEM,
				 system,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ProvidesAtLeastOneInterface",
				 SYSTEM__PROVIDES_AT_LEAST_ONE_INTERFACE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnector(Connector connector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connector, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelegationConnector(DelegationConnector delegationConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(delegationConnector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(delegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(delegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(delegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(delegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(delegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(delegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(delegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(delegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateDelegationConnector_ConnectsOuterAndInnerAssemblyContextOfSameCompositeElement(delegationConnector, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ConnectsOuterAndInnerAssemblyContextOfSameCompositeElement constraint of '<em>Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DELEGATION_CONNECTOR__CONNECTS_OUTER_AND_INNER_ASSEMBLY_CONTEXT_OF_SAME_COMPOSITE_ELEMENT__EEXPRESSION = "\n" +
		"\t\t\t\tself.innerAssemblyContext.parentCompositeElement = self.outerAssemblyContext.instantiatedComponent";

	/**
	 * Validates the ConnectsOuterAndInnerAssemblyContextOfSameCompositeElement constraint of '<em>Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelegationConnector_ConnectsOuterAndInnerAssemblyContextOfSameCompositeElement(DelegationConnector delegationConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AssemblyPackage.Literals.DELEGATION_CONNECTOR,
				 delegationConnector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ConnectsOuterAndInnerAssemblyContextOfSameCompositeElement",
				 DELEGATION_CONNECTOR__CONNECTS_OUTER_AND_INNER_ASSEMBLY_CONTEXT_OF_SAME_COMPOSITE_ELEMENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvidedDelegationConnector(ProvidedDelegationConnector providedDelegationConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(providedDelegationConnector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(providedDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(providedDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(providedDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(providedDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(providedDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(providedDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(providedDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(providedDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateDelegationConnector_ConnectsOuterAndInnerAssemblyContextOfSameCompositeElement(providedDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateProvidedDelegationConnector_InnerRoleBelongsToInnerAssemblyContext(providedDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateProvidedDelegationConnector_OuterRoleBelongsToOuterAssemblyContext(providedDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateProvidedDelegationConnector_SameInterfaceIsDelegatedAsProvided(providedDelegationConnector, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the InnerRoleBelongsToInnerAssemblyContext constraint of '<em>Provided Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROVIDED_DELEGATION_CONNECTOR__INNER_ROLE_BELONGS_TO_INNER_ASSEMBLY_CONTEXT__EEXPRESSION = "self.innerAssemblyContext.assemblyContextProvidedRoles->exists(role| \n" +
		"\t\t\t\trole = self.innerProvidedRole\n" +
		"\t\t\t)";

	/**
	 * Validates the InnerRoleBelongsToInnerAssemblyContext constraint of '<em>Provided Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvidedDelegationConnector_InnerRoleBelongsToInnerAssemblyContext(ProvidedDelegationConnector providedDelegationConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AssemblyPackage.Literals.PROVIDED_DELEGATION_CONNECTOR,
				 providedDelegationConnector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InnerRoleBelongsToInnerAssemblyContext",
				 PROVIDED_DELEGATION_CONNECTOR__INNER_ROLE_BELONGS_TO_INNER_ASSEMBLY_CONTEXT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the OuterRoleBelongsToOuterAssemblyContext constraint of '<em>Provided Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROVIDED_DELEGATION_CONNECTOR__OUTER_ROLE_BELONGS_TO_OUTER_ASSEMBLY_CONTEXT__EEXPRESSION = "self.outerAssemblyContext.assemblyContextProvidedRoles->exists(role| \n" +
		"\t\t\t\trole = self.outerProvidedRole\n" +
		"\t\t\t)";

	/**
	 * Validates the OuterRoleBelongsToOuterAssemblyContext constraint of '<em>Provided Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvidedDelegationConnector_OuterRoleBelongsToOuterAssemblyContext(ProvidedDelegationConnector providedDelegationConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AssemblyPackage.Literals.PROVIDED_DELEGATION_CONNECTOR,
				 providedDelegationConnector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "OuterRoleBelongsToOuterAssemblyContext",
				 PROVIDED_DELEGATION_CONNECTOR__OUTER_ROLE_BELONGS_TO_OUTER_ASSEMBLY_CONTEXT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the SameInterfaceIsDelegatedAsProvided constraint of '<em>Provided Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROVIDED_DELEGATION_CONNECTOR__SAME_INTERFACE_IS_DELEGATED_AS_PROVIDED__EEXPRESSION = "self.outerProvidedRole.providedInterface = \n" +
		"\t\t\t\tself.innerProvidedRole.providedInterface";

	/**
	 * Validates the SameInterfaceIsDelegatedAsProvided constraint of '<em>Provided Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvidedDelegationConnector_SameInterfaceIsDelegatedAsProvided(ProvidedDelegationConnector providedDelegationConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AssemblyPackage.Literals.PROVIDED_DELEGATION_CONNECTOR,
				 providedDelegationConnector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SameInterfaceIsDelegatedAsProvided",
				 PROVIDED_DELEGATION_CONNECTOR__SAME_INTERFACE_IS_DELEGATED_AS_PROVIDED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequiredDelegationConnector(RequiredDelegationConnector requiredDelegationConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(requiredDelegationConnector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(requiredDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(requiredDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(requiredDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(requiredDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(requiredDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(requiredDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(requiredDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(requiredDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateDelegationConnector_ConnectsOuterAndInnerAssemblyContextOfSameCompositeElement(requiredDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequiredDelegationConnector_InnerRoleBelongsToInnerAssemblyContext(requiredDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequiredDelegationConnector_OuterRoleBelongsToOuterAssemblyContext(requiredDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequiredDelegationConnector_SameInterfaceIsDelegatedAsRequired(requiredDelegationConnector, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the InnerRoleBelongsToInnerAssemblyContext constraint of '<em>Required Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REQUIRED_DELEGATION_CONNECTOR__INNER_ROLE_BELONGS_TO_INNER_ASSEMBLY_CONTEXT__EEXPRESSION = "self.innerAssemblyContext.assemblyContextRequiredRoles->exists(role| \n" +
		"\t\t\t\trole = self.innerRequiredRole\n" +
		"\t\t\t)";

	/**
	 * Validates the InnerRoleBelongsToInnerAssemblyContext constraint of '<em>Required Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequiredDelegationConnector_InnerRoleBelongsToInnerAssemblyContext(RequiredDelegationConnector requiredDelegationConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AssemblyPackage.Literals.REQUIRED_DELEGATION_CONNECTOR,
				 requiredDelegationConnector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InnerRoleBelongsToInnerAssemblyContext",
				 REQUIRED_DELEGATION_CONNECTOR__INNER_ROLE_BELONGS_TO_INNER_ASSEMBLY_CONTEXT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the OuterRoleBelongsToOuterAssemblyContext constraint of '<em>Required Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REQUIRED_DELEGATION_CONNECTOR__OUTER_ROLE_BELONGS_TO_OUTER_ASSEMBLY_CONTEXT__EEXPRESSION = "self.outerAssemblyContext.assemblyContextRequiredRoles->exists(role| \n" +
		"\t\t\t\trole = self.outerRequiredRole\n" +
		"\t\t\t)";

	/**
	 * Validates the OuterRoleBelongsToOuterAssemblyContext constraint of '<em>Required Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequiredDelegationConnector_OuterRoleBelongsToOuterAssemblyContext(RequiredDelegationConnector requiredDelegationConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AssemblyPackage.Literals.REQUIRED_DELEGATION_CONNECTOR,
				 requiredDelegationConnector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "OuterRoleBelongsToOuterAssemblyContext",
				 REQUIRED_DELEGATION_CONNECTOR__OUTER_ROLE_BELONGS_TO_OUTER_ASSEMBLY_CONTEXT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the SameInterfaceIsDelegatedAsRequired constraint of '<em>Required Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REQUIRED_DELEGATION_CONNECTOR__SAME_INTERFACE_IS_DELEGATED_AS_REQUIRED__EEXPRESSION = "self.outerRequiredRole.requiredInterface = \n" +
		"\t\t\t\tself.innerRequiredRole.requiredInterface";

	/**
	 * Validates the SameInterfaceIsDelegatedAsRequired constraint of '<em>Required Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequiredDelegationConnector_SameInterfaceIsDelegatedAsRequired(RequiredDelegationConnector requiredDelegationConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AssemblyPackage.Literals.REQUIRED_DELEGATION_CONNECTOR,
				 requiredDelegationConnector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SameInterfaceIsDelegatedAsRequired",
				 REQUIRED_DELEGATION_CONNECTOR__SAME_INTERFACE_IS_DELEGATED_AS_REQUIRED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyConnector(AssemblyConnector assemblyConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(assemblyConnector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssemblyConnector_ProvidedRoleBelongsToProvidedAssemblyContext(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssemblyConnector_RequiredRoleBelongsToRequiredAssemblyContext(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssemblyConnector_SameInterfaceInConnectedRoles(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssemblyConnector_DifferentContextsOfConnectedRoles(assemblyConnector, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ProvidedRoleBelongsToProvidedAssemblyContext constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSEMBLY_CONNECTOR__PROVIDED_ROLE_BELONGS_TO_PROVIDED_ASSEMBLY_CONTEXT__EEXPRESSION = "self.connectedProvidedAssemblyContext.assemblyContextProvidedRoles\n" +
		"\t\t\t\t->includes(self.connectedProvidedRole\n" +
		"\t\t\t)";

	/**
	 * Validates the ProvidedRoleBelongsToProvidedAssemblyContext constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyConnector_ProvidedRoleBelongsToProvidedAssemblyContext(AssemblyConnector assemblyConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AssemblyPackage.Literals.ASSEMBLY_CONNECTOR,
				 assemblyConnector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ProvidedRoleBelongsToProvidedAssemblyContext",
				 ASSEMBLY_CONNECTOR__PROVIDED_ROLE_BELONGS_TO_PROVIDED_ASSEMBLY_CONTEXT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the RequiredRoleBelongsToRequiredAssemblyContext constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSEMBLY_CONNECTOR__REQUIRED_ROLE_BELONGS_TO_REQUIRED_ASSEMBLY_CONTEXT__EEXPRESSION = "self.connectedRequiredAssemblyContext.assemblyContextRequiredRoles\n" +
		"\t\t\t\t->includes(self.connectedRequiredRole\n" +
		"\t\t\t)";

	/**
	 * Validates the RequiredRoleBelongsToRequiredAssemblyContext constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyConnector_RequiredRoleBelongsToRequiredAssemblyContext(AssemblyConnector assemblyConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AssemblyPackage.Literals.ASSEMBLY_CONNECTOR,
				 assemblyConnector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "RequiredRoleBelongsToRequiredAssemblyContext",
				 ASSEMBLY_CONNECTOR__REQUIRED_ROLE_BELONGS_TO_REQUIRED_ASSEMBLY_CONTEXT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the SameInterfaceInConnectedRoles constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSEMBLY_CONNECTOR__SAME_INTERFACE_IN_CONNECTED_ROLES__EEXPRESSION = "self.connectedProvidedRole.providedInterface =\n" +
		"\t\t\t\tself.connectedRequiredRole.requiredInterface";

	/**
	 * Validates the SameInterfaceInConnectedRoles constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyConnector_SameInterfaceInConnectedRoles(AssemblyConnector assemblyConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AssemblyPackage.Literals.ASSEMBLY_CONNECTOR,
				 assemblyConnector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SameInterfaceInConnectedRoles",
				 ASSEMBLY_CONNECTOR__SAME_INTERFACE_IN_CONNECTED_ROLES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the DifferentContextsOfConnectedRoles constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSEMBLY_CONNECTOR__DIFFERENT_CONTEXTS_OF_CONNECTED_ROLES__EEXPRESSION = "self.connectedProvidedAssemblyContext <> \n" +
		"\t\t\t\tself.connectedRequiredAssemblyContext";

	/**
	 * Validates the DifferentContextsOfConnectedRoles constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyConnector_DifferentContextsOfConnectedRoles(AssemblyConnector assemblyConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AssemblyPackage.Literals.ASSEMBLY_CONNECTOR,
				 assemblyConnector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "DifferentContextsOfConnectedRoles",
				 ASSEMBLY_CONNECTOR__DIFFERENT_CONTEXTS_OF_CONNECTED_ROLES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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

} //AssemblyValidator
