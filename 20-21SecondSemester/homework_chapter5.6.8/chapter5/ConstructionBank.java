package chapter5;

public class ConstructionBank extends Bank{
	double year;
	public double computerInterest() {
	super.year = (int)year;
	int day = (int)((year - (int)year) * 1000);
	double yearInterest = super.computerInterest();
	double dayInterest = day * 0.0001 * savedMoney;
	interest = yearInterest + dayInterest;
	System.out.printf("%dԪ���ڽ�������%d��%d�������Ϣ:%fԪ\n", savedMoney, super.year, day, interest);
	return interest;
	}
}
