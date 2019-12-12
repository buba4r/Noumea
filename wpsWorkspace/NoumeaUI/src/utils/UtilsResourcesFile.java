package utils;

import java.io.*;

public class UtilsResourcesFile {
	
	public static String readFile(String path) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(path));
		String everything = null;
		try {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
			}
			everything = sb.toString();
		} finally {
			br.close();
		}
		return everything;
	}

	public static void writeFile(String path, String text) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(path));
		bw.write(text);
		bw.close();
	}

	public static void createFolder(String folderName) throws Exception {
		File theDir = new File(folderName);
		if (!theDir.exists()) {
			theDir.mkdir();
		}
	}
	
	public static void deleteFolder(String folderName) throws Exception {
		File theDir = new File(folderName);
		if( theDir.exists() ) {
			File[] files = theDir.listFiles();
			for(int i=0; i<files.length; i++) {
				if(files[i].isDirectory()) {
					deleteFolder(files[i].getAbsolutePath());
			    } else {
			    	files[i].delete();
			    }
			}
		}
	}
}
