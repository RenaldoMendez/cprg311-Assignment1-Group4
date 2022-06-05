package problemdomain;

public class SquarePrism extends GeometricalShape {
	
	public double calcBaseArea() {
		return Math.pow(super.getSide(), 2);
	}

	public double calcVolume() {
		return calcBaseArea() * super.getHeight();
	}

}
