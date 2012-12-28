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
 * @version $Id: ComponentErrorModelPropertyItemProvider.java,v 1.1 2006-08-18 13:26:30 phf Exp $
 */
package edu.cmu.sei.aadl.errorannex.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import edu.cmu.sei.aadl.errorannex.ComponentErrorModelProperty;
import edu.cmu.sei.aadl.errorannex.ErrorannexFactory;
import edu.cmu.sei.aadl.errorannex.ErrorannexPackage;

/**
 * This is the item provider adapter for a {@link edu.cmu.sei.aadl.errorannex.ComponentErrorModelProperty} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentErrorModelPropertyItemProvider
	extends ErrorModelPropertyItemProvider
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
	public ComponentErrorModelPropertyItemProvider(AdapterFactory adapterFactory) {
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

			addPackageIdentifierPropertyDescriptor(object);
			addErrorModelTypeIdentifierPropertyDescriptor(object);
			addErrorModelImplementationIdentifierPropertyDescriptor(object);
			addErrorModelClassifierPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Package Identifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPackageIdentifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentErrorModelProperty_packageIdentifier_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentErrorModelProperty_packageIdentifier_feature", "_UI_ComponentErrorModelProperty_type"),
				 ErrorannexPackage.Literals.COMPONENT_ERROR_MODEL_PROPERTY__PACKAGE_IDENTIFIER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Error Model Type Identifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addErrorModelTypeIdentifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentErrorModelProperty_errorModelTypeIdentifier_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentErrorModelProperty_errorModelTypeIdentifier_feature", "_UI_ComponentErrorModelProperty_type"),
				 ErrorannexPackage.Literals.COMPONENT_ERROR_MODEL_PROPERTY__ERROR_MODEL_TYPE_IDENTIFIER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Error Model Implementation Identifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addErrorModelImplementationIdentifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentErrorModelProperty_errorModelImplementationIdentifier_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentErrorModelProperty_errorModelImplementationIdentifier_feature", "_UI_ComponentErrorModelProperty_type"),
				 ErrorannexPackage.Literals.COMPONENT_ERROR_MODEL_PROPERTY__ERROR_MODEL_IMPLEMENTATION_IDENTIFIER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Error Model Classifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addErrorModelClassifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentErrorModelProperty_errorModelClassifier_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentErrorModelProperty_errorModelClassifier_feature", "_UI_ComponentErrorModelProperty_type"),
				 ErrorannexPackage.Literals.COMPONENT_ERROR_MODEL_PROPERTY__ERROR_MODEL_CLASSIFIER,
				 true,
				 false,
				 false,
				 null,
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
	public Collection getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ErrorannexPackage.Literals.COMPONENT_ERROR_MODEL_PROPERTY__INPLACE_ERROR_MODEL_TYPE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ComponentErrorModelProperty.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ComponentErrorModelProperty"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((ComponentErrorModelProperty)object).getPackageIdentifier();
		return label == null || label.length() == 0 ?
			getString("_UI_ComponentErrorModelProperty_type") :
			getString("_UI_ComponentErrorModelProperty_type") + " " + label;
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

		switch (notification.getFeatureID(ComponentErrorModelProperty.class)) {
			case ErrorannexPackage.COMPONENT_ERROR_MODEL_PROPERTY__PACKAGE_IDENTIFIER:
			case ErrorannexPackage.COMPONENT_ERROR_MODEL_PROPERTY__ERROR_MODEL_TYPE_IDENTIFIER:
			case ErrorannexPackage.COMPONENT_ERROR_MODEL_PROPERTY__ERROR_MODEL_IMPLEMENTATION_IDENTIFIER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ErrorannexPackage.COMPONENT_ERROR_MODEL_PROPERTY__INPLACE_ERROR_MODEL_TYPE:
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
	protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ErrorannexPackage.Literals.COMPONENT_ERROR_MODEL_PROPERTY__INPLACE_ERROR_MODEL_TYPE,
				 ErrorannexFactory.eINSTANCE.createErrorModelType()));
	}

}
