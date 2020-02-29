package tools;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.geotools.feature.*;
import org.geotools.feature.simple.*;
import org.opengis.feature.simple.SimpleFeature;
import org.opengis.feature.simple.SimpleFeatureType;
import org.opengis.referencing.FactoryException;
import org.opengis.referencing.NoSuchAuthorityCodeException;

import com.vividsolutions.jts.geom.LineString;
import com.vividsolutions.jts.geom.Point;

public class CoastLinesTracking {

	private static DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

	public CoastLinesTracking() {}

	/**
	 * @param referenceLine
	 * @param length
	 * @param distance
	 * @param direction
	 * @return
	 */
	public FeatureCollection<SimpleFeatureType, SimpleFeature> drawRadial(FeatureCollection<SimpleFeatureType, SimpleFeature> referenceLine,
			double length,double distance, boolean direction) {
		
		DefaultFeatureCollection resultFeatureCollection = null;

		try {
			SimpleFeatureTypeBuilder simpleFeatureTypeBuilder = new SimpleFeatureTypeBuilder();
			simpleFeatureTypeBuilder.setName("featureType");
			simpleFeatureTypeBuilder.add("geometry", LineString.class);
			simpleFeatureTypeBuilder.add("type", String.class);
			simpleFeatureTypeBuilder.add("name", String.class);

			LineString refLine = CoastLineUtils.getReferenceLineFromFeature(referenceLine);
			LinkedList<LineString> segements = CoastLineUtils.createSegments(refLine, distance);
			LinkedList<LineString> listRadiales = new LinkedList<LineString>();
			LineString radiale = null;
			// create radials
			for (LineString l : segements) {
				radiale = CoastLineUtils.createRadialSegment(l, length, direction, true);
				listRadiales.add(radiale);
			}

			radiale = CoastLineUtils.createRadialSegment(segements.get(segements.size() - 1), length, direction, false);
			listRadiales.add(radiale);

			// init DefaultFeatureCollection
			SimpleFeatureBuilder simpleFeatureBuilder = new SimpleFeatureBuilder(
					simpleFeatureTypeBuilder.buildFeatureType());
			resultFeatureCollection = new DefaultFeatureCollection(null, simpleFeatureBuilder.getFeatureType());

			// add geometrie to defaultFeatures
			for (int i = 0; i < listRadiales.size(); i++) {
				int id = i + 1;
				simpleFeatureBuilder.add(listRadiales.get(i));
				simpleFeatureBuilder.add("radiale");
				simpleFeatureBuilder.add("R" + id);
				resultFeatureCollection.add(simpleFeatureBuilder.buildFeature(id + ""));
			}

		} catch (NoSuchAuthorityCodeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FactoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultFeatureCollection;
	}

	/**
	 * @param raidalResultFeatureCollection
	 * @return
	 */
	public FeatureCollection<SimpleFeatureType, SimpleFeature> getDistances(
			FeatureCollection<SimpleFeatureType, SimpleFeature> radials,
			FeatureCollection<SimpleFeatureType, SimpleFeature> coastLines) {

		DefaultFeatureCollection resultFeatureCollection = null;
		try {
			SimpleFeatureTypeBuilder simpleFeatureTypeBuilder = new SimpleFeatureTypeBuilder();
			simpleFeatureTypeBuilder.setName("featureType");
			simpleFeatureTypeBuilder.add("geometry", LineString.class);
			simpleFeatureTypeBuilder.add("radiale", String.class);
			simpleFeatureTypeBuilder.add("fromDate", String.class);
			simpleFeatureTypeBuilder.add("toDate", String.class);
			simpleFeatureTypeBuilder.add("separate_dist", Double.class);
			simpleFeatureTypeBuilder.add("cumulate_dist", Double.class);
			simpleFeatureTypeBuilder.add("taux_recul", Double.class);

			SimpleFeatureBuilder simpleFeatureBuilder = new SimpleFeatureBuilder(
					simpleFeatureTypeBuilder.buildFeatureType());

			Map<String, LineString> radialsMap = CoastLineUtils.getLinesByType(radials, 1);
			Map<Date, LineString> coastLinesMap = CoastLineUtils.sortBydate(CoastLineUtils.getLinesByType(coastLines, 2));
			List<Date> dates = CoastLineUtils.getDatesFromCoastLinesMap(coastLinesMap);

			Map<String, Map<Date, Point>> intersectedPoints = CoastLineUtils.getIntersectedPoints(radialsMap, coastLinesMap);
			Map<String, Map<Date[], LineString>> composedSegments = CoastLineUtils.getComposedSegment(intersectedPoints);
			resultFeatureCollection = new DefaultFeatureCollection(null, simpleFeatureBuilder.getFeatureType());
			int id = 0;
			for (Map.Entry<String, Map<Date[], LineString>> radial : composedSegments.entrySet()) {

				for (Map.Entry<Date[], LineString> line : radial.getValue().entrySet()) {

					LineString ln = line.getValue();
					double separateDistance = 0;
					double accumulateDistance = 0;
					id++;

					if ((ln.getStartPoint().getX() < ln.getEndPoint().getX())
							&& (ln.getStartPoint().getY() > ln.getEndPoint().getY())) {
						separateDistance = -line.getValue().getLength();
					} else {
						separateDistance = line.getValue().getLength();
					}

					List<Date> datesBefor = CoastLineUtils.getBeforDates(dates, line.getKey()[1]);
					if (!datesBefor.isEmpty()) {
						accumulateDistance = CoastLineUtils.getCumulatedDistance(composedSegments, datesBefor,
								radial.getKey());
					} else {
						accumulateDistance = separateDistance;
					}

					int nbrJours = CoastLineUtils.getNbrDaysBetweenTwoDate(line.getKey()[0], line.getKey()[1]);
					double taux = separateDistance / nbrJours;

					simpleFeatureBuilder.add(line.getValue());
					simpleFeatureBuilder.add(radial.getKey());
					simpleFeatureBuilder.add(dateFormat.format(line.getKey()[0]));
					simpleFeatureBuilder.add(dateFormat.format(line.getKey()[1]));
					simpleFeatureBuilder.add(separateDistance);
					simpleFeatureBuilder.add(accumulateDistance);
					simpleFeatureBuilder.add(taux);
					resultFeatureCollection.add(simpleFeatureBuilder.buildFeature(id + ""));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return resultFeatureCollection;
	}

	public String distancesToCSV(
			FeatureCollection<SimpleFeatureType, SimpleFeature> distances) {

		List<Date> dates = CoastLineUtils.getDatesFromFeatures(distances);

		String sep = "|";
		String eol = "\n";
		String headers = "";
		String subHeaders = "";
		String rad = "rad";
		String csv = "";

		List<String> dataList = new ArrayList<String>();

		for (Date d : dates)
			headers = headers + dateFormat.format(d) + "|";

		headers = headers.substring(0, headers.length() - 1) + eol;

		for (int i = 1; i < dates.size(); i++)
			subHeaders = subHeaders + "separe;cumule;taux" + sep;

		subHeaders = rad + sep + subHeaders.substring(0, subHeaders.length() - 1) + eol;
		dataList.add(headers);
		dataList.add(subHeaders);

		for (String radiale : CoastLineUtils.getRadialsNameFromFeatures(distances)) {
			String data = radiale + sep;
			for (int i = 1; i < dates.size(); i++) {

				double cumulateDist = CoastLineUtils.getDistanceByType(distances, 1, dates.get(i), radiale);
				double separateDist = CoastLineUtils.getDistanceByType(distances, 2, dates.get(i), radiale);
				double taux = CoastLineUtils.getDistanceByType(distances, 3, dates.get(i), radiale);

				if (cumulateDist != -1)
					data = data + cumulateDist + ";";
				else
					data = data + "none" + ";";

				if (separateDist != -1)
					data = data + separateDist + ";";
				else
					data = data + "none" + ";";

				if (taux != -1)
					data = data + taux;
				else
					data = data + "none";

				data = data + sep;
			}
			data = data.substring(0, data.length() - 1) + eol;
			dataList.add(data);
		}

		for (String line : dataList)
			csv = csv + line;
		return csv;
	}
}


