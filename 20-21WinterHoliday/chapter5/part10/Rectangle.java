package part10;

public class Rectangle extends Geometry {
	double a, b;
	Rectangle(double a, double b) {
		this.a = a;
		this.b = b;
	}
	public double getArea() {
		return a*b;
	}
}
//20210119