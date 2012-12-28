package edu.cmu.sei.aadl.errorannex.util;

import java.util.Iterator;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.uml.internal.impl.ComponentImpl;
import org.osate.aadl2.AadlPackage;
import org.osate.aadl2.ComponentClassifier;
import org.osate.aadl2.ComponentImplementation;
import org.osate.aadl2.Connection;
import org.osate.aadl2.Element;
import org.osate.aadl2.EventPort;
import org.osate.aadl2.Feature;
import org.osate.aadl2.NamedElement;
import org.osate.aadl2.PackageSection;
import org.osate.aadl2.PublicPackageSection;
import org.osate.aadl2.Subcomponent;
import org.osate.aadl2.instance.ComponentInstance;
import org.osate.aadl2.instance.ConnectionInstance;
import org.osate.aadl2.instance.ConnectionReference;
import org.osate.aadl2.instance.FeatureInstance;
import org.osate.aadl2.instance.SystemInstance;

import edu.cmu.sei.aadl.errorannex.ComponentErrorModelProperty;
import edu.cmu.sei.aadl.errorannex.DerivedErrorStateMappingGuard;
import edu.cmu.sei.aadl.errorannex.ErrorAnnexLibrary;
import edu.cmu.sei.aadl.errorannex.ErrorAnnexSubClause;
import edu.cmu.sei.aadl.errorannex.ErrorEventOrPropagation;
import edu.cmu.sei.aadl.errorannex.ErrorModelClassifier;
import edu.cmu.sei.aadl.errorannex.ErrorModelProperty;
import edu.cmu.sei.aadl.errorannex.ErrorannexPackage;
import edu.cmu.sei.aadl.errorannex.InErrorPropagationGuard;
import edu.cmu.sei.aadl.errorannex.ModeTransitionGuard;
import edu.cmu.sei.aadl.errorannex.ModelHierarchyProperty;
import edu.cmu.sei.aadl.errorannex.OccurrenceProperty;
import edu.cmu.sei.aadl.errorannex.OutErrorPropagationGuard;
import edu.cmu.sei.aadl.errorannex.PortEventGuard;
import edu.cmu.sei.aadl.errorannex.ReportErrorProperty;

public class EAXUtil {


	/**
	 * Get error annex subclause for a given component classifier
	 * @param cc Component Classifier
	 * @return ErrorAnnexSubClause
	 */
	public ErrorAnnexSubClause getErrorAnnexSubclause(ComponentClassifier cc){
		EList annexsubclauselist = cc.getOwnedAnnexSubclauses();
		for (Iterator it = annexsubclauselist.iterator(); it.hasNext();){
			Object next = it.next();
			if (next instanceof ErrorAnnexSubClause){
				return (ErrorAnnexSubClause)next;
			}
		}
		return null;
	}
	
//	/**
//	 * find error annex library for given package
//	 * @param aadlpackagename String package name
//	 * @return ErrorAnnexLibrary
//	 */
//	public ErrorAnnexLibrary getErrorAnnexLibrary(String aadlpackagename){
//		AadlPackage pkg = PropertiesLinkingService.findAadlPackage(aadlpackagename);
//		PublicPackageSection root = pkg.getOwnedPublicSection();
//		return getErrorAnnexLibrary(root);
//	}
		
	/**
	 * find the error annex library in an AadlSpec or PackageSection
	 * @param root Element AadlSpec, AadlPackage or PackageSection
	 * @return ErrorAnnexLibrary
	 */
	public ErrorAnnexLibrary getErrorAnnexLibrary(Element root){
		EList annexsubclauselist = null;
		if (root instanceof PackageSection){ 
			annexsubclauselist = ((PackageSection)root).getOwnedAnnexLibraries();
		}
		if (root instanceof AadlPackage){
			PublicPackageSection ps = ((AadlPackage)root).getOwnedPublicSection();
			if (ps != null){
				annexsubclauselist = ps.getOwnedAnnexLibraries();
			}
		}
		if (annexsubclauselist == null) return null;
		for (Iterator it = annexsubclauselist.iterator(); it.hasNext();){
			Object next = it.next();
			if (next instanceof ErrorAnnexLibrary){
				return (ErrorAnnexLibrary)next;
			}
		}
		return null;
	}
	
	/*****************
	 * Methods for retrieval of MODEL property and its value, i.e., the error model associated with a component or connection instance.
	 * Retrieval from the instance model takes into account the applies to clause of error model properties.
	 * Also methods to retrieve them from the declarative model. Those methods do not take into account the applies to
	 */

	
	protected EClass CEMPClass = ErrorannexPackage.eINSTANCE.getComponentErrorModelProperty();


	/**
	 * get the ComponentErrorModelProperty associated with a component instance
	 * This method takes into account Model declarations with applies to in enclosing components
	 * @param ci ComponentInstance
	 * @return ComponentErrorModelProperty
	 */
	public ComponentErrorModelProperty getComponentErrorModelProperty(ComponentInstance ci){
		ErrorModelProperty occ =  getErrorModelProperty(CEMPClass, ci,null, null);
		return (ComponentErrorModelProperty)occ;
	}
	

	/**
	 * get the ComponentErrorModelProperty associated with a component instance
	 * This method takes into account Model declarations with applies to in enclosing components
	 * @param ci ComponentInstance
	 * @return ComponentErrorModelProperty
	 */
	public ComponentErrorModelProperty getComponentErrorModelProperty(ConnectionInstance conni){
		ErrorModelProperty occ =  getErrorModelProperty(CEMPClass, conni,null, null);
		return (ComponentErrorModelProperty)occ;
	}

	
	/**
	 * get the ComponentErrorModelProperty associated with a component classifier
	 * The ComponentErrorModelProperty is assumed to be declared in the component, not via applies to
	 * @param cc Component classifier
	 * @return ComponentErrorModelProperty
	 */
	public ComponentErrorModelProperty getComponentErrorModelProperty( ComponentClassifier cc ){
		ErrorModelProperty occ = getErrorModelProperty(CEMPClass,cc, null, null);
		return (ComponentErrorModelProperty)occ;
	}


