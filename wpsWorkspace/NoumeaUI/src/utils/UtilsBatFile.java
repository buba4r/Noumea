package utils;

import java.io.IOException;

public class UtilsBatFile {

	public static void createStartFile(String startFileName, String geoserverFileName) {
		try {
			UtilsResourcesFile.writeFile(startFileName, 
					"cd \"" + geoserverFileName.replace("\r", "").replace("\n", "") + "\\bin\"\n"
					+ "call startup.bat");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void createShutdownFile(String stopFileName, String geoserverFileName) {
		try {
			UtilsResourcesFile.writeFile(stopFileName,
					"cd \"" + geoserverFileName.replace("\r", "").replace("\n", "") + "\\bin\"\n"
					+ "call shutdown.bat");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void createDeployFile(String projectName, String deployFileName, String geoserverFileName) {
		try {
			UtilsResourcesFile.writeFile(deployFileName,
					"c\"" + geoserverFileName.replace("\r", "").replace("\n", "") + "\\bin\"\n"
					+ "call shutdown.bat\n"
					+"cd \"" + projectName+"\\target\"\n"
					+"\n"
					+ "copy *.jar \""+geoserverFileName.replace("\r", "").replace("\n","") + "\\webapps\\geoserver\\WEB-INF\\lib\"\n"
					+"\n"
					+ "cd \"" + geoserverFileName.replace("\r","").replace("\n","") + "\\bin\"\"\n"
					+ "call startup.bat");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
