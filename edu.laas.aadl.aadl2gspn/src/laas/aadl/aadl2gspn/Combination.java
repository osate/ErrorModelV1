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

/**
 * @uml.dependency   supplier="laas.aadl.aadl2gspn.BooleanOperations" stereotypes="Standard::Call"
 */
public class Combination {
	
	/**
	 * 
	 * This method computes the simple combinations of length k, of n elements (contained 
	 * in the list passed as parameter) that don't belong to the same boolean error expression
	 * 
	 * @param elements EList containing the elements, EList of objects ErrorSourceNameEnc
	 * @param bees EList containing the boolean error expressions in the DNF
	 * @param k int, length of the combinations
	 * @return result, EList containing all the combinations of n elements over k places
	 * 
	 * @author Marilena Bruffa
	 */
	@SuppressWarnings("unchecked")
	public static EList combinations(EList elements, EList bees, int k){
		EList possible_result = new BasicEList();
		EList result = new BasicEList();
		EList comb = new BasicEList();
		//find all the possible combinations of elements over k places
		possible_result.addAll(combinations(elements, k));
		//find the ands that come from the same boolean error expression
		for(Iterator it = bees.iterator(); it.hasNext();){
			EList or = (EList) it.next();
			for(int i=2; i<=or.size(); i++){
				comb.addAll(combinations(or,i));
			}
		}
		result = clone(possible_result);
		//remove those intermediary products (coming form the same bee)
		for(Iterator it1 = possible_result.iterator(); it1.hasNext();){
			EList l = (EList)it1.next();//and list
			for(int j=0; j<comb.size(); j++){
				EList el = (EList)comb.get(j);
				if(l.containsAll(el)){
					result.remove(l);
				}
			}	
		}
		return result;	
	}
	/**
	 * 
	 * This method computes the simple combinations of length k, of the n elements contained 
	 * in the list passed as parameter, 
	 * for example [a b c d] k=2 returns the list [ab ac ad bc bd cd]
	 * 
	 * @param elements
	 * @param k
	 * @return result, EList
	 * 
	 * @author Marilena Bruffa
	 */
	@SuppressWarnings("unchecked")
	protected static EList combinations(EList elements, int k){
		EList result = new BasicEList();
		if(k==0)
			return new BasicEList();
		if(k==1){
			return elements;
		}
		for(int i=0; i<elements.size();i++){
			EList first = (EList)elements.get(i);
			EList rest = new BasicEList();
			//copy of the rest of the list 
			for(int j=i+1; j<elements.size(); j++){
				EList l = (EList) elements.get(j); 
				if(l!=first){
					rest.add(l);
				}
			}
			//find the combinations of length k-1 on the rest of the list
			EList partial_combinations = combinations(rest,k-1);
			//product between first element of the list and the rest
			for(Iterator it1 = partial_combinations.iterator(); it1.hasNext();){
				BasicEList l = (BasicEList) it1.next();
				BasicEList and = new BasicEList();
				and.addAll(first);
				and.addAll(l);
				result.add(and);	
			}
		}
		return result;
	}
	
	/**
	 * 
	 * @param elements EList containing objects of class BooleanExpression
	 * @param k length of the combinations k>0
	 * @return EList containing all the combinations of length k of the boolean 
	 * operands contained in the boolean expressions
	 */
	@SuppressWarnings("unchecked")
	public static EList combineBooleanExpressions(EList elements, int k){
		
		/*for(Iterator i = elements.iterator(); i.hasNext();){
			BooleanExpression be = (BooleanExpression) i.next();
			be.printExpression();
		}*/
		if(k==1 || elements.size() == 1){
			return elements;
		}

		EList result = new BasicEList();
		EList rest = new BasicEList();
		BooleanExpression first = (BooleanExpression)elements.get(0);
		for(int i=1; i<elements.size();i++){
			BooleanExpression l = (BooleanExpression) elements.get(i); 
			if(l!=first){
				rest.add(l);
			}	
		}
		//find the combinations of length k-1 on the rest of the list
		
		EList partial_combinations = combineBooleanExpressions(rest,k-1);
		//product between first element of the list and the rest
		for(Iterator it1 = partial_combinations.iterator(); it1.hasNext();){
			BooleanExpression l = (BooleanExpression) it1.next();
			BooleanExpression and = BooleanOperations.and(first, l);
			and.simplifyBooleanExpression();
			if(and.or.size() != 0)
				result.add(and);	
		}
		return result;
	}
	
	/** 
	 * This method creates a list that is a copy of the list origin
	 * 
	 * @param origin EList
	 * @return copy EList
	 * 
	 * @author Marilena Bruffa
	 */
	@SuppressWarnings("unchecked")
	protected static EList clone(EList origin){
		EList copy = new BasicEList();
		for(int j=0; j<origin.size(); j++){
			copy.add(origin.get(j));
		}
		return copy;
	}
}
