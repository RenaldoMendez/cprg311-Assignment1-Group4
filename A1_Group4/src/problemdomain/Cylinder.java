package problemdomain;

public class Cylinder extends GeometricalShape {
	private double height = 0;
	private double radius = 0;
	
	private static final double PI = 3.14159;

	public Cylinder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cylinder(double height, double radius) {
		this.height = height;
		this.radius = radius;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double calcVolume() {
		return this.calcBaseArea() * this.getHeight();
		
	}

	@Override
	public double calcBaseArea() {
		return PI * Math.pow(this.getRadius(),2);
	}
	
}

