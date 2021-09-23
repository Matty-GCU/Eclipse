package cn.edu.gcu;
import cn.edu.gcu.tools.GoodsInput;

public class GoodsManage {
	Goods[] goods;
	GoodsManage(int catalogueNumber) {
		goods = new Goods[catalogueNumber];
		for(int i = 0; i < goods.length; i++) {
			goods[i] = new Goods(GoodsInput.iName(), GoodsInput.iNumber(), GoodsInput.iPrice());
		}
	}
	int searchName(String t) {
		for(int i = 0; i < goods.length; i++) {
			if(goods[i].getName().equals(t)) {
				System.out.println("》》》");
				System.out.println("查询到第" + i + "号商品");
				goods[i].print();
				return i;
			}
		}
		System.out.println("查询失败");
		return -1;
	}
	boolean searchPrice(double min, double max) {
		boolean result = false;
		for(int i = 0; i < goods.length; i++) {
			double t = goods[i].getPrice();
			if(t >= min && t <= max) {
				System.out.println("》》》");
				System.out.println("查询到第" + i + "号商品");
				goods[i].print();
				result = true;
			}
		}
		if(result == false) {
			System.out.println("》》》");
			System.out.println("查询失败");
		}
		return result;
	}
	public void buyGoods(String name, int number) {
		for(int i = 0; i < goods.length; i++) {
			if(goods[i].getName().equals(name)) {
				goods[i].buy(number);
				break;
			}
		}
	}
	public void saleGoods(String name, int number) {
		for(int i = 0; i < goods.length; i++) {
			if(goods[i].getName().equals(name)) {
				goods[i].sale(number);
				break;
			}
		}
	}
	//
	public double totalPrice() {
		int sum = 0;
		for(int i = 0; i < goods.length; i++) {
			sum += goods[i].getPrice() * goods[i].getNumber();
		}
		return sum;
	}
	public void printAll() {
		System.out.println("》》》");
		for(int i = 0; i < goods.length-1; i++) {
			goods[i].print();
			System.out.println("----------");
		}
		goods[goods.length-1].print();
	}
	
}