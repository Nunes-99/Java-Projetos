package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

import Util.Conta;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double valor = 0;
		
		System.out.println("Qual o n�mero da conta? ");
		String conta = sc.nextLine();
		
		System.out.println("Qual o nome do titular da conta? ");
		String nome = sc.nextLine();
		
		System.out.println("Voce deseja depositar algum dinheiro na conta? (sim = 1/n�o = 0)");
		int resp = sc.nextInt();
		
		switch (resp) {
		
		case 1:
			System.out.println("Qual o valor do dep�sito inicial?");
			valor = sc.nextDouble();
			break;
		case 0:
			valor = 0;
			break;
			
		default:
			break;
		}
		
		Conta cont = new Conta (conta, nome, valor);
		System.out.println(cont.toString());
		
		System.out.println("Qual o valor que pretende fazer de dep�sito?");
		double v = sc.nextDouble();
		cont.deposito(v);
		System.out.println("atualizando....");
		System.out.println(cont.toString());
		
		System.out.println("\nQual o valor que pretende fazer de saque?");
		v = sc.nextDouble();
		cont.saque(v);
		System.out.println("atualizando....");

		System.out.println(cont.toString());
	}

}
