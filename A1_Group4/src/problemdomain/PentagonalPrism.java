package problemdomain;

public class PentagonalPrism extends Prism {

	
	/**
	 * 
	 */
	public PentagonalPrism() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param side
	 * @param height
	 */
	public PentagonalPrism(double side, double height) {
		super(side, height);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param height
	 */
	public PentagonalPrism(double height) {
		super(height);
		// TODO Auto-generated constructor stub
	}

	public double calcBaseArea() {
		return (5 * (Math.pow(super.getSide(), 2)) * (Math.tan(54))) / 4;
	}

	public double calcVolume() {
		return this.calcBaseArea() * super.getHeight();
	}

}
