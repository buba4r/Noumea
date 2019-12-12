package application;

import java.io.*;
import java.net.URL;
import java.util.*;
import java.util.stream.*;

import org.eclipse.jdt.core.*;
import org.osgi.framework.Bundle;
import org.eclipse.core.resources.*;
import org.eclipse.core.runtime.*;
import org.eclipse.emf.common.util.EList;
import org.geotools.data.wps.*;

import javafx.collections.ObservableList;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.control.Alert.*;
import javafx.scene.layout.*;
import javafx.stage.*;

import net.opengis.wps10.*;
import net.opengis.wps10.impl.*;

import com.facade.interfaceServices;
import WfServices.facadeServices;
import utils.*;

public class MainController implements Initializable {
	
	private static final String GEOSERVER_FILE_PATH = "\\geoserverPath.txt";
	private static final String startGeoFileName = "\\startGeoServer.bat";
	private static final String stopGeoFileName = "\\stopGeoServer.bat";
	private static final String deployFileName = "\\deploy.bat";
	private static final List<String> typesJava = Stream.of("I", "D", "Z","QString;","QBufferedImage;","QGeometry;","QFeatureCollection<QSimpleFeatureType;QSimpleFeature;>;").collect(Collectors.toList());
	
	private interfaceServices appInterface=new facadeServices();
	private Stage stage;

	@FXML
	private TextField libPath;
	@FXML
	private TextField projectPath;
	@FXML
	private TextField geoPath;
	@FXML
	private TextField projectName;
	@FXML
	private TextField packageName;
	@FXML
	private TextField className;
	@FXML
	private TextField functionName;
	@FXML
	private TextField serverAddress;
    @FXML
    private VBox vbox1;
    @FXML
    private VBox vbox2;
 	@FXML
	private TextField jarName;   
    
	private File geoServerProject = null;
	private File libFile = null;
	private File projectDirectory = null;
	
	private IPath localDir;
	private String workspaceDir;
	private ICompilationUnit theUnit;
	private IMethod theMethod;
	
	private String theServerAddress;
	
	private Runtime proc = Runtime.getRuntime();

	public void init(Stage stage) {
		// TODO Auto-generated method stub
		this.stage = stage;
	}

	@FXML
	void chooseLib(ActionEvent event) {
		
		libFile = UtilsChooser.fileChooser("Select the library", workspaceDir, "wfwps file", "*.wfwps");
		updateLib();
	}
	
	private void updateLib() {
				
		if (libFile!=null) {
			libPath.setText(libFile.getName());
			appInterface.setFile(libFile);

			vbox1.getChildren().clear();
			vbox2.getChildren().clear();
		
			for(String str:appInterface.getLocalWpsList()){
				vbox1.getChildren().add(new CheckBox(str));	
			}
			for(String str2:appInterface.getWorkFlowList()){
				vbox2.getChildren().add(new CheckBox(str2));
			}
		}
	}
	
	@FXML
	void chooseProject(ActionEvent event) {
		DirectoryChooser directoryChooser = new DirectoryChooser();	
		directoryChooser.setInitialDirectory(new File(workspaceDir));
		projectDirectory = directoryChooser.showDialog(stage);
		if (projectDirectory != null) {
			projectPath.setText(projectDirectory.getName());
			projectName.setText(projectDirectory.getName());
			jarName.setText(projectDirectory.getName());
			className.clear();
			packageName.clear();
			functionName.clear();
		}
	}
	
	@FXML
	void chooseGeoInstall(ActionEvent event) {
		DirectoryChooser directoryChooser = new DirectoryChooser();	
		directoryChooser.setInitialDirectory(new File(System.getProperty("user.home")));
		geoServerProject = directoryChooser.showDialog(stage);
		if (geoServerProject != null) {
			try {
				UtilsResourcesFile.writeFile(localDir+GEOSERVER_FILE_PATH, geoServerProject.getAbsolutePath());
			} catch (IOException e) {
				e.printStackTrace();
			}	
			geoPath.setText(geoServerProject.getAbsolutePath());
			UtilsBatFile.createStartFile(localDir+startGeoFileName, geoServerProject.getAbsolutePath());
			UtilsBatFile.createShutdownFile(localDir+stopGeoFileName, geoServerProject.getAbsolutePath());
			if (projectDirectory != null) {
				UtilsBatFile.createDeployFile(projectDirectory.getAbsolutePath(),localDir+deployFileName , geoServerProject.getAbsolutePath());				
			}
		}
	}
	