	/**
	 * get the ComponentErrorModelProperty associated with a subcomponent
	 * The ComponentErrorModelProperty is assumed to be declared in the component classifier of the subcomponent
	 * or in the component classifier (impl or type) that contains the subcomponent. 
	 * In the latter case the applies to in the enclosing component classifier names that subcomponent
	 * Applies to higher in the component hierarchy are not considered
	 * @param sub subcomponent
	 * @return ComponentErrorModelProperty
	 */
	public ComponentErrorModelProperty getComponentErrorModelProperty(Subcomponent sub){
		return (ComponentErrorModelProperty)getErrorModelProperty(CEMPClass,sub,null, null);
	}

	/**
	 * get the ComponentErrorModelProperty associated with a Connection
	 * The ComponentErrorModelProperty is assumed to be declared in the component that contains the connection
	 * @param conn Connection
	 * @return ComponentErrorModelProperty
	 */
	public ComponentErrorModelProperty getComponentErrorModelProperty(Connection conn){
		return (ComponentErrorModelProperty)getErrorModelProperty(CEMPClass,conn,null, null);
	}


	/**
	 * get the Model associated with a component instance
	 * This method takes into account Model declarations with applies to in enclosing components
	 * @param instance component instance or system instance
	 * @return ErrorModelClassifier
	 */
	public ErrorModelClassifier getComponentErrorModelPropertyValue(ComponentInstance ci){
		ComponentErrorModelProperty cemp = getComponentErrorModelProperty(ci);
		if (cemp != null) return cemp.getErrorModelClassifier(); else return null;
	}
	
	/**
	 * get the Model associated with a connection instance
	 * This method takes into account Model declarations with applies to in enclosing components
	 * @param conni the connectioninstance for which the error model is to be retrieved
	 * @return ErrorModelClassifier
	 */
	public ErrorModelClassifier getComponentErrorModelPropertyValue(ConnectionInstance conni){
		ComponentErrorModelProperty cemp = getComponentErrorModelProperty(conni);
		if (cemp != null) return cemp.getErrorModelClassifier(); else return null;
	}


	
	/**
	 * get the Model associated with a component classifier
	 * The Model property is assumed to be declared in the com ponent, not via applies sto
	 * @param cc Component classifier
	 * @return ErrorModelClassifier
	 */
	public ErrorModelClassifier getComponentErrorModelPropertyValue(ComponentClassifier cc){
		ComponentErrorModelProperty cemp = getComponentErrorModelProperty(cc);
		if (cemp != null) return cemp.getErrorModelClassifier(); else return null;
	}
	
	/**
	 * get the Model associated with a subcomponent
	 * The Model is assumed to be declared in the component classifier of the subcomponent
	 * or in the component classifier (impl or type) that contains the subcomponent. 
	 * In the latter case the applies to in the enclosing component classifier names that subcomponent
	 * Applies to higher in the component hierarchy are not considered
	 * @param sub subcomponent
	 * @return ErrorModelClassifier
	 */
	public ErrorModelClassifier getComponentErrorModelPropertyValue(Subcomponent sub){
		ComponentErrorModelProperty cemp = getComponentErrorModelProperty(sub);
		if (cemp != null) return cemp.getErrorModelClassifier(); else return null;
	}
	
	/**
	 * get the Model associated with a Connection
	 * The Model is assumed to be declared in the component that contains the connection
	 * @param conn Connection
	 * @return ErrorModelClassifier
	 */
	public ErrorModelClassifier getComponentErrorModelPropertyValue(Connection conn){
		ComponentErrorModelProperty cemp = getComponentErrorModelProperty(conn);
		if (cemp != null) return cemp.getErrorModelClassifier(); else return null;
	}
	
	
	/************************
	 * Methods for retrieval of the Occurrence property
	 * Retrieval from the instance model takes into account the applies to clause of error model properties.
	 * Also methods to retrieve them from the declarative model. Those methods do not take into account the applies to
	 */


	/**
	 * get the Occurrence of an error event or propagation associated with a component instance
	 * @param ci ComponentInstance
	 * @param emf Error Model Feature (propagation or event)
	 * @return OccurrenceProperty
	 */
	protected EClass OPClass = ErrorannexPackage.eINSTANCE.getOccurrenceProperty();


	/**
	 * get the OccurrenceProperty associated with a component instance
	 * This method takes into account OccurrenceProperty declarations with applies to in enclosing components
	 * @param ci ComponentInstance
	 * @param emf Error Model Feature (propagation or event)
	 * @return OccurrenceProperty
	 */
	public OccurrenceProperty getOccurrenceProperty(ComponentInstance ci, ErrorEventOrPropagation feature){
		ErrorModelClassifier emc = getComponentErrorModelPropertyValue(ci);
		OccurrenceProperty res = emc.getOccurrenceProperty(feature);
		ErrorModelProperty occ =  getErrorModelProperty(OPClass, ci,feature, null);
		return occ==null?res:(OccurrenceProperty)occ;
	}


	/**
	 * get the OccurrenceProperty associated with a component instance
	 * This method takes into account OccurrenceProperty declarations with applies to in enclosing components
	 * @param ci ComponentInstance
	 * @param emf Error Model Feature (propagation or event)
	 * @return OccurrenceProperty
	 */
	public OccurrenceProperty getOccurrenceProperty(ConnectionInstance conni, ErrorEventOrPropagation feature){
		ErrorModelClassifier emc = getComponentErrorModelPropertyValue(conni);
		OccurrenceProperty res = emc.getOccurrenceProperty(feature);
		ErrorModelProperty occ =  getErrorModelProperty(OPClass, conni,feature, null);
		return occ==null?res:(OccurrenceProperty)occ;
	}


