package part10;

public class Pillar {
	Geometry bottom;
	double height;
	Pillar(Geometry bottom, double height) {
		this.bottom = bottom;
		this.height = height;
	}
	public double getVolumn() {
		if(bottom == null) {
			System.out.println("û�еף��޷������������");
			return -1;
		}
		return height * bottom.getArea();
	}
}
//20210119