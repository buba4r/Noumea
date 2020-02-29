package WfServices;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.JavaModelException;
import org.geotools.data.wps.WebProcessingService;

import wfwps.*;

import com.facade.interfaceServices;

import net.opengis.wps10.ProcessBriefType;
import utils.UtilsResourcesFile;
import utils.utilsProcessFactory;

public class facadeServices implements interfaceServices {
	
	WfWpsServices theWfWpsServices;
	WfWpsLibServices libModel;
	utilsProcessFactory utilFile;
	String fileName;
	
	public facadeServices() {
		theWfWpsServices = new WfWpsServices();
		libModel = new WfWpsLibServices();
		utilFile = new utilsProcessFactory();
	}
	
	public boolean AddModel(String name, String packageName, String className, IMethod function, String returnName) {
		libModel.LoadLibFile();
		boolean addOK = libModel.addLocalWPS(name, packageName, className,function.getElementName());
		if (addOK) {
			try {
				libModel.addInputs(function.getParameterNames(),function.getParameterTypes());
				libModel.addOutput(returnName,function.getReturnType());
			} catch (JavaModelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			libModel.Save();
		}
		return addOK;
	}
	
	public boolean AddRemoteModel(String url, WebProcessingService aWps, String process) {
		libModel.LoadLibFile();
		boolean result = libModel.addRemoteWPS(url, aWps, process);
		libModel.Save();
		return result;
	}
	
	public void setFile(File file) {
		theWfWpsServices.setLibFileName(file.getAbsolutePath());
		libModel.setLibFileName(file.getAbsolutePath());
		fileName = file.getAbsolutePath();
	}
	
	public String getFileName(){
		return fileName;
	}
	
	public List<String> getLocalWpsList(){
		
		ArrayList <String> localWpsList = new ArrayList<String>();

		for (LocalWPS wps : theWfWpsServices.getLocalWPS()) {
			localWpsList.add(wps.getName());
		}
		return localWpsList;
	}
	
	public List<String> getRemoteWpsList(){
		
		ArrayList <String> remoteWpsList = new ArrayList<String>();

		for (RemoteWPS wps : theWfWpsServices.getRemoteWPS()) {
			remoteWpsList.add(wps.getName());
		}
		return remoteWpsList;
	}
	
	public List<String> getWorkFlowList(){
		
		ArrayList <String> listWorkflow = new ArrayList<String>();
		
		for (WorkFlow wf : theWfWpsServices.getWF()) {
			listWorkflow.add(wf.getName());
		}
		return listWorkflow;
	}

	public String generateJava(List<Integer> idWps, List<Integer> idWf,String folderName) {
		String result = "";
		theWfWpsServices.LoadLibFile();
		utilFile.emptyFile(folderName);
		try {
			UtilsResourcesFile.deleteFolder(folderName+"/src/main/java/"+theWfWpsServices.getProjectName()+"/WPSpackage");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for (Integer id : idWps) {
			if (id>=0 && id <theWfWpsServices.getLocalWPS().size()) {
				if (theWfWpsServices.isOK(theWfWpsServices.getLocalWPS().get(id))) {
					theWfWpsServices.generateLocalWPS(theWfWpsServices.getLocalWPS().get(id), folderName+"/src/main/java/"+theWfWpsServices.getProjectName()+"/WPSpackage");
					try {
						String className = Character.toUpperCase(theWfWpsServices.getLocalWPS().get(id).getName().charAt(0)) + theWfWpsServices.getLocalWPS().get(id).getName().substring(1);
						utilFile.addClassName(folderName, theWfWpsServices.getProjectName(),className);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					result+="impossible to generate code due to modelling errors, check model of: "+(theWfWpsServices.getLocalWPS().get(id).getName());
				}
			}
		}
		for (int itWf = 0; itWf < theWfWpsServices.getWF().size(); itWf++) {
			if (theWfWpsServices.isOK(theWfWpsServices.getWF().get(itWf))) {
				int errorNumber = theWfWpsServices.generateWF(theWfWpsServices.getWF().get(itWf), folderName+"/src/main/java/"+theWfWpsServices.getProjectName()+"/WPSpackage");
				switch (errorNumber) {
				case 1:
					result+="impossible to generate code for "+(theWfWpsServices.getWF().get(itWf).getName()+" : there is a cycle in the workflow");										
					break;
				case 2:
					result+="impossible to generate code for "+(theWfWpsServices.getWF().get(itWf).getName()+" : this is a recursive workflow");										
					break;
				case 3:
					result+="impossible to generate code for "+(theWfWpsServices.getWF().get(itWf).getName()+" : there is a cycle in the workflow and this is a recursive workflow");										
					break;
				case 0:
					try {
						for (Integer id : idWf) {
							if (id==itWf) {
								String className = Character.toUpperCase(theWfWpsServices.getWF().get(itWf).getName().charAt(0)) + theWfWpsServices.getWF().get(itWf).getName().substring(1);
								utilFile.addClassName(folderName, theWfWpsServices.getProjectName(),className);
							}
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				default:break;
				}
			} else {
					result+="impossible to generate code for "+(theWfWpsServices.getWF().get(itWf).getName()+" : modelling errors, correct and check the model");
			}			
		}
		return result;
	}

	/*public String generateWF( String folderName) {
		String result = "";
		theWfWpsServices.LoadLibFile();
		for (Integer id : idWf) {
			if (id>=0 && id <theWfWpsServices.getWF().size()) {
				if (theWfWpsServices.isOK(theWfWpsServices.getWF().get(id))) {
					int errorNumber = theWfWpsServices.generateWF(theWfWpsServices.getWF().get(id), folderName+"/src/main/java/"+theWfWpsServices.getProjectName()+"/WPSpackage");
					switch (errorNumber) {
					case 1:
						result+="impossible to generate code for "+(theWfWpsServices.getWF().get(id).getName()+" : there is a cycle in the workflow");										
						break;
					case 2:
						result+="impossible to generate code for "+(theWfWpsServices.getWF().get(id).getName()+" : this is a recursive workflow");										
						break;
					case 3:
						result+="impossible to generate code for "+(theWfWpsServices.getWF().get(id).getName()+" : there is a cycle in the workflow and this is a recursive workflow");										
						break;
					case 0:
						try {
							String className = Character.toUpperCase(theWfWpsServices.getWF().get(id).getName().charAt(0)) + theWfWpsServices.getWF().get(id).getName().substring(1);
							utilFile.addClassName(folderName, theWfWpsServices.getProjectName(),className);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						break;
					default:break;
					}
				} else {
					result+="impossible to generate code for "+(theWfWpsServices.getWF().get(id).getName()+" : modelling errors, correct and check the model");
				}			
			}
		}
		return result;
	}*/
}
