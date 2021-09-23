package chapter4;
import myUtil.Printer;

class Circle {
	double radius, area;
	void setRadius(double r) {
		radius = r;
	}
	double getRadius() {
		return radius;
	}
	double getArea() {
		area = 3.14*radius*radius;
		return area;
	}
}

class Circular {
	Circle  bottom;
	double height;
	void setBottom(Circle c) {		//设置圆锥的底是一个Circle对象
		bottom = c;
	}
	void setHeight(double h) {
		height = h;
	}
	double getVolume() {
		if(bottom == null)
			return -1;
		else
			return bottom.getArea()*height/3.0;
	}
	double getBottomRadius() {
		return bottom.getRadius();
	}
	public void setBottomRadius(double r) {
		bottom.setRadius(r);
	}
}

public class Example4_8 {
	public static void main(String args[]) {
		Circle circle = new Circle();
		circle.setRadius(10);
		Circular circular = new Circular();
		Printer p = new Printer();
		p.p("circle的引用:" + circle);
		p.p("bottom的引用:" + circular.bottom);
		circular.setHeight(5);
		circular.setBottom(circle);
		p.p("circle的引用:" + circle);
		p.p("bottom的引用:" + circular.bottom);
		p.p("圆锥的体积:" + circular.getVolume());
		p.p("修改circle的半径，bottom的半径同样变化");
		circle.setRadius(20);
		p.p("bottom的半径:" + circular.getBottomRadius());
		p.p("重新创建circle,circle的引用将发生变化");
		circle = new Circle();
		p.p("circle的引用:" + circle);
		p.p("但是不影响circular的bottom的引用");
		p.p("圆锥的bottom的引用" + circular.bottom);
	}
}
//20201207