	@FXML
	void classSelect(ActionEvent event) {
		if (projectName.getText()!=null && !projectName.getText().contentEquals("")) {
			File javaClass = UtilsChooser.fileChooser("Select the class", projectDirectory.getAbsolutePath(), "java class", "*.java");
			int pos = javaClass.getName().lastIndexOf(".");
			className.setText(javaClass.getName().substring(0, pos));

			IWorkspace workspace = ResourcesPlugin.getWorkspace();
			IWorkspaceRoot root = workspace.getRoot();
			// Get all projects in the workspace
			IProject[] projects = root.getProjects();
			// Loop over all projects
			for (IProject project : projects) {
				try {
					if (project.getName().equals(projectName.getText()) ) {
						if (project.isNatureEnabled("org.eclipse.jdt.core.javanature")) {
							IJavaProject javaProject = JavaCore.create(project);
							IPackageFragment[] packages = javaProject.getPackageFragments();
							for (IPackageFragment mypackage : packages) {
								for (ICompilationUnit unit : mypackage.getCompilationUnits()) {
									if (unit.getElementName().equals(className.getText()+".java")) {
										theUnit = unit;
										packageName.setText(mypackage.getElementName());
										className.setText(javaClass.getName().substring(0, pos));
										functionName.clear();
									} 
								}
							}
						}
					}
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
		} else {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Configuration");
			alert.setHeaderText("Error");
			alert.setContentText("choose a Java Project"); 
			alert.showAndWait();			
		}
	}
	
	@FXML
	void functionSelect(ActionEvent event) {
		if (className.getText()!=null && !className.getText().contentEquals("")) {
			IType[] allTypes;
			try {
				allTypes = theUnit.getAllTypes();
				List<IMethod> theMethods = new ArrayList<IMethod>();
				final Dialog<ButtonType> dialog = new Dialog<ButtonType>(); 
				dialog.setTitle("Function"); 
				dialog.setHeaderText("Choose a function");
				final GridPane gridPane = new GridPane(); 
				gridPane.setHgap(6); 
				gridPane.setVgap(6); 
				VBox functionBox = new VBox(8);
				ChoiceBox<String> functionNames = new ChoiceBox<String> ();
				for (IType type : allTypes) {
					IMethod[] methods;
					methods = type.getMethods();
					for (IMethod method : methods) {
						functionNames.getItems().add(method.getElementName());
						theMethods.add(method);
					}
				}	
				functionBox.getChildren().add(functionNames);
				gridPane.add(functionBox,0,0);
				dialog.getDialogPane().setContent(gridPane);
				dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
				dialog.getDialogPane().getButtonTypes().add(ButtonType.CLOSE);
				Optional<ButtonType> result = dialog.showAndWait();
				if (result.get() == ButtonType.OK){
					theMethod = theMethods.get(functionNames.getSelectionModel().getSelectedIndex());
					functionName.setText(theMethod.getElementName());
				} 		
			} catch (JavaModelException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} else {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Configuration");
			alert.setHeaderText("Error");
			alert.setContentText("choose a Class"); 
			alert.showAndWait();			
		}
	}
	
	@FXML
	void modelGenerate(ActionEvent event) {
		if (libFile!=null && functionName.getText()!=null && !functionName.getText().contentEquals("")) {  
			boolean isOKparam;
			try {
				isOKparam = typesJava.contains(theMethod.getReturnType());
				for (String param : theMethod.getParameterTypes()){
					isOKparam = isOKparam && typesJava.contains(param);
				}
				if (isOKparam) {
					String wpsName = className.getText()+"_"+theMethod.getElementName();
					TextInputDialog dialog = new TextInputDialog(wpsName);
					dialog.setTitle("WPS");
					dialog.setHeaderText("WPS Name");
					dialog.setContentText("Please enter the WPS name:");

					// Traditional way to get the response value.
					Optional<String> result = dialog.showAndWait();
					if (result.isPresent()){
						wpsName= result.get();
						boolean addOK = appInterface.AddModel(wpsName, packageName.getText(), className.getText(), theMethod,"result");
						updateLib();
						if (! addOK) {
							Alert alert = new Alert(AlertType.INFORMATION);
							alert.setTitle("WPS");
							alert.setHeaderText("Error");
							alert.setContentText("A WPS already exists for this function"); 
							alert.showAndWait();
						}
					}	
					
				} else {
					Alert alert = new Alert(AlertType.INFORMATION);
					alert.setTitle("Type");
					alert.setHeaderText("Error");
					alert.setContentText("Only the following types are allowed : int, double, boolean, String, BufferedImage, Geometry and FeatureCollection<SimpleFeatureType,SimpleFeature>"); 
					alert.showAndWait();
				}			
			} catch (JavaModelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			 Alert alert = new Alert(AlertType.INFORMATION);
			 alert.setTitle("Configuration");
			 alert.setHeaderText("Error");
			 alert.setContentText("Define the lib file and the java function first"); 
			 alert.showAndWait();
		 }
	}
	
	@FXML
	void serverCall(ActionEvent event) {
		if (libFile!=null){
			if (serverAddress.getText()!=null) {
				theServerAddress = serverAddress.getText();
				try {
					URL url = new URL("http://"+theServerAddress+"?service=WPS&request=GetCapabilities");
					WebProcessingService aWps = new WebProcessingService(url);
					WPSCapabilitiesType capabilities = aWps.getCapabilities();
					ProcessOfferingsType processOfferings = capabilities.getProcessOfferings();
					EList processes = processOfferings.getProcess();
					final Dialog<ButtonType> dialog = new Dialog<ButtonType>(); 
					dialog.setTitle("remote WPS"); 
					dialog.setHeaderText("Choose WPS to model");
					final GridPane gridPane = new GridPane(); 
					gridPane.setHgap(6); 
					gridPane.setVgap(6); 
					ListView processListView = new ListView();
					processListView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
					Iterator iterator = processes.iterator();
					while (iterator.hasNext()) {
						ProcessBriefType process = (ProcessBriefType) iterator.next();
						processListView.getItems().add(process.getIdentifier().getValue());
					}
					HBox hbox = new HBox(processListView);
					gridPane.add(hbox,0,0);
					dialog.getDialogPane().setContent(gridPane);
					dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
					dialog.getDialogPane().getButtonTypes().add(ButtonType.CLOSE);
					Optional<ButtonType> result = dialog.showAndWait();
					if (result.get() == ButtonType.OK){
						Iterator iterator2 = processes.iterator();
						while (iterator2.hasNext()) {
							ProcessBriefType process = (ProcessBriefType) iterator2.next();
							Boolean addedProcess = false;
							for(Object o : processListView.getSelectionModel().getSelectedItems()){
								if (process.getIdentifier().getValue().equals(o)) {
									addedProcess = appInterface.AddRemoteModel(theServerAddress, aWps,(String)o);
									updateLib();
									Alert alert = new Alert(AlertType.INFORMATION);
									alert.setTitle("WPS");
									if (addedProcess) {
										alert.setHeaderText("OK");
										alert.setContentText(process.getIdentifier().getValue()+" has been added to the WPS model library"); 
										alert.showAndWait();
									} else {
										alert.setHeaderText("Error");
										alert.setContentText("cannot add "+process.getIdentifier().getValue()+" a WPS model with the same name already exists"); 
										alert.showAndWait();
									}
								}
							}
						}						
					} 
				} catch (Throwable e) {
					Alert alert = new Alert(AlertType.INFORMATION);
					alert.setTitle("Connexion");
					alert.setHeaderText("Error");
					alert.setContentText("The server does not exist or is unavailable: change the address or start the server"); 
					alert.showAndWait();
					throw new InternalError(e);
				}
			}
		} else {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Configuration");
			alert.setHeaderText("Error");
			alert.setContentText("Define the lib file first"); 
			alert.showAndWait();
		}
	}
	
	@FXML
	private void generateJava(ActionEvent event){
	 
	 if (projectDirectory!= null && libFile!=null) {
		 List<Integer> wps = new ArrayList<Integer>();
		 int i=0;
		 for (javafx.scene.Node node : vbox1.getChildren()) {
			 CheckBox cb = (CheckBox) node;
			 if (cb.isSelected()) {
				 wps.add(i);
			 }
			 i++;
		 }
		 List<Integer> wf = new ArrayList<Integer>();
		 i=0;
		 for (javafx.scene.Node node : vbox2.getChildren()) {
			 CheckBox cb = (CheckBox) node;
			 if (cb.isSelected()) {
				 wf.add(i);
			 }
			 i++;
		 }
		 String result = appInterface.generateJava(wps,wf,projectDirectory.getAbsolutePath());
	     Alert alert = new Alert(AlertType.INFORMATION);
		 alert.setTitle("Generation");
	     alert.setHeaderText("Results:");
		 if (result.contentEquals("")) {
			 alert.setContentText("OK"); 
		 } else {
			 alert.setContentText(result); 
		 }
		 alert.showAndWait(); 
	 } else {
		 Alert alert = new Alert(AlertType.INFORMATION);
		 alert.setTitle("Configuration");
		 alert.setHeaderText("Error");
		 alert.setContentText("Define the Java project path and the wfwps file first"); 
		 alert.showAndWait();
	 }
	}
	
	@FXML
	void deploy(ActionEvent event) {
		if (projectDirectory != null && geoServerProject != null) {
			UtilsBatFile.createDeployFile(projectDirectory.getAbsolutePath(),localDir+deployFileName , geoServerProject.getAbsolutePath());
			try {
				proc.exec("cmd /c start " + (new File(localDir+deployFileName)).getAbsolutePath());
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Configuration");
			alert.setHeaderText("Error");
			alert.setContentText("Define the GeoServer path and Java the project path first"); 
			alert.showAndWait();
		}
	}
	
	@FXML
	void startGeo(ActionEvent event) {
		if (geoServerProject != null) {
			try {
				proc.exec("cmd /c start " + (new File(localDir+startGeoFileName)).getAbsolutePath());
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Configuration");
			alert.setHeaderText("Error");
			alert.setContentText("Define the GeoServer path first"); 
			alert.showAndWait();
		}
	}
	
	@FXML
	void stopGeo(ActionEvent event) {
		if (geoServerProject != null) {
			try {
				proc.exec("cmd /c start " + (new File(localDir+stopGeoFileName)).getAbsolutePath());
				Runtime.getRuntime().exec("taskkill /f /im cmd.exe");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Configuration");
			alert.setHeaderText("Error");
			alert.setContentText("Define the GeoServer path first"); 
			alert.showAndWait();
		}
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		Bundle bundle = Platform.getBundle("NoumeaUI");
		localDir = Platform.getStateLocation(bundle);
		
		workspaceDir = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
		
		libPath.setEditable(false);
		projectPath.setEditable(false);
		geoPath.setEditable(false);
		projectName.setEditable(false);
		packageName.setEditable(false);
		className.setEditable(false);
		functionName.setEditable(false);
		
		String resultGeo;
		try {
			resultGeo = UtilsResourcesFile.readFile(localDir+GEOSERVER_FILE_PATH);
			if (!resultGeo.trim().isEmpty()) {
				geoPath.setText(resultGeo);
				geoServerProject = new File(resultGeo);
			}		
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (geoServerProject!=null) {
			UtilsBatFile.createStartFile(localDir+startGeoFileName, geoServerProject.getAbsolutePath());
			UtilsBatFile.createShutdownFile(localDir+stopGeoFileName, geoServerProject.getAbsolutePath());
		}

		jarName.setEditable(false);
	}
}