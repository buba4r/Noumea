/**
 */
package wfwps.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import wfwps.WfwpsFactory;
import wfwps.WfwpsPackage;
import wfwps.WorkFlow;

/**
 * This is the item provider adapter for a {@link wfwps.WorkFlow} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkFlowItemProvider extends DescribedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkFlowItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(WfwpsPackage.Literals.WORK_FLOW__INPUTS);
			childrenFeatures.add(WfwpsPackage.Literals.WORK_FLOW__OUTPUTS);
			childrenFeatures.add(WfwpsPackage.Literals.WORK_FLOW__WPS);
			childrenFeatures.add(WfwpsPackage.Literals.WORK_FLOW__LINKS);
			childrenFeatures.add(WfwpsPackage.Literals.WORK_FLOW__REMOTE_DATA);
			childrenFeatures.add(WfwpsPackage.Literals.WORK_FLOW__CONSTANTS);
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
	 * This returns WorkFlow.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/WorkFlow"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((WorkFlow)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_WorkFlow_type") :
			getString("_UI_WorkFlow_type") + " " + label;
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

		switch (notification.getFeatureID(WorkFlow.class)) {
			case WfwpsPackage.WORK_FLOW__INPUTS:
			case WfwpsPackage.WORK_FLOW__OUTPUTS:
			case WfwpsPackage.WORK_FLOW__WPS:
			case WfwpsPackage.WORK_FLOW__LINKS:
			case WfwpsPackage.WORK_FLOW__REMOTE_DATA:
			case WfwpsPackage.WORK_FLOW__CONSTANTS:
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
				(WfwpsPackage.Literals.WORK_FLOW__INPUTS,
				 WfwpsFactory.eINSTANCE.createInputWorkflow()));

		newChildDescriptors.add
			(createChildParameter
				(WfwpsPackage.Literals.WORK_FLOW__OUTPUTS,
				 WfwpsFactory.eINSTANCE.createOutputWorkflow()));

		newChildDescriptors.add
			(createChildParameter
				(WfwpsPackage.Literals.WORK_FLOW__WPS,
				 WfwpsFactory.eINSTANCE.createLocalWPSReference()));

		newChildDescriptors.add
			(createChildParameter
				(WfwpsPackage.Literals.WORK_FLOW__WPS,
				 WfwpsFactory.eINSTANCE.createRemoteWPSReference()));

		newChildDescriptors.add
			(createChildParameter
				(WfwpsPackage.Literals.WORK_FLOW__WPS,
				 WfwpsFactory.eINSTANCE.createWorkflowReference()));

		newChildDescriptors.add
			(createChildParameter
				(WfwpsPackage.Literals.WORK_FLOW__LINKS,
				 WfwpsFactory.eINSTANCE.createLink()));

		newChildDescriptors.add
			(createChildParameter
				(WfwpsPackage.Literals.WORK_FLOW__REMOTE_DATA,
				 WfwpsFactory.eINSTANCE.createWMS()));

		newChildDescriptors.add
			(createChildParameter
				(WfwpsPackage.Literals.WORK_FLOW__REMOTE_DATA,
				 WfwpsFactory.eINSTANCE.createWFS()));

		newChildDescriptors.add
			(createChildParameter
				(WfwpsPackage.Literals.WORK_FLOW__CONSTANTS,
				 WfwpsFactory.eINSTANCE.createIntegerConstant()));

		newChildDescriptors.add
			(createChildParameter
				(WfwpsPackage.Literals.WORK_FLOW__CONSTANTS,
				 WfwpsFactory.eINSTANCE.createDoubleConstant()));

		newChildDescriptors.add
			(createChildParameter
				(WfwpsPackage.Literals.WORK_FLOW__CONSTANTS,
				 WfwpsFactory.eINSTANCE.createStringConstant()));

		newChildDescriptors.add
			(createChildParameter
				(WfwpsPackage.Literals.WORK_FLOW__CONSTANTS,
				 WfwpsFactory.eINSTANCE.createBooleanConstant()));

		newChildDescriptors.add
			(createChildParameter
				(WfwpsPackage.Literals.WORK_FLOW__CONSTANTS,
				 WfwpsFactory.eINSTANCE.createGeometryConstant()));

		newChildDescriptors.add
			(createChildParameter
				(WfwpsPackage.Literals.WORK_FLOW__CONSTANTS,
				 WfwpsFactory.eINSTANCE.createRasterConstant()));
	}

}
