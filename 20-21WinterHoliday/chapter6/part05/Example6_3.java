package part05;

abstract class MotorVehicles {
	abstract void brake();
}

interface MoneyFare {
	void charge();
}

interface ControlTemperature {
	void controlTemperature();
}

class Bus extends MotorVehicles implements MoneyFare {
	void brake() {
		System.out.println("公交车：使用XX刹车技术");
	}
	public void charge() {
		System.out.println("公交车：2元/人");
	}
}

class Taxi extends MotorVehicles implements MoneyFare, ControlTemperature {
	void brake() {
		System.out.println("出租车：使用YY刹车技术");
	}
	public void charge() {
		System.out.println("出租车：2元/公里");
	}
	public void controlTemperature() {
		System.out.println("出租车安装了海尔空调");
	}
}

class Cinema implements MoneyFare, ControlTemperature {
	public void charge() {
		System.out.println("电影院：30元/人");
	}
	public void charge2() {
		System.out.println("电影院：3100元/人");
	}
	public void controlTemperature() {
		System.out.println("电影院安装了中央空调");
	}
}

public class Example6_3 {
	
	public static void main(String[] args) {
		
		Bus bus313 = new Bus();
		Taxi blueTaxi = new Taxi();
		Cinema allStarsCinema = new Cinema();
		MoneyFare fare;
		ControlTemperature temperature;
		
		fare = bus313;
		bus313.brake();
		fare.charge();
		
		fare = blueTaxi;
		temperature = blueTaxi;
		blueTaxi.brake();
		fare.charge();
		temperature.controlTemperature();

		fare = allStarsCinema;
		temperature = allStarsCinema;
		fare.charge();
		temperature.controlTemperature();
	}
	
}
//20210121