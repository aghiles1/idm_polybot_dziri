/**
 */
package polybot.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import polybot.PolybotFactory;
import polybot.PolybotPackage;
import polybot.While;

/**
 * This is the item provider adapter for a {@link polybot.While} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WhileItemProvider extends InstructionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhileItemProvider(AdapterFactory adapterFactory) {
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

			addNbPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Nb feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNbPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_While_nb_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_While_nb_feature", "_UI_While_type"),
				 PolybotPackage.Literals.WHILE__NB,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(PolybotPackage.Literals.WHILE__LIST_OF_INSTRUCTIONS);
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
	 * This returns While.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/While"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		While while_ = (While)object;
		return getString("_UI_While_type") + " " + while_.getNb();
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

		switch (notification.getFeatureID(While.class)) {
			case PolybotPackage.WHILE__NB:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PolybotPackage.WHILE__LIST_OF_INSTRUCTIONS:
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
				(PolybotPackage.Literals.WHILE__LIST_OF_INSTRUCTIONS,
				 PolybotFactory.eINSTANCE.createGoTo()));

		newChildDescriptors.add
			(createChildParameter
				(PolybotPackage.Literals.WHILE__LIST_OF_INSTRUCTIONS,
				 PolybotFactory.eINSTANCE.createRight()));

		newChildDescriptors.add
			(createChildParameter
				(PolybotPackage.Literals.WHILE__LIST_OF_INSTRUCTIONS,
				 PolybotFactory.eINSTANCE.createLeft()));

		newChildDescriptors.add
			(createChildParameter
				(PolybotPackage.Literals.WHILE__LIST_OF_INSTRUCTIONS,
				 PolybotFactory.eINSTANCE.createReverse()));

		newChildDescriptors.add
			(createChildParameter
				(PolybotPackage.Literals.WHILE__LIST_OF_INSTRUCTIONS,
				 PolybotFactory.eINSTANCE.createForward()));

		newChildDescriptors.add
			(createChildParameter
				(PolybotPackage.Literals.WHILE__LIST_OF_INSTRUCTIONS,
				 PolybotFactory.eINSTANCE.createIfObjectDetected()));

		newChildDescriptors.add
			(createChildParameter
				(PolybotPackage.Literals.WHILE__LIST_OF_INSTRUCTIONS,
				 PolybotFactory.eINSTANCE.createIfObstacleDetected()));

		newChildDescriptors.add
			(createChildParameter
				(PolybotPackage.Literals.WHILE__LIST_OF_INSTRUCTIONS,
				 PolybotFactory.eINSTANCE.createTakeDropObject()));

		newChildDescriptors.add
			(createChildParameter
				(PolybotPackage.Literals.WHILE__LIST_OF_INSTRUCTIONS,
				 PolybotFactory.eINSTANCE.createWhile()));
	}

}
