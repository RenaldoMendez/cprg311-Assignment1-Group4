package problemdomain;

public class Cylinder extends GeometricalShape {

	private static final double PI = 3.14159;

	public Cylinder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cylinder(double height, double radius) {
		super(height, radius);
		// TODO Auto-generated constructor stub
	}

	public double calcBaseArea() {
		return PI * Math.pow(super.getRadius(), 2);
	}

	public double calcVolume() {
		return PI * Math.pow(super.getRadius(), 2) * super.getHeight();
	}
}
