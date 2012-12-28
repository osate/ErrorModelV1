/**
 * <copyright>
 * Copyright  2007 by LAAS-CNRS, all rights reserved.
 *
 * Use of ADAPT is subject to the terms of the license set forth
 * at http://www.eclipse.org/legal/cpl-v10.html.
 *
*/

package laas.aadl.aadl2gspn;

import java.util.Iterator;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.osate.aadl2.NamedElement;
import org.osate.aadl2.instance.ComponentInstance;
import org.osate.aadl2.instance.FeatureInstance;
import org.osate.aadl2.instance.InstanceObject;

import edu.cmu.sei.aadl.errorannex.BooleanErrorExpression;
import edu.cmu.sei.aadl.errorannex.BooleanExpressionType;
import edu.cmu.sei.aadl.errorannex.ErrorModelImplementation;
import edu.cmu.sei.aadl.errorannex.ErrorPropagationRule;
import edu.cmu.sei.aadl.errorannex.ErrorSourceName;
import edu.cmu.sei.aadl.errorannex.ErrorState;
import edu.cmu.sei.aadl.errorannex.ErrorTransition;
import edu.cmu.sei.aadl.errorannex.ErrorTransitions;
import edu.laas.aadl.dependency.FindSenderOrReceiverErrorModel;
import edu.laas.aadl.dependency.hasAbstractEM;


/**
 * @author Ana Rugina
 * This class is used to transform any kind of boolean expression into a disjunctive normal
 * form (DNF) boolean expression. A DNF has the following form:
 *   a . b . !c + r . g . !t . a
 *   where a, b, c, r, g, t are literals.
 * To do so, we use this structure:
 * An EList, which represents the "or" expression, contains all "and" expressions.
 * An "and" expression is also represented by an EList. Each element of this EList
 * are "literals". A literal can be prefixed by a negation, so, we use a
 * class which contains the literal and a boolean indicating if a negation is used.
 */
public class ToDisjunctiveNormalForm {
	/* Information for debugging. */
	static int indent_level = 0;
	static final boolean DEBUG = false;


