package Aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Cadastro;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <Cadastro> list = new ArrayList<>();
		
		System.out.println("Informe a quantidade de funcionários: ");
		int n = sc.nextInt();
		
		for(int i = 1; i < n+1; i++) {
			System.out.printf("Funcionario #"+i);
			
			System.out.printf("\nId: ");
			int id = sc.nextInt();
			while(hasId(list,id)) {
				System.out.println("Este id já existe, por favor tente novamente:");
				id = sc.nextInt();
			}
						
			System.out.printf("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.printf("Salario: ");
			double salario = sc.nextDouble();
			
			list.add(new Cadastro(nome, id, salario));
		}
		
		System.out.printf("Informe o Id do funcionário que terá um aumento: ");
		int id = sc.nextInt();
		
		Cadastro cad = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (cad == null) {
			System.out.println("Este Id não existe!!!");
		}else {
			System.out.printf("Informe a porcentagem que aumentará no salário: ");
			double valor = sc.nextDouble();
			cad.aumento(valor);
		}
		
		System.out.println("");
		System.out.println("Lista de Funcionários: ");
		for(Cadastro obj : list) {
			System.out.println(obj);
		}
		
		
		
		sc.close();
	}
	
	public static boolean hasId(List<Cadastro> list, int id) {
		Cadastro emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
