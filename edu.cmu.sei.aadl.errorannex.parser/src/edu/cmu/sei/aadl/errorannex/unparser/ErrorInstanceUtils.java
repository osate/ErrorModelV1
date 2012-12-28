package edu.cmu.sei.aadl.errorannex.unparser;

//import edu.cmu.sei.aadl.model.property.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.uml2.uml.internal.impl.ComponentImpl;
import org.osate.aadl2.ComponentClassifier;
import org.osate.aadl2.Connection;
import org.osate.aadl2.Context;
import org.osate.aadl2.Feature;
import org.osate.aadl2.FeatureGroup;
import org.osate.aadl2.NamedElement;
import org.osate.aadl2.Subcomponent;
import org.osate.aadl2.instance.ComponentInstance;
import org.osate.aadl2.instance.ConnectionInstance;
import org.osate.aadl2.instance.ConnectionReference;
import org.osate.aadl2.instance.FeatureInstance;
import org.osate.aadl2.instance.InstanceObject;

import edu.cmu.sei.aadl.errorannex.ModelSelectionType;
import edu.cmu.sei.aadl.errorannex.util.EAXUtil;

public class ErrorInstanceUtils {
	
public ModelSelectionType NonNullModelHierarchyPropertyValue (
		final ComponentClassifier cc) {
	EAXUtil o = new EAXUtil();
	if (o.getModelHierarchyProperty(cc) == null) 
		if (o.getDerivedErrorStateMappingGuard(cc) == null)
			return(ModelSelectionType.ABSTRACT_LITERAL);
		else
			return(ModelSelectionType.DERIVED_LITERAL);
	else
		return(o.getModelHierarchyProperty(cc).getErrorModelSelection());
}
	
public FeatureInstance getImmSrcToUltDst(ConnectionInstance conni) {
	List featureList = getConnectionInstancePassThroughs(conni);
	ListIterator it = featureList.listIterator(featureList.size()-1); //atleast 2 featureinstances
	if(it.hasPrevious()) {
		FeatureInstance immSrc = (FeatureInstance) it.previous();
		return immSrc;
	}
	//else error!
	return null;
}


/* The following two methods - getInstantiatedEndPoint 
 * and getConnectionInstancePassThroughs
 * are copied from the AADL-wiki website.
 * Aadl-wiki: http://la.sei.cmu.edu/aadl-wiki/index.php/Getting_the_FeatureInstances_that_a_Semantic_Connections_passes_through
 * Getting the FeatureInstances that a Semantic Connections passes through 
 */
	
/* getInstantiatedEndPoint returns the InstanceObject based on the 
 * connection context (the component instance corresponding to the 
 * component containing the connection), and its endpoint and the endpoint
 * context.
 */

private InstanceObject getInstantiatedEndPoint(
	    final ComponentInstance ctxt, final NamedElement connEndPoint,
	    final Context connCtxt) {
	  InstanceObject srcInstance = null;
	  if (connCtxt == null) {
	    // lookup subcomponent using the connection src
	    srcInstance = ctxt.findSubcomponentInstance((Subcomponent) connEndPoint);
	    if (srcInstance == null){
	    	// lookup feature in the context using the connection src
	    	srcInstance = ctxt.findFeatureInstance((Feature) connEndPoint);
	    }
	  } else if (connCtxt instanceof Subcomponent) {
	    // lookup feature in the subcomponent 
	    srcInstance =
	        ctxt.findSubcomponentInstance((Subcomponent) connCtxt)
	            .findFeatureInstance((Feature) connEndPoint);
	  } else if (connCtxt instanceof FeatureGroup) {
	    // feature in a Port group...
	    srcInstance =
	        ctxt.findFeatureInstance((FeatureGroup) connCtxt)
	            .findFeatureInstance((Feature) connEndPoint);
	  }
	  return srcInstance;
	}
/*
 * Reminder: the first element of the list returned by 
 * getConnectionInstancePassThroughs may be a ComponentInstance if the 
 * connection is an access connection. All other elements of the returned 
 * list are FeatureInstance objects. Retrieved from 
 * "http://la.sei.cmu.edu/aadl-wiki/index.php/Getting_the_FeatureInstances_that_a_Semantic_Connections_passes_through"
 */
 
public List getConnectionInstancePassThroughs(ConnectionInstance ci) {
	final List featureList = new ArrayList();
	Iterator conns = ci.getConnectionReferences().iterator();
				
	InstanceObject lastDest = null;
	while (conns.hasNext()) {
		ConnectionReference connref = (ConnectionReference) conns.next();
		Connection conn = connref.getConnection();
		ComponentInstance ctxt = connref.getContext();
		final NamedElement srcF = conn.getAllSource();
		final Context srcCtxt = conn.getAllSourceContext();
		final InstanceObject srcInstance =
			getInstantiatedEndPoint(ctxt, srcF, srcCtxt);
		if (srcInstance != lastDest) {
			featureList.add(srcInstance);
		}
		
		final NamedElement destF = conn.getAllDestination();
		final Context destCtxt = conn.getAllDestinationContext();
		final InstanceObject destInstance =
			getInstantiatedEndPoint(ctxt, destF, destCtxt);
		featureList.add(destInstance);
		lastDest = destInstance;
	}
	return featureList;
}


}