package chapter5;

public class H4_MyPowerStation extends PowerSubstation {
	public double getElectricBill(boolean isResidentialElectricity, int electricConsumption) {
		return electricConsumption * rate4;
	}
	public static void main(String[] args) {
		H4_MyPowerStation station = new H4_MyPowerStation();
		System.out.println(station.generateElectricBill(true, 510));
		System.out.println(station.generateElectricBill(false, 300));
	}
}
