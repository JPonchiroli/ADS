package lista_2;

import java.util.Scanner;

public class Exe_02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num1;
		
		System.out.println("Informe um número");
		num1 = s.nextInt();
		
		
		if(num1 > 0) {
			System.out.println("Número Positivo");
		} else if(num1 < 0) {
			System.out.println("Número Negativo");
		} else {
			System.out.println("Número igual a 0");
		}
	}
}
/*
	2. Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
*/