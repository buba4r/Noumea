package CoastLine.WPSpackage;

import org.geotools.process.factory.*;
import org.geotools.text.Text;
import org.geotools.feature.FeatureCollection;
import org.opengis.feature.simple.*;
import java.awt.image.BufferedImage;

import com.vividsolutions.jts.geom.*;

import tools.CoastLinesTracking;

public class DrawRadial_class extends StaticMethodsProcessFactory<DrawRadial_class> {
	
	protected static CoastLinesTracking callObject;

	public DrawRadial_class() {
		super(Text.text("coast line analysis"),"CoastLine",DrawRadial_class.class);
		callObject = new CoastLinesTracking();
	}

	@DescribeProcess(title="DrawRadial",description="Add a description of DrawRadial")
	@DescribeResult(name="result",description="set of radials")
	public static FeatureCollection<SimpleFeatureType, SimpleFeature> DrawRadial(@DescribeParameter(name="referenceLine",description=" the reference Line") FeatureCollection<SimpleFeatureType, SimpleFeature> referenceLine,@DescribeParameter(name="length",description=" length of radial") Double length,@DescribeParameter(name="distance",description=" distance between two radials") Double distance,@DescribeParameter(name="direction",description=" direction of the radial") Boolean direction) {
		FeatureCollection<SimpleFeatureType, SimpleFeature> result;
		result = callObject.drawRadial( referenceLine, length, distance, direction);

		return result;
	}
}
