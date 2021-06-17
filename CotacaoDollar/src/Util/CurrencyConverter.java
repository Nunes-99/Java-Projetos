package Util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double pagar(double preco, double comp) {
		double total = preco *comp;
		return total + (preco * comp * IOF);
	}
	
	
}
