/*
 * Created on Jan 30, 2004
 *
 * <copyright>
 * Copyright  2004 by Carnegie Mellon University, all rights reserved.
 *
 * Use of the Open Source AADL Tool Environment (OSATE) is subject to the terms of the license set forth
 * at http://www.eclipse.org/legal/cpl-v10.html.
 *
 * NO WARRANTY
 *
 * ANY INFORMATION, MATERIALS, SERVICES, INTELLECTUAL PROPERTY OR OTHER PROPERTY OR RIGHTS GRANTED OR PROVIDED BY
 * CARNEGIE MELLON UNIVERSITY PURSUANT TO THIS LICENSE (HEREINAFTER THE "DELIVERABLES") ARE ON AN "AS-IS" BASIS.
 * CARNEGIE MELLON UNIVERSITY MAKES NO WARRANTIES OF ANY KIND, EITHER EXPRESS OR IMPLIED AS TO ANY MATTER INCLUDING,
 * BUT NOT LIMITED TO, WARRANTY OF FITNESS FOR A PARTICULAR PURPOSE, MERCHANTABILITY, INFORMATIONAL CONTENT,
 * NONINFRINGEMENT, OR ERROR-FREE OPERATION. CARNEGIE MELLON UNIVERSITY SHALL NOT BE LIABLE FOR INDIRECT, SPECIAL OR
 * CONSEQUENTIAL DAMAGES, SUCH AS LOSS OF PROFITS OR INABILITY TO USE SAID INTELLECTUAL PROPERTY, UNDER THIS LICENSE,
 * REGARDLESS OF WHETHER SUCH PARTY WAS AWARE OF THE POSSIBILITY OF SUCH DAMAGES. LICENSEE AGREES THAT IT WILL NOT
 * MAKE ANY WARRANTY ON BEHALF OF CARNEGIE MELLON UNIVERSITY, EXPRESS OR IMPLIED, TO ANY PERSON CONCERNING THE
 * APPLICATION OF OR THE RESULTS TO BE OBTAINED WITH THE DELIVERABLES UNDER THIS LICENSE.
 *
 * Licensee hereby agrees to defend, indemnify, and hold harmless Carnegie Mellon University, its trustees, officers,
 * employees, and agents from all claims or demands made against them (and any related losses, expenses, or
 * attorney's fees) arising out of, or relating to Licensee's and/or its sub licensees' negligent use or willful
 * misuse of or negligent conduct or willful misconduct regarding the Software, facilities, or other rights or
 * assistance granted by Carnegie Mellon University under this License, including, but not limited to, any claims of
 * product liability, personal injury, death, damage to property, or violation of any laws or regulations.
 *
 * Carnegie Mellon University Software Engineering Institute authored documents are sponsored by the U.S. Department
 * of Defense under Contract F19628-00-C-0003. Carnegie Mellon University retains copyrights in all material produced
 * under this contract. The U.S. Government retains a non-exclusive, royalty-free license to publish or reproduce these
 * documents, or allow others to do so, for U.S. Government purposes only pursuant to the copyright license
 * under the contract clause at 252.227.7013.
 *
 * </copyright>
 *
 *
 * @version $Id: CheckEAXProperties.java,v 1.4 2007-05-28 06:17:56 relief Exp $
 */
package edu.cmu.sei.aadl.errorannex.unparser;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.osate.aadl2.Element;
import org.osate.aadl2.instance.ComponentInstance;
import org.osate.aadl2.instance.ConnectionInstance;
import org.osate.aadl2.modelsupport.AadlConstants;
import org.osate.aadl2.parsesupport.AObject;
import org.osate.ui.actions.AaxlReadOnlyActionAsJob;
import org.osgi.framework.Bundle;

import edu.cmu.sei.aadl.errorannex.ComponentErrorModelProperty;
import edu.cmu.sei.aadl.errorannex.ErrorModelClassifier;
import edu.cmu.sei.aadl.errorannex.parser.ParserPlugin;
import edu.cmu.sei.aadl.errorannex.util.EAXUtil;



/**
 * ClearHistory implements workbench action delegate.
 * The action proxy will be created by the workbench and
 * shown in the UI. When the user tries to use the action,
 * this delegate will be created and execution will be
 * delegated to it.
 * <p>
 * ClearHistory removes any history of the selected Resource in the E#clipse Navigator.
 * @see IWorkbenchWindowActionDelegate
 */
public final class CheckEAXProperties extends AaxlReadOnlyActionAsJob {
	protected Bundle getBundle() {
		return ParserPlugin.getDefault().getBundle();
	}
	
	protected String getMarkerType() {
		return AadlConstants.INSTANTIATION_OBJECT_MARKER;
	}

	/**
	 * The action has been activated. The argument of the
	 * method represents the 'real' action sitting
	 * in the workbench UI.
	 */
	public void doAaxlAction(final IProgressMonitor monitor, final AObject obj) {
		// phf
		if (obj instanceof ComponentInstance){
			ComponentInstance ci = (ComponentInstance)obj;
			EAXUtil eu = new EAXUtil();
			ComponentErrorModelProperty re = eu.getComponentErrorModelProperty(ci);
			if (re != null) {
				ErrorModelClassifier emc = re.getErrorModelClassifier();
//				ErrorEvent ev = emc.findErrorEvent("e1");
//				OccurrenceProperty op = eu.getOccurrenceProperty(ci, ev);
			}
		}
		if (obj instanceof ConnectionInstance){
			ConnectionInstance ci = (ConnectionInstance)obj;
			EAXUtil eu = new EAXUtil();
			ComponentErrorModelProperty re = eu.getComponentErrorModelProperty(ci);
			if (re != null) {
				ErrorModelClassifier emc = re.getErrorModelClassifier();
			}
		}
	}

	protected String getActionName() {
		return "CheckEAXProperties";
	}

	@Override
	protected void doAaxlAction(IProgressMonitor monitor, Element root) {
		// TODO Auto-generated method stub
		
	}
}