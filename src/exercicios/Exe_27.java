package exercicios;

import java.util.Scanner;

public class Exe_27 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double num1, num2, resultDivisao;
		
		System.out.println("Informe o valor do numero 1");
		num1 = s.nextInt();
		
		System.out.println("Informe o valor do numero 2");
		num2 = s.nextInt();
		
		resultDivisao = num1 / num2;
		
		System.out.println("Resultado da Divisão: " + resultDivisao);
		
	}
}
/*
	27. Faça um algoritmo que receba dois números, calcule e mostre a divisão do primeiro número
	pelo segundo. Sabe-se que o segundo número não pode ser zero, portanto não é necessário se
	preocupar com validações.
*/