/**
 */
package edu.kit.ipd.sdq.cbsm.repository.provider;


import edu.kit.ipd.sdq.cbsm.assembly.AssemblyFactory;
import edu.kit.ipd.sdq.cbsm.core.provider.ComponentBasedSystemModelEditPlugin;

import edu.kit.ipd.sdq.cbsm.core.provider.ViewTypeItemProvider;
import edu.kit.ipd.sdq.cbsm.repository.Repository;
import edu.kit.ipd.sdq.cbsm.repository.RepositoryFactory;
import edu.kit.ipd.sdq.cbsm.repository.RepositoryPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.cbsm.repository.Repository} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RepositoryItemProvider 
	extends ViewTypeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(RepositoryPackage.Literals.REPOSITORY__INTERFACES);
			childrenFeatures.add(RepositoryPackage.Literals.REPOSITORY__COMPONENTS);
			childrenFeatures.add(RepositoryPackage.Literals.REPOSITORY__DATA_TYPES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Repository.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Repository"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Repository)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Repository_type") :
			getString("_UI_Repository_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Repository.class)) {
			case RepositoryPackage.REPOSITORY__INTERFACES:
			case RepositoryPackage.REPOSITORY__COMPONENTS:
			case RepositoryPackage.REPOSITORY__DATA_TYPES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(RepositoryPackage.Literals.REPOSITORY__INTERFACES,
				 RepositoryFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(RepositoryPackage.Literals.REPOSITORY__COMPONENTS,
				 RepositoryFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(RepositoryPackage.Literals.REPOSITORY__COMPONENTS,
				 AssemblyFactory.eINSTANCE.createCompositeComponent()));

		newChildDescriptors.add
			(createChildParameter
				(RepositoryPackage.Literals.REPOSITORY__DATA_TYPES,
				 RepositoryFactory.eINSTANCE.createComplexType()));

		newChildDescriptors.add
			(createChildParameter
				(RepositoryPackage.Literals.REPOSITORY__DATA_TYPES,
				 RepositoryFactory.eINSTANCE.createSimpleType()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ComponentBasedSystemModelEditPlugin.INSTANCE;
	}

}
