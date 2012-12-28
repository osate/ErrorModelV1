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
import PetriNet.PetriNet;
import PetriNet.Place;
import PetriNet.PlaceToTransition;
import PetriNet.Transition;

/**
 * 
 * This class contains a set of methods used for the computation of logical operations and
 * the manipulation and semplification of the boolean expressions
 * 
 * @author Marilena Bruffa
 * 
 *
 */
public class BooleanOperations{
	
	/**
	 * This method finds the places, other than the intermediary place, in the petri net the have 
	 * outgoing arcs to the transition t given as a parameter of the method and creates the corresponding
	 * BooleanOperand object
	 * 
	 * @param pn PetriNet
	 * @param intermediaryPlace Place
	 * @param t Transition
	 * @return bo BooleanOperand
	 */
	public static BooleanOperand getTransitionCauseExpression(PetriNet pn, Place intermediaryPlace, Transition t){
		BooleanOperand bo = new BooleanOperand();
		EList incoming_arcs = t.getPlaceToTransition();
		for(Iterator it = incoming_arcs.iterator(); it.hasNext();){
			PlaceToTransition arc = (PlaceToTransition) it.next();
			Place origin = arc.getPlace();
			if(origin != intermediaryPlace){
				BooleanVariable bv;
				if(arc.isInhibitor()){
					bv = new BooleanVariable(origin.getName(), origin, true);
				}
				else{
					bv = new BooleanVariable(origin.getName(), origin, false);
				}
				bo.addBooleanVariable(bv);
			}
		}
		return bo;
	}
	
	/**
	 * This method computes the and between n boolean expressions in DNF
	 * 
	 * @param bes EList containing objects of class BooleanExpression
	 * @return be BooleanExpression representing the and of the boolean expressions contained
	 * in the list passes as parameter
	 */
	public static BooleanExpression and(EList bes){
		if(bes.size() == 0)
			return new BooleanExpression();
		BooleanExpression new_be = new BooleanExpression();
		BooleanExpression be = (BooleanExpression) bes.get(0);
		for(int i=1; i<bes.size(); i++){
			new_be = and(be, (BooleanExpression) bes.get(i));
			be = new_be;
		}
		return be;
	}
	
	/**
	 * This method computes the logic operation AND between two boolean expressions in DNF
	 * 
	 * @param be1 BooleanExpression
	 * @param be2 BooleanExpression
	 * @return and BooleanExpression
	 */
	@SuppressWarnings("unchecked")
	protected static BooleanExpression and(BooleanExpression be1, BooleanExpression be2){
		BooleanExpression and = new BooleanExpression();
		EList l1 = be1.getExpression();
		EList l2 = be2.getExpression();
		for(Iterator it1=l1.iterator(); it1.hasNext();){
			BooleanOperand bo1 = (BooleanOperand) it1.next();
			for(Iterator it2=l2.iterator(); it2.hasNext();){
				BooleanOperand bo2 = (BooleanOperand) it2.next();
				EList factor = new BasicEList();
				factor.addAll(bo1.getOperands());
				factor.addAll(bo2.getOperands());
				BooleanOperand op = new BooleanOperand(factor);
				op.semplifyOperand();
				if(op.bool_variables.size() !=0 )
					and.addBooleanOperand(op);	
			}
		}
		and.simplifyBooleanExpression();
		return and;
	}
	
	/**
	 * This method implements the logical operation not(expr) in which expr is a boolean expression
	 * in DNF
	 * es: !(a + bc + d) = !a.!(bc).!d = !a.(!b+!c).!d = !a.!b.!d +!a.!c!.d
	 * @param be BooleanExpression
	 * @return result BooleanExpression
	 */
	@SuppressWarnings("unchecked")
	public static BooleanExpression not(BooleanExpression be){
		EList boolOperands = be.getExpression();
		EList rest = new BasicEList();
		rest.addAll(boolOperands); //copy the list
		if(be.getSize() == 0)
			return new BooleanExpression();
		if(be.getSize() == 1){
			return notBooleanOperand((BooleanOperand)be.getExpression().get(0));
		}
		BooleanOperand bo = (BooleanOperand) rest.remove(0);
		BooleanExpression f1 = notBooleanOperand(bo);
		BooleanExpression f_rest = not(new BooleanExpression(rest));
		BooleanExpression result = and(f1,f_rest);

		return result;	
	}

	/**
	 * This method computes the negation of an and expression, using the rule of 
	 * De Morgan !(abc...) = !a+!b+!c+...
	 * @param bo 
	 * @return be BooleanExpression that represents the DNF of !bo
	 */
	public static BooleanExpression notBooleanOperand(BooleanOperand bo){
		BooleanExpression be = new BooleanExpression();
		EList operands = bo.getOperands();
		BooleanVariable new_bv = new BooleanVariable();
		for(Iterator it=operands.iterator(); it.hasNext();){
			BooleanVariable bv = (BooleanVariable) it.next();
			if(bv.getNot()){
				new_bv = new BooleanVariable(bv.getName(),bv.getPlace(),false);
			}
			else
				new_bv = new BooleanVariable(bv.getName(),bv.getPlace(),true);
			be.addBooleanOperand(new BooleanOperand(new_bv));
		}
		return be;
	}
	
	/**
	 * 
	 * This method computes the logic operation and between 2 boolean operands
	 * a.b.c & c.d = a.b.c.d
	 * 
	 * @param bo1 BooleanOperand
	 * @param bo2 BooleanOperand
	 * @return bo BooleanOperand corresponding to the and of bo1 with bo2
	 */
	@SuppressWarnings("unchecked")
	public static BooleanOperand and(BooleanOperand bo1, BooleanOperand bo2){
		EList and = new BasicEList();
		and.addAll(bo1.getOperands());
		and.addAll(bo2.getOperands());
		BooleanOperand bo = new BooleanOperand(and);
		bo.semplifyOperand();
		return bo;
	}
}