package util;

public class CurrencyConverter {
	public static double TAX = 0.06;
	public static double dollarPrice;
	public static double dollars;
	
	public static double converter() {
		return dollarPrice * dollars * (1+TAX);
	}
}
