package TestGeom.WPSpackage;

import java.io.IOException;
import java.util.*;

import org.geotools.process.factory.DescribeParameter;
import org.geotools.process.factory.DescribeProcess;
import org.geotools.process.factory.DescribeResult;
import org.geotools.process.factory.StaticMethodsProcessFactory;
import org.geotools.text.Text;
import org.geotools.feature.FeatureCollection;
import org.opengis.feature.simple.*;
import java.awt.image.BufferedImage;
import com.vividsolutions.jts.geom.*;

import com.vividsolutions.jts.io.ParseException;

import remoteWpsCall.*;

import Math.MathUtils;

public class TestGeom_class extends StaticMethodsProcessFactory<TestGeom_class>
{
		protected static MathUtils callObject_3;

	public TestGeom_class() {
		super(Text.text("geometries"),"TestGeom",TestGeom_class.class);
		callObject_3 = new MathUtils();
	}

	@DescribeProcess(title="testGeom",description="WPS")
	@DescribeResult(name="result",description="ordinates")
	public static Double testGeom(@DescribeParameter(name="point",description=" point") Geometry point) {
		Geometry point_wps1 ;	
		Double result_wps1 = 0.0;
		Geometry point_wps2 ;	
		Double result_wps2 = 0.0;
		Double input1d_wps3 = 0.0;	
		Double input2d_wps3 = 0.0;	
		Double resultAd_wps3 = 0.0;
		Double result;
		point_wps1=point;
		point_wps2=point;


	    RemoteWpsCall wpscall1= new RemoteWpsCall("http://localhost:8080/geoserver/ows","JTS:getX");
		ArrayList<Object> inputs1= new ArrayList<Object>();
		inputs1.add(point_wps1);
		String resultRwps1;
		try { 
			resultRwps1 = wpscall1.Request(inputs1);
			result_wps1 = Double.parseDouble(resultRwps1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		input1d_wps3=result_wps1;
	    RemoteWpsCall wpscall2= new RemoteWpsCall("http://localhost:8080/geoserver/ows","JTS:getY");
		ArrayList<Object> inputs2= new ArrayList<Object>();
		inputs2.add(point_wps2);
		String resultRwps2;
		try { 
			resultRwps2 = wpscall2.Request(inputs2);
			result_wps2 = Double.parseDouble(resultRwps2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		input2d_wps3=result_wps2;
		resultAd_wps3 = callObject_3.doubleAddBody(input1d_wps3,input2d_wps3);	
		result=resultAd_wps3;	
		return result;	
	}
}
