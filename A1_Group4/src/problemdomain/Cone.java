package problemdomain;

public class Cone extends GeometricalShape {

	private static final double PI = 3.14159;

	public Cone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cone(double height, double radius) {
		super(height, radius);
		// TODO Auto-generated constructor stub
	}

	public double calcBaseArea() {
		return PI * Math.pow(super.getRadius(), 2);
	}

	public double calcVolume() {
		return (1 / 3) * PI * Math.pow(super.getRadius(), 2) * super.getHeight();
	}

}
