package WfServices;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.*;

import org.eclipse.emf.common.util.*;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import wfwps.acceleo.main.*;
import graph.wfGraphAdapter;
import wfwps.*;
import wfwps.util.WfwpsValidator;

public class WfWpsServices {

	WorkflowWps myWorflowWps;
	String fileName;
	
	public WfWpsServices() {
	}
	
	public void setLibFileName(String filename) {
	       fileName = filename;
	       LoadLibFile();
	}
	
	public void LoadLibFile() {
        // Initialize the model
       WfwpsPackage.eINSTANCE.eClass();

        // Register the XMI resource factory for the extension
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("wfwps", new XMIResourceFactoryImpl());

        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();

        // Get the resource
        String urlName = "file:///"+fileName.replace("\\", "/");
        Resource resource = resSet.getResource(URI.createURI(urlName), true);

        myWorflowWps = (WorkflowWps) resource.getContents().get(0);
	}
	
	public String toString() {
		String result= "";
		
		result+=myWorflowWps.toString();
		
		for (WPS aWPS : myWorflowWps.getLocalWpsLibrary()) {
			result+=aWPS.getName()+"\n";
		}
				
		return result;
	}
	
	
	public String getProjectName() {
		return myWorflowWps.getName();
	}
	
	public List<LocalWPS> getLocalWPS() {
		return myWorflowWps.getLocalWpsLibrary();
	}
	
	public List<RemoteWPS> getRemoteWPS() {
		return myWorflowWps.getRemoteWpsLibrary();
	}
	
	public List<WorkFlow> getWF() {
		return myWorflowWps.getWfLibrary();
	}
	
	public void generateLocalWPS(WPS aWPS, String folderName) {

		File folder = new File(folderName);
        
        List<String> arguments = new ArrayList<String>();
        
        GenerateLocalWPS generator;
		try {
			generator = new GenerateLocalWPS(aWPS, folder, arguments);
			generator.doGenerate(new BasicMonitor());		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public int generateWF(WorkFlow aWF, String folderName) {
		boolean	noCycle = true;
		boolean noRecursion = true;
		int errorNumber = 0;
		
		File folder = new File(folderName);
        List<String> arguments = new ArrayList<String>();
        
        wfGraphAdapter anAdapt = new wfGraphAdapter(aWF);
		noCycle = anAdapt.preOrder();
		noRecursion = anAdapt.noRecursion();
		if (noCycle && noRecursion)  {
			GenerateWF generator;
			try {
				generator = new GenerateWF(aWF, folder, arguments);
				generator.doGenerate(new BasicMonitor());		
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		errorNumber=noCycle?errorNumber:1;
		errorNumber=noRecursion?errorNumber:(errorNumber+2);
		return (errorNumber);
	}

	public boolean isOK() {
		boolean	result;
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(myWorflowWps);
		result = (diagnostic.getSeverity() == Diagnostic.OK);
		return result;
	}

	public boolean isOK(LocalWPS localWPS) {
		boolean	result;
	    Diagnostic diagnostic = Diagnostician.INSTANCE.validate(localWPS);
	    result =  (diagnostic.getSeverity() == Diagnostic.OK);
		return result;
	}

	public boolean isOK(WorkFlow workFlow) {
		boolean	result;
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(workFlow);
		result = (diagnostic.getSeverity() == Diagnostic.OK);
		return result;
	}
}