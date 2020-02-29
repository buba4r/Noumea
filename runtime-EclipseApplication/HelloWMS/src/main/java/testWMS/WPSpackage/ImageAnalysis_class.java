package testWMS.WPSpackage;

import java.io.IOException;
import java.util.*;

import org.geotools.process.factory.DescribeParameter;
import org.geotools.process.factory.DescribeProcess;
import org.geotools.process.factory.DescribeResult;
import org.geotools.process.factory.StaticMethodsProcessFactory;
import org.geotools.text.Text;
import org.geotools.feature.FeatureCollection;
import org.geotools.ows.ServiceException;
import org.opengis.feature.simple.*;
import java.awt.image.BufferedImage;
import com.vividsolutions.jts.geom.*;

import com.vividsolutions.jts.io.ParseException;

import remoteWpsCall.*;

import Images.ImageUtils;
import Math.MathUtils;

public class ImageAnalysis_class extends StaticMethodsProcessFactory<ImageAnalysis_class>
{
		protected static ImageUtils callObject_1;
		protected static ImageUtils callObject_2;
		protected static MathUtils callObject_3;

	public ImageAnalysis_class() {
		super(Text.text("test on WMS"),"testWMS",ImageAnalysis_class.class);
		callObject_1 = new ImageUtils();
		callObject_2 = new ImageUtils();
		callObject_3 = new MathUtils();
	}

	@DescribeProcess(title="imageAnalysis",description="imgAnalysis")
	@DescribeResult(name="result",description="result")
	public static Integer imageAnalysis() {
		BufferedImage  inputImage_wps1;
		Integer numberPixels_wps1 = 0;
		BufferedImage  inputImage_wps2;
		Integer numberPixels_wps2 = 0;
		Integer input1i_wps3 = 0;	
		Integer input2i_wps3 = 0;	
		Integer resultAi_wps3 = 0;
		BufferedImage  rdImage1 = null;
		Integer result;
	
			WMSrequest aWMSrequest1;
			try {
				aWMSrequest1 = new WMSrequest("geobretagne.fr/geoserver/paysstbrieuc/ows","ZONE_URBA_rnu",0,"png",200,200,false,"CRS:84",-3.0,48.37,-2.97,48.4);
				rdImage1= aWMSrequest1.Call();
				} catch (ServiceException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		inputImage_wps1 = rdImage1;
		inputImage_wps2 = rdImage1;


		numberPixels_wps1 = callObject_1.numberPixelsImage(inputImage_wps1);	
		input2i_wps3=numberPixels_wps1;
		numberPixels_wps2 = callObject_2.numberPixelsImage(inputImage_wps2);	
		input1i_wps3=numberPixels_wps2;
		resultAi_wps3 = callObject_3.intAddBody(input1i_wps3,input2i_wps3);	
		result=resultAi_wps3;	
		return result;	
	}
}
