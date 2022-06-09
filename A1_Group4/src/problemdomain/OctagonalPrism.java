package problemdomain;

public class OctagonalPrism extends Prism {

	/**
	 * 
	 */
	public OctagonalPrism() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param side
	 * @param height
	 */
	public OctagonalPrism(double side, double height) {
		super(side, height);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param height
	 */
	public OctagonalPrism(double height) {
		super(height);
		// TODO Auto-generated constructor stub
	}

	public double calcBaseArea() {
		return 2 * (1 + Math.sqrt(2)) * (Math.pow(super.getSide(), 2));
	}

	public double calcVolume() {
		return this.calcBaseArea() * super.getHeight();
	}

}
