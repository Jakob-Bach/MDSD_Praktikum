# Ecore meta-model changes

This file documents changes to the Ecore meta-model after creating the first version. Be aware that the other meta-models and the models depend on it. So if the Ecore meta-model changes, (in more recent commits) the Xtext grammar, the QVT transformation, the Xtend code generator and the Sirius editor might be affected, too, as well as the different instance (model) files.

## Base version

`5a0d49c8a1` Create first version of meta-model

Initial version as described by task a) (also tagged **cbsm-first-version**), but lacking the OCL constraints which we chose to add after talking to the advisor about this first version and doing some basic refactorings. The initial version is strongly based on the task, so it has some major differences to Palladio and does not contain attributes/references which would make sense, but are not mentioned (a kind of sanity check was done during the following refactoring).

## Task 1b: Meta-model refactorings before model creation

**Note:** As described in the `FAQ` file, the OCL constraints (belonging to task 1a) were added after first refactorings took place (so during the work on task 1b). Changes that only add OCL constraints for the first time or even whole commits doing just that (without changing meta-model elements or existing OCL constraints) are not mentioned here, because they are no true meta-model refactorings.

`a7e9ba23a2` Remove Services
- Remove the EClass *Service*. Services are mentioned in the text of the task ("interfaces [...] provides services", "external calls to required services"), but they are rather a semantic concept. Regarding syntax, they can also be represented with the existing EClass *Signature*, so we chose to remove the EClass *Service* after a discussion with the advisor.

`ea829b7ed2` Change BehaviorDescription 
- Add the EReferences *predecessor* and *successor* to the EClass *Action*, so the user can define a behavior flow.
- Add the EReference *loopActions* to the EClass *Loop*, so the semantics of loops is properly represented (*Loop* had no EReferences before, as the task did not provide any details on that aspect).
- Add the EReference *branchPaths* to the EClass *Branch* and create an EClass *BranchPath* with an EReference *pathActions*, so the semantics of branches is properly represented (*Branch* had no EReferences before, as the task did not provide any detail on that aspect).

`61718efe0e` Replace Interface with Role + Split DelegationConnector
- Consistently use the EClasses *ProvidedRole* and *RequiredRole* to hide references to interfaces. In the initial version, the EClasses *System* and *DelegationConnector* had direct references to the type *Interface*, because it was described that way in the task. With this refactoring, roles are referenced instead. One the one hand this ensures consistency within our meta-model, on the other hand, the same approach is chosen in Palladio.
- Move the EClasses *ProvidedRole* and *RequiredRole* from the EPackage *assembly* to *repository*. They are needed e.g. by the EClass *Component* in the EPackage *repository* and we do not want any references from *repository* to *assembly*, as there are already dependencies from *assembly* to *repository*. Cyclic dependencies are an anti-pattern in software engineering and from the component-based point of view, the entities in the repository should not depend on any elements of a concrete system (on the model level).
- Create two sub-classes of *DelegationConnector*, *ProvidedDelegationConnector* and *RequiredDelegationConnector*. The old EClass contained all the references of both sub-classes at the same time, but that did not make sense because the connection is either provided-provided or required-required. Therefore, two sub-classes with the same super-class are created.

`2edb242609` Move behavior-related elements to separate EPackage
- Create a new EPackage *behavior* as sub-package of *repository*. Move all behavior-related EClasses to that package. They belong to the same concept and should therefore be stored together, but they are still part of the repository, so we decided on a sub-package.

`7d4e4a6f52` Change containment in assembly
- Make the EClass *System* the top-level element for the assembly view type. It references the EClasses *Connector*, *ProvidedRole* and *AssemblyContext* (and contains instances of that classes). Each model file should have a top-level element and the `.assembly` had none before this change.
- Create a super-class *Connector* for *AssemblyConnector* and *DelegationConnector*, because they represent related concepts (although there are no common attributes).
- Make the EReferences to *ProvidedRole* and *RequiredRole* non-containment in the *Connector* sub-classes and *AssemblyContext*. Those EClasses only reference roles already contained in a *Component*. If the reference to roles was a containment one for connectors and assembly contexts, too, there would be additional roles in the model, although the same real-world entity was referenced.

`0ed2cb37d2` Add element names where appropriate
- Add inheritance from multiple EClasses to *NamedElement*. For some elements it is explicitly mentioned in the text that they should have a name, but for some not. The initial version of the meta-model had only names where mentioned in the text, this refactoring adds further names where they make sense (so in the end nearly all elements are named, because this allows a user-friendly identification in the model).

