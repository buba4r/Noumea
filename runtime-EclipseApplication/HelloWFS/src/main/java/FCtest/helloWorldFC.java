package FCtest;

import org.geotools.feature.*;
import org.opengis.feature.simple.SimpleFeature;
import org.opengis.feature.simple.SimpleFeatureType;

public class helloWorldFC {

	public helloWorldFC() {}

	public int numberFeatures(FeatureCollection<SimpleFeatureType, SimpleFeature> aFeatureCollection) {
		
		return aFeatureCollection.size();
	}
}


