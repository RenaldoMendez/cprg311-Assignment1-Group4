package problemdomain;

public class SquarePrism extends Prism {
	
	
	/**
	 * 
	 */
	public SquarePrism() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param side
	 * @param height
	 */
	public SquarePrism(double side, double height) {
		super(side, height);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param height
	 */
	public SquarePrism(double height) {
		super(height);
		// TODO Auto-generated constructor stub
	}

	public double calcBaseArea() {
		return Math.pow(super.getSide(), 2);
	}

	public double calcVolume() {
		return calcBaseArea() * super.getHeight();
	}

}
