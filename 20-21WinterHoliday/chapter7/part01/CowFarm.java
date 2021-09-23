package part01;

public class CowFarm {
	static String farmName;
	RedCow redCow;		//内部类声明对象
	CowFarm() {
	}
	CowFarm(String s) {
		redCow = new RedCow(150, 112, 5000);
		farmName = s;
	}
	void showMess() {
		redCow.speak();
	}
	static class RedCow {		//内部类的声明
		String cowName = "红牛";
		int height, weight, price;
		RedCow(int h, int w, int p) {
			height = h;
			weight = w;
			price = p;
		}
		void speak() {
			System.out.println("我是"+cowName+",身高"+height+",体重"+weight+",生活在"+farmName);
		}
	}			//内部类结束
}				//外嵌类结束
