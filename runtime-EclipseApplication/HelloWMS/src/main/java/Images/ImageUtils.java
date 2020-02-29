package Images;

import java.awt.image.BufferedImage;

public class ImageUtils {
	public int numberPixelsImage(BufferedImage image) {
		return (image.getHeight() * image.getWidth() );
	}
}

