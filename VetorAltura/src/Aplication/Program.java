package Aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Qual a quantidade de pessoas? ");
		int num = sc.nextInt();
		
		double [] vect = new double [num];
		
		for (int i=0; i<num; i++) {
			System.out.print("Informe a altura: ");
			vect[i] = sc.nextDouble();
		}
		
		double soma = 0;
		
		for (int i = 0; i<num; i++) {
			soma += vect[i];
		}
		
		double media = soma / num;
		
		System.out.printf("A média da altura é %.2f", media);
		
		sc.close();
	}

}
