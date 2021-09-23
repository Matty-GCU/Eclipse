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
			System.out.println("没有底，无法计算柱体面积");
			return -1;
		}
		return height * bottom.getArea();
	}
}
//20210119