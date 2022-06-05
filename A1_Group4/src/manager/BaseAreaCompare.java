package manager;

import problemdomain.GeometricalShape;
import java.util.Comparator;

public class BaseAreaCompare implements Comparator<GeometricalShape> {

	@Override
	public int compare(GeometricalShape shape1, GeometricalShape shape2) {
		if (shape1.calcBaseArea() > shape2.calcBaseArea()) {
			return 100;
		} else if (shape1.calcBaseArea() < shape2.calcBaseArea()) {
			return -100;
		} else
			return 0;
	}

}
