/**
 * <copyright>
 * Copyright  2007 by LAAS-CNRS, all rights reserved.
 *
 * Use of ADAPT is subject to the terms of the license set forth
 * at http://www.eclipse.org/legal/cpl-v10.html.
 *
*/

package laas.aadl.aadl2gspn;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilePermission;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.osate.aadl2.instance.ComponentInstance;
import org.osate.aadl2.instance.ConnectionInstance;
import org.osate.aadl2.instance.SystemInstance;

import com.ice.tar.TarArchive;
import com.ice.tar.TarEntry;

import PetriNet.Arc;
import PetriNet.NamedElement;
import PetriNet.OccurrenceType;
import PetriNet.PetriNet;
import PetriNet.Place;
import PetriNet.PlaceToTransition;
import PetriNet.Transition;
import PetriNet.TransitionToPlace;
import edu.cmu.sei.aadl.errorannex.BooleanErrorExpression;
import edu.cmu.sei.aadl.errorannex.DerivedErrorStateMappingGuard;
import edu.cmu.sei.aadl.errorannex.ErrorStateMappingRule;
import edu.cmu.sei.aadl.errorannex.util.EAXUtil;



/**
 * 
 * @author Ana Rugina aerugina@laas.fr
 * This class aims at transfrming a PN object into a text file that can be processed by
 * the tool Surf-2
 *
 */

public class PN2Surf {

