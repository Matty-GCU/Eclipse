package chapter6;


public class H1_CheckCarWeight {

	public static void main(String[] args) {
		ComputerWeight[] goods = new ComputerWeight[650];
		for(int i = 0; i < goods.length; i++) {
			if(i%3 == 0)
				goods[i] = new Television();
			else if(i%3 == 1)
				goods[i] = new Computer();
			else if(i%3 == 2)
				goods[i] = new WashMachine();
		}
		Truck truck = new Truck(goods);
		System.out.println("货车装载的货物重量：" + (int)truck.getTotalWeights());
		goods = new ComputerWeight[68];
		for(int i = 0; i < goods.length; i++) {
			if(i % 2 == 0)
				goods[i] = new Television();
			else
				goods[i] = new WashMachine();
		}
		truck.setGoods(goods);
		System.out.println("货车装载的货物重量：" + (int)truck.getTotalWeights());
	}

}

interface ComputerWeight {
	public double computerWeight();
}

class Television implements ComputerWeight {
	public double computerWeight() {
		return 3.5;
	}
}

class Computer implements ComputerWeight {
	public double computerWeight() {
		return 2.67;
	}
}

class WashMachine implements ComputerWeight {
	public double computerWeight() {
		return 13.8;
	}
}

class Truck {
	ComputerWeight[] goods;
	double getTotalWeight = 0;
	Truck(ComputerWeight[] goods) {
		this.goods = goods;
	}
	public void setGoods(ComputerWeight[] goods) {
		this.goods = goods;
	}
	public double getTotalWeights() {
		getTotalWeight = 0;
		for(ComputerWeight c: goods) {
			getTotalWeight += c.computerWeight();
		}
		return getTotalWeight;
	}
}