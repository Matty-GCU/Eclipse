package part01;
import java.util.Date;

class TV {
	double price;
	public void setPrice(double m) {
		price = m;
	}
	public String toString() {
		String oldStr = super.toString();
		return oldStr + "\n这是电视机，价格是" + price;
	}
}
public class Example8_5 {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.toString());
		TV tv = new TV();
		tv.setPrice(1459.99);
		System.out.println(tv.toString());
	}

}
