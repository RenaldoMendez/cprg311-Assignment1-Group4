package manager;

import problemdomain.GeometricalShape;
import java.util.Comparator;

public class VolumeCompare implements Comparator<GeometricalShape> {

	@Override
	public int compare(GeometricalShape shape1, GeometricalShape shape2) {
		if (shape1.calcVolume() > shape2.calcVolume()) {
			return 100;
		} else if (shape1.calcVolume() < shape2.calcVolume()) {
			return -100;
		} else
			return 0;
	}

}
