package problemdomain;

public class TriangularPrism extends Prism {
	
	/**
	 * 
	 */
	public TriangularPrism() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param side
	 * @param height
	 */
	public TriangularPrism(double side, double height) {
		super(side, height);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param height
	 */
	public TriangularPrism(double height) {
		super(height);
		// TODO Auto-generated constructor stub
	}

	public double calcBaseArea() {
		return (Math.pow(super.getSide(), 2) * Math.sqrt(3)) / 4;
	}

	public double calcVolume() {
		return calcBaseArea() * super.getHeight();
	}


}
