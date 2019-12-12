package utils;

import java.io.File;

import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class UtilsChooser {

	public static File fileChooser(String title, String absolutePath, String nameEx, String extension) {
		FileChooser fileChooser = new FileChooser();
		if (absolutePath != null) {
			fileChooser.setInitialDirectory(new File(absolutePath));
		} else {
			fileChooser.setInitialDirectory(new File(System.getProperty("user.dir")));
		}
		fileChooser.setTitle(title);

		fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter(nameEx, extension));
		return fileChooser.showOpenDialog(new Stage());
	}
	
}
