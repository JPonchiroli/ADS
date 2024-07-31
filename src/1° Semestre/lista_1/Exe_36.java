package lista_1;

import java.util.Scanner;

public class Exe_36 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double salarioCliente, salarioMinimo, qtdSalariosMinimos;
		
		System.out.println("Informe quanto vale um salário mínimo");
		salarioMinimo = s.nextDouble();
		
		System.out.println("Informe quanto vale o salário do cliente");
		salarioCliente = s.nextDouble();
		
		qtdSalariosMinimos = salarioCliente / salarioMinimo;
		
		System.out.println("O salário do cliente vale " + qtdSalariosMinimos + " salários mínimos");
	}
}
/*
	36. Faça um algoritmo que receba o valor do salário mínimo e o valor do salário de um funcionário,
	calcule e mostre a quantidade de salários mínimos que ganha esse funcionário.
*/