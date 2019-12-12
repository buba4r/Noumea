package testWMS.WPSpackage;

import org.geotools.process.factory.*;
import org.geotools.text.Text;
import org.geotools.feature.FeatureCollection;
import org.opengis.feature.simple.*;
import java.awt.image.BufferedImage;

import com.vividsolutions.jts.geom.*;

import Images.ImageUtils;

public class ImageResolution_class extends StaticMethodsProcessFactory<ImageResolution_class> {
	
	protected static ImageUtils callObject;

	public ImageResolution_class() {
		super(Text.text("test on WMS"),"testWMS",ImageResolution_class.class);
		callObject = new ImageUtils();
	}

	@DescribeProcess(title="ImageResolution",description="image resolution")
	@DescribeResult(name="numberPixels",description="number of pixels")
	public static Integer ImageResolution(@DescribeParameter(name="inputImage",description=" the image to analyse") BufferedImage inputImage) {
		Integer numberPixels;
		numberPixels = callObject.numberPixelsImage( inputImage);

		return numberPixels;
	}
}
