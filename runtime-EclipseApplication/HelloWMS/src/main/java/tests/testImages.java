package tests;

import testWMS.WPSpackage.ImageAnalysis_class;

public class testImages {

	public static void main(String[] args) {
		
		ImageAnalysis_class testImage2 = new ImageAnalysis_class();
		int result2 = testImage2.imageAnalysis();
		System.out.println(result2);
	}
}