package utils;

import java.io.*;

public class utilsProcessFactory {

	public boolean addClassName(String folderName, String projectName, String wpsName) throws IOException {
		boolean find = false;
		File wpsDeclarationFiles = new File(folderName+"/src/main/resources/META-INF/services/org.geotools.process.ProcessFactory");
		FileInputStream bufferIn = new FileInputStream(wpsDeclarationFiles);
		BufferedReader reader = new BufferedReader(new InputStreamReader(bufferIn));
			 
		String line = null;
		String lines = "";
		
		while ((line = reader.readLine()) != null) {
			lines+= line+"\n";
			if (line.equals(projectName+".WPSpackage."+wpsName+"_class")) {
				find = true;
			}
		}
		reader.close();
		
		if (!find) {
			FileOutputStream bufferOut = new FileOutputStream(wpsDeclarationFiles);
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(bufferOut));
			writer.write(lines+projectName+".WPSpackage."+wpsName+"_class");
			writer.close();
		}

		return find;
	}

	public void emptyFile(String folderName) {
		File wpsDeclarationFiles = new File(folderName+"/src/main/resources/META-INF/services/org.geotools.process.ProcessFactory");
		if (wpsDeclarationFiles.exists() && wpsDeclarationFiles.isFile()) {
			wpsDeclarationFiles.delete();
		}
		try {
			wpsDeclarationFiles.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
