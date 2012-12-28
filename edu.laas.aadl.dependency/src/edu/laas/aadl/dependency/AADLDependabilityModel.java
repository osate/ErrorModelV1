/**
 * <copyright>
 * Copyright  2007 by LAAS-CNRS, all rights reserved.
 *
 * Use of this library is subject to the terms of the license set forth
 * at http://www.eclipse.org/legal/cpl-v10.html.
 *
*/

package edu.laas.aadl.dependency;





import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.osate.aadl2.AnnexSubclause;
import org.osate.aadl2.ComponentClassifier;
import org.osate.aadl2.ComponentImplementation;
import org.osate.aadl2.DefaultAnnexSubclause;
import org.osate.aadl2.Element;
import org.osate.aadl2.NamedElement;
import org.osate.aadl2.instance.ComponentInstance;
import org.osate.aadl2.instance.ConnectionInstance;
import org.osate.aadl2.instance.impl.ComponentInstanceImpl;
import org.osate.aadl2.modelsupport.errorreporting.AnalysisErrorReporterManager;
import org.osate.aadl2.modelsupport.modeltraversal.ForAllElement;

import edu.cmu.sei.aadl.errorannex.ComponentErrorModelProperty;
import edu.cmu.sei.aadl.errorannex.ErrorAnnexSubClause;
import edu.cmu.sei.aadl.errorannex.ErrorModelClassifier;
import edu.cmu.sei.aadl.errorannex.ErrorModelProperty;
import edu.cmu.sei.aadl.errorannex.util.EAXUtil;

/**
 * @author Ana Elena Rugina aerugina@laas.fr
 *
 */
public class AADLDependabilityModel extends ForAllElement {
	protected static EAXUtil utilEMA = new edu.cmu.sei.aadl.errorannex.util.EAXUtil();

	/**
	 * @param errMgr
	 */
	public AADLDependabilityModel(AnalysisErrorReporterManager errMgr) {
		super(errMgr);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	public AADLDependabilityModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 *  (non-Javadoc)
	 * @see edu.cmu.sei.aadl.model.util.ForAllElement#suchThat(edu.cmu.sei.aadl.model.core.Element)
	 */
	protected boolean suchThat(Element obj) {
		if (obj instanceof ComponentInstance)
			return (hasAbstractEM.hasCompAbstractEM((ComponentInstance) obj)); 
		else if (obj instanceof ConnectionInstance){
			//EList cil = ((ConnectionInstance)obj).getConnection();			
			//for (Iterator it=cil.iterator();it.hasNext();){
			//	Connection c = (Connection) it.next();
			//	System.out.println("Connection "+c.getName());
			//}
			//return true;
			return (hasAbstractEM.hasConnAbstractEM((ConnectionInstance) obj)); 
		}
		return false;
	}
	
	/**
	 *  (non-Javadoc)
	 * gets the error model annex subclause for a component instance
	 */
	public ErrorAnnexSubClause getErrorAnnexSubClause(Element obj) {

		/* get the implementation of the component instance */
		ComponentClassifier cc =  ((ComponentInstance) obj).getComponentClassifier();

		/*
		 * if there is a component implementation, search for an error annex
		 * subclause
		 */
		if (cc != null && cc instanceof ComponentImplementation) {
			ComponentImplementation cii = (ComponentImplementation)cc;
			EList ListofAnnexes = cii.getAllAnnexSubclauses();
			for (Iterator it = ListofAnnexes.iterator(); it.hasNext();) 
			{
				final AnnexSubclause annex = (AnnexSubclause) it.next();
				if (annex instanceof DefaultAnnexSubclause)
				{
					if (annex.getName().equals("Error_Model"))
						error(obj, "You need the Error Model parser before running this analysis.");
				}
				/*ErrorAnnexSubClauseImpl*/
				else if (annex instanceof ErrorAnnexSubClause)
				{
					return (ErrorAnnexSubClause)annex;
					
				};
			};
		};
		return null;
	};

	/**
	 * (non-Javadoc) gets the error model annex subclause for a component
	 * instance
	 */
	public ErrorModelClassifier getErrorModel(Element obj) {

		/* get the implementation of the component instance */
		ComponentClassifier cc =  ((ComponentInstance) obj).getComponentClassifier();

		/*
		 * if there is a component implementation, search for an error annex
		 * subclause
		 */
		if (cc != null && cc instanceof ComponentImplementation) {
			ComponentImplementation cii = (ComponentImplementation)cc;
			EList<AnnexSubclause> ListofAnnexes = cii.getAllAnnexSubclauses();
			for (Iterator<AnnexSubclause> it = ListofAnnexes.iterator(); it.hasNext();) {
				final AnnexSubclause annex =  it.next();
				if (annex instanceof DefaultAnnexSubclause) {
					if (annex.getName().equals("Error_Model"))
						error(obj, "You need the Error Model parser before running this analysis.");
				}
				/* ErrorAnnexSubClause */
				else if (annex instanceof ErrorAnnexSubClause) {
					EList emps = ((ErrorAnnexSubClause) annex).getErrorModelProperty();
					for (Iterator it1 = emps.iterator(); it1.hasNext();) {
						ErrorModelProperty emp = (ErrorModelProperty) it1.next();
						if (emp instanceof ComponentErrorModelProperty) {
							return ((ComponentErrorModelProperty) emp).getErrorModelClassifier();

						}

					}

				}
				;
			}
			;
		}
		;
		return null;
	};

//	
//	public AadlSpec getAADLSpec(Element obj){
//		//if (obj instanceof ComponentInstanceImpl)
//			AadlSpec as = (AadlSpec) ((ComponentInstanceImpl) obj).getAadlSpec();
//		return as;
//	}

}

		