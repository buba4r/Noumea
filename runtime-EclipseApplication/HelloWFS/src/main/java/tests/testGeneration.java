package tests;

import org.geotools.feature.FeatureCollection;
import org.geotools.feature.FeatureIterator;
import org.opengis.feature.simple.SimpleFeature;
import org.opengis.feature.simple.SimpleFeatureType;

import remoteWpsCall.WFSrequest;
import testWFS.WPSpackage.NumberTest_class;

public class testGeneration {

	public static void main(String[] args) {
		
		System.out.println("test Program");
		
		NumberTest_class testHWWFS = new NumberTest_class();
/*        FeatureIterator<SimpleFeature> iterator = testWFS.features();
        while( iterator.hasNext() ){
            SimpleFeature feature = iterator.next();
            System.out.println(feature.toString());
        }*/
        System.out.println(testHWWFS.numberTest());  
	}
}