# FAQ: Assumptions, special design decisions and usage hints

This file explains some points where our solution seems to deviate from the task or where additional hints might be helpful to use the projects. The purpose is **not** to describe all design decisions in general; especially the transformation and code generation files have comments where necessary.

## Software versions used to create the projects

|Software|Version|
|---|---|
|Eclipse Modeling Tools|4.5.2.20160218-0600|
|EMF - Eclipse Modeling Framework SDK|2.11.2.v20160208-0841|
|OCL Examples and Editors SDK|6.1.0.v20160526-1513|
|Palladio Component Model|4.0.0.201607011447|
|QVT Operational SDK|3.5.0.v20150603-1058|
|Sirius|3.1.5.201604151508|
|Xtext Complete SDK|2.10.0.v201605250459|
|Xpand SDK|2.1.0.v201505260349|

## Import hints
All projects are stored as Eclipse projects, i.e. containing `.project` and `.classpath` files, which means they can be imported as existing projects and their structure/nature should be recognized automatically. However, generated binary files, i.e. `.xtextbin` and `.xtendbin` are not committed, so if you want to use the Xtext grammar in nested Eclipse applications, you have to generate the Xtext artifacts first (`GenerateCbsmDsl.mwe2`). The `CBSM_MediaStore` example project should be imported into an additional Eclipse application to make use of the different meta-model plug-ins (opening some of its files in the base Eclipse might cause errors).

## Task 1: Ecore

- The return type *void* is represented by a null value (the corresponding EReference has the lower bound 0).
- The EClasses in the package *behavior* are enhanced with EReferences similar to those in the corresponding Palladio EClasses (the task 1a mentions only the classes for the behavior, no attributes).
- The commit with the initial version of the meta-model is tagged as `cbsm-first-version`. As it can be checked out directly, there is no explicit copy as stated in task 1b.
- The initial version of the meta-model does not contain OCL constraints; those were added after some refactorings, but they also triggered refactorings (so there is no clear order of task 1a and 1b).
- The text of task 1a says that each system provides at least one interface. Therefore we added a provided role and a corresponding delegation connector to our MediaStore system, so there is one role and one provided delegation connector more in our example than mentioned in task 1c.
- No data types are used in the MediaStore example, as the task does not mention any. There is also no behavior-related element (EClass *BehaviorDescription*, *Loop* etc.). Nevertheless, Xtext grammar, QVT transformation and the Sirius editor have also been tested with behavior elements.
- New model files based on the CBSM meta-model can be created in a new Eclipse application (which is started with the meta-model plug-ins) using the *New* dialog of Eclipse: Choose *Example EMF Model Creation Wizards* and then *Repository Model*, *Assembly Model*, *Environment Model* or *Allocation Model*.

## Task 2: Xtext

- If you create a file in a new Eclipse application (which is started with the `cbsmdsl` plug-ins) and give it the file ending `cbsmdsl`, you should get the usual content assist of Eclipse with `CTRL` + `Space`.
- All DSL instance files have the same ending (`cbsmdsl`), but you can specify exactly one of the four view types per file which you choose with the first statement (entry rule of grammar dispatches to rules of view types).
- When saving a DSL file, it will be serialized automatically as XMI to the `serialized` sub-folder.

## Task 3: QVT-O
- All transformation rules are in the `CBSM2PCM_Library.qvto` file. The other transformation files only define the inputs/outputs and call one or multiple top-level mappings.
- You can run transformations based on the Ecore MediaStore example by choosing a pre-defined launch configuration in the folder `edu.kit.ipd.sdq.cbsm.transform/launches` (there is no need to start an extra Eclipse application, but the `CBSM_MediaStore` project should be in the same workspace as the transformation project). You can transform all view types independently. However, assembly and allocation need access to other view types for some of their references; their `Simple...Transformation.launch` works without other files, but will result in some empty values (and probably violated OCL constraints). A simultaneous transformation of all view types can be achieved with the `CBSM2PCM_Transformation`. The output can be found in the `PCM_Ecore` folder of the `CBSM_MediaStore` project.

## Task 4: Xtend
- The repository code generator can be started by right-clicking on a `.repository` file created based on our meta-model (in a new Eclipse application which is started with the code generation plug-in) and choosing the code generation option.

## Task 5: Sirius
- The `repositoryeditor` project should be imported into the workspace of an Eclipse application (which is started with the Ecore meta-model plug-ins) to prevent some referencing errors.
- The validation of `repositoryeditor.odesign` shows a mysterious error ("Nothing will be left after calling oclAsType:") for the element *Interface_SuperInterface_EdgeDeletion*. Nevertheless, the affected action works without problems in the diagram.
- The diagram created for the MediaStore example can be found in the `representations.aird` file. If you cannot choose it as a child element there, you might first to right-click on the whole `CBSM_MediaStore` project and use the *Viewpoints Selection* dialog.