	public static void PN2Surf2(final PetriNet pn, final SystemInstance si, final EList UpperComponentsEM, String name) {

		final Display d = PlatformUI.getWorkbench().getDisplay();
		d.syncExec(new Runnable(){
			File Net = null;
			File Part = null;
			File date_sauv_modele = null;
			File date_sauv_part = null;
			File Part_tmp = null;

			File archivePetri = null;
			File dirPetri = null;

			// create SaveAs dialog  
			String path;
			public void run() {
				IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();

				Shell sh = window.getShell();
				FileDialog fd = new FileDialog(sh, SWT.SAVE);
				path = fd.open();
				if (path != null) {
					archivePetri = new File(path);

					// suffix for the RP directory to be put in the tar archive
					int i=1;
					// increment i while a file named RPi already exists
					do {
						dirPetri = (new File(archivePetri.getParent()+"/RP"+i));
						i++;
					}while(dirPetri.exists());
					dirPetri.mkdir();
					new FilePermission(dirPetri.getAbsolutePath(), "write");

					// Create files necessary to Surf 
					try {
						Net =  new File(dirPetri.getPath()+"/"+"Net");
						Part = new File(dirPetri.getPath()+"/"+"Part");

						date_sauv_modele = new File(dirPetri.getPath()+"/"+"date_sauv_modele");
						date_sauv_part = new File(dirPetri.getPath()+"/"+"date_sauv_part");
						Part_tmp = new File(dirPetri.getPath()+"/"+"Part.tmp");

						// the files below are empty
						(new File(dirPetri.getPath()+"/"+"Etude")).createNewFile();
						(new File(dirPetri.getPath()+"/"+"Invariant")).createNewFile();
						(new File(dirPetri.getPath()+"/"+"Noms_Etudes")).createNewFile();
						(new File(dirPetri.getPath()+"/"+"lock")).createNewFile();
						(new File(dirPetri.getPath()+"/"+"Invariant.tmp")).createNewFile();

						// we write in the files Net, Part, part.tmp and date_sauv_xxxx
						buildDateSauvFiles(date_sauv_modele, date_sauv_part);
						buildNetFile(pn, Net);
						buildPartFile(Part, Part_tmp, si, UpperComponentsEM);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}


					try {
						OutputStream archive_output = new FileOutputStream(path+".petri");
						TarArchive ta = new TarArchive(archive_output);
						TarEntry tarAdd = new TarEntry(dirPetri);
						ta.writeEntry(tarAdd, true);
						ta.closeArchive();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					// delete the RPi directory and its contents and leave only the tar archive
					File myfiles[] = dirPetri.listFiles();
					for (int j=0; j<myfiles.length;j++){
						myfiles[j].delete();
					}
					dirPetri.delete();

				}// end if saveAs chosen
			}
		});
	}// end method PN2Surf2		


	public static void buildDateSauvFiles(File date_sauv_modele, File date_sauv_part) throws IOException{
		PrintWriter writerDateSauvModele = new PrintWriter(new BufferedWriter(new FileWriter(date_sauv_modele, false)));
		PrintWriter writerDateSauvPart = new PrintWriter(new BufferedWriter(new FileWriter(date_sauv_part, false)));
		// put the date in format yyyyMMdd hhmmss
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HHmmss");
		Date now = new Date(); 
		writerDateSauvModele.print(sdf.format(now)+"\n");
		writerDateSauvModele.close();
		writerDateSauvPart.print(sdf.format(now)+"\n");
		writerDateSauvPart.close();
	}// end method buidlDate_sauvFiles

	public static void buildPartFile(File Part, File Part_tmp, SystemInstance si, EList UpperComponentsEM) throws IOException {
		PrintWriter writerPart, writerPart_tmp;
		writerPart = new PrintWriter(new BufferedWriter(new FileWriter(Part, false)));
		writerPart_tmp = new PrintWriter(new BufferedWriter(new FileWriter(Part_tmp, false)));
		String FailedStateClass=new String("Failed={};");
		String CatastrophicStateClass=new String ("Catastrophic={};");
		EAXUtil utilEMA = new edu.cmu.sei.aadl.errorannex.util.EAXUtil();
		DerivedErrorStateMappingGuard derivedEM = utilEMA.getDerivedErrorStateMappingGuard(si);
		if (derivedEM != null){
			// for each mapping rule
			EList mappingRules = derivedEM.getErrorStateMappingRule();
			for (Iterator it = mappingRules.iterator(); it.hasNext();) {
				ErrorStateMappingRule mr =  (ErrorStateMappingRule) it.next();
				String StateClass = mr.getErrorState().getName();
				BooleanErrorExpression bee = mr.getErrorExpression();
				if (StateClass.compareToIgnoreCase("failed")==0){
					FailedStateClass = new String("Failed=");
					EList bee_DNF = ToDisjunctiveNormalForm.make_canonical(si, bee, mappingRules, UpperComponentsEM);
					FailedStateClass = FailedStateClass.concat(buildPrintableBoolExpr(bee_DNF,si));
					FailedStateClass = FailedStateClass.concat(";");
				}
				else if (StateClass.compareToIgnoreCase("catastrophic")==0){
					CatastrophicStateClass = new String("Catastrophic=");
					EList bee_DNF = ToDisjunctiveNormalForm.make_canonical(si, bee, mappingRules, UpperComponentsEM);
					
					CatastrophicStateClass = CatastrophicStateClass.concat(buildPrintableBoolExpr(bee_DNF,si));
					CatastrophicStateClass = CatastrophicStateClass.concat(";");
				} 
			}

		}
		// write in Part file
		writerPart.print("STATE_CLASS\n");
		writerPart.print(FailedStateClass+"\n");
		writerPart.print(CatastrophicStateClass+"\n");
		writerPart.print("PARTITION\n");
		writerPart.print("Part=IMPROPER Failed CATASTROPHIC Catastrophic;");
		writerPart.close();
		// write in Part.tmp file
		writerPart_tmp.print("STATE_CLASS\n");
		writerPart_tmp.print(FailedStateClass+"\n");
		writerPart_tmp.print(CatastrophicStateClass+"\n");
		writerPart_tmp.print("PARTITION\n");
		writerPart_tmp.print("Part=IMPROPER Failed CATASTROPHIC Catastrophic;");
		writerPart_tmp.close();
	}// end method buildPartFile

	public static void buildNetFile(PetriNet pn, File Net) throws IOException{
		// i,j = coordinates of a node
		double i = 0.00;
		double j = 0.00;
		PrintWriter writerNet = new PrintWriter(new BufferedWriter(new FileWriter(Net, false)));
		EList nodes = pn.getNamedElement();
		EList arcs = pn.getArcs();
		// write # nb_of_nodes nb_of_edges
		writerNet.print("# "+nodes.size()+" "+arcs.size()+"\n");

		// process each node
		for (Iterator it = nodes.iterator(); it.hasNext();) {
			NamedElement ne =  (NamedElement) it.next();
			if (ne instanceof Place){
				// write @ node_number node_type=2
				writerNet.print("@ "+(nodes.indexOf(ne)+1)+" "+"2"+"\n");
				// write size_nodeNameString nodeNameString
				writerNet.print(ne.getName().length()+" "+ne.getName()+"\n");
				// write relative location of node name from the center of the node
				writerNet.print("-7.25 0.38"+"\n");
				// write @ size_infoString infoString (~initial marking for a place)
				writerNet.print("@ 1 "+((Place)ne).getInitialMarking()+"\n");
				// write relative location of the information
				writerNet.print("0.00 0.00"+"\n");
				// write 0 meaning that there is no comment string
				writerNet.print("0"+"\n");
				writerNet.print("0"+"\n");
				// write coordinates of node
				writerNet.print(i+" "+j+"\n");
			}
			else if (ne instanceof Transition){
				if (((Transition)ne).getOccurrence()==OccurrenceType.POISSON_LITERAL){
					// write @ node_number node_type=3
					writerNet.print("@ "+(nodes.indexOf(ne)+1)+" "+"3"+"\n");
				}
				else 
					// write @ node_number node_type=4
					writerNet.print("@ "+(nodes.indexOf(ne)+1)+" "+"4"+"\n");
				// write size_nodeNameString nodeNameString
				writerNet.print(ne.getName().length()+" "+ne.getName()+"\n");
				// write relative location of node name from the center of the node
				writerNet.print("-7.25 0.38"+"\n");
				// write @ size_infoString infoString (parameter =probability or distribution parameter)
				writerNet.print("@ "+ ((Transition)ne).getParam().length()+" "+((Transition)ne).getParam()+"\n");
				// write relative location of the information
				writerNet.print("0.00 0.00"+"\n");
				// write 0 meaning that there is no comment string
				writerNet.print("0"+"\n");
				writerNet.print("0"+"\n");
				// write coordinates of node
				writerNet.print(i+" "+j+"\n");
			}
			/*if (i<250)
				i = i+10.00;
			else 
				{i = 0;
				 j = j +5.00;
				}*/
			i=i+5;
			j=j+5;
		}

		// process each edge
		i = 0.00;
		j = 5.00;
		for (Iterator it = arcs.iterator(); it.hasNext();) {
			Arc a =  (Arc) it.next(); 
			if (a instanceof PlaceToTransition){
				Place pl=((PlaceToTransition)a).getPlace();
				Transition t=((PlaceToTransition)a).getTransition();
				int transType = t.getOccurrence().getValue()+3;
				// write @ origin_node_nb origin_node_type=(2 for place)  
				// dest_node_nb dest_node_type=(3 for timed tr or 4 for immediate tr)
				writerNet.print("@ "+(nodes.indexOf(pl)+1)+ " 2 " + (nodes.indexOf(t)+1)+" "+transType+"\n");
				// write @ size_infoString infoString=0 if inhibitor arc or weight otherwise
				if (((PlaceToTransition)a).isInhibitor())
					writerNet.print("@ "+"1"+" "+"0"+"\n");
				else
					writerNet.print("@ "+ String.valueOf(a.getWeight()).length() +" "+a.getWeight()+"\n");
			}
			else if (a instanceof TransitionToPlace){
				Place pl=((TransitionToPlace)a).getPlace();
				Transition t=((TransitionToPlace)a).getTransition();
				int transType = t.getOccurrence().getValue()+3;
				// write @ origin_node_nb origin_node_type=(3 for timed tr or 4 for immediate tr)  
				// dest_node_nb dest_node_type=(2 for place)
				writerNet.print("@ "+(nodes.indexOf(t)+1)+" "+transType+" "+(nodes.indexOf(pl)+1)+" 2"+"\n");
				// write @ size_infoString infoString=weight of arc
				writerNet.print("@ "+ String.valueOf(a.getWeight()).length() +" "+a.getWeight()+"\n");
			}

			// write relative location of information
			writerNet.print("0.00 0.00"+"\n");
			// write 0 meaning that there is no comment string
			writerNet.print("0"+"\n");
			// write nb of vertices (surf needs at least 2) and list of points for vertices
			writerNet.print("2 "+ i +" "+ i + " "+ j +" "+j+"\n");
			i = i + 10.00;
			j = j + 10.00;
		}
		// end of file is indicated by 0
		writerNet.print(0+"\n");
		writerNet.close();
	}// end method buildNetFile

	static public String buildPrintableBoolExpr(EList or, SystemInstance si) {
		// paranthesis for the highest level OR
		String BoolExp = "(";
		if (or != null) {
			for (int i = 0; i < or.size(); i++) {
				if (i > 0) {
					BoolExp = BoolExp.concat(" or ");
				}
				// paranthesis beginning of AND
				BoolExp = BoolExp.concat("(");
				EList and = (EList)or.get(i);
				for (int j = 0; j < and.size(); j++) {
					if (j > 0) {
						BoolExp = BoolExp.concat(" and ");
					}

					// deal with states in brackets to build the prefix 
					// corresponding to the instanceObjectPath of the referenced subcomponent
					org.osate.aadl2.NamedElement subcomponent = ((((ErrorSourceNameEnc)and.get(j)).getEsn())).getSubcomponentOrFeature();
					String placePrefix = "";
					if (subcomponent != null){
						EList allSubcomponents = si.getChildren();
						for (int l = 0; l<allSubcomponents.size(); l++){
							org.osate.aadl2.NamedElement ci = (org.osate.aadl2.NamedElement) allSubcomponents.get(l);
							if (ci instanceof ComponentInstance || ci instanceof ConnectionInstance){
								if ( ( ci).getName().equalsIgnoreCase(subcomponent.getName())){
									placePrefix = ((ComponentInstance) ci).getInstanceObjectPath()+"_";
								}
							}
						}

					}
					else{
						 // subcomponent == null means that the DerivedStateMapping references self[mode]
						placePrefix = si.getInstanceObjectPath()+"_";
					}
					// if the operand is negated add the not
					if (((ErrorSourceNameEnc)and.get(j)).getNot()) {
						BoolExp = BoolExp.concat(" (not ");
					}
					// if several state names are listed, transform that in an imbricated OR
					EList atomicStateNames =(((ErrorSourceNameEnc)and.get(j)).getEsn()).getErrorStateOrPropagationName();
					// beginning of imbricated OR
					String imbricatedOr = "";
					if (atomicStateNames.size()!=0)
						imbricatedOr = "( "; 
					for (int k=0; k<atomicStateNames.size();k++){
						if (k>0)
							imbricatedOr = imbricatedOr.concat(" or ");
						String aState = placePrefix.concat((String) atomicStateNames.get(k));
						String aMarking = "{m("+aState+") = 1}";
						imbricatedOr = imbricatedOr.concat(aMarking);
					}
					// end of imbricated OR
					if (atomicStateNames.size()!=0)
						imbricatedOr = imbricatedOr.concat(")");
					BoolExp = BoolExp.concat(imbricatedOr);
					// end of negation
					if (((ErrorSourceNameEnc)and.get(j)).getNot()) {
						BoolExp = BoolExp.concat(" ) ");
					}

				}
				// end of an AND
				BoolExp = BoolExp.concat(")");
			}

		}
		// end of highest level OR
		BoolExp= BoolExp.concat(")");
		return BoolExp;
	}



}













