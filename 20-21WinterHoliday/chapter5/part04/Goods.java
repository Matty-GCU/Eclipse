package part04;

public class Goods {
	public double weight;
	public void oldSetWeight(double w) {
		weight = w;
		System.out.println("doubelÐÍµÄweight=" + weight);
	}
	public double oldGetPrice() {
		double price = weight*10;
		return price;
	}
}
//20210119