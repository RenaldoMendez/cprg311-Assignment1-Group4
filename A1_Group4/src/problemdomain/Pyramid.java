package problemdomain;

public class Pyramid extends Prism {

	public Pyramid(double height, double side) {
		super.setHeight(height);
		super.setSide(side);
	}

	public double calcBaseArea() {
		return Math.pow(super.getSide(), 2);
	}

	public double calcVolume() {
		return (1 / 3) * calcBaseArea() * super.getHeight();
	}

}
