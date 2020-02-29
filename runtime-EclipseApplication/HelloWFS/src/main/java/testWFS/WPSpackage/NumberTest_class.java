package testWFS.WPSpackage;

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

import FCtest.helloWorldFC;

public class NumberTest_class extends StaticMethodsProcessFactory<NumberTest_class>
{
		protected static helloWorldFC callObject_1;

	public NumberTest_class() {
		super(Text.text("testsWFS"),"testWFS",NumberTest_class.class);
		callObject_1 = new helloWorldFC();
	}

	@DescribeProcess(title="numberTest",description="test on WFS calls")
	@DescribeResult(name="number",description="number of features")
	public static Integer numberTest() {
		FeatureCollection<SimpleFeatureType, SimpleFeature> features_wps1 ;	
		Integer number_wps1 = 0;
		FeatureCollection<SimpleFeatureType, SimpleFeature> wfs_1 = null;
		Integer result;

		wfs_1 = (new WFSrequest("portail.indigeo.fr/geoserver/LETG-BREST/ows","LETG-BREST:REF_VOUG")).Call();
		features_wps1 = wfs_1;

		number_wps1 = callObject_1.numberFeatures(features_wps1);	
		result=number_wps1;	
		return result;	
	}
}
