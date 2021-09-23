package cn.edu.gcu;
public class GoodsDemo {

	public static void main(String[] args) {
		//实现多个商品的输出、汇总、购买、销售、查询等功能
		GoodsManage manager = new GoodsManage(1);
		manager.printAll();
		System.out.println("商店总资产：" + manager.totalPrice());
		manager.buyGoods("t", 10);
		manager.printAll();
	}

}
