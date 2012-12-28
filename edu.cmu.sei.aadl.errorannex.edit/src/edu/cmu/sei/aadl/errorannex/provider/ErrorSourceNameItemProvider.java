/**
 * <copyright>
 * Copyright (c) 2004-2005 Carnegie Mellon University and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   SEI - AADL Meta Model and EMF generated editor
 *
 * </copyright>
 *
 * @version $Id: ErrorSourceNameItemProvider.java,v 1.2 2007-05-28 06:18:17 relief Exp $
 */
package edu.cmu.sei.aadl.errorannex.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.osate.aadl2.provider.ElementItemProvider;

import edu.cmu.sei.aadl.errorannex.ErrorSourceName;
import edu.cmu.sei.aadl.errorannex.ErrorannexPackage;

/**
 * This is the item provider adapter for a {@link edu.cmu.sei.aadl.errorannex.ErrorSourceName} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ErrorSourceNameItemProvider
	extends ElementItemProvider
	implements	
		IEditingDomainItemProvider,	
		IStructuredItemContentProvider,	
		ITreeItemContentProvider,	
		IItemLabelProvider,	
		IItemPropertySource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2006 by Carnegie Mellon University, all rights reserved";

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorSourceNameItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addComponentNameOrFeatureNamePropertyDescriptor(object);
			addErrorStateOrPropagationNamePropertyDescriptor(object);
			addErrorStateOrPropagationPropertyDescriptor(object);
			addSubcomponentOrFeaturePropertyDescriptor(object);
			addSubcomponentNamePropertyDescriptor(object);
			addContextSubcomponentPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Component Name Or Feature Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComponentNameOrFeatureNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ErrorSourceName_componentNameOrFeatureName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ErrorSourceName_componentNameOrFeatureName_feature", "_UI_ErrorSourceName_type"),
				 ErrorannexPackage.Literals.ERROR_SOURCE_NAME__COMPONENT_NAME_OR_FEATURE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Error State Or Propagation Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addErrorStateOrPropagationNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ErrorSourceName_errorStateOrPropagationName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ErrorSourceName_errorStateOrPropagationName_feature", "_UI_ErrorSourceName_type"),
				 ErrorannexPackage.Literals.ERROR_SOURCE_NAME__ERROR_STATE_OR_PROPAGATION_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Error State Or Propagation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addErrorStateOrPropagationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ErrorSourceName_errorStateOrPropagation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ErrorSourceName_errorStateOrPropagation_feature", "_UI_ErrorSourceName_type"),
				 ErrorannexPackage.Literals.ERROR_SOURCE_NAME__ERROR_STATE_OR_PROPAGATION,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Subcomponent Or Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubcomponentOrFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ErrorSourceName_subcomponentOrFeature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ErrorSourceName_subcomponentOrFeature_feature", "_UI_ErrorSourceName_type"),
				 ErrorannexPackage.Literals.ERROR_SOURCE_NAME__SUBCOMPONENT_OR_FEATURE,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Subcomponent Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubcomponentNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ErrorSourceName_subcomponentName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ErrorSourceName_subcomponentName_feature", "_UI_ErrorSourceName_type"),
				 ErrorannexPackage.Literals.ERROR_SOURCE_NAME__SUBCOMPONENT_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Context Subcomponent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContextSubcomponentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ErrorSourceName_contextSubcomponent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ErrorSourceName_contextSubcomponent_feature", "_UI_ErrorSourceName_type"),
				 ErrorannexPackage.Literals.ERROR_SOURCE_NAME__CONTEXT_SUBCOMPONENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns ErrorSourceName.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ErrorSourceName"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((ErrorSourceName)object).getComponentNameOrFeatureName();
		return label == null || label.length() == 0 ?
			getString("_UI_ErrorSourceName_type") :
			getString("_UI_ErrorSourceName_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ErrorSourceName.class)) {
			case ErrorannexPackage.ERROR_SOURCE_NAME__COMPONENT_NAME_OR_FEATURE_NAME:
			case ErrorannexPackage.ERROR_SOURCE_NAME__ERROR_STATE_OR_PROPAGATION_NAME:
			case ErrorannexPackage.ERROR_SOURCE_NAME__SUBCOMPONENT_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return ErrorannexEditPlugin.INSTANCE;
	}

}
