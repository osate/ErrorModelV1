/**
 * <copyright>
 * Copyright  2007 by LAAS-CNRS, all rights reserved.
 *
 * Use of ADAPT is subject to the terms of the license set forth
 * at http://www.eclipse.org/legal/cpl-v10.html.
 *
*/

package laas.aadl.aadl2gspn;

import PetriNet.Place;
import java.util.Iterator;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;


/**
 * This class represents a boolean expression in DNF
 * @author       Marilena Bruffa
 * @uml.dependency   supplier="laas.aadl.aadl2gspn.BooleanOperand" stereotypes="Omondo::Access"
 */
public class BooleanExpression{
	EList or = new BasicEList(); // EList of BooleanOperand objects
	
	/**
	 * This is the constructor for the class, it creates a boolean expression from the operands
	 * specified through the parameter, it is an expression in the DNF
	 *  
	 * @param boolOperands EList containing objects of class BooleanOperand
	 */
	public BooleanExpression(EList boolOperands){
		or = boolOperands;
	}
	
	/**
	 * Default constructor, it creates an empty boolean expression
	 *
	 */
	public BooleanExpression() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 * @param bo BooleanOperand to add to this boolean expression
	 */
	@SuppressWarnings("unchecked")
	public void addBooleanOperand(BooleanOperand bo){
		or.add(bo);
	}
	/**
	 * It returns the elements of this boolean expression
	 * 
	 * @return or, EList of BooleanOperand objects
	 */
	public EList getExpression(){
		return or;
	}
	
	/**
	 * 
	 * @return the number of operands contained in the expression
	 */
	public int getSize(){
		return or.size();
	}
	
	/**
	 * This is a method used to print the expression
	 *
	 */
	public void printExpression(){
		System.out.print("[");
		for(int i=0; i<or.size(); i++){
			BooleanOperand bo = (BooleanOperand)or.get(i);
			bo.printOperand();
			if(i!=or.size()-1)
				System.out.print(" + ");
		}
		System.out.println("]");
	}
	/**
	 * This method simplifies the current boolean expression
	 *
	 */
	@SuppressWarnings("unchecked")
	public void simplifyBooleanExpression(){
		BooleanOperand next;
		EList copy= new BasicEList();
		copy.addAll(this.or);
		for(int i=0; i<copy.size(); i++){
			BooleanOperand first = (BooleanOperand)copy.get(i);
			first.semplifyOperand();
			for(int j=i+1; j<i+copy.size(); j++){
				next=(BooleanOperand)copy.get(j%copy.size());
				next.semplifyOperand();
				if(next.containsOperand(first)){
					this.or.remove(next);
				}
			}
		}
	}
}
/**
 * This class is created to define a boolean variable that will be used to compute  expressions in order to find the evacuation transitions and the arcs linked to them.
 * @author   Marilena Bruffa
 * @uml.dependency   supplier="PetriNet.Place" stereotypes="Omondo::Access"
 */
class BooleanVariable {
	String name;
	Place p;
	boolean not;
	
	/**
	 * Constructor
	 * @param name
	 * @param not
	 */
	public BooleanVariable(String name, Place p, boolean not){
		this.name = name;
		this.p = p;
		this.not = not;
	}
	
	public BooleanVariable() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @return p field, the Place corresponding
	 */
	public Place getPlace(){
		return p;
	}
	
	/**
	 * 
	 * @return the not field, boolean type
	 */
	public boolean getNot(){
		return not;
	}
	
	/**
	 * 
	 * @return the name field, a String object
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * This method is used to print the boolean variable
	 *
	 */
	public void printVariable(){
		String placename = name.substring(name.lastIndexOf('.')+1);
		if(this.getNot())
			System.out.print("!"+placename);
		else
			System.out.print(placename);
	}
	
	/**
	 * This method overrides the method equals of class Object, it returns true if
	 * this boolean variable is equal to the variable passed as parameter
	 * 
	 * @param bv BooleanVariable
	 * @return
	 */
	public boolean equals(BooleanVariable bv){
		if(bv.getName() == name && bv.getNot() == not){
			return true;
		}
		return false;
	}
}

/**
 * This class represents a single operand of a BooleanExpression object
 * @author     Marilena Bruffa
 *
 */
