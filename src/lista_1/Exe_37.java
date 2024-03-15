package lista_1;

import java.util.Scanner;

public class Exe_37 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int numTabuada;
		
		System.out.println("Informe qual tabuada deseja ver");
		numTabuada = s.nextInt();
		
		for (int i = 0; i <= 10; i++) {
			int tabuada = i * numTabuada;
			System.out.println(i + " X " + numTabuada + " = " + tabuada);
		}
		
	}
}
/*
	37. Faça um algoritmo que calcule e mostre a tabuada de um número digitado pelo usuário.
*/