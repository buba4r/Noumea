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


public class VougayCLE_class extends StaticMethodsProcessFactory<VougayCLE_class>
{
		protected static CoastLineEvolution_class callObject_1;

	public VougayCLE_class() {
		super(Text.text("coast line analysis"),"CoastLine",VougayCLE_class.class);
		callObject_1 = new CoastLineEvolution_class();
	}

	@DescribeProcess(title="VougayCLE",description="coast line analysis")
	@DescribeResult(name="result",description="distances to the reference line in CSV format")
	public static String VougayCLE() {
		FeatureCollection<SimpleFeatureType, SimpleFeature> coastLines_wps1 ;	
		FeatureCollection<SimpleFeatureType, SimpleFeature> referenceLine_wps1 ;	
		String result_wps1 = "";
		FeatureCollection<SimpleFeatureType, SimpleFeature> wfs_1 = null;
		FeatureCollection<SimpleFeatureType, SimpleFeature> wfs_2 = null;
		String result;

		wfs_1 = (new WFSrequest("portail.indigeo.fr/geoserver/LETG-BREST/ows","LETG-BREST:REF_VOUG")).Call();
		wfs_2 = (new WFSrequest("portail.indigeo.fr/geoserver/LETG-BREST/ows","LETG-BREST:TDC_VOUG")).Call();
		referenceLine_wps1 = wfs_1;
		coastLines_wps1 = wfs_2;

		result_wps1 = callObject_1.CoastLineEvolution(coastLines_wps1,referenceLine_wps1);	
		result=result_wps1;	
		return result;	
	}
}
