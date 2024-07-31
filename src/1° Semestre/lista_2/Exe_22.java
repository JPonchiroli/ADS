package lista_2;

import java.util.Scanner;

public class Exe_22 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int valor;
		
		System.out.println("Informe um valor");
		valor = s.nextInt();
		
		if(valor % 2 == 0) {
			System.out.println("Número Informado é Par");
		} else {
			System.out.println("Número Informado é Impar");
		}
	}
}
/*
	22. Faça um Programa que peça um número inteiro e determine se ele é par ou ímpar. Dica: utilize o
	operador módulo (resto da divisão).
*/