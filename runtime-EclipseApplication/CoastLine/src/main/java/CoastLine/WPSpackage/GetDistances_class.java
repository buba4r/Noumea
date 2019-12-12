package CoastLine.WPSpackage;

import org.geotools.process.factory.*;
import org.geotools.text.Text;
import org.geotools.feature.FeatureCollection;
import org.opengis.feature.simple.*;
import java.awt.image.BufferedImage;

import com.vividsolutions.jts.geom.*;

import tools.CoastLinesTracking;

public class GetDistances_class extends StaticMethodsProcessFactory<GetDistances_class> {
	
	protected static CoastLinesTracking callObject;

	public GetDistances_class() {
		super(Text.text("coast line analysis"),"CoastLine",GetDistances_class.class);
		callObject = new CoastLinesTracking();
	}

	@DescribeProcess(title="GetDistances",description="Add a description of GetDistances")
	@DescribeResult(name="result",description="distances to the reference line")
	public static FeatureCollection<SimpleFeatureType, SimpleFeature> GetDistances(@DescribeParameter(name="radials",description=" set of radials") FeatureCollection<SimpleFeatureType, SimpleFeature> radials,@DescribeParameter(name="coastLines",description=" set of coast lines") FeatureCollection<SimpleFeatureType, SimpleFeature> coastLines) {
		FeatureCollection<SimpleFeatureType, SimpleFeature> result;
		result = callObject.getDistances( radials, coastLines);

		return result;
	}
}
