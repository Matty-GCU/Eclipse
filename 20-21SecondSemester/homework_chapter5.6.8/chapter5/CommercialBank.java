package chapter5;

public class CommercialBank extends Bank{
	double year;
	public double computerInterest() {
	super.year = (int)year;
	int day = (int)((year - (int)year) * 1000);
	double yearInterest = super.computerInterest();
	double dayInterest = day * 0.00015 * savedMoney;
	interest = yearInterest + dayInterest;
	System.out.printf("%d元存在商业银行%d年%d零天的利息:%f元\n", savedMoney, super.year, day, interest);
	return interest;
	}
}
