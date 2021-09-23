package part01;

public class Example7_1 {

	public static void main(String[] args) {
		CowFarm cowFarm = new CowFarm("QQÄÁ³¡");
		cowFarm.showMess();
		cowFarm.redCow.speak();
		CowFarm.RedCow redCow = new CowFarm.RedCow(180, 119, 6000);
		redCow.speak();
		//cowFarm.redCow VS redCow
	}

}
