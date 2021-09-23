package cn.edu.gcu;

public class Goods {
	private String name; 
	private double price;
	private int number;
	//Constructor
	Goods(String name, double price) {
		this.name = name;
		this.price = price;
		number = 0;
	}
	Goods(String name, int number, double price) {
		this.name = name;
		this.number = number;
		this.price = price;
	}
	//Setter
	public void setName(String t) {
		name = t;
	}
	public void setnumber(int t) {
		number = t;
	}
	public void setPrice(double t) {
		price = t;
	}
	//Getter
	public String getName() {
		return name;
	}
	public int getNumber() {
		return number;
	}
	public double getPrice() {
		return price;
	}
	

	public void buy(int number) {
		this.number -= number;
	}
	public void sale(int number) {
		this.number -= number;
	}
	public void print() {
		System.out.println("商品：" + name);
		System.out.println("数量：" + number);
		System.out.println("价格：" + price);
	}
}
