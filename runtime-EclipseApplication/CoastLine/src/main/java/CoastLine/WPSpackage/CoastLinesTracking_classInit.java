package CoastLine.WPSpackage;

import org.geoserver.wps.gs.GeoServerProcess;
import org.geotools.feature.FeatureCollection;
import org.geotools.process.factory.DescribeParameter;
import org.geotools.process.factory.DescribeProcess;
import org.geotools.process.factory.DescribeResult;
import org.geotools.process.factory.StaticMethodsProcessFactory;
import org.geotools.text.Text;
import org.opengis.feature.simple.SimpleFeature;
import org.opengis.feature.simple.SimpleFeatureType;

import tools.CoastLinesTracking;

@DescribeProcess(title = "Coastlines tracking project", description = "WPS for the tracking of coastlines")
public class CoastLinesTracking_classInit extends StaticMethodsProcessFactory<CoastLinesTracking_classInit>
		implements GeoServerProcess {

	protected static CoastLinesTracking callObject;

	public CoastLinesTracking_classInit() {
		super(Text.text("WPS for the tracking of coastlines "), "coa", CoastLinesTracking_classInit.class);
		callObject = new CoastLinesTracking();
	}

	/**
	 * @param referenceLine
	 * @param length
	 * @param distance
	 * @param direction
	 * @return
	 */
	@DescribeProcess(title = "Draw radial", description = "draw radial from reference Line")
	@DescribeResult(name = "resulFeatureCollection", description = "the result of drawing radials in reference Line")
	public static FeatureCollection<SimpleFeatureType, SimpleFeature> drawRadial(
			@DescribeParameter(name = "referenceLine", description = "the input referenceLine") final FeatureCollection<SimpleFeatureType, SimpleFeature> referenceLine,
			@DescribeParameter(name = "radialLength", description = "the length of radial in M") final double length,
			@DescribeParameter(name = "radialDistance", description = "the distance between radials in M") final double distance,
			@DescribeParameter(name = "radialDirection", description = "the direction of radial (true or false)") final boolean direction) {
		
		FeatureCollection<SimpleFeatureType, SimpleFeature> result;
		
		result = callObject.drawRadial(referenceLine, length, distance, direction);

		return result;
	}

	/**
	 * @param raidalResultFeatureCollection
	 * @return
	 */
	@DescribeProcess(title = "Calculate distances between coastlines", description = "calculate distances between coastlines using radials intersection.")
	@DescribeResult(name = "resultFeatureCollection", description = "the result of distance calculting.")
	public static FeatureCollection<SimpleFeatureType, SimpleFeature> getDistances(
			@DescribeParameter(name = "radials", description = "the result featureCollection from draw radials process") final FeatureCollection<SimpleFeatureType, SimpleFeature> radials,
			@DescribeParameter(name = "coaslines", description = "the input Coaslines") final FeatureCollection<SimpleFeatureType, SimpleFeature> coastLines) {

		FeatureCollection<SimpleFeatureType, SimpleFeature> result;
		
		result = callObject.getDistances(radials, coastLines);

		return result;
	}

	@DescribeProcess(title = "distancesToCSV", description = "parse a feautureCollection of distances to csv String.")
	@DescribeResult(name = "csvString", description = "the result of parsing distances.")
	public static String getDistancesToCSV(
			@DescribeParameter(name = "distancesFeatureCollection", description = "the result distance feature collection") final FeatureCollection<SimpleFeatureType, SimpleFeature> distances) {

		String result;
		
		result = callObject.distancesToCSV(distances);

		return result;
	}

	@DescribeProcess(title = "coastLinesTracking", description = "coastLinesTracking WPS")
	@DescribeResult(name = "csvString", description = "the result of coastLinesTracking WPS")
	public static String coastLinesTracking(
			@DescribeParameter(name = "referenceLine", description = "the input referenceLine") final FeatureCollection<SimpleFeatureType, SimpleFeature> referenceLine,
			@DescribeParameter(name = "radialLength", description = "the length of radial in M") final double length,
			@DescribeParameter(name = "radialDistance", description = "the distance between radials in M") final double distance,
			@DescribeParameter(name = "radialDirection", description = "the direction of radial (true or false)") final boolean direction,
			@DescribeParameter(name = "coaslines", description = "the input Coaslines") final FeatureCollection<SimpleFeatureType, SimpleFeature> coastLines) {

		FeatureCollection<SimpleFeatureType, SimpleFeature> fc1 = callObject.drawRadial(referenceLine, length, distance,direction);
		FeatureCollection<SimpleFeatureType, SimpleFeature> fc2 = fc1;
		FeatureCollection<SimpleFeatureType, SimpleFeature> fc3 = callObject.getDistances(fc2, coastLines);
		FeatureCollection<SimpleFeatureType, SimpleFeature> fc4 = fc3;
		String csv = callObject.distancesToCSV(fc4);

		return csv;
	}
}


