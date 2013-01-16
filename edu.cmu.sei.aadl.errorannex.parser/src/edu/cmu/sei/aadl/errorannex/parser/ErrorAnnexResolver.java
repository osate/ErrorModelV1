package edu.cmu.sei.aadl.errorannex.parser;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.internal.impl.ComponentImpl;
import org.osate.aadl2.AadlPackage;
import org.osate.aadl2.ComponentClassifier;
import org.osate.aadl2.ComponentImplementation;
import org.osate.aadl2.ComponentType;
import org.osate.aadl2.Connection;
import org.osate.aadl2.DirectionType;
import org.osate.aadl2.Feature;
import org.osate.aadl2.ModeTransition;
import org.osate.aadl2.NamedElement;
import org.osate.aadl2.Namespace;
import org.osate.aadl2.Port;
import org.osate.aadl2.Subcomponent;
import org.osate.aadl2.SubprogramCallSequence;
import org.osate.aadl2.modelsupport.errorreporting.AnalysisErrorReporterManager;
import org.osate.aadl2.modelsupport.util.AadlUtil;
import org.osate.aadl2.parsesupport.AObject;
import org.osate.xtext.aadl2.properties.linking.PropertiesLinkingService;
import org.osate.xtext.aadl2.properties.util.EMFIndexRetrieval;
import org.osate.xtext.aadl2.properties.util.GetProperties;

import edu.cmu.sei.aadl.errorannex.ComponentErrorModelProperty;
import edu.cmu.sei.aadl.errorannex.DerivedErrorStateMappingGuard;
import edu.cmu.sei.aadl.errorannex.DistributionName;
import edu.cmu.sei.aadl.errorannex.ErrorAnnexLibrary;
import edu.cmu.sei.aadl.errorannex.ErrorAnnexSubClause;
import edu.cmu.sei.aadl.errorannex.ErrorEvent;
import edu.cmu.sei.aadl.errorannex.ErrorEventOrPropagation;
import edu.cmu.sei.aadl.errorannex.ErrorGuard;
import edu.cmu.sei.aadl.errorannex.ErrorModelClassifier;
import edu.cmu.sei.aadl.errorannex.ErrorModelImplementation;
import edu.cmu.sei.aadl.errorannex.ErrorModelProperty;
import edu.cmu.sei.aadl.errorannex.ErrorModelType;
import edu.cmu.sei.aadl.errorannex.ErrorPropagation;
import edu.cmu.sei.aadl.errorannex.ErrorPropagationRule;
import edu.cmu.sei.aadl.errorannex.ErrorSourceName;
import edu.cmu.sei.aadl.errorannex.ErrorState;
import edu.cmu.sei.aadl.errorannex.ErrorStateMappingRule;
import edu.cmu.sei.aadl.errorannex.ErrorStateOrPropagation;
import edu.cmu.sei.aadl.errorannex.ErrorTransition;
import edu.cmu.sei.aadl.errorannex.ErrorannexPackage;
import edu.cmu.sei.aadl.errorannex.InErrorPropagationGuard;
import edu.cmu.sei.aadl.errorannex.ModeTransitionGuard;
import edu.cmu.sei.aadl.errorannex.OccurrenceProperty;
import edu.cmu.sei.aadl.errorannex.OutErrorPropagationGuard;
import edu.cmu.sei.aadl.errorannex.ReportErrorProperty;
import edu.cmu.sei.aadl.errorannex.util.EAXUtil;

public class ErrorAnnexResolver  {
	AnalysisErrorReporterManager errManager = null;

	
	public ErrorAnnexResolver(AnalysisErrorReporterManager errManager){
		this.errManager = errManager;
	}
	
	

