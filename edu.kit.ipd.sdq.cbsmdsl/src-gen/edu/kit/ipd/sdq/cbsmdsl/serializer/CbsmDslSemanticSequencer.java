/*
 * generated by Xtext 2.9.2
 */
package edu.kit.ipd.sdq.cbsmdsl.serializer;

import com.google.inject.Inject;
import edu.kit.ipd.sdq.cbsm.allocation.Allocation;
import edu.kit.ipd.sdq.cbsm.allocation.AllocationContext;
import edu.kit.ipd.sdq.cbsm.allocation.AllocationPackage;
import edu.kit.ipd.sdq.cbsm.assembly.AssemblyConnector;
import edu.kit.ipd.sdq.cbsm.assembly.AssemblyContext;
import edu.kit.ipd.sdq.cbsm.assembly.AssemblyPackage;
import edu.kit.ipd.sdq.cbsm.assembly.ProvidedDelegationConnector;
import edu.kit.ipd.sdq.cbsm.assembly.RequiredDelegationConnector;
import edu.kit.ipd.sdq.cbsm.core.CorePackage;
import edu.kit.ipd.sdq.cbsm.environment.Container;
import edu.kit.ipd.sdq.cbsm.environment.Environment;
import edu.kit.ipd.sdq.cbsm.environment.EnvironmentPackage;
import edu.kit.ipd.sdq.cbsm.environment.Link;
import edu.kit.ipd.sdq.cbsm.repository.ComplexType;
import edu.kit.ipd.sdq.cbsm.repository.Component;
import edu.kit.ipd.sdq.cbsm.repository.Interface;
import edu.kit.ipd.sdq.cbsm.repository.ProvidedRole;
import edu.kit.ipd.sdq.cbsm.repository.Repository;
import edu.kit.ipd.sdq.cbsm.repository.RepositoryPackage;
import edu.kit.ipd.sdq.cbsm.repository.RequiredRole;
import edu.kit.ipd.sdq.cbsm.repository.Signature;
import edu.kit.ipd.sdq.cbsm.repository.SimpleType;
import edu.kit.ipd.sdq.cbsm.repository.behavior.BehaviorDescription;
import edu.kit.ipd.sdq.cbsm.repository.behavior.BehaviorPackage;
import edu.kit.ipd.sdq.cbsm.repository.behavior.Branch;
import edu.kit.ipd.sdq.cbsm.repository.behavior.BranchPath;
import edu.kit.ipd.sdq.cbsm.repository.behavior.ExternalCall;
import edu.kit.ipd.sdq.cbsm.repository.behavior.InternalAction;
import edu.kit.ipd.sdq.cbsm.repository.behavior.Loop;
import edu.kit.ipd.sdq.cbsmdsl.services.CbsmDslGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class CbsmDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CbsmDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == AllocationPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case AllocationPackage.ALLOCATION:
				sequence_Allocation(context, (Allocation) semanticObject); 
				return; 
			case AllocationPackage.ALLOCATION_CONTEXT:
				sequence_AllocationContext(context, (AllocationContext) semanticObject); 
				return; 
			}
		else if (epackage == AssemblyPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case AssemblyPackage.ASSEMBLY_CONNECTOR:
				sequence_AssemblyConnector(context, (AssemblyConnector) semanticObject); 
				return; 
			case AssemblyPackage.ASSEMBLY_CONTEXT:
				sequence_AssemblyContext(context, (AssemblyContext) semanticObject); 
				return; 
			case AssemblyPackage.PROVIDED_DELEGATION_CONNECTOR:
				sequence_ProvidedDelegationConnector(context, (ProvidedDelegationConnector) semanticObject); 
				return; 
			case AssemblyPackage.REQUIRED_DELEGATION_CONNECTOR:
				sequence_RequiredDelegationConnector(context, (RequiredDelegationConnector) semanticObject); 
				return; 
			case AssemblyPackage.SYSTEM:
				sequence_System(context, (edu.kit.ipd.sdq.cbsm.assembly.System) semanticObject); 
				return; 
			}
		else if (epackage == BehaviorPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case BehaviorPackage.ACTION:
				sequence_Action_Impl(context, (edu.kit.ipd.sdq.cbsm.repository.behavior.Action) semanticObject); 
				return; 
			case BehaviorPackage.BEHAVIOR_DESCRIPTION:
				sequence_BehaviorDescription(context, (BehaviorDescription) semanticObject); 
				return; 
			case BehaviorPackage.BRANCH:
				sequence_Branch(context, (Branch) semanticObject); 
				return; 
			case BehaviorPackage.BRANCH_PATH:
				sequence_BranchPath(context, (BranchPath) semanticObject); 
				return; 
			case BehaviorPackage.EXTERNAL_CALL:
				sequence_ExternalCall(context, (ExternalCall) semanticObject); 
				return; 
			case BehaviorPackage.INTERNAL_ACTION:
				sequence_InternalAction(context, (InternalAction) semanticObject); 
				return; 
			case BehaviorPackage.LOOP:
				sequence_Loop(context, (Loop) semanticObject); 
				return; 
			}
		else if (epackage == EnvironmentPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case EnvironmentPackage.CONTAINER:
				sequence_Container(context, (Container) semanticObject); 
				return; 
			case EnvironmentPackage.ENVIRONMENT:
				sequence_Environment(context, (Environment) semanticObject); 
				return; 
			case EnvironmentPackage.LINK:
				sequence_Link(context, (Link) semanticObject); 
				return; 
			}
		else if (epackage == RepositoryPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case RepositoryPackage.COMPLEX_TYPE:
				sequence_ComplexType(context, (ComplexType) semanticObject); 
				return; 
			case RepositoryPackage.COMPONENT:
				sequence_Component(context, (Component) semanticObject); 
				return; 
			case RepositoryPackage.INTERFACE:
				sequence_Interface(context, (Interface) semanticObject); 
				return; 
			case RepositoryPackage.PARAMETER:
				sequence_Parameter(context, (edu.kit.ipd.sdq.cbsm.repository.Parameter) semanticObject); 
				return; 
			case RepositoryPackage.PROVIDED_ROLE:
				sequence_ProvidedRole(context, (ProvidedRole) semanticObject); 
				return; 
			case RepositoryPackage.REPOSITORY:
				sequence_Repository(context, (Repository) semanticObject); 
				return; 
			case RepositoryPackage.REQUIRED_ROLE:
				sequence_RequiredRole(context, (RequiredRole) semanticObject); 
				return; 
			case RepositoryPackage.SIGNATURE:
				sequence_Signature(context, (Signature) semanticObject); 
				return; 
			case RepositoryPackage.SIMPLE_TYPE:
				sequence_SimpleType(context, (SimpleType) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Action returns Action
	 *     Action_Impl returns Action
	 *
	 * Constraint:
	 *     (name=EString predecessor=[Action|EString]? successor=[Action|EString]?)
	 */
	protected void sequence_Action_Impl(ISerializationContext context, edu.kit.ipd.sdq.cbsm.repository.behavior.Action semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AllocationContext returns AllocationContext
	 *
	 * Constraint:
	 *     (name=EString allocatedContainer=[Container|EString] allocatedAssemblyContext=[AssemblyContext|EString])
	 */
	protected void sequence_AllocationContext(ISerializationContext context, AllocationContext semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, AllocationPackage.Literals.ALLOCATION_CONTEXT__ALLOCATED_CONTAINER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AllocationPackage.Literals.ALLOCATION_CONTEXT__ALLOCATED_CONTAINER));
			if (transientValues.isValueTransient(semanticObject, AllocationPackage.Literals.ALLOCATION_CONTEXT__ALLOCATED_ASSEMBLY_CONTEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AllocationPackage.Literals.ALLOCATION_CONTEXT__ALLOCATED_ASSEMBLY_CONTEXT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAllocationContextAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAllocationContextAccess().getAllocatedContainerContainerEStringParserRuleCall_4_0_1(), semanticObject.getAllocatedContainer());
		feeder.accept(grammarAccess.getAllocationContextAccess().getAllocatedAssemblyContextAssemblyContextEStringParserRuleCall_6_0_1(), semanticObject.getAllocatedAssemblyContext());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ViewType returns Allocation
	 *     Allocation returns Allocation
	 *
	 * Constraint:
	 *     (allocationContexts+=AllocationContext allocationContexts+=AllocationContext*)?
	 */
	protected void sequence_Allocation(ISerializationContext context, Allocation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Connector returns AssemblyConnector
	 *     AssemblyConnector returns AssemblyConnector
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         connectedProvidedRole=[ProvidedRole|EString] 
	 *         connectedRequiredRole=[RequiredRole|EString] 
	 *         connectedProvidedAssemblyContext=[AssemblyContext|EString] 
	 *         connectedRequiredAssemblyContext=[AssemblyContext|EString]
	 *     )
	 */
	protected void sequence_AssemblyConnector(ISerializationContext context, AssemblyConnector semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, AssemblyPackage.Literals.ASSEMBLY_CONNECTOR__CONNECTED_PROVIDED_ROLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AssemblyPackage.Literals.ASSEMBLY_CONNECTOR__CONNECTED_PROVIDED_ROLE));
			if (transientValues.isValueTransient(semanticObject, AssemblyPackage.Literals.ASSEMBLY_CONNECTOR__CONNECTED_REQUIRED_ROLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AssemblyPackage.Literals.ASSEMBLY_CONNECTOR__CONNECTED_REQUIRED_ROLE));
			if (transientValues.isValueTransient(semanticObject, AssemblyPackage.Literals.ASSEMBLY_CONNECTOR__CONNECTED_PROVIDED_ASSEMBLY_CONTEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AssemblyPackage.Literals.ASSEMBLY_CONNECTOR__CONNECTED_PROVIDED_ASSEMBLY_CONTEXT));
			if (transientValues.isValueTransient(semanticObject, AssemblyPackage.Literals.ASSEMBLY_CONNECTOR__CONNECTED_REQUIRED_ASSEMBLY_CONTEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AssemblyPackage.Literals.ASSEMBLY_CONNECTOR__CONNECTED_REQUIRED_ASSEMBLY_CONTEXT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAssemblyConnectorAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAssemblyConnectorAccess().getConnectedProvidedRoleProvidedRoleEStringParserRuleCall_4_0_1(), semanticObject.getConnectedProvidedRole());
		feeder.accept(grammarAccess.getAssemblyConnectorAccess().getConnectedRequiredRoleRequiredRoleEStringParserRuleCall_6_0_1(), semanticObject.getConnectedRequiredRole());
		feeder.accept(grammarAccess.getAssemblyConnectorAccess().getConnectedProvidedAssemblyContextAssemblyContextEStringParserRuleCall_8_0_1(), semanticObject.getConnectedProvidedAssemblyContext());
		feeder.accept(grammarAccess.getAssemblyConnectorAccess().getConnectedRequiredAssemblyContextAssemblyContextEStringParserRuleCall_10_0_1(), semanticObject.getConnectedRequiredAssemblyContext());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AssemblyContext returns AssemblyContext
	 *
	 * Constraint:
	 *     (name=EString instantiatedComponent=[Component|EString])
	 */
	protected void sequence_AssemblyContext(ISerializationContext context, AssemblyContext semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, AssemblyPackage.Literals.ASSEMBLY_CONTEXT__INSTANTIATED_COMPONENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AssemblyPackage.Literals.ASSEMBLY_CONTEXT__INSTANTIATED_COMPONENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAssemblyContextAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAssemblyContextAccess().getInstantiatedComponentComponentEStringParserRuleCall_4_0_1(), semanticObject.getInstantiatedComponent());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     BehaviorDescription returns BehaviorDescription
	 *
	 * Constraint:
	 *     (actions+=Action actions+=Action*)?
	 */
	protected void sequence_BehaviorDescription(ISerializationContext context, BehaviorDescription semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BranchPath returns BranchPath
	 *
	 * Constraint:
	 *     (name=EString (pathActions+=Action pathActions+=Action*)?)
	 */
	protected void sequence_BranchPath(ISerializationContext context, BranchPath semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Action returns Branch
	 *     Branch returns Branch
	 *
	 * Constraint:
	 *     (name=EString predecessor=[Action|EString]? successor=[Action|EString]? (branchPaths+=BranchPath branchPaths+=BranchPath*)?)
	 */
	protected void sequence_Branch(ISerializationContext context, Branch semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DataType returns ComplexType
	 *     ComplexType returns ComplexType
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_ComplexType(ISerializationContext context, ComplexType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getComplexTypeAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Component returns Component
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         (providedRoles+=ProvidedRole providedRoles+=ProvidedRole*)? 
	 *         (requiredRoles+=RequiredRole requiredRoles+=RequiredRole*)? 
	 *         behaviorDescription=BehaviorDescription?
	 *     )
	 */
	protected void sequence_Component(ISerializationContext context, Component semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Container returns Container
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_Container(ISerializationContext context, Container semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getContainerAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ViewType returns Environment
	 *     Environment returns Environment
	 *
	 * Constraint:
	 *     ((containers+=Container containers+=Container*)? (links+=Link links+=Link*)?)
	 */
	protected void sequence_Environment(ISerializationContext context, Environment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Action returns ExternalCall
	 *     ExternalCall returns ExternalCall
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         predecessor=[Action|EString]? 
	 *         successor=[Action|EString]? 
	 *         requiredService=[Signature|EString] 
	 *         requiredRoleOfService=[RequiredRole|EString]
	 *     )
	 */
	protected void sequence_ExternalCall(ISerializationContext context, ExternalCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Interface returns Interface
	 *
	 * Constraint:
	 *     (name=EString (signatures+=Signature signatures+=Signature*)?)
	 */
	protected void sequence_Interface(ISerializationContext context, Interface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Action returns InternalAction
	 *     InternalAction returns InternalAction
	 *
	 * Constraint:
	 *     (name=EString predecessor=[Action|EString]? successor=[Action|EString]?)
	 */
	protected void sequence_InternalAction(ISerializationContext context, InternalAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Link returns Link
	 *
	 * Constraint:
	 *     (name=EString linkedContainers+=[Container|EString] linkedContainers+=[Container|EString]*)
	 */
	protected void sequence_Link(ISerializationContext context, Link semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Action returns Loop
	 *     Loop returns Loop
	 *
	 * Constraint:
	 *     (name=EString predecessor=[Action|EString]? successor=[Action|EString]? (loopActions+=Action loopActions+=Action*)?)
	 */
	protected void sequence_Loop(ISerializationContext context, Loop semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Parameter returns Parameter
	 *
	 * Constraint:
	 *     (name=EString type=[DataType|EString])
	 */
	protected void sequence_Parameter(ISerializationContext context, edu.kit.ipd.sdq.cbsm.repository.Parameter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, RepositoryPackage.Literals.PARAMETER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RepositoryPackage.Literals.PARAMETER__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getParameterAccess().getTypeDataTypeEStringParserRuleCall_4_0_1(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Connector returns ProvidedDelegationConnector
	 *     ProvidedDelegationConnector returns ProvidedDelegationConnector
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         innerAssemblyContext=[AssemblyContext|EString] 
	 *         outerAssemblyContext=[AssemblyContext|EString] 
	 *         innerProvidedRole=[ProvidedRole|EString] 
	 *         outerProvidedRole=[ProvidedRole|EString]
	 *     )
	 */
	protected void sequence_ProvidedDelegationConnector(ISerializationContext context, ProvidedDelegationConnector semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, AssemblyPackage.Literals.DELEGATION_CONNECTOR__INNER_ASSEMBLY_CONTEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AssemblyPackage.Literals.DELEGATION_CONNECTOR__INNER_ASSEMBLY_CONTEXT));
			if (transientValues.isValueTransient(semanticObject, AssemblyPackage.Literals.DELEGATION_CONNECTOR__OUTER_ASSEMBLY_CONTEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AssemblyPackage.Literals.DELEGATION_CONNECTOR__OUTER_ASSEMBLY_CONTEXT));
			if (transientValues.isValueTransient(semanticObject, AssemblyPackage.Literals.PROVIDED_DELEGATION_CONNECTOR__INNER_PROVIDED_ROLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AssemblyPackage.Literals.PROVIDED_DELEGATION_CONNECTOR__INNER_PROVIDED_ROLE));
			if (transientValues.isValueTransient(semanticObject, AssemblyPackage.Literals.PROVIDED_DELEGATION_CONNECTOR__OUTER_PROVIDED_ROLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AssemblyPackage.Literals.PROVIDED_DELEGATION_CONNECTOR__OUTER_PROVIDED_ROLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getProvidedDelegationConnectorAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getProvidedDelegationConnectorAccess().getInnerAssemblyContextAssemblyContextEStringParserRuleCall_4_0_1(), semanticObject.getInnerAssemblyContext());
		feeder.accept(grammarAccess.getProvidedDelegationConnectorAccess().getOuterAssemblyContextAssemblyContextEStringParserRuleCall_6_0_1(), semanticObject.getOuterAssemblyContext());
		feeder.accept(grammarAccess.getProvidedDelegationConnectorAccess().getInnerProvidedRoleProvidedRoleEStringParserRuleCall_8_0_1(), semanticObject.getInnerProvidedRole());
		feeder.accept(grammarAccess.getProvidedDelegationConnectorAccess().getOuterProvidedRoleProvidedRoleEStringParserRuleCall_10_0_1(), semanticObject.getOuterProvidedRole());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ProvidedRole returns ProvidedRole
	 *
	 * Constraint:
	 *     (name=EString providedInterface=[Interface|EString])
	 */
	protected void sequence_ProvidedRole(ISerializationContext context, ProvidedRole semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, RepositoryPackage.Literals.PROVIDED_ROLE__PROVIDED_INTERFACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RepositoryPackage.Literals.PROVIDED_ROLE__PROVIDED_INTERFACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getProvidedRoleAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getProvidedRoleAccess().getProvidedInterfaceInterfaceEStringParserRuleCall_4_0_1(), semanticObject.getProvidedInterface());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ViewType returns Repository
	 *     Repository returns Repository
	 *
	 * Constraint:
	 *     ((interfaces+=Interface interfaces+=Interface*)? (components+=Component components+=Component*)? (dataTypes+=DataType dataTypes+=DataType*)?)
	 */
	protected void sequence_Repository(ISerializationContext context, Repository semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Connector returns RequiredDelegationConnector
	 *     RequiredDelegationConnector returns RequiredDelegationConnector
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         innerAssemblyContext=[AssemblyContext|EString] 
	 *         outerAssemblyContext=[AssemblyContext|EString] 
	 *         innerRequiredRole=[RequiredRole|EString] 
	 *         outerRequiredRole=[RequiredRole|EString]
	 *     )
	 */
	protected void sequence_RequiredDelegationConnector(ISerializationContext context, RequiredDelegationConnector semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, AssemblyPackage.Literals.DELEGATION_CONNECTOR__INNER_ASSEMBLY_CONTEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AssemblyPackage.Literals.DELEGATION_CONNECTOR__INNER_ASSEMBLY_CONTEXT));
			if (transientValues.isValueTransient(semanticObject, AssemblyPackage.Literals.DELEGATION_CONNECTOR__OUTER_ASSEMBLY_CONTEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AssemblyPackage.Literals.DELEGATION_CONNECTOR__OUTER_ASSEMBLY_CONTEXT));
			if (transientValues.isValueTransient(semanticObject, AssemblyPackage.Literals.REQUIRED_DELEGATION_CONNECTOR__INNER_REQUIRED_ROLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AssemblyPackage.Literals.REQUIRED_DELEGATION_CONNECTOR__INNER_REQUIRED_ROLE));
			if (transientValues.isValueTransient(semanticObject, AssemblyPackage.Literals.REQUIRED_DELEGATION_CONNECTOR__OUTER_REQUIRED_ROLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AssemblyPackage.Literals.REQUIRED_DELEGATION_CONNECTOR__OUTER_REQUIRED_ROLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRequiredDelegationConnectorAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRequiredDelegationConnectorAccess().getInnerAssemblyContextAssemblyContextEStringParserRuleCall_4_0_1(), semanticObject.getInnerAssemblyContext());
		feeder.accept(grammarAccess.getRequiredDelegationConnectorAccess().getOuterAssemblyContextAssemblyContextEStringParserRuleCall_6_0_1(), semanticObject.getOuterAssemblyContext());
		feeder.accept(grammarAccess.getRequiredDelegationConnectorAccess().getInnerRequiredRoleRequiredRoleEStringParserRuleCall_8_0_1(), semanticObject.getInnerRequiredRole());
		feeder.accept(grammarAccess.getRequiredDelegationConnectorAccess().getOuterRequiredRoleRequiredRoleEStringParserRuleCall_10_0_1(), semanticObject.getOuterRequiredRole());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     RequiredRole returns RequiredRole
	 *
	 * Constraint:
	 *     (name=EString requiredInterface=[Interface|EString])
	 */
	protected void sequence_RequiredRole(ISerializationContext context, RequiredRole semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, RepositoryPackage.Literals.REQUIRED_ROLE__REQUIRED_INTERFACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RepositoryPackage.Literals.REQUIRED_ROLE__REQUIRED_INTERFACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRequiredRoleAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRequiredRoleAccess().getRequiredInterfaceInterfaceEStringParserRuleCall_4_0_1(), semanticObject.getRequiredInterface());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Signature returns Signature
	 *
	 * Constraint:
	 *     (name=EString returnType=[DataType|EString]? (parameters+=Parameter parameters+=Parameter*)?)
	 */
	protected void sequence_Signature(ISerializationContext context, Signature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DataType returns SimpleType
	 *     SimpleType returns SimpleType
	 *
	 * Constraint:
	 *     typeInstance=SimpleTypeInstance
	 */
	protected void sequence_SimpleType(ISerializationContext context, SimpleType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RepositoryPackage.Literals.SIMPLE_TYPE__TYPE_INSTANCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RepositoryPackage.Literals.SIMPLE_TYPE__TYPE_INSTANCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSimpleTypeAccess().getTypeInstanceSimpleTypeInstanceEnumRuleCall_3_0(), semanticObject.getTypeInstance());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ViewType returns System
	 *     System returns System
	 *
	 * Constraint:
	 *     (
	 *         (providedRoles+=ProvidedRole providedRoles+=ProvidedRole*)? 
	 *         (requiredRoles+=RequiredRole requiredRoles+=RequiredRole*)? 
	 *         (containedAssemblyContexts+=AssemblyContext containedAssemblyContexts+=AssemblyContext*)? 
	 *         (systemConnectors+=Connector systemConnectors+=Connector*)?
	 *     )
	 */
	protected void sequence_System(ISerializationContext context, edu.kit.ipd.sdq.cbsm.assembly.System semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
