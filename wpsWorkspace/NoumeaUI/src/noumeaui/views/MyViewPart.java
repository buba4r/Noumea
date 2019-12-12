package noumeaui.views;

import java.io.IOException;

import org.eclipse.fx.ui.workbench3.FXViewPart;

import application.MainController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MyViewPart extends FXViewPart {
	@Override
	protected Scene createFxScene() {
		Scene scene ;
		BorderPane pane = new BorderPane();
		Button button = new Button("Noumea");
		button.setOnAction((event) -> {		
			try {	
				FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Main.fxml"));
				Parent root = loader.load();
				Stage primaryStage = new Stage();
				primaryStage.setScene(new Scene(root));
				primaryStage.setTitle("Noumea User Interface");
				primaryStage.show();			
				
				MainController controller = (MainController) loader.getController();
				controller.init(primaryStage);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}		      
		});
		pane.setCenter(button);
		scene=new Scene(pane);		
		return scene;
	}

	@Override
	protected void setFxFocus() {
		
	}
}