	/**
	 * This method is used to transform any kind of expression into a DNF expression.
	 * @param BooleanErrorExpression bee
	 * @return EList corresponding to an OR
	 */
	static public EList make_canonical(ComponentInstance ci, BooleanErrorExpression bee, EList rules, EList UpperComponentsEM) {
		if (DEBUG) {
			indent_level += 2;
		}
		EList or = new BasicEList();
		int type = bee.getType().getValue();
		switch(type){
		case BooleanExpressionType.ERRORSOURCENAME:
			// If it is a literal, we create a DNF containing only this literal.
			if (DEBUG) {
				for (int k = 0; k < indent_level; k++) System.out.print(" ");
				System.out.println("ERRORSOURCENAME_LITERAL: " + bee.getErrorSourceName().getErrorStateOrPropagationName());
			}
			//case errorStateOrPropagation is empty -> we must refer to the initial state of the connected component
			BasicEList l = new BasicEList();
			ErrorSourceName esn = bee.getErrorSourceName();
			manageErrorSourceName(ci, esn, UpperComponentsEM );
			ErrorSourceNameEnc esne = new ErrorSourceNameEnc(esn, false);
			l.add(esne);
			or.add(l);
			break;
		case BooleanExpressionType.OR:
			// DNF(expr1 or expr2 or ...) = DNF(expr1) or DNF(expr2) or ...
			// We must concate all "or" EList of each DNF(expri)
			if (DEBUG) {
				for (int k = 0; k < indent_level; k++) System.out.print(" ");
				System.out.println("OR_LITERAL");
			}
			for (Iterator it_cbe = bee.getContainedExpressions().iterator(); it_cbe.hasNext();) {
				or.addAll(make_canonical(ci, (BooleanErrorExpression)it_cbe.next(), rules, UpperComponentsEM));
			}
			break;
		case BooleanExpressionType.AND: 
			// We have the expression: (expr1 and expr2 and ...)
			// First, we process all expri to make them DNF. We obtain an EList which contains
			// a list of DNF expression.
			// Then, we call the method process_make_canonical_and which distributes
			// the first "or" EList on the second and recurses until it remains only one
			// "or" EList.
			if (DEBUG) {
				for (int k = 0; k < indent_level; k++) System.out.print(" ");
				System.out.println("AND_LITERAL");
			}
			BasicEList and = new BasicEList();
			for (Iterator it_cbe = bee.getContainedExpressions().iterator(); it_cbe.hasNext();) {
				and.add(make_canonical(ci, (BooleanErrorExpression)it_cbe.next(),rules, UpperComponentsEM));
			}
			or = process_make_canonical_and(and);
			break;
		case BooleanExpressionType.NOT: 
			// We have !(expr). We make expr DNF without considering the "!".
			// So, DNF(expr) = l1 . l2 . l3 + l5 . l6 . l7 + l8 . l9 . l2 + ...
			// We transform !(l1 . l2 . l3 + l5 . l6 . l7 + l8 . l9 . l2 + ...) into
			//   ((l1 + l2 + l3) . (l5 + l6 + l7) . (l8 + l9 + l2))
			// The last expression is an EList of "or" expressions. So, we can continue
			// as in the AND case: we call process_make_canonical_and.
			if (DEBUG) {
				for (int k = 0; k < indent_level; k++) System.out.print(" ");
				System.out.println("NOT_LITERAL");
			}
			EList not_tmp = make_canonical(ci, (BooleanErrorExpression)bee.getContainedExpressions().get(0), rules, UpperComponentsEM);
			BasicEList all_and = new BasicEList();
			for (Iterator it = not_tmp.iterator(); it.hasNext();) {
				BasicEList old_and = (BasicEList)it.next();
				BasicEList new_or = new BasicEList();
				for (int i = 0; i < old_and.size(); i++) {
					BasicEList new_and = new BasicEList();
					ErrorSourceNameEnc old_esne = (ErrorSourceNameEnc)old_and.get(i);
					old_esne.setNot(!old_esne.getNot());
					new_and.add(old_esne);
					new_or.add(new_and);
				}
				all_and.add(new_or);
			}
			or = process_make_canonical_and(all_and);
			break;
		case  BooleanExpressionType.ORMORE:
			int k = bee.getNumericLiteral();
			EList expressions = bee.getContainedExpressions();
			EList or_list = new BasicEList();
			EList bees = new BasicEList();
			for(Iterator it = expressions.iterator(); it.hasNext();){
				BooleanErrorExpression contained_bee = (BooleanErrorExpression) it.next();
				EList or1 = make_canonical(ci, contained_bee, rules, UpperComponentsEM);
				bees.add(or1);
				or_list.addAll(or1);
			}
			for(int j=k; j<=bees.size(); j++){
				or.addAll(Combination.combinations(or_list,bees, j));
			}
			break;
		case BooleanExpressionType.ORLESS:
			k = bee.getNumericLiteral();
			expressions = bee.getContainedExpressions();
			or_list = new BasicEList();
			bees = new BasicEList();
			for(Iterator it = expressions.iterator(); it.hasNext();){
				BooleanErrorExpression contained_bee = (BooleanErrorExpression) it.next();
				EList or1 = make_canonical(ci, contained_bee, rules, UpperComponentsEM);
				bees.add(or1);
				or_list.addAll(or1);	
			}
			for(int j=k; j>=1; j--){
				or.addAll(Combination.combinations(or_list, bees, j));
			}
			break;	
		case BooleanExpressionType.OTHERS:
			BasicEList all_or = new BasicEList();
			for(Iterator it = rules.iterator(); it.hasNext();){
				BooleanErrorExpression bee1 = ((ErrorPropagationRule)it.next()).getErrorExpression();
				if(bee1.getType()!= BooleanExpressionType.OTHERS_LITERAL){
					all_or.addAll(make_canonical(ci, bee1, rules, UpperComponentsEM));
				}
			}
			or = process_make_canonical_not(all_or);
			break;
		default:
			or = null;
		break;
		}
		if (DEBUG) {
			for (int k1 = 0; k1 < indent_level; k1++) System.out.print(" ");
			System.out.print("Resultat: ");
			print_canonical((BasicEList)or);
			indent_level -= 2;
		}
		return or;
	}

	/**
	 * This method distributes the first "or" DNF EList on the second and recurses
	 * until it remains only one "or" DNF EList.
	 * @param and BasicEList containing the expression to transform in DNF
	 * @return result BasicEList containing the expression in the DNF
	 */
	static private BasicEList process_make_canonical_and(BasicEList and) {
		BasicEList result = new BasicEList();
		if (and.size() > 1) {
			BasicEList first = (BasicEList)and.remove(0);
			for (int j = 0; j < first.size(); j++) {
				// (a + b) . R = a . R + b . R
				// We concatenate a to all "and" expression of the first "or" expression of R.
				// We do the same with b. So, we must clone R.
				BasicEList new_and = clone_canonical_and(and);
				BasicEList new_first = (BasicEList)new_and.get(0);
				for (int i = 0; i < new_first.size(); i++) {
					((BasicEList)new_first.get(i)).addAll((BasicEList)first.get(j));
				}
				result.addAll(process_make_canonical_and(new_and));
			}
		} else if (and.size() == 1){
			result = (BasicEList)and.get(0);
		}
		return result;
	}


