package CoastLine.WPSpackage;

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

import tools.CoastLinesTracking;
import tools.CoastLinesTracking;
import tools.CoastLinesTracking;

public class CoastLineEvolution_class extends StaticMethodsProcessFactory<CoastLineEvolution_class>
{
		protected static CoastLinesTracking callObject_1;
		protected static CoastLinesTracking callObject_2;
		protected static CoastLinesTracking callObject_3;

	public CoastLineEvolution_class() {
		super(Text.text("coast line analysis"),"CoastLine",CoastLineEvolution_class.class);
		callObject_1 = new CoastLinesTracking();
		callObject_2 = new CoastLinesTracking();
		callObject_3 = new CoastLinesTracking();
	}

	@DescribeProcess(title="CoastLineEvolution",description="coast line analysis")
	@DescribeResult(name="result",description="distances to the reference line in CSV format")
	public static String CoastLineEvolution(@DescribeParameter(name="coastLines",description=" Add a description") FeatureCollection<SimpleFeatureType, SimpleFeature> coastLines,@DescribeParameter(name="referenceLine",description=" Add a description") FeatureCollection<SimpleFeatureType, SimpleFeature> referenceLine) {
		FeatureCollection<SimpleFeatureType, SimpleFeature> referenceLine_wps1 ;	
		Double length_wps1 = 0.0;	
		Double distance_wps1 = 0.0;	
		Boolean direction_wps1 = true;	
		FeatureCollection<SimpleFeatureType, SimpleFeature> result_wps1 ;
		FeatureCollection<SimpleFeatureType, SimpleFeature> radials_wps2 ;	
		FeatureCollection<SimpleFeatureType, SimpleFeature> coastLines_wps2 ;	
		FeatureCollection<SimpleFeatureType, SimpleFeature> result_wps2 ;
		FeatureCollection<SimpleFeatureType, SimpleFeature> distances_wps3 ;	
		String result_wps3 = "";
		String result;
		referenceLine_wps1=referenceLine;
		coastLines_wps2=coastLines;
		length_wps1=200.0;

		distance_wps1=20.0;

		direction_wps1=true;



		result_wps1 = callObject_1.drawRadial(referenceLine_wps1,length_wps1,distance_wps1,direction_wps1);	
		radials_wps2=result_wps1;
		result_wps2 = callObject_2.getDistances(radials_wps2,coastLines_wps2);	
		distances_wps3=result_wps2;
		result_wps3 = callObject_3.distancesToCSV(distances_wps3);	
		result=result_wps3;	
		return result;	
	}
}
