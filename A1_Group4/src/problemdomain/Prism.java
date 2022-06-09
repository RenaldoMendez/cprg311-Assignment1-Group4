package problemdomain;

public class Prism {

private double side;
private double height;
	

public Prism() {
	
}



public Prism(double side, double height) {
	super();
	this.side = side;
	this.height = height;
}



public double calcVolume() {
	return 0;
	
}

public double calcBaseArea() {
	return 0;
}



@Override
public String toString() {
	return "Prism [side=" + side + ", height=" + height + "]";
}

}
