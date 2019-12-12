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

public class Test_class extends StaticMethodsProcessFactory<Test_class>
{
		protected static MathUtils callObject_1;

	public Test_class() {
		super(Text.text("WPS"),"TestWPS",Test_class.class);
		callObject_1 = new MathUtils();
	}

	@DescribeProcess(title="Test",description="Add a description")
	@DescribeResult(name="result",description="Add a description")
	public static Integer Test() {
		Integer input1i_wps1 = 0;	
		Integer input2i_wps1 = 0;	
		Integer resultAi_wps1 = 0;
		Integer result;
		input1i_wps1=0;

		input2i_wps1=0;



		resultAi_wps1 = callObject_1.intAddBody(input1i_wps1,input2i_wps1);	
		result=resultAi_wps1;	
		return result;	
	}
}
