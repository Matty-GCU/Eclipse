package chapter5;

public class PowerSubstation {
	double rate1 = 0.59;
	double rate2 = 0.64;
	double rate3 = 0.86;
	double rate4 = 0.91;
	public double generateElectricBill(boolean isResidentialElectricity, double electricConsumption) {
		if(isResidentialElectricity == false)
			return commercialElectricity(electricConsumption);
		else
			return residentialElectricity(electricConsumption);
	}
	
	private double residentialElectricity(double electricConsumption) {
		if(electricConsumption < 260)
			return electricConsumption*rate1;
		else if(electricConsumption < 600)
			return 260*rate1 + (electricConsumption-260)*rate2;
		else
			return 260*rate1 + (600-260)*rate2 + (electricConsumption-600)*rate3;
	}
	
	private double commercialElectricity(double electricConsumption) {
		return electricConsumption*rate4;
	}
}