	/**
	 * get the OccurrenceProperty associated with a component classifier
	 * The OccurrenceProperty is assumed to be declared in the component, not via applies to
	 * @param cc Component classifier
	 * @param emf Error Model Feature (propagation or event)
	 * @return OccurrenceProperty
	 */
	public OccurrenceProperty getOccurrenceProperty( ComponentClassifier cc, ErrorEventOrPropagation feature ){
		ErrorModelClassifier emc = getComponentErrorModelPropertyValue(cc);
		OccurrenceProperty res = emc.getOccurrenceProperty(feature);
		ErrorModelProperty occ = getErrorModelProperty(OPClass,cc, feature, null);
		return occ==null?res:(OccurrenceProperty)occ;
	}


	/**
	 * get the OccurrenceProperty associated with a subcomponent
	 * The OccurrenceProperty is assumed to be declared in the component classifier of the subcomponent
	 * or in the component classifier (impl or type) that contains the subcomponent. 
	 * In the latter case the applies to in the enclosing component classifier names that subcomponent
	 * Applies to higher in the component hierarchy are not considered
	 * @param sub subcomponent
	 * @param emf Error Model Feature (propagation or event)
	 * @return OccurrenceProperty
	 */
	public OccurrenceProperty getOccurrenceProperty(Subcomponent sub, ErrorEventOrPropagation feature){
		ErrorModelClassifier emc = getComponentErrorModelPropertyValue(sub);
		OccurrenceProperty res = emc.getOccurrenceProperty(feature);
		ErrorModelProperty occ =   (OccurrenceProperty)getErrorModelProperty(OPClass,sub,feature, null);
		return occ==null?res:(OccurrenceProperty)occ;
	}

	/**
	 * get the OccurrenceProperty associated with a Connection
	 * The OccurrenceProperty is assumed to be declared in the component that contains the connection
	 * The applies to of that declaration must name the connection
	 * @param conn Connection
	 * @param emf Error Model Feature (propagation or event)
	 * @return OccurrenceProperty
	 */
	public OccurrenceProperty getOccurrenceProperty(Connection conn, ErrorEventOrPropagation feature){
		ErrorModelClassifier emc = getComponentErrorModelPropertyValue(conn);
		OccurrenceProperty res = emc.getOccurrenceProperty(feature);
		ErrorModelProperty occ =   (OccurrenceProperty)getErrorModelProperty(OPClass,conn,feature, null);
		return occ==null?res:(OccurrenceProperty)occ;
	}

	
	/************************
	 * Methods for retrieval of the ReportError property
	 * Retrieval from the instance model takes into account the applies to clause of error model properties.
	 * Also methods to retrieve them from the declarative model. Those methods do not take into account the applies to
	 */

	
	protected EClass REPClass = ErrorannexPackage.eINSTANCE.getReportErrorProperty();


	/**
	 * get the ReportErrorProperty associated with a component instance
	 * This method takes into account ReportErrorProperty declarations with applies to in enclosing components
	 * @param ci ComponentInstance
	 * @return ReportErrorProperty
	 */
	public ReportErrorProperty getReportErrorProperty(ComponentInstance ci){
		ErrorModelProperty occ =  getErrorModelProperty(REPClass, ci,null, null);
		return (ReportErrorProperty)occ;
	}
	

	/**
	 * get the ReportErrorProperty associated with a component instance
	 * This method takes into account ReportErrorProperty declarations with applies to in enclosing components
	 * @param ci ComponentInstance
	 * @return ReportErrorProperty
	 */
	public ReportErrorProperty getReportErrorProperty(ConnectionInstance conni){
		ErrorModelProperty occ =  getErrorModelProperty(REPClass, conni,null, null);
		return (ReportErrorProperty)occ;
	}

	
	/**
	 * get the ReportErrorProperty associated with a component classifier
	 * The ReportErrorProperty is assumed to be declared in the component, not via applies to
	 * @param cc Component classifier
	 * @return ReportErrorProperty
	 */
	public ReportErrorProperty getReportErrorProperty( ComponentClassifier cc ){
		ErrorModelProperty occ = getErrorModelProperty(REPClass,cc, null, null);
		return (ReportErrorProperty)occ;
	}


	/**
	 * get the ReportErrorProperty associated with a subcomponent
	 * The ReportErrorProperty is assumed to be declared in the component classifier of the subcomponent
	 * or in the component classifier (impl or type) that contains the subcomponent. 
	 * In the latter case the applies to in the enclosing component classifier names that subcomponent
	 * Applies to higher in the component hierarchy are not considered
	 * @param sub subcomponent
	 * @return ReportErrorProperty
	 */
	public ReportErrorProperty getReportErrorProperty(Subcomponent sub){
		return (ReportErrorProperty)getErrorModelProperty(REPClass,sub,null, null);
	}

	/**
	 * get the ReportErrorProperty associated with a Connection
	 * The ReportErrorProperty is assumed to be declared in the component that contains the connection
	 * The applies to of that declaration must name the connection
	 * @param conn Connection
	 * @return ReportErrorProperty
	 */
	public ReportErrorProperty getReportErrorProperty(Connection conn){
		return (ReportErrorProperty)getErrorModelProperty(REPClass,conn,null, null);
	}


	
	/************************
	 * Methods for retrieval of the ModelHierarchy property
	 * Retrieval from the instance model takes into account the applies to clause of error model properties.
	 * Also methods to retrieve them from the declarative model. Those methods do not take into account the applies to
	 */

	
	protected EClass MHPClass = ErrorannexPackage.eINSTANCE.getModelHierarchyProperty();


