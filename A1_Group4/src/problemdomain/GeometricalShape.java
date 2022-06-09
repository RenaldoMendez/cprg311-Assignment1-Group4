package problemdomain;

public class GeometricalShape implements Comparable<GeometricalShape> {
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
