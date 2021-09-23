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
	void setBottom(Circle c) {		//����Բ׶�ĵ���һ��Circle����
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
		p.p("circle������:" + circle);
		p.p("bottom������:" + circular.bottom);
		circular.setHeight(5);
		circular.setBottom(circle);
		p.p("circle������:" + circle);
		p.p("bottom������:" + circular.bottom);
		p.p("Բ׶�����:" + circular.getVolume());
		p.p("�޸�circle�İ뾶��bottom�İ뾶ͬ���仯");
		circle.setRadius(20);
		p.p("bottom�İ뾶:" + circular.getBottomRadius());
		p.p("���´���circle,circle�����ý������仯");
		circle = new Circle();
		p.p("circle������:" + circle);
		p.p("���ǲ�Ӱ��circular��bottom������");
		p.p("Բ׶��bottom������" + circular.bottom);
	}
}
//20201207