	/**
	 * get the ModelHierarchyProperty associated with a component instance
	 * This method takes into account ModelHierarchyProperty declarations with applies to in enclosing components
	 * @param ci ComponentInstance
	 * @return ModelHierarchyProperty
	 */
	public ModelHierarchyProperty getModelHierarchyProperty(ComponentInstance ci){
		ErrorModelProperty occ =  getErrorModelProperty(MHPClass, ci,null, null);
		return (ModelHierarchyProperty)occ;
	}
	

	/**
	 * get the ModelHierarchyProperty associated with a component instance
	 * This method takes into account ModelHierarchyProperty declarations with applies to in enclosing components
	 * @param ci ComponentInstance
	 * @return ModelHierarchyProperty
	 */
	public ModelHierarchyProperty getModelHierarchyProperty(ConnectionInstance conni){
		ErrorModelProperty occ =  getErrorModelProperty(MHPClass, conni,null, null);
		return (ModelHierarchyProperty)occ;
	}

	
	/**
	 * get the ModelHierarchyProperty associated with a component classifier
	 * The ModelHierarchyProperty is assumed to be declared in the component, not via applies to
	 * @param cc Component classifier
	 * @return ModelHierarchyProperty
	 */
	public ModelHierarchyProperty getModelHierarchyProperty( ComponentClassifier cc ){
		ErrorModelProperty occ = getErrorModelProperty(MHPClass,cc, null, null);
		return (ModelHierarchyProperty)occ;
	}


	/**
	 * get the ModelHierarchyProperty associated with a subcomponent
	 * The ModelHierarchyProperty is assumed to be declared in the component classifier of the subcomponent
	 * or in the component classifier (impl or type) that contains the subcomponent. 
	 * In the latter case the applies to in the enclosing component classifier names that subcomponent
	 * Applies to higher in the component hierarchy are not considered
	 * @param sub subcomponent
	 * @return ModelHierarchyProperty
	 */
	public ModelHierarchyProperty getModelHierarchyProperty(Subcomponent sub){
		return (ModelHierarchyProperty)getErrorModelProperty(MHPClass,sub,null, null);
	}

	/**
	 * get the ModelHierarchyProperty associated with a Connection
	 * The ModelHierarchyProperty is assumed to be declared in the component that contains the connection
	 * The applies to of that declaration must name the connection
	 * @param conn Connection
	 * @return ModelHierarchyProperty
	 */
	public ModelHierarchyProperty getModelHierarchyProperty(Connection conn){
		return (ModelHierarchyProperty)getErrorModelProperty(MHPClass,conn,null, null);
	}


	
	/************************
	 * Methods for retrieval of the DerivedErrorStateMappingGuard
	 * Retrieval from the instance model takes into account the applies to clause of error model properties.
	 * Also methods to retrieve them from the declarative model. Those methods do not take into account the applies to
	 */

	
	protected EClass DESMGClass = ErrorannexPackage.eINSTANCE.getDerivedErrorStateMappingGuard();


	/**
	 * get the DerivedErrorStateMappingGuard associated with a component instance
	 * This method takes into account DerivedErrorStateMappingGuard declarations with applies to in enclosing components
	 * @param ci ComponentInstance
	 * @return DerivedErrorStateMappingGuard
	 */
	public DerivedErrorStateMappingGuard getDerivedErrorStateMappingGuard(ComponentInstance ci){
		ErrorModelProperty occ =  getErrorModelProperty(DESMGClass, ci,null, null);
		return (DerivedErrorStateMappingGuard)occ;
	}
	

	/**
	 * get the DerivedErrorStateMappingGuard associated with a component instance
	 * This method takes into account DerivedErrorStateMappingGuard declarations with applies to in enclosing components
	 * @param ci ComponentInstance
	 * @return DerivedErrorStateMappingGuard
	 */
	public DerivedErrorStateMappingGuard getDerivedErrorStateMappingGuard(ConnectionInstance conni){
		ErrorModelProperty occ =  getErrorModelProperty(DESMGClass, conni,null, null);
		return (DerivedErrorStateMappingGuard)occ;
	}

	
	/**
	 * get the DerivedErrorStateMappingGuard associated with a component classifier
	 * The DerivedErrorStateMappingGuard is assumed to be declared in the component, not via applies to
	 * @param cc Component classifier
	 * @return DerivedErrorStateMappingGuard
	 */
	public DerivedErrorStateMappingGuard getDerivedErrorStateMappingGuard( ComponentClassifier cc ){
		ErrorModelProperty occ = getErrorModelProperty(DESMGClass,cc, null, null);
		return (DerivedErrorStateMappingGuard)occ;
	}


	/**
	 * get the DerivedErrorStateMappingGuard associated with a subcomponent
	 * The DerivedErrorStateMappingGuard is assumed to be declared in the component classifier of the subcomponent
	 * or in the component classifier (impl or type) that contains the subcomponent. 
	 * In the latter case the applies to in the enclosing component classifier names that subcomponent
	 * Applies to higher in the component hierarchy are not considered
	 * @param sub subcomponent
	 * @return DerivedErrorStateMappingGuard
	 */
	public DerivedErrorStateMappingGuard getDerivedErrorStateMappingGuard(Subcomponent sub){
		return (DerivedErrorStateMappingGuard)getErrorModelProperty(DESMGClass,sub,null, null);
	}

