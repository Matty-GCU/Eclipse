package part5;

//MVC结构里的Model
public class Triangle {
	double sideA, sideB, sideC, area;
	boolean isTriangle;
	public String getArea() {
		if(isTriangle) {
			//使用边长计算三角形的面积
			double p = (sideA + sideB + sideC) / 2.0;
			area = Math.sqrt(p * (p-sideA) * (p-sideB) * (p-sideC));
			return "面积为" + String.valueOf(area);
		}
		else {
			return "无法计算面积";
		}
	}
	public void setSideA(double a) {
		sideA = a;
		isTriangle = isATriangle();
	}
	public void setSideB(double b) {
		sideB = b;
		isTriangle = isATriangle();
	}
	public void setSideC(double c) {
		sideC = c;
		isTriangle = isATriangle();
	}
	private boolean isATriangle() {
		if(sideA+sideB > sideC && sideA+sideC > sideB && sideB+sideC > sideA) {
			return true;
		}
		else {
			return false;
		}
	}
}
