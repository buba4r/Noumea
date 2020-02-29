package TestWPS.WPSpackage;

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
import Math.MathUtils;

public class TestGeneration_class extends StaticMethodsProcessFactory<TestGeneration_class>
{
		protected static MathUtils callObject_1;
		protected static Test_class callObject_2;
		protected static MathUtils callObject_4;

	public TestGeneration_class() {
		super(Text.text("WPS"),"TestWPS",TestGeneration_class.class);
		callObject_1 = new MathUtils();
		callObject_2 = new Test_class();
		callObject_4 = new MathUtils();
	}

	@DescribeProcess(title="testGeneration",description="WPS")
	@DescribeResult(name="result",description="operands")
	public static Integer testGeneration(@DescribeParameter(name="input1",description=" operand") Integer input1,@DescribeParameter(name="input2",description=" operand") Integer input2) {
		Integer input1i_wps1 = 0;	
		Integer input2i_wps1 = 0;	
		Integer resultAi_wps1 = 0;
		Integer result_wps2 = 0;
		Integer v1_wps3 = 0;	
		Integer v2_wps3 = 0;	
		Integer resultRi_wps3 = 0;
		Integer input1i_wps4 = 0;	
		Integer input2i_wps4 = 0;	
		Integer resultAi_wps4 = 0;
		Integer result;
		input1i_wps1=input1;
		input2i_wps1=input2;
		input2i_wps4=14;



		resultAi_wps1 = callObject_1.intAddBody(input1i_wps1,input2i_wps1);	
		v1_wps3=resultAi_wps1;
		result_wps2 = callObject_2.Test();	
		v2_wps3=result_wps2;
	    RemoteWpsCall wpscall3= new RemoteWpsCall("http://localhost:8080/geoserver/ows","TestWPS:addInt");
		ArrayList<Object> inputs3= new ArrayList<Object>();
		inputs3.add(v1_wps3);
		inputs3.add(v2_wps3);
		String resultRwps3;
		try { 
			resultRwps3 = wpscall3.Request(inputs3);
			resultRi_wps3 = Integer.parseInt(resultRwps3);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		input1i_wps4=resultRi_wps3;
		resultAi_wps4 = callObject_4.intAddBody(input1i_wps4,input2i_wps4);	
		result=resultAi_wps4;	
		return result;	
	}
}
