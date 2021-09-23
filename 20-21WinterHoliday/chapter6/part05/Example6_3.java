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
		System.out.println("��������ʹ��XXɲ������");
	}
	public void charge() {
		System.out.println("��������2Ԫ/��");
	}
}

class Taxi extends MotorVehicles implements MoneyFare, ControlTemperature {
	void brake() {
		System.out.println("���⳵��ʹ��YYɲ������");
	}
	public void charge() {
		System.out.println("���⳵��2Ԫ/����");
	}
	public void controlTemperature() {
		System.out.println("���⳵��װ�˺����յ�");
	}
}

class Cinema implements MoneyFare, ControlTemperature {
	public void charge() {
		System.out.println("��ӰԺ��30Ԫ/��");
	}
	public void charge2() {
		System.out.println("��ӰԺ��3100Ԫ/��");
	}
	public void controlTemperature() {
		System.out.println("��ӰԺ��װ������յ�");
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