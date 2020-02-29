package testWfWervices;

import java.io.IOException;
import java.util.List;

import WfServices.WfWpsServices;
import utils.utilsProcessFactory;
import wfwps.*;

public class testUtilFiles {

	public static void main(String[] args) {

		utilsProcessFactory testFiles = new utilsProcessFactory();
		
		try {
			testFiles.addClassName("C:/EclipseProjects/WPS/localWPS", "TestWPS","HelloWorld");
			testFiles.addClassName("C:/EclipseProjects/WPS/localWPS", "TestWPS", "AddInt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