class BooleanOperand{
	/**
	 * EList of BooleanVariable objects 
	 */
	EList bool_variables = new BasicEList();;
	
	/**
	 * Constructor for the class, it creates a boolean operand containing the boolean variables
	 * contained in the parameter
	 *  
	 * @param variables Elist containing objects of class BooleanVariable
	 */
	public BooleanOperand(EList variables){
		bool_variables = variables;	
	}
	
	/**
	 * Constructor for the class, it creates a boolean operand containing a single boolean variable
	 * contained in the parameter
	 * 
	 * @param bv BooleanVariable
	 */
	@SuppressWarnings("unchecked")
	public BooleanOperand(BooleanVariable bv){
		bool_variables.add(bv);
	}
	
	/**
	 * Default constructor for the class, it creates an empty boolean operand
	 *
	 */
	public BooleanOperand() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * This method adds a boolean variable to the current boolean operand,
	 * es: bo = abc this.addBooleanVariable(d) -> bo = abcd;
	 * @param bv
	 */
	@SuppressWarnings("unchecked")
	public void addBooleanVariable(BooleanVariable bv){
		bool_variables.add(bv);
	}
	
	/**
	 * 
	 * @return the EList containing the BooleanVariable object
	 */
	public EList getOperands(){
		return bool_variables;
	}
	
	/**
	 * This method is used to print the boolean operand
	 *
	 */
	public void printOperand(){
		for(int i=0; i<bool_variables.size(); i++){
			BooleanVariable bv = (BooleanVariable)bool_variables.get(i);
			bv.printVariable();
			if(i<bool_variables.size()-1)
				System.out.print(".");	
		}
	}
	
	/**
	 * This method is a test to see if the current operand contains or is equal to the operand
	 * passed as a parameter
	 * 
	 * @param bo BooleanOperand
	 * @return a boolean value
	 */
	public boolean containsOperand(BooleanOperand bo){
		boolean found;
		EList or2 = bo.getOperands();
		for(Iterator it1 = or2.iterator(); it1.hasNext();){
			BooleanVariable bv1 = (BooleanVariable) it1.next();
			found = false;
			for(Iterator it2 = this.bool_variables.iterator(); it2.hasNext();){
				BooleanVariable bv2 = (BooleanVariable) it2.next();
				if(bv1.equals(bv2))
					found = true;
			}
			if(found == false)
				return false;
		}
		return true;
	}
	
	/**
	 * This method overrides the method equals of class Object in order to face general situations
	 * such as for example abcd.equals(bacd)
	 * 
	 * @param bo BooleanOperand with whom test the equality
	 * @return a boolean value
	 */
	public boolean equals(BooleanOperand bo){
		if(bo.getOperands().size() == bool_variables.size()){
			for(Iterator it1 = bool_variables.iterator(); it1.hasNext();){
				BooleanVariable bv1 = (BooleanVariable) it1.next();
				boolean found = false;
				for(Iterator it2 = bo.getOperands().iterator(); it2.hasNext();){
					BooleanVariable bv2 = (BooleanVariable) it2.next();
					if(bv1.equals(bv2)){
						found = true;
						break;
					}
				}
				if(found == false)
					return false;
			}
		}
		return true;
	}
	
	/**
	 * This method applies the rules a.!a = 0 and a.a = a and !a.!a = !a
	 * in order to semplify the boolean operand
	 */
	@SuppressWarnings("unchecked")
	public void semplifyOperand(){
		EList operand = new BasicEList();
		operand.addAll(this.bool_variables);
		for(int i=0; i<operand.size(); i++){
			BooleanVariable bv1 = (BooleanVariable)operand.get(i);
			for(int j=i+1; j<operand.size(); j++){
				BooleanVariable bv2 = (BooleanVariable) operand.get(j);
				if(bv1.getName().equals(bv2.getName())){
					if(bv1.getNot() && !bv2.getNot() || !bv1.getNot() && bv2.getNot()){ //this happens in both the cases [a,!a] or [!a,a]
						bool_variables = new BasicEList();
						return;
				}
					else{ //cases a.a or !a.!a
						bool_variables.remove(bv2); //remove the next occurrence
					}
				}
			}
		}
	}
}