	/**
	 * @param identified
	 */
	// ensures that a FIXED/POISSON Occurrence error property has only one parameter in the correct range
	private void checkOccurrencePropertyExpression(OccurrenceProperty identified) {
		if (identified.getType().getValue()==DistributionName.FIXED){
			EList parameters = identified.getParameterList();
			if(parameters.size()!=1){
				errManager.error(identified, "A Fixed Occurrence error property should have only one parameter. found "+parameters);
			}
			else{
				Double param;
				try {
					param = new Double((String)identified.getParameterList().get(0));
				} catch (NumberFormatException e) {
					return;
				}
				if(param.doubleValue()>1 ||param.doubleValue()<0){
					errManager.error(identified, "Value of Fixed Occurrence parameter must be in the range [0,1] inclusive. found: "+param);
				}								
			}
			
		} else if (identified.getType().getValue()==DistributionName.POISSON){
			EList parameters = identified.getParameterList();
			if(parameters.size()!=1){
				errManager.error(identified, "A Poisson Occurrence error property should have only one parameter. found "+parameters);
			}
			else{
				Double param;
				try {
					param = new Double((String)identified.getParameterList().get(0));
				} catch (NumberFormatException e) {
					return;
				}
				if(param.doubleValue()<0){
					errManager.error(identified, "Value of Poisson Occurrence parameter must be positive. found: "+param);
				}								
			}

		}
		if(identified instanceof OccurrenceProperty){
			ErrorEventOrPropagation prop = ((OccurrenceProperty)identified).getAppliesToErrorEventOrPropagation();
			if(prop instanceof ErrorPropagation && !((ErrorPropagation)prop).isOut()){
				errManager.error(prop,"Error Propagation \""+prop.getName()+"\" must be of type \"out\" or \"in out\" for Occurrence Property");
			}
		}
	}			
	
	
	/**
	 * This next section performs the name resolution
	 */
	
	private EAXUtil eaxutil = new EAXUtil();
	
	protected EClass CEMPClass = ErrorannexPackage.eINSTANCE.getComponentErrorModelProperty();
	
	public void nameResolveLibrary(ErrorAnnexLibrary eal){
		/* error model types having nothing to resolve. */
		EList emilist = eal.getErrorModelImplementation();
		for (Iterator it = emilist.iterator(); it.hasNext();){
			ErrorModelImplementation emi = (ErrorModelImplementation)it.next();
			/* resolve the type name */
			ErrorModelType emt = eal.findErrorModelType(emi.getTypeName());
			if (emt == null){
				errManager.error(emi,"Could not find ErrorModelType "+emi.getTypeName());
				break;
			} else {
				emi.setErrorModelType(emt);
			}
			if (emi.getErrorTransitions() != null){
				EList translist = emi.getErrorTransitions().getErrorTransition();
				for (Iterator tt = translist.iterator();tt.hasNext();){
					ErrorTransition et = (ErrorTransition)tt.next();
					EList eslist = et.getOriginName();
					for (Iterator st = eslist.iterator();st.hasNext();){
						String origname = (String)st.next();
						ErrorState es = emt.findErrorState(origname);
						if (es != null){
							et.getOrigin().add(es);
						} else {
							errManager.error(et,"Could not find origin state "+origname);
						}
					}
					String destname = et.getDestinationName();
					ErrorState ds = emt.findErrorState(destname);
					if (ds != null){
						et.setDestination(ds);
					} else {
						errManager.error(et,"Could not find destination state "+destname);
					}
					EList triggerlist = et.getTransitionTriggerName();
					for (Iterator st = triggerlist.iterator();st.hasNext();){
						String origname = (String)st.next();
						ErrorEvent es = emt.findErrorEvent(origname);
						if (es != null){
							et.getTransitionTrigger().add(es);
						} else {
							ErrorPropagation ep = emt.findErrorPropagation(origname);
							if (ep != null){
								et.getTransitionTrigger().add(ep);
							} else {
								errManager.error(et,"Could not find transition event or in propagation "+origname);
							}
						}
					}
					EList actionlist = et.getTransitionActionName();
					for (Iterator st = actionlist.iterator();st.hasNext();){
						String origname = (String)st.next();
						ErrorPropagation es = emt.findErrorPropagation(origname);
						if (es != null){
							et.getTransitionAction().add(es);
						} else {
							errManager.error(et,"Could not find transition out propagation "+origname);
						}
					}
				}
			}
			/* handle occurrence properties in error model implementation */
			if (emi.getErrorProperties() != null){
				EList occlist = emi.getErrorProperties().getOccurrenceProperty();
				for (Iterator ot = occlist.iterator(); ot.hasNext();){
					OccurrenceProperty occ = (OccurrenceProperty)ot.next();
					String eps = occ.getEventOrPropagationName();
					ErrorEvent es = emt.findErrorEvent(eps);
					if (es != null){
						occ.setAppliesToErrorEventOrPropagation(es);
					} else {
						ErrorPropagation ep = emt.findErrorPropagation(eps);
						if (ep != null){
							occ.setAppliesToErrorEventOrPropagation(ep);
						} else {
							errManager.error(occ,"Could not find transition event or in propagation "+eps+ " in applies to");
						}
					}
					checkOccurrencePropertyExpression(occ);
				}
			}
		}
	}
	
	
	public ErrorModelClassifier getErrorModelType(Subcomponent subc ){
		ComponentClassifier cc = subc.getAllClassifier();
		/* error model type for the component of the subcomponent */
		ErrorModelClassifier emc = null;
		ComponentErrorModelProperty cemp = eaxutil.getComponentErrorModelProperty(subc);
		if (cemp == null) return null;
		emc = cemp.getErrorModelClassifier();
		if (emc != null){
			return emc;
		}
		// has not been resolved yet (or was not resolvable)
		// try to resolve
		ErrorAnnexSubClause subclause = eaxutil.getErrorAnnexSubclause(cc);
		nameResolveSubclause(subclause);
		return cemp.getErrorModelClassifier();
	}
	
