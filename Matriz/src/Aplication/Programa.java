package Aplication;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Informe o número de linhas: ");
		int m = sc.nextInt();
		System.out.printf("Informe o número de colunas: ");
		int n = sc.nextInt();
		
		int [][] mat = new int [m][n];
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				System.out.println("Informe um valor ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Informe um numero: ");
		int num = sc.nextInt();
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if (mat[i][j] == num) {
				System.out.println("Posição " + i + ", " + j + ":");
				if (j > 0) {
					System.out.println("Esquerda: " + mat[i][j-1]);
				}
				if (i > 0) {
					System.out.println("Em cima: " + mat[i-1][j]);
				}
				if (j < mat[i].length-1) {
					System.out.println("Direita: " + mat[i][j+1]);
				}
				if (i < mat.length-1) {
					System.out.println("Embaixo: " + mat[i+1][j]);
				}
			}
		}
		
		sc.close();
	}
	}
	
}
