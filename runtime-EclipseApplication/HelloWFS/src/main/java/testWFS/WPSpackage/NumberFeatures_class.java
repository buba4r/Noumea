package testWFS.WPSpackage;

import org.geotools.process.factory.*;
import org.geotools.text.Text;
import org.geotools.feature.FeatureCollection;
import org.opengis.feature.simple.*;
import java.awt.image.BufferedImage;

import com.vividsolutions.jts.geom.*;

import FCtest.helloWorldFC;

public class NumberFeatures_class extends StaticMethodsProcessFactory<NumberFeatures_class> {
	
	protected static helloWorldFC callObject;

	public NumberFeatures_class() {
		super(Text.text("testsWFS"),"testWFS",NumberFeatures_class.class);
		callObject = new helloWorldFC();
	}

	@DescribeProcess(title="numberFeatures",description="number of features")
	@DescribeResult(name="number",description="number of features")
	public Integer numberFeatures(@DescribeParameter(name="features",description=" input feature") FeatureCollection<SimpleFeatureType, SimpleFeature> features) {
		Integer number;
		number = callObject.numberFeatures( features);

		return number;
	}
}
