package lista_2;

import java.util.Scanner;

public class Exe_01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Informe o número 1");
		num1 = s.nextInt();
		
		System.out.println("Informe o número 2");
		num2 = s.nextInt();
		
		if(num1 > num2) {
			System.out.println("Maior Número: " + num1);
		} else if(num2 > num1) {
			System.out.println("Maior Número: " + num2);
		} else {
			System.out.println("Os números são iguais");
		}
	}
}
/*
	1. Faça um Programa que peça dois números e imprima o maior deles.
*/