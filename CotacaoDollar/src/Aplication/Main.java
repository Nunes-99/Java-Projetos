package Aplication;

import java.util.Locale;
import java.util.Scanner;

import Util.CurrencyConverter;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual � o pre�o do dollar?");
		double preco = sc.nextDouble();
		
		System.out.println("Quantos dollars voc� pretende comprar?");
		double comp = sc.nextDouble();
		
		
		System.out.printf("O valor total a ser pago � %.2f.", CurrencyConverter.pagar(preco, comp));
		
		sc.close();
	}

}
