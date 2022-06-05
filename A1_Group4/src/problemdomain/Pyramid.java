package problemdomain;

public class Pyramid extends GeometricalShape {

	public Pyramid(double side, double height) {
		super.getHeight();
		super.getSide();
	}

	public double calcBaseArea() {
		return Math.pow(super.getSide(), 2);
	}

	public double calcVolume() {
		return (1 / 3) * calcBaseArea() * super.getHeight();
	}

}
