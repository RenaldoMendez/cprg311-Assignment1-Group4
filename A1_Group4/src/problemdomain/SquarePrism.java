package problemdomain;

public class SquarePrism extends Prism {
	
	public double calcBaseArea() {
		return Math.pow(super.getSide(), 2);
	}

	public double calcVolume() {
		return calcBaseArea() * super.getHeight();
	}

}