	/**
	 * get the DerivedErrorStateMappingGuard associated with a Connection
	 * The DerivedErrorStateMappingGuard is assumed to be declared in the component that contains the connection
	 * The applies to of that declaration must name the connection
	 * @param conn Connection
	 * @return DerivedErrorStateMappingGuard
	 */
	public DerivedErrorStateMappingGuard getDerivedErrorStateMappingGuard(Connection conn){
		return (DerivedErrorStateMappingGuard)getErrorModelProperty(DESMGClass,conn,null, null);
	}


	
	/************************
	 * Methods for retrieval of the PortEventGuard
	 * Retrieval from the instance model takes into account the applies to clause of error model properties.
	 * Also methods to retrieve them from the declarative model. Those methods do not take into account the applies to
	 */

	
	protected EClass PEGClass = ErrorannexPackage.eINSTANCE.getPortEventGuard();


	/**
	 * get the PortEventGuard associated with a component instance
	 * This method takes into account PortEventGuard declarations with applies to in enclosing components
	 * @param ci ComponentInstance
	 * @param feature Feature 
	 * @return PortEventGuard
	 */
	public PortEventGuard getPortEventGuard(ComponentInstance ci, EventPort feature){
		ErrorModelProperty occ =  getErrorModelProperty(PEGClass, ci,feature, null);
		return (PortEventGuard)occ;
	}
	

	/**
	 * get the PortEventGuard associated with a component instance
	 * This method takes into account PortEventGuard declarations with applies to in enclosing components
	 * @param epi FeatureInstance
	 * @return PortEventGuard
	 */
	public PortEventGuard getPortEventGuard(FeatureInstance epi){
		if (!(epi.getFeature() instanceof EventPort)) return null;
		ErrorModelProperty occ =  getErrorModelProperty(PEGClass, epi.getContainingComponentInstance(),epi.getFeature(), null);
		return (PortEventGuard)occ;
	}

	/**
	 * get the PortEventGuard associated with a component instance
	 * This method takes into account PortEventGuard declarations with applies to in enclosing components
	 * @param ci ComponentInstance
	 * @param feature Feature 
	 * @return PortEventGuard
	 */
	public PortEventGuard getPortEventGuard(ConnectionInstance conni, EventPort feature){
		ErrorModelProperty occ =  getErrorModelProperty(PEGClass, conni,feature, null);
		return (PortEventGuard)occ;
	}

	
	/**
	 * get the PortEventGuard associated with a component classifier
	 * The PortEventGuard is assumed to be declared in the component, not via applies to
	 * @param cc Component classifier
	 * @param feature Feature 
	 * @return PortEventGuard
	 */
	public PortEventGuard getPortEventGuard( ComponentClassifier cc, EventPort feature ){
		ErrorModelProperty occ = getErrorModelProperty(PEGClass,cc, feature, null);
		return (PortEventGuard)occ;
	}


	/**
	 * get the PortEventGuard associated with a subcomponent
	 * The PortEventGuard is assumed to be declared in the component classifier of the subcomponent
	 * or in the component classifier (impl or type) that contains the subcomponent. 
	 * In the latter case the applies to in the enclosing component classifier names that subcomponent
	 * Applies to higher in the component hierarchy are not considered
	 * @param sub subcomponent
	 * @param feature Feature 
	 * @return PortEventGuard
	 */
	public PortEventGuard getPortEventGuard(Subcomponent sub, EventPort feature){
		return (PortEventGuard)getErrorModelProperty(PEGClass,sub,feature, null);
	}

	/**
	 * get the PortEventGuard associated with a Connection
	 * The PortEventGuard is assumed to be declared in the component that contains the connection
	 * The applies to of that declaration must name the connection
	 * @param conn Connection
	 * @param feature Feature 
	 * @return PortEventGuard
	 */
	public PortEventGuard getPortEventGuard(Connection conn, EventPort feature){
		return (PortEventGuard)getErrorModelProperty(PEGClass,conn,feature, null);
	}


	
	/************************
	 * Methods for retrieval of the OutErrorPropagationGuard
	 * Retrieval from the instance model takes into account the applies to clause of error model properties.
	 * Also methods to retrieve them from the declarative model. Those methods do not take into account the applies to
	 */

	
	protected EClass OEPGClass = ErrorannexPackage.eINSTANCE.getOutErrorPropagationGuard();


	/**
	 * get the OutErrorPropagationGuard associated with a component instance
	 * This method takes into account OutErrorPropagationGuard declarations with applies to in enclosing components
	 * @param ci ComponentInstance
	 * @param feature Feature 
	 * @return OutErrorPropagationGuard
	 */
	public OutErrorPropagationGuard getOutErrorPropagationGuard(ComponentInstance ci, Feature feature){
		ErrorModelProperty occ =  getErrorModelProperty(OEPGClass, ci,feature, null);
		return (OutErrorPropagationGuard)occ;
	}
	

	/**
	 * get the OutErrorPropagationGuard associated with a feature instance
	 * This method takes into account OutErrorPropagationGuard declarations with applies to in enclosing components
	 * @param fi FeatureInstance
 * @param feature Feature 
	 * @return OutErrorPropagationGuard
	 */
	public OutErrorPropagationGuard getOutErrorPropagationGuard(FeatureInstance fi){
		ErrorModelProperty occ =  getOutErrorPropagationGuard( fi.getContainingComponentInstance(),fi.getFeature());
		return (OutErrorPropagationGuard)occ;
	}

