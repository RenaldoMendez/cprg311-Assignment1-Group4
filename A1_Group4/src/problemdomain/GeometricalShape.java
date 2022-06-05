package problemdomain;

public class GeometricalShape implements Comparable<GeometricalShape> {
	private double height;
	private double radius;
	private double side;

	public GeometricalShape() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GeometricalShape(double height, double radius) {
		super();
		this.height = height;
		this.radius = radius;
	}
	
	public GeometricalShape(double height) {
		super();
		this.height = height;
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

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	public double calcVolume() {
		return 0;
		
	}
	
	public double calcBaseArea() {
		return 0;
	}

	@Override
	public int compareTo(GeometricalShape that) {
		if(this.height > that.height) {
			return 1;
		}
		else if(this.height < that.height) {
			return -1;
		}
		else
			return 0;
	}
	

}
