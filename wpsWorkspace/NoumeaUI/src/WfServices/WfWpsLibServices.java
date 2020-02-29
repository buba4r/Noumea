package WfServices;

import java.io.IOException;
import java.util.*;
import java.util.stream.*;

import org.eclipse.emf.common.util.*;
import org.eclipse.emf.ecore.resource.*;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.geotools.data.wps.*;
import org.geotools.data.wps.request.*;
import org.geotools.data.wps.response.*;
import org.geotools.ows.ServiceException;

import net.opengis.wps10.*;

import wfwps.*;
import wfwps.impl.*;


public class WfWpsLibServices {

	private static final List<String> typesJava = Stream.of("I", "D", "Z","QString;","QBufferedImage;","QGeometry;","QFeatureCollection<QSimpleFeatureType;QSimpleFeature;>;").collect(Collectors.toList());
	
	WorkflowWps myWorflowWps;
	String fileName;
	Resource resource;
	
	WfwpsFactory theFactory;
	LocalWPS newLocalWPS;
	RemoteWPS newRemoteWPS;
	
	public WfWpsLibServices() {
	}
	
	public void setLibFileName(String filename) {
	       fileName = filename;
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
        resource = resSet.getResource(URI.createURI(urlName), true);

        myWorflowWps = (WorkflowWps) resource.getContents().get(0);
	}
	
	public boolean addLocalWPS(String name, String packageName, String className, String functionName) {
		
		boolean okWPS = true;

		for (LocalWPS wps : myWorflowWps.getLocalWpsLibrary()) {
			if (wps.getFunctionName().equals(functionName)&&wps.getClassName().equals(className)&&wps.getPackageName().equals(packageName)) {
				okWPS = false;
			}
		}
		if (okWPS) {
			theFactory = new WfwpsFactoryImpl();
		
			newLocalWPS = theFactory.createLocalWPS();
			newLocalWPS.setPackageName(packageName);
			newLocalWPS.setClassName(className);
			newLocalWPS.setFunctionName(functionName);
			newLocalWPS.setName(name);
			newLocalWPS.setAbstract("Add a description of "+name);
			myWorflowWps.getLocalWpsLibrary().add(newLocalWPS);
		}
		return okWPS;
	}

	public void addInputs(String[] parameterNames, String[] parameterTypes) {
		
		for (int i = 0; i < parameterNames.length; i++) {
			Input input = theFactory.createInput();
			input.setName(parameterNames[i]);
			input.setLowerBound(1);
			input.setUpperBound(1);
			int typeNumber = typesJava.lastIndexOf(parameterTypes[i]);
			switch (typeNumber) {
			case 0:		input.setType(wfwps.WPStype.INTEGER);break;
			case 1:		input.setType(wfwps.WPStype.DOUBLE);break;
			case 2:		input.setType(wfwps.WPStype.BOOLEAN);break;
			case 3:		input.setType(wfwps.WPStype.STRING);break;
			case 4:		input.setType(wfwps.WPStype.RASTER);break;
			case 5:		input.setType(wfwps.WPStype.GEOMETRY);break;
			case 6:		input.setType(wfwps.WPStype.COMPLEX);break;
			default:	input.setType(wfwps.WPStype.INTEGER);break;
			}
			newLocalWPS.getInputs().add(input);
		}
	}

	public void addOutput(String returnName, String returnType) {
		Output output = theFactory.createOutput();
		output.setName(returnName);
		output.setLowerBound(1);
		output.setUpperBound(1);
		int typeNumber = typesJava.lastIndexOf(returnType);
		switch (typeNumber) {
		case 0:		output.setType(wfwps.WPStype.INTEGER);break;
		case 1:		output.setType(wfwps.WPStype.DOUBLE);break;
		case 2:		output.setType(wfwps.WPStype.BOOLEAN);break;
		case 3:		output.setType(wfwps.WPStype.STRING);break;
		case 4:		output.setType(wfwps.WPStype.RASTER);break;
		case 5:		output.setType(wfwps.WPStype.GEOMETRY);break;
		case 6:		output.setType(wfwps.WPStype.COMPLEX);break;
		default:	output.setType(wfwps.WPStype.INTEGER);break;
		}
		newLocalWPS.getOutputs().add(output);
	}

