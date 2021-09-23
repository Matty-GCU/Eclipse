package part5;

//MVC�ṹ���Model
public class Triangle {
	double sideA, sideB, sideC, area;
	boolean isTriangle;
	public String getArea() {
		if(isTriangle) {
			//ʹ�ñ߳����������ε����
			double p = (sideA + sideB + sideC) / 2.0;
			area = Math.sqrt(p * (p-sideA) * (p-sideB) * (p-sideC));
			return "���Ϊ" + String.valueOf(area);
		}
		else {
			return "�޷��������";
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
