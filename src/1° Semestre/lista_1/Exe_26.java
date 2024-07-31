package lista_1;

import java.util.Scanner;

public class Exe_26 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num1, num2, num3, multNumeros;
		
		System.out.println("Informe o valor do numero 1");
		num1 = s.nextInt();
		
		System.out.println("Informe o valor do numero 2");
		num2 = s.nextInt();
		
		System.out.println("Informe o valor do numero 3");
		num3 = s.nextInt();
		
		multNumeros = num1 * num2 * num3;
		
		System.out.println("Multiplicação do Números: " + multNumeros);
	}
}
/*
	26. Faça um algoritmo que receba três números, calcule e mostre a multiplicação desses números.
*/