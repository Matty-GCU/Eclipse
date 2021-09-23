package chapter4;

public class H3_Cylinder {
	double r, h;
	H3_Cylinder() {
	}
	H3_Cylinder(double a) {
		r = a;
		h = a;
	}
	H3_Cylinder(double a, double b) {
		r = a;
		h = b;
	}
	double getArea() {
		double area = Math.PI * r * r;
		return area;
	}
	double getVolume() {
		double volume = h * getArea();
		return volume;
	}
}
//20201127