package Tests;

import java.awt.image.BufferedImage;
import com.vividsolutions.jts.geom.*;
import org.geotools.feature.FeatureCollection;
import org.opengis.feature.simple.*;

public class HWtypes {
	
	public String helloWorld(BufferedImage image, boolean b, Geometry point,FeatureCollection<SimpleFeatureType, SimpleFeature> referenceLine) {
		return ("Hello World");
	}
	
	public String helloWorldErr(Point image, boolean b, Geometry point,FeatureCollection<SimpleFeatureType, SimpleFeature> referenceLine) {
		return ("Hello World");
	}
}