`e7413b2c55` Introduce common super-class for ProvidedRole and RequiredRole
- Create a super-class *Role*, because *ProvidedRole* and *RequiredRole* represent similar concepts (although the new EClass does not have any own attributes; the EReference to the represented interface remains in the sub-classes, as it is named differently -> *providedInterface* / *requiredInterface*).

`2e86e554ea` Make elements abstract where appropriate
- Make *NamedElement*, *Role*, *DataType*, *Connector* and *DelegationConnector* abstract. All those EClasses have multiple sub-classes and no direct real-world representation themselves, so instantiation is not necessary. 

`ad89cda487` Derive Roles of AssemblyContext
- Make the EReferences *providedRoles* and *requiredRoles* of the EClass *AssemblyContext* derived. They can be directly calculated from the 1..1 *instantiatedComponent* EReference.

`649bf7d474` Rename EReferences where appropriate 
- Give more descriptive names for EReferences. Many EReferences were directly named after their type (which resulted in multiple EClasses having EReferences with the same names if the type was the same). To distinguish them better, they are renamed and include more context information. E.g., both *Link* and *AllocationContext* had an EReference to *Container*. Now they are called *linkedContainers* respectively *allocatedContainer*.

`ce9b5c00a2` Add System's RequiredRole EReference 
- Add an EReference *systemRequiredRoles* to the EClass *System*. The text only mentions functionality provided by the system, but it makes sense that systems could also require interfaces.

`0a1f183de4` Add first OCL constraints and refactor
- Rename the EReference *requiredRole* of the EClass *Component* to *requiredRoles*. Just a typo, cardinality already was 0..*.
- Add an EReference *requiredRoleOfService* with type *RequiredRole* to the EClass *ExternalCall*. The *requiredService* (type: *Signature*) already was an EReference, but signatures are independent of components, they belong to an interface. The external call should not only be related to the signature, but also its context (role that references the containing interface), as it describes component behavior. Therefore, the reference to the required role is added.
- Create an abstract super-class *CompositeElement* for *CompositeComponent* and *System* which references *containedAssemblyContexts*. On the one hand this moves a common concept of two sub-classes to a super-class, on the other hand this bi-directional EReference is necessary for an OCL constraint regarding the EClass *AllocationContext*.
- Add the EReferences *innerAssemblyContext* and *outerAssemblyContext* to the EClass *DelegationConnector*. Necessary for OCL constraints.
- Move the EReferences *innerRole* and *outerRole* of the EClasses *ProvidedDelegationConnector* and *RequiredDelegationConnector* to super-class *DelegationConnector*. Both represent similar concepts, only the type of connected roles are different. As a consequence, the references can be moved to the super-class and the latter gets a generic type parameter \<T extends Role>.

`ff2a332dde` Add constraints for DelegationConnector
- Move the EReferences *innerRole* and *outerRole* back to sub-classes, because OCL has problems with the generic type parameter.
- Create an abstract super-class *ProvidingAndRequiringElement* for *Component* and *CompositeProvidingAndRequiringElement* (former *CompositeElement*, sub-classes *CompositeComponent* and *System*). The common EReferences *providedRoles* and *requiredRoles* can be moved to the new super-class (common concept for all sub-classes).
- Move the EClass *CompositeComponent* to the EPackage *assembly*, so there are no references
from the EPackage *repository* to *assembly* (the super-class *CompositeProvidingAndRequiringElement* is part of the *assembly*), only the other way around.

`7d82a5711b` Add constraints for AssemblyConnector
- Add the EReferences *connectedProvidedAssemblyContext* and *connectedRequiredAssemblyContext* to the EClass *AssemblyConnector*. This ensures consistency to the *DelegationConnector* which also stores references to the contexts, not only the roles.

`6b3fa26625` Add constrainte for AllocationContext and Allocation
- Add the EReference *parentEnvironment* to the EClasses *Container* and *Link*. This is necessary for the OCL constraints regarding the EClass *Allocation*.

## Task 1c: Meta-model changes during model creation

`3017ba75c2` Change meta-model duration model creation
- Add inheritance of *SimpleType* and *ComplexType* to *DataType*. Just missed during the initial meta-model creation.
- Make the EReference *returnType* of the EClass *Signature* a 0..1 reference instead of 1..1 to support the "void" return type.
- Edit the *AssemblyContextsConnectedByAssemblyConnectorAllocatedOnSameOrLinkedContainers* constraint, as it showed a validation error.

## Meta-model changes during Xtext grammar development (task 2)

