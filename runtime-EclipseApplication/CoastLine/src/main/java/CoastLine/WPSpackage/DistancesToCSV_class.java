package CoastLine.WPSpackage;

import org.geotools.process.factory.*;
import org.geotools.text.Text;
import org.geotools.feature.FeatureCollection;
import org.opengis.feature.simple.*;
import java.awt.image.BufferedImage;

import com.vividsolutions.jts.geom.*;

import tools.CoastLinesTracking;

public class DistancesToCSV_class extends StaticMethodsProcessFactory<DistancesToCSV_class> {
	
	protected static CoastLinesTracking callObject;

	public DistancesToCSV_class() {
		super(Text.text("coast line analysis"),"CoastLine",DistancesToCSV_class.class);
		callObject = new CoastLinesTracking();
	}

	@DescribeProcess(title="DistancesToCSV",description="Add a description of DistancesToCSV")
	@DescribeResult(name="result",description="distances in a CSV format")
	public static String DistancesToCSV(@DescribeParameter(name="distances",description=" distance to the reference line") FeatureCollection<SimpleFeatureType, SimpleFeature> distances) {
		String result;
		result = callObject.distancesToCSV( distances);

		return result;
	}
}
