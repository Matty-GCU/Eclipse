package cn.edu.gcu;
public class GoodsDemo {

	public static void main(String[] args) {
		//ʵ�ֶ����Ʒ����������ܡ��������ۡ���ѯ�ȹ���
		GoodsManage manager = new GoodsManage(1);
		manager.printAll();
		System.out.println("�̵����ʲ���" + manager.totalPrice());
		manager.buyGoods("t", 10);
		manager.printAll();
	}

}