	/**
	 * get the OutErrorPropagationGuard associated with a component instance
	 * This method takes into account OutErrorPropagationGuard declarations with applies to in enclosing components
	 * @param ci ComponentInstance
	 * @param feature Feature 
	 * @return OutErrorPropagationGuard
	 */
	public OutErrorPropagationGuard getOutErrorPropagationGuard(ConnectionInstance conni, Feature feature){
		ErrorModelProperty occ =  getErrorModelProperty(OEPGClass, conni,feature, null);
		return (OutErrorPropagationGuard)occ;
	}

	
	/**
	 * get the OutErrorPropagationGuard associated with a component classifier
	 * The OutErrorPropagationGuard is assumed to be declared in the component, not via applies to
	 * @param cc Component classifier
	 * @param feature Feature 
	 * @return OutErrorPropagationGuard
	 */
	public OutErrorPropagationGuard getOutErrorPropagationGuard( ComponentClassifier cc, Feature feature ){
		ErrorModelProperty occ = getErrorModelProperty(OEPGClass,cc, feature, null);
		return (OutErrorPropagationGuard)occ;
	}


	/**
	 * get the OutErrorPropagationGuard associated with a subcomponent
	 * The OutErrorPropagationGuard is assumed to be declared in the component classifier of the subcomponent
	 * or in the component classifier (impl or type) that contains the subcomponent. 
	 * In the latter case the applies to in the enclosing component classifier names that subcomponent
	 * Applies to higher in the component hierarchy are not considered
	 * @param sub subcomponent
	 * @param feature Feature 
	 * @return OutErrorPropagationGuard
	 */
	public OutErrorPropagationGuard getOutErrorPropagationGuard(Subcomponent sub, Feature feature){
		return (OutErrorPropagationGuard)getErrorModelProperty(OEPGClass,sub,feature, null);
	}

	/**
	 * get the OutErrorPropagationGuard associated with a Connection
	 * The OutErrorPropagationGuard is assumed to be declared in the component that contains the connection
	 * The applies to of that declaration must name the connection
	 * @param conn Connection
	 * @param feature Feature 
	 * @return OutErrorPropagationGuard
	 */
	public OutErrorPropagationGuard getOutErrorPropagationGuard(Connection conn, Feature feature){
		return (OutErrorPropagationGuard)getErrorModelProperty(OEPGClass,conn,feature, null);
	}

	
	/************************
	 * Methods for retrieval of the InErrorPropagationGuard
	 * Retrieval from the instance model takes into account the applies to clause of error model properties.
	 * Also methods to retrieve them from the declarative model. Those methods do not take into account the applies to
	 */

	
	protected EClass IEPGClass = ErrorannexPackage.eINSTANCE.getInErrorPropagationGuard();


	/**
	 * get the InErrorPropagationGuard associated with a component instance
	 * This method takes into account InErrorPropagationGuard declarations with applies to in enclosing components
	 * @param ci ComponentInstance
	 * @param feature Feature 
	 * @return InErrorPropagationGuard
	 */
	public InErrorPropagationGuard getInErrorPropagationGuard(ComponentInstance ci, Feature feature){
		ErrorModelProperty occ =  getErrorModelProperty(IEPGClass, ci,feature, null);
		return (InErrorPropagationGuard)occ;
	}
	

	/**
	 * get the InErrorPropagationGuard associated with a feature instance
	 * This method takes into account InErrorPropagationGuard declarations with applies to in enclosing components
	 * @param fi FeatureInstance
 * @param feature Feature 
	 * @return InErrorPropagationGuard
	 */
	public InErrorPropagationGuard getInErrorPropagationGuard(FeatureInstance fi){
		ErrorModelProperty occ =  getInErrorPropagationGuard( fi.getContainingComponentInstance(),fi.getFeature());
		return (InErrorPropagationGuard)occ;
	}

	/**
	 * get the InErrorPropagationGuard associated with a component instance
	 * This method takes into account InErrorPropagationGuard declarations with applies to in enclosing components
	 * @param ci ComponentInstance
	 * @param feature Feature 
	 * @return InErrorPropagationGuard
	 */
	public InErrorPropagationGuard getInErrorPropagationGuard(ConnectionInstance conni, Feature feature){
		ErrorModelProperty occ =  getErrorModelProperty(IEPGClass, conni,feature, null);
		return (InErrorPropagationGuard)occ;
	}

	
	/**
	 * get the InErrorPropagationGuard associated with a component classifier
	 * The InErrorPropagationGuard is assumed to be declared in the component, not via applies to
	 * @param cc Component classifier
	 * @param feature Feature 
	 * @return InErrorPropagationGuard
	 */
	public InErrorPropagationGuard getInErrorPropagationGuard( ComponentClassifier cc, Feature feature ){
		ErrorModelProperty occ = getErrorModelProperty(IEPGClass,cc, feature, null);
		return (InErrorPropagationGuard)occ;
	}


	/**
	 * get the InErrorPropagationGuard associated with a subcomponent
	 * The InErrorPropagationGuard is assumed to be declared in the component classifier of the subcomponent
	 * or in the component classifier (impl or type) that contains the subcomponent. 
	 * In the latter case the applies to in the enclosing component classifier names that subcomponent
	 * Applies to higher in the component hierarchy are not considered
	 * @param sub subcomponent
	 * @param feature Feature 
	 * @return InErrorPropagationGuard
	 */
	public InErrorPropagationGuard getInErrorPropagationGuard(Subcomponent sub, Feature feature){
		return (InErrorPropagationGuard)getErrorModelProperty(IEPGClass,sub,feature,null);
	}

	/**
	 * get the InErrorPropagationGuard associated with a connection
	 * The InErrorPropagationGuard is assumed to be declared in the component that contains the connection
	 * The applies to of that declaration must name the connection
	 * @param conn connection
	 * @param feature Feature 
	 * @return InErrorPropagationGuard
	 */
	public InErrorPropagationGuard getInErrorPropagationGuard(Connection conn, Feature feature){
		return (InErrorPropagationGuard)getErrorModelProperty(IEPGClass,conn,feature,null);
	}

	
	/************************
	 * Methods for retrieval of the ModeTransitionGuard
	 * Retrieval from the instance model takes into account the applies to clause of error model properties.
	 * Also methods to retrieve them from the declarative model. Those methods do not take into account the applies to
	 */
	
