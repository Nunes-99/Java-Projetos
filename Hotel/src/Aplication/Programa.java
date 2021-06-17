package Aplication;

import java.util.Locale;
import java.util.Scanner;

import Entities.Cadastro;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Cadastro[] vect = new Cadastro[10];

		System.out.println("Qual a quantidade de estudantes que irão alugar um quarto? ");
		int num = sc.nextInt();


		for (int i = 0; i < num; i++) {

			System.out.print("Informe o nome: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Informe o email: ");
			String email = sc.nextLine();

			System.out.print("Qual o quarto desejado?");
			int quart = sc.nextInt();

			vect[quart] = new Cadastro(name, email);

		}

		System.out.println();
		System.out.println("Lista dos quartos:");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}

		sc.close();
	}

}
