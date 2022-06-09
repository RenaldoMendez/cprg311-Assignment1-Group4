package problemdomain;

public class TriangularPrism extends Prism {
	
	public double calcBaseArea() {
		return (Math.pow(super.getSide(), 2) * Math.sqrt(3)) / 4;
	}

	public double calcVolume() {
		return calcBaseArea() * super.getHeight();
	}


}
