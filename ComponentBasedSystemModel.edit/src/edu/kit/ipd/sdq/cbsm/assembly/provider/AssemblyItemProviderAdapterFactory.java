/**
 */
package edu.kit.ipd.sdq.cbsm.assembly.provider;

import edu.kit.ipd.sdq.cbsm.assembly.util.AssemblyAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AssemblyItemProviderAdapterFactory extends AssemblyAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.cbsm.assembly.AssemblyContext} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyContextItemProvider assemblyContextItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.cbsm.assembly.AssemblyContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssemblyContextAdapter() {
		if (assemblyContextItemProvider == null) {
			assemblyContextItemProvider = new AssemblyContextItemProvider(this);
		}

		return assemblyContextItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.cbsm.assembly.System} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemItemProvider systemItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.cbsm.assembly.System}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSystemAdapter() {
		if (systemItemProvider == null) {
			systemItemProvider = new SystemItemProvider(this);
		}

		return systemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.cbsm.assembly.Connector} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorItemProvider connectorItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.cbsm.assembly.Connector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConnectorAdapter() {
		if (connectorItemProvider == null) {
			connectorItemProvider = new ConnectorItemProvider(this);
		}

		return connectorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.cbsm.assembly.DelegationConnector} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelegationConnectorItemProvider delegationConnectorItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.cbsm.assembly.DelegationConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDelegationConnectorAdapter() {
		if (delegationConnectorItemProvider == null) {
			delegationConnectorItemProvider = new DelegationConnectorItemProvider(this);
		}

		return delegationConnectorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.cbsm.assembly.ProvidedDelegationConnector} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvidedDelegationConnectorItemProvider providedDelegationConnectorItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.cbsm.assembly.ProvidedDelegationConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProvidedDelegationConnectorAdapter() {
		if (providedDelegationConnectorItemProvider == null) {
			providedDelegationConnectorItemProvider = new ProvidedDelegationConnectorItemProvider(this);
		}

		return providedDelegationConnectorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.cbsm.assembly.RequiredDelegationConnector} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequiredDelegationConnectorItemProvider requiredDelegationConnectorItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.cbsm.assembly.RequiredDelegationConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRequiredDelegationConnectorAdapter() {
		if (requiredDelegationConnectorItemProvider == null) {
			requiredDelegationConnectorItemProvider = new RequiredDelegationConnectorItemProvider(this);
		}

		return requiredDelegationConnectorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.cbsm.assembly.AssemblyConnector} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyConnectorItemProvider assemblyConnectorItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.cbsm.assembly.AssemblyConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssemblyConnectorAdapter() {
		if (assemblyConnectorItemProvider == null) {
			assemblyConnectorItemProvider = new AssemblyConnectorItemProvider(this);
		}

		return assemblyConnectorItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (assemblyContextItemProvider != null) assemblyContextItemProvider.dispose();
		if (systemItemProvider != null) systemItemProvider.dispose();
		if (connectorItemProvider != null) connectorItemProvider.dispose();
		if (delegationConnectorItemProvider != null) delegationConnectorItemProvider.dispose();
		if (providedDelegationConnectorItemProvider != null) providedDelegationConnectorItemProvider.dispose();
		if (requiredDelegationConnectorItemProvider != null) requiredDelegationConnectorItemProvider.dispose();
		if (assemblyConnectorItemProvider != null) assemblyConnectorItemProvider.dispose();
	}

}