	public void Save() {
		resource.getContents().add(myWorflowWps);
        try {
            resource.save(Collections.EMPTY_MAP);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

	public boolean addRemoteWPS(String url, WebProcessingService aWps, String process) {
		boolean okWPS = true;
		for (RemoteWPS wps : myWorflowWps.getRemoteWpsLibrary()) {
			if (wps.getName().equals(process)) {
				okWPS = false;
			} 
		}
		if (okWPS) {
			DescribeProcessRequest descRequest = aWps.createDescribeProcessRequest();
			descRequest.setIdentifier(process); 
			DescribeProcessResponse descResponse;
			try {
				descResponse = aWps.issueRequest(descRequest);			
				ProcessDescriptionsType T_processDesc = descResponse.getProcessDesc();
				ProcessDescriptionType T_Processdescription = (ProcessDescriptionType) T_processDesc.getProcessDescription().get(0);
				
				theFactory = new WfwpsFactoryImpl();
				
				newRemoteWPS = theFactory.createRemoteWPS();
				newRemoteWPS.setName(T_Processdescription.getIdentifier().getValue());
				newRemoteWPS.setUrl("http://"+url);
				newRemoteWPS.setIsVersion1(true);
				newRemoteWPS.setAbstract(T_Processdescription.getAbstract().getValue());
				for (int i = 0; i < T_Processdescription.getDataInputs().getInput().size(); i++) {
					InputDescriptionType input = (InputDescriptionType) T_Processdescription.getDataInputs().getInput().get(i);
					Input inputWps = theFactory.createInput();
					inputWps.setName(input.getIdentifier().getValue());
					if (input.getAbstract()!=null) {
						inputWps.setAbstract(input.getAbstract().getValue());
					} else {
						inputWps.setAbstract("asbtract to modify");
					}
					inputWps.setLowerBound((int) input.getMinOccurs().longValue());
					inputWps.setUpperBound((int)input.getMaxOccurs().longValue());
					inputWps.setOptional((int) input.getMinOccurs().longValue()==0);
					if (input.getComplexData()!=null) {
						inputWps.setType(wfwps.WPStype.COMPLEX);
					} else if (input.getLiteralData().getDataType()!=null) {
						if((input.getLiteralData().getDataType().getValue()).equals("xs:int")) {
							inputWps.setType(wfwps.WPStype.INTEGER);
						} else if ((input.getLiteralData().getDataType().getValue()).equals("xs:double")||(input.getLiteralData().getDataType().getValue()).equals("xs:float")) {
							inputWps.setType(wfwps.WPStype.DOUBLE);
						} else if ((input.getLiteralData().getDataType().getValue()).equals("xs:boolean")) {
							inputWps.setType(wfwps.WPStype.BOOLEAN);
						} else {
							inputWps.setType(wfwps.WPStype.STRING);
						}
						if (input.getLiteralData().getDefaultValue()!=null) {
							inputWps.setDefaultValue(input.getLiteralData().getDefaultValue());
						}
					} else {
							inputWps.setType(wfwps.WPStype.STRING);
					}
					newRemoteWPS.getInputs().add(inputWps);
				}
				for (int i = 0; i < T_Processdescription.getProcessOutputs().getOutput().size(); i++) {
					OutputDescriptionType output = (OutputDescriptionType) T_Processdescription.getProcessOutputs().getOutput().get(i);
					Output outputWps = theFactory.createOutput();
					outputWps.setName(output.getIdentifier().getValue());
					if (output.getAbstract()!=null) {
						outputWps.setAbstract(output.getAbstract().getValue());
					} else {
						outputWps.setAbstract("asbtract to modify");
					}
					outputWps.setLowerBound(1);
					outputWps.setUpperBound(1);
					if (output.getComplexOutput()!=null) {
						outputWps.setType(wfwps.WPStype.COMPLEX);
					} else if (output.getLiteralOutput().getDataType()!=null) {
						if((output.getLiteralOutput().getDataType().getValue()).equals("xs:int")) {
							outputWps.setType(wfwps.WPStype.INTEGER);
						} else if ((output.getLiteralOutput().getDataType().getValue()).equals("xs:double")||(output.getLiteralOutput().getDataType().getValue()).equals("xs:float")) {
							outputWps.setType(wfwps.WPStype.DOUBLE);
						} else if ((output.getLiteralOutput().getDataType().getValue()).equals("xs:boolean")) {
							outputWps.setType(wfwps.WPStype.BOOLEAN);
						} else {
							outputWps.setType(wfwps.WPStype.STRING);
						}
					} else {
						outputWps.setType(wfwps.WPStype.STRING);
					}
					newRemoteWPS.getOutputs().add(outputWps);
				}
				myWorflowWps.getRemoteWpsLibrary().add(newRemoteWPS);
			} catch (ServiceException | IOException e) {
				// TODO Auto-generated catch block
				System.out.println("error");
				e.printStackTrace();
			}
		}
		return okWPS;
	}
}