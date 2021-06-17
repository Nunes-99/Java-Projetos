package Aplication;

import java.util.Locale;
import java.util.Scanner;

import Entities.Produto;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Qual a quantidade de produtos? ");
		int num = sc.nextInt();
		
		Produto [] vect = new Produto [num];
		
		for (int i = 0; i<num; i++) {
			System.out.println("Informe o nome do produto: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Informe o preço do produto: ");
			double price = sc.nextDouble();
			
			vect[i] = new Produto(name, price);
		}
		
		double soma = 0;
		
		for (int i = 0; i<num; i++) {
			soma += vect[i].getPrice();
		}
		
		double media = soma / num;
		
		System.out.printf("Média do preço é %.2f", media);
		 
		sc.close();
	}

}