	static private BasicEList clone_canonical_and(BasicEList cluster_and) {
		BasicEList new_cluster_and = new BasicEList();
		for (int k = 0; k < cluster_and.size(); k++) {
			BasicEList old_or = (BasicEList)cluster_and.get(k);
			BasicEList new_or = new BasicEList();
			new_cluster_and.add(new_or);
			for (int i = 0; i < old_or.size(); i++) {
				BasicEList old_and = (BasicEList)old_or.get(i);
				new_or.add(old_and.clone());
			}
		}
		return new_cluster_and;
	}
	/**
	 * 
	 * This method takes an expression in the DNF and computes its negation, the expression 
	 * returned is in the DNF 
	 * 
	 * @param or BasicEList contains the expression expr in DNF for which we want to compute !(expr)
	 * @return not_or
	 * 
	 * @author Marilena Bruffa
	 */
	static private BasicEList process_make_canonical_not(BasicEList or) {
		//or is a list of and
		BasicEList not_or = new BasicEList();
		BasicEList all_and = new BasicEList();
		//a.b is transformed into !a+!b
		//a.b+c is transformed into (!a+!b).!c
		//a.b+c.d is transformed into (!a+!b).(!c+!d)
		for(Iterator it = or.iterator(); it.hasNext();){
			BasicEList and = (BasicEList)it.next();
			BasicEList all_or = new BasicEList();
			for(Iterator it_and = and.iterator(); it_and.hasNext();){
				ErrorSourceNameEnc old_esn = (ErrorSourceNameEnc) it_and.next();
				//we get the negation of the value of old_esn
				old_esn.setNot(!old_esn.getNot());
				BasicEList new_or = new BasicEList();
				new_or.add(old_esn);
				all_or.add(new_or); //it represents !a+!b+...
			}
			all_and.add(all_or); //(!a+!b).(!c+!d). ... .(!x+!y)
		}
		not_or = process_make_canonical_and(all_and); // !a.!c+!a.!d+!b.!c+!b.!d
		return not_or;
	}

	static public void print_canonical(EList or) {
		if (or == null) {
			System.out.println("null expression");
		}
		for (int i = 0; i < or.size(); i++) {
			if (i > 0) {
				System.out.print(" + ");
			}
			EList and = (EList)or.get(i);
			for (int j = 0; j < and.size(); j++) {
				if (j > 0) {
					System.out.print(".");
				}
				if (((ErrorSourceNameEnc)and.get(j)).getNot()) {
					System.out.print("!");
				}
				System.out.print(((ErrorSourceNameEnc)and.get(j)).getEsn().getErrorStateOrPropagationName());
			}
		}
		System.out.println();
	}
	
	/**
	 * This method manages the case in which errorStateOrPropagationName list is empty 
	 * The initial error state of the connected component should be referenced
			
	 * @param ci ComponentInstance
	 * @param esn ErrorSourceName
	 * @param UpperComponentsEM EList 
	 */
	private static void manageErrorSourceName(ComponentInstance ci, ErrorSourceName esn, EList UpperComponentsEM){
		FindSenderOrReceiverErrorModel fsrem = new FindSenderOrReceiverErrorModel();
		EList statesOrPropagations = esn.getErrorStateOrPropagationName();
		if(statesOrPropagations.size() == 0){
			System.out.println("no state");
			EList senders = new BasicEList();
			EList initialStates = new BasicEList();
			NamedElement ph = esn.getSubcomponentOrFeature();
			if(ph != null){
				EList features = ci.getFeatureInstances();
				FeatureInstance feature = null;
				for(Iterator it = features.iterator(); it.hasNext();){
					FeatureInstance fi = (FeatureInstance) it.next();
					if(fi.getName().equals(ph.getName())){
						feature = fi;	
					}
				}
				senders = fsrem.getSenders(ci, feature, UpperComponentsEM);
			}
			else{
				EList l1 = new BasicEList();
				l1.add(ci);
				senders.add(l1);
			}
			for(Iterator it = senders.iterator(); it.hasNext();){
				EList states = new BasicEList();
				EList element = (EList)it.next();
				InstanceObject sender = (InstanceObject) element.get(0);
				ErrorModelImplementation emi = hasAbstractEM.getErrorModelImplementation(sender);
				ErrorTransitions transitions = emi.getErrorTransitions();
				EList trans = transitions.getErrorTransition();
				for(Iterator it2 = trans.iterator(); it2.hasNext();){
					ErrorTransition et = (ErrorTransition) it2.next();
					states = et.getOrigin();
					states.add(et.getDestination());
				}
				for(Iterator it3 = states.iterator(); it3.hasNext();){
					ErrorState es = (ErrorState) it3.next();
					if(es.isInitial() && !initialStates.contains(es)){
						initialStates.add(es);
						esn.getErrorStateOrPropagation().add(es);
						esn.getErrorStateOrPropagationName().add(es.getName());
					}
				}
			}
		}
	}

}
