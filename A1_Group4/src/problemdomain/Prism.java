package problemdomain;

public abstract class Prism extends GeometricalShape {

	private double side;
	private double height;

	/**
	 * 
	 */
	public Prism() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param height
	 */
	public Prism(double height) {
		super(height);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @param side
	 * @param height
	 */
	public Prism(double side, double height) {
		super();
		this.side = side;
		this.height = height;
	}

	/**
	 * @return the side
	 */
	public double getSide() {
		return side;
	}

	/**
	 * @param side the side to set
	 */
	public void setSide(double side) {
		this.side = side;
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	
	public abstract double calcVolume();
	
	public abstract double calcBaseArea();

	@Override
	public String toString() {
		return "Prism [side=" + side + ", height=" + height + "]";
	}

}
