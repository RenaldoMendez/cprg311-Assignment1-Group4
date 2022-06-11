package problemdomain;

import java.util.Comparator;

public abstract class GeometricalShape implements Comparable<GeometricalShape>, Comparator<GeometricalShape>{
	private double height;
	

	public GeometricalShape() {
		super();
		// TODO Auto-generated constructor stub
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

	
	public abstract double calcVolume();
	
	public abstract double calcBaseArea();

	//Not necessary, the compareTo methods have their own classes
	@Override
	public int compareTo(GeometricalShape that) {
		if(this.getHeight() > that.getHeight()) {
			return 1;
		}
		else if(this.getHeight() < that.getHeight()) {
			return -1;
		}
		else
			return 0;
	}
	@Override
	public int compare(GeometricalShape o1, GeometricalShape o2) {
		if(o1.calcBaseArea() > o2.calcBaseArea()) {
			return 1;
		}else if (o1.calcBaseArea() < o2.calcBaseArea()) {
			return -1;
		}else
		return 0;
	}
	

}
