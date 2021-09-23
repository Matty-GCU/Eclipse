package part99;

public class Trapezoid {
	double upperBottom, bottom, height;
	public Trapezoid(double a, double b, double c) {
		upperBottom = a;
		bottom = b;
		height = c;
	}
	public double giveArea() {
		return ((upperBottom+bottom)*height)/2;
	}
}
