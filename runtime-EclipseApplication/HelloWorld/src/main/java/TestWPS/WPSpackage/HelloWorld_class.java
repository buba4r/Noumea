package TestWPS.WPSpackage;

import org.geotools.process.factory.*;
import org.geotools.text.Text;
import org.geotools.feature.FeatureCollection;
import org.opengis.feature.simple.*;
import java.awt.image.BufferedImage;

import com.vividsolutions.jts.geom.*;

import Tests.HW;

public class HelloWorld_class extends StaticMethodsProcessFactory<HelloWorld_class> {
	
	protected static HW callObject;

	public HelloWorld_class() {
		super(Text.text("WPS"),"TestWPS",HelloWorld_class.class);
		callObject = new HW();
	}

	@DescribeProcess(title="HelloWorld",description="WPS")
	@DescribeResult(name="result",description="input")
	public static String HelloWorld(@DescribeParameter(name="input",description=" input") String input) {
		String result;
		result = callObject.helloWorld( input);

		return result;
	}
}