	protected EClass MTGClass = ErrorannexPackage.eINSTANCE.getModeTransitionGuard();


	/**
	 * get the ModeTransitionGuard associated with a component instance
	 * This method takes into account ModeTransitionGuard declarations with applies to in enclosing components
	 * @param ci ComponentInstance
	 * @param feature Feature (event port)
	 * @param featureContext Subcomponent or ComponentImpl that is the context of the event port
	 * @return ModeTransitionGuard
	 */
	public ModeTransitionGuard getModeTransitionGuard(ComponentInstance ci, EventPort feature, NamedElement featureContext){
		ErrorModelProperty occ =  getErrorModelProperty(MTGClass, ci,feature,featureContext);
		return (ModeTransitionGuard)occ;
	}
	

	/**
	 * get the ModeTransitionGuard associated with a feature instance
	 * This method takes into account OutErrorPropagationGuard declarations with applies to in enclosing components
	 * @param ci ComponentInstance that contains the mode transitions
	 * @param fi Feature Instance that triggers mode transition for which the guard is defined
	 * @return ModeTransitionGuard
	 */
	public ModeTransitionGuard getModeTransitionGuard(ComponentInstance ci, FeatureInstance fi){
		if (!(fi.getFeature() instanceof EventPort)) return null;
		ComponentInstance parentCi = fi.getContainingComponentInstance();
		ErrorModelProperty occ =  getModeTransitionGuard(ci,(EventPort)fi.getFeature(), (ci==parentCi)?ci.getComponentClassifier():parentCi.getSubcomponent());
		return (ModeTransitionGuard)occ;
	}

	/**
	 * get the ModeTransitionGuard associated with a component instance
	 * This method takes into account ModeTransitionGuard declarations with applies to in enclosing components
	 * @param ci ComponentInstance
	 * @param feature Feature (event port)
	 * @param featureContext Subcomponent or ComponentImpl that is the context of the event port
	 * @return ModeTransitionGuard
	 */
	public ModeTransitionGuard getModeTransitionGuard(ConnectionInstance conni, EventPort feature, NamedElement featureContext){
		ErrorModelProperty occ =  getErrorModelProperty(MTGClass, conni,feature,featureContext);
		return (ModeTransitionGuard)occ;
	}

	
	/**
	 * get the ModeTransitionGuard associated with a component classifier
	 * The ModeTransitionGuard is assumed to be declared in the component, not via applies to
	 * @param cc Component classifier
	 * @param feature Feature (event port)
	 * @param featureContext Subcomponent or ComponentImpl that is the context of the event port
	 * @return ModeTransitionGuard
	 */
	public ModeTransitionGuard getModeTransitionGuard( ComponentClassifier cc, EventPort feature, NamedElement featureContext ){
		ErrorModelProperty occ = getErrorModelProperty(MTGClass,cc, feature, featureContext);
		return (ModeTransitionGuard)occ;
	}


	/**
	 * get the ModeTransitionGuard associated with a subcomponent
	 * The ModeTransitionGuard is assumed to be declared in the component classifier of the subcomponent
	 * or in the component classifier (impl or type) that contains the subcomponent. 
	 * In the latter case the applies to in the enclosing component classifier names that subcomponent
	 * Applies to higher in the component hierarchy are not considered
	 * @param sub subcomponent
	 * @param feature Feature (event port)
	 * @param featureContext Subcomponent or ComponentImpl that is the context of the event port
	 * @return ModeTransitionGuard
	 */
	public ModeTransitionGuard getModeTransitionGuard(Subcomponent sub, EventPort feature, NamedElement featureContext){
		return (ModeTransitionGuard)getErrorModelProperty(MTGClass,sub,feature,featureContext);
	}

	/**
	 * get the ModeTransitionGuard associated with a connection
	 * The ModeTransitionGuard is assumed to be declared in the component that contains the connection
	 * The applies to of that declaration must name the connection
	 * @param conn connection
	 * @param feature Feature (event port)
	 * @param featureContext Subcomponent or ComponentImpl that is the context of the event port
	 * @return ModeTransitionGuard
	 */
	public ModeTransitionGuard getModeTransitionGuard(Connection conn, EventPort feature, NamedElement featureContext){
		return (ModeTransitionGuard)getErrorModelProperty(MTGClass,conn,feature,featureContext);
	}
	
	
	/************************
	 * Generic retrieval methods for error model properties
	 */


	/**
	 * get the ErrorModelProperty of specified class associated with a component instance
	 * This method takes into account ErrorModel property declarations with applies to in enclosing components
	 * @param eclass EClass of desired ErrorModelProperty
	 * @param ci ComponentInstance
	 * @param feature Error Model Feature (event or propagation) or component feature (port)
	 * @param featureContext Subcomponent or ComponentImpl that is the context of the event port
	 * @return ErrorModelProperty
	 */
	protected ErrorModelProperty getErrorModelProperty(EClass eclass, ComponentInstance ci, NamedElement feature, NamedElement featureContext){
		ErrorModelProperty occ = null;
		EList target = new BasicEList();
		while (ci != null){
			ComponentClassifier cc = ci.getComponentClassifier();
			ErrorModelProperty res = getErrorModelProperty(eclass,cc,feature,featureContext, target);
			if (res != null ) occ = res;
			target.add(0,ci.getSubcomponent());
			ci = ci.getContainingComponentInstance();
		}
		return occ;
	}
	