	public void nameResolveSubclause(ErrorAnnexSubClause easc){
		ComponentClassifier cc = (ComponentClassifier)easc.eContainer();
		/* error model type for the component of the subclause */
		ErrorModelType emt = null;
		EList emplist = easc.getErrorModelProperty();
		for (Iterator it = emplist.iterator(); it.hasNext();){
			/* process ComponentErrorModelProperty before the others as they need to know the error model to use */
			/// this resolves the reference to the error model classifier
			ErrorModelProperty emp = (ErrorModelProperty)it.next();
			if (emp instanceof ComponentErrorModelProperty){
				ComponentErrorModelProperty cemp = (ComponentErrorModelProperty)emp;
				if (cemp.getInplaceErrorModelType()!= null){
					cemp.setErrorModelClassifier(cemp.getInplaceErrorModelType());
					break;
				}
				String pkgname = cemp.getPackageIdentifier();
				Namespace ao = cc.getNamespace();
				ErrorAnnexLibrary eal=null;
				if (pkgname != null && pkgname.length()>0){
					AadlPackage pkg = EMFIndexRetrieval.getPackageInWorkspace(easc,pkgname);
					if (pkg != null){ 
						eal = eaxutil.getErrorAnnexLibrary(pkg);
					} else {
						errManager.error(cemp,"Could not find Aadl package "+pkgname);
						break;
					}
					if (eal == null){
						errManager.error(cemp,"Could not find error annex library in package "+pkgname);
						break;
					}
				} else {
					eal=eaxutil.getErrorAnnexLibrary(ao);
					if (eal == null){
						errManager.error(cemp,"Could not find error annex library ");
						break;
					}
				}
				String emin = cemp.getErrorModelImplementationIdentifier();
				ErrorModelClassifier emc = null;
				if (emin == null || emin.length() == 0){
					emc = eal.findErrorModelType(cemp.getErrorModelTypeIdentifier());
					if (emc == null){
						errManager.error(cemp,"Could not find error model type "+cemp.getErrorModelTypeIdentifier());
					} else if (cemp.getAppliesToName().isEmpty()){
						emt = (ErrorModelType)emc;
					}
				} else {
					emc = eal.findErrorModelImplementation(cemp.getErrorModelTypeIdentifier()+"."+emin);
					if (emc == null){
						errManager.error(cemp,"Could not find error model classifier "+cemp.getErrorModelTypeIdentifier()+"."+emin);
					} else if (cemp.getAppliesToName().isEmpty()){
						emt = eal.findErrorModelType(cemp.getErrorModelTypeIdentifier());
					}
				}
				cemp.setErrorModelClassifier(emc);
			}
		}
		boolean reportMissingMODEL = false;
		for (Iterator it = emplist.iterator(); it.hasNext();){
			ErrorModelProperty emp = (ErrorModelProperty)it.next();
			EList apnamelist = emp.getAppliesToName();
			/* remember the last element the applies to points to a component */
			NamedElement myappliesto = cc;
			/* remember the classifier of the last element that is a component */
			ComponentClassifier mycc = cc;
			Connection theconn = null;
			/* first process applies to.  It is assumed to point to components or a connection */
			// NOTE: any feature reference is kept in a separate attribute of the appropriate guard.
			for (Iterator at = apnamelist.iterator(); at.hasNext();){
				String apname = (String)at.next();
				if (mycc instanceof ComponentImplementation){
					ComponentImplementation ci = (ComponentImplementation)cc;
					Subcomponent sc = (Subcomponent)AadlUtil.findNamedElementInList(ci.getAllSubcomponents(), apname);
					if (sc != null ){
						emp.getAppliesTo().add(sc);
						mycc = sc.getAllClassifier();
						myappliesto = sc;
					} else {
						if (at.hasNext()){
							errManager.error(emp,"Could not find applies to subcomponent "+apname);
						} else {
							Connection conn = (Connection)AadlUtil.findNamedElementInList(ci.getAllConnections(),apname);
							if (conn != null){
								emp.getAppliesTo().add(conn);
								theconn = conn;
							} else {
								errManager.error(emp,"Could not find applies to subcomponent or connection "+apname);
							}
						}
					}
				} else {
					/* no impl to look for subcomponents or connection */
					errManager.error(emp,"Need component implementation to find applies to subcomponent or connection "+apname);
				}
			}
			/* more emp processing. It can use to applies to to retrieve the error model 
			 * in other words, we use the component/conn portion of the guard etc. applies to to determine the correct error model.
			 * the applies to is also used to look for the MODEL property in the same place as the error model property */
			
			ErrorModelType myemt = emt;
			ComponentType myct = (mycc instanceof ComponentType)? (ComponentType)mycc : ((ComponentImplementation)mycc).getType();
			if (!apnamelist.isEmpty()){
				ComponentErrorModelProperty scemp = (ComponentErrorModelProperty)easc.getErrorModelProperty(CEMPClass, null, null, apnamelist);
				ErrorModelClassifier semc = null;
				if (scemp != null){
					semc = scemp.getErrorModelClassifier();
				} else {
					if (theconn != null){
						semc = eaxutil.getComponentErrorModelPropertyValue(theconn);
					} else if (myappliesto != cc){
						/* need to process the applies to and retrieve the error model */
						if (myappliesto instanceof Subcomponent){
							semc = eaxutil.getComponentErrorModelPropertyValue(mycc);
						}
					}
				}
				if (semc instanceof ErrorModelType){
					myemt = (ErrorModelType)semc;
				} else if (semc instanceof ErrorModelImplementation){
					myemt = ((ErrorModelImplementation)semc).getErrorModelType();
				}
			}
			if (myemt == null){
				if ( ! reportMissingMODEL ){
					reportMissingMODEL = true;
					errManager.error(easc,"Error model subclause is missing MODEL property");
				}
			}
			List myfeaturelist = myct == null?Collections.EMPTY_LIST:myct.getAllFeatures();
			List mysubcomponentlist = (mycc instanceof ComponentImplementation? ((ComponentImplementation)cc).getAllSubcomponents():Collections.EMPTY_LIST);
//			List mycallslist = (mycc instanceof ComponentImplementation? ((ComponentImplementation)cc).getAllCallSequences():Collections.EMPTY_LIST);
			List mymtlist = (mycc instanceof ComponentImplementation? ((ComponentImplementation)cc).getAllModeTransitions():Collections.EMPTY_LIST);
//			if (mycallslist.size()>0){
//				mycallslist = ((SubprogramCallSequence)mycallslist.get(0)).getOwnedCallSpecifications();
//			}
			
			/* now process the property in the context of the error model the applies to points to */
			if (myemt != null && emp instanceof OccurrenceProperty){
				OccurrenceProperty occ = (OccurrenceProperty)emp;
				String epname = occ.getEventOrPropagationName();
				ErrorEventOrPropagation ee = myemt.findErrorEvent(epname);
				if (ee == null){
					ee = myemt.findErrorPropagation(epname);
				}
				if (ee == null){
					errManager.error(occ,"Could not find error event or propagation "+epname);
				} else {
					occ.setAppliesToErrorEventOrPropagation(ee);
				}
			}
			
			if (myemt != null && emp instanceof ReportErrorProperty){
				ReportErrorProperty rep = (ReportErrorProperty)emp;
				EList list = rep.getStateAndPropagationList();
				for (Iterator lt = list.iterator(); lt.hasNext();){
					String es = (String) lt.next();
					ErrorStateOrPropagation esp = myemt.findErrorState(es);
					if (esp == null){
						esp = myemt.findErrorPropagation(es);
					}
					if (esp == null){
						errManager.error(rep,"Could not find error state or propagation "+es);
					} else {
						rep.getErrorStateOrPropagation().add(esp);
					}
				}
			}
			
			if (emp instanceof ErrorGuard){
				/* resolve the applies to component feature reference & rules reference */
				ErrorGuard eg = (ErrorGuard)emp;
				EList eflist = eg.getAppliesToFeatureName();
				for (Iterator ft = eflist.iterator(); ft.hasNext();){
					String fname = (String) ft.next();
					Feature f = (Feature) AadlUtil.findNamedElementInList(myfeaturelist,fname);
					/** TODO bind to call */
					if (f != null){
						eg.getAppliesToFeature().add(f);
					} else {
						if (eg instanceof ModeTransitionGuard){
							ModeTransition mt = (ModeTransition) AadlUtil.findNamedElementInList(mymtlist,fname);
							if (mt != null){
								((ModeTransitionGuard)eg).setAppliesToModeTransition(mt);
							} else {
								errManager.error(eg,"Could not find event port or mode transition "+fname);
							}
						} else {
							errManager.error(eg,"Could not find event port "+fname);
						}
					}
				}
				if (eg instanceof ModeTransitionGuard){
					ModeTransitionGuard mtg = (ModeTransitionGuard)eg;
					EList cxtlist = mtg.getAppliesToFeatureContextName();
//					if (mysubcomponentlist.isEmpty() && !cxtlist.isEmpty()){
//						errManager.error(eg,"Cannot look up subcomponents for ModeTransitionGuard in component type");
//					}
					for (Iterator ft = cxtlist.iterator(); ft.hasNext();){
						String sname = (String) ft.next();
						if (sname.length()>0){
							Subcomponent sub = (Subcomponent) AadlUtil.findNamedElementInList(mysubcomponentlist,sname);
							if (sub != null){
//								mtg.getAppliesToFeatureContext().add(sub);
							} else {
								errManager.error(eg,"Could not find subcomponent "+sname);
							}
						}
					}
				}
				EList eprlist = null;
				if (emp instanceof InErrorPropagationGuard){
					eprlist = ((InErrorPropagationGuard)emp).getErrorPropagationRule();
				} else if (emp instanceof OutErrorPropagationGuard){
					eprlist = ((OutErrorPropagationGuard)emp).getErrorPropagationRule();
				}
				if (myemt != null && eprlist != null){
					for (Iterator et = eprlist.iterator(); et.hasNext();){
						ErrorPropagationRule epr = (ErrorPropagationRule)et.next();
						if (!epr.isMask() && epr.getErrorPropagationIdentifier().length() != 0){
							/* don't do it if it is masked */
							String epname = epr.getErrorPropagationIdentifier();
							ErrorPropagation ep = myemt.findErrorPropagation(epname);
							if (ep != null){
								epr.setErrorPropagation(ep);
							} else {
								errManager.error(epr,"Could not find error propagation "+epname);
							}
						}
					}
				}
			}
			if (myemt != null && emp instanceof DerivedErrorStateMappingGuard){
				/* resolve the rules */
				DerivedErrorStateMappingGuard desmg = (DerivedErrorStateMappingGuard)emp;
				EList esmrlist = desmg.getErrorStateMappingRule();
				for (Iterator et = esmrlist.iterator(); et.hasNext();){
					ErrorStateMappingRule epr = (ErrorStateMappingRule)et.next();
					String esname = epr.getComponentErrorStateIdentifier();
					ErrorState es = myemt.findErrorState(esname);
					if (es != null){
						epr.setErrorState(es);
					} else {
						errManager.error(epr,"Could not find error state "+esname);
					}
				}
			}
			/* now handle ErrorSourceName */
			nameResolveErrorSourceName(myemt,emp,myfeaturelist,mysubcomponentlist);
		}
	}
	