`0049059140` Add ViewType EClass
- Create an abstract super-class *ViewType* for the EClasses *Repository*, *System*, *Environment* and *Allocation*. This is used as entry rule for the Xtext grammar: A DSL file can contain exactly one *ViewType* (rule dispatch).

`8e09feedf0` Fix constraint for connected contexts 
- Edit the *AssemblyContextsConnectedByAssemblyConnectorAllocatedOnSameOrLinkedContainer* constraint, as it should be fulfilled if there are no allocation contexts from which the constraint could be checked (check if isEmpty first).

## Meta-model changes during QVT-O transformation development (task 3)

`f795bd4ed0` Make CBSM more compliant to Palladio
- Add inheritance from *ViewType* to *NamedElement*, so the EClasses *Repository*, *System*, *Environment* and *Allocation* get a name as in Palladio (otherwise the transformation sets a default name).
- Make the EReference *behaviorDescriptions* of the EClass *Component* a 0..* reference instead of 0..1, as PCM components can also have multiple SEFFs. 
- Add inheritance from *BehaviorDescription* to *NamedElement*, so you can distinguish the different behaviors that might belong to the same component.
- Make the EClass *Action* abstract. Non-abstract actions are *InternalAction*, *Loop*, *ExternalCall* and *Branch*. The task for assignment 1 only demands those four types, so a non-abstract class Action simply is not necessary (but as abstract super-class it serves a purpose, as it contains the EReferences *predecessor* and *successor*).
- Change the EReferences of the EClasses *Loop* and *BranchPath*. Now they reference exactly one *BehaviorDescription* instead of 0..* *Action*s. This is similar to Palladio's *AbstractBranchTransition* and *AbstractLoopAction* which both reference one *ResourceDemandingBehavior*.

`659434a160` Fix some PCM-OCL-related errors
- Move the EReference *connectors* from the EClass *System* to the EClass *CompositeProvidingAndRequiringElement*, so *CompositeComponent*s can contain connectors now. Our initial idea was that all connectors should be stored centrally in the system, but Palladio's OCL constraints require a local storage (connectors have to be related to their container).
- Remove the EReference *outerAssemblyContext* of the EClass *DelegationConnector*, so similar to PCM only the *innerAssmemblyContext* and the inner/outer role are referenced. This also enables delegation connectors for the system as a whole which in that case don't have an *outerAssemblyContext*.
- Add the EReferences *allocatedSystem* and *allocatedEnvironment* to the EClass *Allocation*. OCL constraints of Palladio and now also in our meta-model guarantee that the assembly contexts of the allocation contexts of the allocation belong to that system and that the containers of the allocation contexts of the allocation belong to that environment.

`ebfa31d9b4` Fix some behavior mappings
- Make the EReferences *predecessor* and *successor* of the EClass *Action* eOpposites. This has the advantage that setting one reference from an element to another one directly sets the opposite reference.

`ebe6a27cb9` Fix SEFF mapping
- Add an EClass *ComponentBehaviorDescription* that inherits from *BehaviorDescription*. The old CBSM meta-model had only one EClass *BehaviorDescription* to represent PCM's *ResourceDemandingBehavior*, always transformed to PCM's *ResourceDemandingSEFF*. However, two EReferences of a SEFF were missing (to the described service [signature] and the containing component), which resulted in violated OCL constraints. These EReferences are only interesting for SEFFs, but not for the general PCM super-class *ResourceDemandingBehaviour* which also is non-abstract and can be referenced from the EClasses *LoopAction* and *AbstractBranchTransition* in Palladio. As a consequence, our meta-model gets a new EClass *ComponentBehaviorDescription* which extends *BehaviorDescription* and has the necessary references for representing a SEFF.

## Meta-model changes during Xtend code generator development (task 4)

## Meta-model changes during Sirius editor development (task 5)

`de9217a989` Allow interface Inheritance in meta-model
- Add an EReference *superInterfaces* to the EClass *Interface*. Task 5 speaks about interface inheritance which we did not have in our meta-model, so it is added here.

`8bbe53b30d` Add icons for Repository elements
- Add icons for various EClasses of the EPackage *repository* to the editor project (does not affect the core meta-model). The icons are mainly needed for the Sirius editor, but as they are added to the editor project of the meta-model, they can also be used in the tree editor. The structure of the meta-model is not affected by this change.

## Meta-model changes before final presentation / submission

`3e025ceb3e` Rename meta-model projects
- Adapt the project name to make it fully-qualified and similar to other projects. The meta-model itself is not affected, its package names and URIs remain the same. Only the name of the plug-in and project directory changes (and all locations depending on that, e.g. the `.genmodel` file).