	/**
	 * get the ErrorModelProperty of specified class associated with a connection instance
	 * This method takes into account ErrorModel property declarations with applies to in enclosing components
	 * @param eclass EClass of desired ErrorModelProperty
	 * @param conni ConnectionInstance
	 * @param feature Error Model Feature (event or propagation) or component feature (port)
	 * @param featureContext Subcomponent or ComponentImpl that is the context of the event port
	 * @return ErrorModelProperty
	 */
	protected ErrorModelProperty getErrorModelProperty(EClass eclass,ConnectionInstance conni, NamedElement feature, NamedElement featureContext){
		ErrorModelProperty occ = null;
		EList connlist = conni.getConnectionReferences();
		for (Iterator it = connlist.iterator();it.hasNext();){
			ConnectionReference connref = (ConnectionReference) it.next();
			Connection conn = connref.getConnection();
			ComponentInstance ci = null;
			if (conn.getAllSourceContext() instanceof ComponentImpl){
				ci = conni.getDestination().getContainingComponentInstance();
			} else {
				ci = conni.getSource().getContainingComponentInstance();
			}
			ComponentImplementation parent = conn.getContainingComponentImpl();
			while (ci != null && ci.getComponentClassifier() != parent) {
				ci = ci.getContainingComponentInstance(); 
			}
			EList target = new BasicEList(); target.add(conn);
			while (ci != null){
				ComponentClassifier cc = ci.getComponentClassifier();
				ErrorModelProperty res = getErrorModelProperty(eclass, cc,feature,featureContext,target);
				if (res != null ) occ = res;
				target.add(0,ci.getSubcomponent());
				ci = ci.getContainingComponentInstance();
			}
			if (occ != null) return occ;
		}
		return occ;
	}


	
	/**
	 * get the ErrorModelProperty of the specified class associated with a component classifier
	 * The ErrorModelProperty is assumed to be declared in the component
	 * applies to is not taken into account
	 * @param eclass EClass of desired ErrorModelProperty
	 * @param cc Component classifier
	 * @param feature Error Model Feature (event or propagation) or component feature (port)
	 * @param featureContext Subcomponent or ComponentImpl that is the context of the event port
	 * @return ErrorModelProperty
	 */
	protected ErrorModelProperty getErrorModelProperty(EClass eclass, ComponentClassifier cc, NamedElement feature, NamedElement featureContext ){
		return getErrorModelProperty(eclass,cc, feature, featureContext, null);
	}


	/**
	 * get the ErrorModelProperty of the specified class associated with a connection
	 * The ErrorModelProperty is assumed to be declared in the component that contains the connection
	 * The applies to of that declaration must name the connection
	 * @param eclass EClass of desired ErrorModelProperty
	 * @param conn connection
	 * @param feature Error Model Feature (event or propagation) or component feature (port)
	 * @param featureContext Subcomponent or ComponentImpl that is the context of the event port
	 * @return ErrorModelProperty
	 */
	protected ErrorModelProperty getErrorModelProperty(EClass eclass, Connection conn, NamedElement feature, NamedElement featureContext){
		ComponentClassifier cc = conn.getContainingComponentImpl();
		EList target = new BasicEList(); target.add(conn);
		return getErrorModelProperty(eclass,cc,feature,featureContext,target);
	}

	/**
	 * get the ErrorModelProperty of the specified class associated with a subcomponent
	 * The ErrorModelProperty is assumed to be declared in the component classifier of the subcomponent
	 * or in the component classifier (impl or type) that contains the subcomponent. 
	 * In the latter case the applies to in the enclosing component classifier names that subcomponent
	 * Applies to higher in the component hierarchy are not considered
	 * @param eclass EClass of desired ErrorModelProperty
	 * @param sub subcomponent
	 * @param feature Error Model Feature (event or propagation) or component feature (port)
	 * @param featureContext Subcomponent or ComponentImpl that is the context of the event port
	 * @return ErrorModelProperty
	 */
	protected ErrorModelProperty getErrorModelProperty(EClass eclass, Subcomponent sub, NamedElement feature, NamedElement featureContext){
		ComponentClassifier cc = sub.getAllClassifier();
		ErrorModelProperty emp = getErrorModelProperty(eclass,cc,feature,featureContext);
		/* check in enclosing implementation for error model property with applies to */
		ComponentClassifier parentcc = sub.getContainingComponentImpl();
		EList target = new BasicEList(); target.add(sub);
		ErrorModelProperty pemp = getErrorModelProperty(eclass,parentcc,feature,featureContext, target);
		if (pemp != null){
			emp =pemp;
		}
		return emp;
	}

	/**
	 * get the ErrorModelProperty of the specified class - take aaplies to into account
	 * It is declared in the ErrorModelAnnexSubclause of the component classifier
	 * It will check both the ErrorModelAnnexSubclause in the component impl and the component type
	 * Its applies to clause must match the list of model elements specified in target
	 * @param eclass EClass of desired ErrorModelProperty
	 * @param cc Component classifier; can be null
	 * @param feature Error Model Feature (event or propagation) or component feature (port)
	 * @param featureContext Subcomponent or ComponentImpl that is the context of the event port
	 * @param target Subcomponent of connection for which the property is to be retrieved
	 * @return ErrorModelProperty
	 */
	protected ErrorModelProperty getErrorModelProperty( EClass eclass, ComponentClassifier cc, NamedElement feature, NamedElement featureContext, EList target ){
		if (cc == null) return null;
		ErrorAnnexSubClause easc = getErrorAnnexSubclause(cc);
		ErrorModelProperty occ = easc==null?null:easc.getErrorModelProperty( eclass, feature, featureContext, target);
		if (occ == null){
			if (cc instanceof ComponentImplementation){
				easc = getErrorAnnexSubclause(((ComponentImplementation)cc).getType());
				if (easc != null)
					occ = easc.getErrorModelProperty(eclass, feature, featureContext, target);
			}
		}
		return occ;
	}
	


}