	// utility function to determine whether the error source name is on a guard that allows subcomponent dot feature
	// currently this should only be for guard transition
	
	protected boolean subcomponentOK(ErrorSourceName esn){
		boolean result = false;
		EObject ancestor = esn.eContainer();
		while (ancestor != null && !(ancestor instanceof ErrorModelProperty) ){
			ancestor = ancestor.eContainer(); 
		}
		if (ancestor instanceof ModeTransitionGuard){
			result = true;
		}
		return result;
	}
	
	protected void nameResolveErrorSourceName(ErrorModelType myemt, EObject root, List featurelist, List sublist ){//,List calllist){
		TreeIterator et = root.eAllContents();
		while (et.hasNext()){
			Object obj = et.next();
			if (obj instanceof ErrorSourceName){
				/* resolve name */
				ErrorSourceName esn = (ErrorSourceName)obj;
				String cfname = esn.getComponentNameOrFeatureName();
				if (cfname.length()>0){
					NamedElement subc = null;
					List myfeaturelist = featurelist;
					String subcname = esn.getSubcomponentName();
					if (subcname != null && subcname.length()>0){
						// need to resolve subcomponent name
						subc = (NamedElement)AadlUtil.findNamedElementInList(sublist,subcname);
						if (subc != null){
							esn.setContextSubcomponent(subc);
							if (!subcomponentOK(esn)){
								errManager.error(esn,"Subcomponent and port name ("+subcname+"."+cfname+") only allowed in Guard_Transition");
							}
							myfeaturelist = ((Subcomponent)subc).getAllFeatures();
						}
					}
					/* self has an empty string */
					NamedElement cf = (NamedElement)AadlUtil.findNamedElementInList(myfeaturelist,cfname);
					if (cf == null ){
						/* check the features of the enclosing component */
						cf = (NamedElement)AadlUtil.findNamedElementInList(sublist,cfname);
					}
					/** TODO need to look up in call sequence */
					if (cf != null){
						esn.setSubcomponentOrFeature(cf);
					}else {
						/* TODO add error port if we look for error port as feature */
						errManager.error(esn,"Could not find subcomponent or feature "+cfname);
					}
					if (cf instanceof Port){
						DirectionType pd = ((Port)cf).getDirection();
						if (subc == null){
							// own incoming event ports
						if (!pd.incoming()){
							errManager.error(esn,"Named port \""+cf.getName()+"\" must be \"in\" or \"in out\"");
						}
						} else {
							// must be outgoing subcomponent ports
							if (!pd.outgoing()){
								errManager.error(esn,"Named port \""+cf.getName()+"\" of subcomponent \""+subc.getName()+"\" must be \"out\" or \"in out\"");
							}
						}
					}
				} 
				// this a self reference. We can resolve the state name
				EList states = esn.getErrorStateOrPropagationName();
				for (Iterator it = states.iterator(); it.hasNext();){
					String statename = (String) it.next();
					ErrorState es = null;
					ErrorModelClassifier semt = null;
					if (esn.getSubcomponentOrFeature() != null){
						semt = getErrorModelType((Subcomponent)esn.getSubcomponentOrFeature());
						if (semt != null) es =semt.findErrorState(statename);
					} else if (myemt != null){
						es =myemt.findErrorState(statename);
					}							
					if (es != null){
						esn.getErrorStateOrPropagation().add(es);
					} else {
						if (cfname.isEmpty()){
							// no subcomponent
							errManager.error(esn,"State \""+statename+"\" could not be found.");
						} else {
							// had subcompont
							if (semt == null){
								// could not find model property
								errManager.error(esn,"State \""+statename+"\" subcomponent \""+cfname+"\" could not be found due to missing MODEL property.");
							} else {
								errManager.error(esn,"State \""+statename+"\" of subcomponent \""+cfname+"\" could not be found.");
							}
						}
					}

				}
			}
		}
	}
}

