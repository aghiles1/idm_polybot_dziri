/**
 */
package polybot.provider;

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

import polybot.util.PolybotAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PolybotItemProviderAdapterFactory extends PolybotAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public PolybotItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link polybot.Bot} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BotItemProvider botItemProvider;

	/**
	 * This creates an adapter for a {@link polybot.Bot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBotAdapter() {
		if (botItemProvider == null) {
			botItemProvider = new BotItemProvider(this);
		}

		return botItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link polybot.Point} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointItemProvider pointItemProvider;

	/**
	 * This creates an adapter for a {@link polybot.Point}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPointAdapter() {
		if (pointItemProvider == null) {
			pointItemProvider = new PointItemProvider(this);
		}

		return pointItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link polybot.GoTo} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoToItemProvider goToItemProvider;

	/**
	 * This creates an adapter for a {@link polybot.GoTo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGoToAdapter() {
		if (goToItemProvider == null) {
			goToItemProvider = new GoToItemProvider(this);
		}

		return goToItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link polybot.Right} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RightItemProvider rightItemProvider;

	/**
	 * This creates an adapter for a {@link polybot.Right}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRightAdapter() {
		if (rightItemProvider == null) {
			rightItemProvider = new RightItemProvider(this);
		}

		return rightItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link polybot.Left} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LeftItemProvider leftItemProvider;

	/**
	 * This creates an adapter for a {@link polybot.Left}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLeftAdapter() {
		if (leftItemProvider == null) {
			leftItemProvider = new LeftItemProvider(this);
		}

		return leftItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link polybot.Reverse} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReverseItemProvider reverseItemProvider;

	/**
	 * This creates an adapter for a {@link polybot.Reverse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReverseAdapter() {
		if (reverseItemProvider == null) {
			reverseItemProvider = new ReverseItemProvider(this);
		}

		return reverseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link polybot.Forward} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForwardItemProvider forwardItemProvider;

	/**
	 * This creates an adapter for a {@link polybot.Forward}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createForwardAdapter() {
		if (forwardItemProvider == null) {
			forwardItemProvider = new ForwardItemProvider(this);
		}

		return forwardItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link polybot.IfObjectDetected} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfObjectDetectedItemProvider ifObjectDetectedItemProvider;

	/**
	 * This creates an adapter for a {@link polybot.IfObjectDetected}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIfObjectDetectedAdapter() {
		if (ifObjectDetectedItemProvider == null) {
			ifObjectDetectedItemProvider = new IfObjectDetectedItemProvider(this);
		}

		return ifObjectDetectedItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link polybot.IfObstacleDetected} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfObstacleDetectedItemProvider ifObstacleDetectedItemProvider;

	/**
	 * This creates an adapter for a {@link polybot.IfObstacleDetected}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIfObstacleDetectedAdapter() {
		if (ifObstacleDetectedItemProvider == null) {
			ifObstacleDetectedItemProvider = new IfObstacleDetectedItemProvider(this);
		}

		return ifObstacleDetectedItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link polybot.TakeDropObject} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TakeDropObjectItemProvider takeDropObjectItemProvider;

	/**
	 * This creates an adapter for a {@link polybot.TakeDropObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTakeDropObjectAdapter() {
		if (takeDropObjectItemProvider == null) {
			takeDropObjectItemProvider = new TakeDropObjectItemProvider(this);
		}

		return takeDropObjectItemProvider;
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
		if (botItemProvider != null) botItemProvider.dispose();
		if (pointItemProvider != null) pointItemProvider.dispose();
		if (goToItemProvider != null) goToItemProvider.dispose();
		if (rightItemProvider != null) rightItemProvider.dispose();
		if (leftItemProvider != null) leftItemProvider.dispose();
		if (reverseItemProvider != null) reverseItemProvider.dispose();
		if (forwardItemProvider != null) forwardItemProvider.dispose();
		if (ifObjectDetectedItemProvider != null) ifObjectDetectedItemProvider.dispose();
		if (ifObstacleDetectedItemProvider != null) ifObstacleDetectedItemProvider.dispose();
		if (takeDropObjectItemProvider != null) takeDropObjectItemProvider.dispose();
	}

}