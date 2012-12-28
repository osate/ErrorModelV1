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
 * @version $Id: ErrorannexItemProviderAdapterFactory.java,v 1.1 2006-08-18 13:26:30 phf Exp $
 */
package edu.cmu.sei.aadl.errorannex.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import edu.cmu.sei.aadl.errorannex.util.ErrorannexAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ErrorannexItemProviderAdapterFactory extends ErrorannexAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2006 by Carnegie Mellon University, all rights reserved";

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
	protected Collection supportedTypes = new ArrayList();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorannexItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.cmu.sei.aadl.errorannex.ErrorModelType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorModelTypeItemProvider errorModelTypeItemProvider;

	/**
	 * This creates an adapter for a {@link edu.cmu.sei.aadl.errorannex.ErrorModelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createErrorModelTypeAdapter() {
		if (errorModelTypeItemProvider == null) {
			errorModelTypeItemProvider = new ErrorModelTypeItemProvider(this);
		}

		return errorModelTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.cmu.sei.aadl.errorannex.ErrorEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorEventItemProvider errorEventItemProvider;

	/**
	 * This creates an adapter for a {@link edu.cmu.sei.aadl.errorannex.ErrorEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createErrorEventAdapter() {
		if (errorEventItemProvider == null) {
			errorEventItemProvider = new ErrorEventItemProvider(this);
		}

		return errorEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.cmu.sei.aadl.errorannex.ErrorState} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorStateItemProvider errorStateItemProvider;

	/**
	 * This creates an adapter for a {@link edu.cmu.sei.aadl.errorannex.ErrorState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createErrorStateAdapter() {
		if (errorStateItemProvider == null) {
			errorStateItemProvider = new ErrorStateItemProvider(this);
		}

		return errorStateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.cmu.sei.aadl.errorannex.ErrorPropagation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorPropagationItemProvider errorPropagationItemProvider;

	/**
	 * This creates an adapter for a {@link edu.cmu.sei.aadl.errorannex.ErrorPropagation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createErrorPropagationAdapter() {
		if (errorPropagationItemProvider == null) {
			errorPropagationItemProvider = new ErrorPropagationItemProvider(this);
		}

		return errorPropagationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.cmu.sei.aadl.errorannex.ErrorModelImplementation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorModelImplementationItemProvider errorModelImplementationItemProvider;

	/**
	 * This creates an adapter for a {@link edu.cmu.sei.aadl.errorannex.ErrorModelImplementation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createErrorModelImplementationAdapter() {
		if (errorModelImplementationItemProvider == null) {
			errorModelImplementationItemProvider = new ErrorModelImplementationItemProvider(this);
		}

		return errorModelImplementationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.cmu.sei.aadl.errorannex.ErrorTransition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorTransitionItemProvider errorTransitionItemProvider;

	/**
	 * This creates an adapter for a {@link edu.cmu.sei.aadl.errorannex.ErrorTransition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createErrorTransitionAdapter() {
		if (errorTransitionItemProvider == null) {
			errorTransitionItemProvider = new ErrorTransitionItemProvider(this);
		}

		return errorTransitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.cmu.sei.aadl.errorannex.BooleanErrorExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanErrorExpressionItemProvider booleanErrorExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link edu.cmu.sei.aadl.errorannex.BooleanErrorExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createBooleanErrorExpressionAdapter() {
		if (booleanErrorExpressionItemProvider == null) {
			booleanErrorExpressionItemProvider = new BooleanErrorExpressionItemProvider(this);
		}

		return booleanErrorExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.cmu.sei.aadl.errorannex.ErrorAnnexLibrary} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorAnnexLibraryItemProvider errorAnnexLibraryItemProvider;

	/**
	 * This creates an adapter for a {@link edu.cmu.sei.aadl.errorannex.ErrorAnnexLibrary}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createErrorAnnexLibraryAdapter() {
		if (errorAnnexLibraryItemProvider == null) {
			errorAnnexLibraryItemProvider = new ErrorAnnexLibraryItemProvider(this);
		}

		return errorAnnexLibraryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.cmu.sei.aadl.errorannex.ErrorAnnexSubClause} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorAnnexSubClauseItemProvider errorAnnexSubClauseItemProvider;

	/**
	 * This creates an adapter for a {@link edu.cmu.sei.aadl.errorannex.ErrorAnnexSubClause}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createErrorAnnexSubClauseAdapter() {
		if (errorAnnexSubClauseItemProvider == null) {
			errorAnnexSubClauseItemProvider = new ErrorAnnexSubClauseItemProvider(this);
		}

		return errorAnnexSubClauseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.cmu.sei.aadl.errorannex.ErrorPropagationRule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorPropagationRuleItemProvider errorPropagationRuleItemProvider;

	/**
	 * This creates an adapter for a {@link edu.cmu.sei.aadl.errorannex.ErrorPropagationRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createErrorPropagationRuleAdapter() {
		if (errorPropagationRuleItemProvider == null) {
			errorPropagationRuleItemProvider = new ErrorPropagationRuleItemProvider(this);
		}

		return errorPropagationRuleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.cmu.sei.aadl.errorannex.OccurrenceProperty} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OccurrencePropertyItemProvider occurrencePropertyItemProvider;

	/**
	 * This creates an adapter for a {@link edu.cmu.sei.aadl.errorannex.OccurrenceProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createOccurrencePropertyAdapter() {
		if (occurrencePropertyItemProvider == null) {
			occurrencePropertyItemProvider = new OccurrencePropertyItemProvider(this);
		}

		return occurrencePropertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.cmu.sei.aadl.errorannex.ComponentErrorModelProperty} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentErrorModelPropertyItemProvider componentErrorModelPropertyItemProvider;

	/**
	 * This creates an adapter for a {@link edu.cmu.sei.aadl.errorannex.ComponentErrorModelProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createComponentErrorModelPropertyAdapter() {
		if (componentErrorModelPropertyItemProvider == null) {
			componentErrorModelPropertyItemProvider = new ComponentErrorModelPropertyItemProvider(this);
		}

		return componentErrorModelPropertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.cmu.sei.aadl.errorannex.ReportErrorProperty} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReportErrorPropertyItemProvider reportErrorPropertyItemProvider;

	/**
	 * This creates an adapter for a {@link edu.cmu.sei.aadl.errorannex.ReportErrorProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createReportErrorPropertyAdapter() {
		if (reportErrorPropertyItemProvider == null) {
			reportErrorPropertyItemProvider = new ReportErrorPropertyItemProvider(this);
		}

		return reportErrorPropertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.cmu.sei.aadl.errorannex.InErrorPropagationGuard} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InErrorPropagationGuardItemProvider inErrorPropagationGuardItemProvider;

	/**
	 * This creates an adapter for a {@link edu.cmu.sei.aadl.errorannex.InErrorPropagationGuard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createInErrorPropagationGuardAdapter() {
		if (inErrorPropagationGuardItemProvider == null) {
			inErrorPropagationGuardItemProvider = new InErrorPropagationGuardItemProvider(this);
		}

		return inErrorPropagationGuardItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.cmu.sei.aadl.errorannex.PortEventGuard} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortEventGuardItemProvider portEventGuardItemProvider;

	/**
	 * This creates an adapter for a {@link edu.cmu.sei.aadl.errorannex.PortEventGuard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createPortEventGuardAdapter() {
		if (portEventGuardItemProvider == null) {
			portEventGuardItemProvider = new PortEventGuardItemProvider(this);
		}

		return portEventGuardItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.cmu.sei.aadl.errorannex.ErrorSourceName} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorSourceNameItemProvider errorSourceNameItemProvider;

	/**
	 * This creates an adapter for a {@link edu.cmu.sei.aadl.errorannex.ErrorSourceName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createErrorSourceNameAdapter() {
		if (errorSourceNameItemProvider == null) {
			errorSourceNameItemProvider = new ErrorSourceNameItemProvider(this);
		}

		return errorSourceNameItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.cmu.sei.aadl.errorannex.DerivedErrorStateMappingGuard} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DerivedErrorStateMappingGuardItemProvider derivedErrorStateMappingGuardItemProvider;

	/**
	 * This creates an adapter for a {@link edu.cmu.sei.aadl.errorannex.DerivedErrorStateMappingGuard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createDerivedErrorStateMappingGuardAdapter() {
		if (derivedErrorStateMappingGuardItemProvider == null) {
			derivedErrorStateMappingGuardItemProvider = new DerivedErrorStateMappingGuardItemProvider(this);
		}

		return derivedErrorStateMappingGuardItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.cmu.sei.aadl.errorannex.ErrorStateMappingRule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorStateMappingRuleItemProvider errorStateMappingRuleItemProvider;

	/**
	 * This creates an adapter for a {@link edu.cmu.sei.aadl.errorannex.ErrorStateMappingRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createErrorStateMappingRuleAdapter() {
		if (errorStateMappingRuleItemProvider == null) {
			errorStateMappingRuleItemProvider = new ErrorStateMappingRuleItemProvider(this);
		}

		return errorStateMappingRuleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.cmu.sei.aadl.errorannex.ErrorTransitions} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorTransitionsItemProvider errorTransitionsItemProvider;

	/**
	 * This creates an adapter for a {@link edu.cmu.sei.aadl.errorannex.ErrorTransitions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createErrorTransitionsAdapter() {
		if (errorTransitionsItemProvider == null) {
			errorTransitionsItemProvider = new ErrorTransitionsItemProvider(this);
		}

		return errorTransitionsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.cmu.sei.aadl.errorannex.ErrorProperties} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorPropertiesItemProvider errorPropertiesItemProvider;

	/**
	 * This creates an adapter for a {@link edu.cmu.sei.aadl.errorannex.ErrorProperties}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createErrorPropertiesAdapter() {
		if (errorPropertiesItemProvider == null) {
			errorPropertiesItemProvider = new ErrorPropertiesItemProvider(this);
		}

		return errorPropertiesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.cmu.sei.aadl.errorannex.ModelHierarchyProperty} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelHierarchyPropertyItemProvider modelHierarchyPropertyItemProvider;

	/**
	 * This creates an adapter for a {@link edu.cmu.sei.aadl.errorannex.ModelHierarchyProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createModelHierarchyPropertyAdapter() {
		if (modelHierarchyPropertyItemProvider == null) {
			modelHierarchyPropertyItemProvider = new ModelHierarchyPropertyItemProvider(this);
		}

		return modelHierarchyPropertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.cmu.sei.aadl.errorannex.ModeTransitionGuard} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModeTransitionGuardItemProvider modeTransitionGuardItemProvider;

	/**
	 * This creates an adapter for a {@link edu.cmu.sei.aadl.errorannex.ModeTransitionGuard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createModeTransitionGuardAdapter() {
		if (modeTransitionGuardItemProvider == null) {
			modeTransitionGuardItemProvider = new ModeTransitionGuardItemProvider(this);
		}

		return modeTransitionGuardItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.cmu.sei.aadl.errorannex.OutErrorPropagationGuard} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutErrorPropagationGuardItemProvider outErrorPropagationGuardItemProvider;

	/**
	 * This creates an adapter for a {@link edu.cmu.sei.aadl.errorannex.OutErrorPropagationGuard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createOutErrorPropagationGuardAdapter() {
		if (outErrorPropagationGuardItemProvider == null) {
			outErrorPropagationGuardItemProvider = new OutErrorPropagationGuardItemProvider(this);
		}

		return outErrorPropagationGuardItemProvider;
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
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class) || (((Class)type).isInstance(adapter))) {
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

}
