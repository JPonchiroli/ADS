package lista_1;

import java.util.Scanner;

public class Exe_30 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double salario, valorVendas, salarioFinal;
		
		System.out.println("Informe o valor do salário");
		salario = s.nextDouble();
		
		System.out.println("Informe quanto foi fatura com as vendas");
		valorVendas = s.nextDouble();
		
		valorVendas *= 0.4;
		salarioFinal = salario + valorVendas;
		
		System.out.println("\n Comissão: " + valorVendas + "\n Salário Final: " + salarioFinal);
	}
}
/*
	30. Um funcionário recebe um salário fixo mais 4% de comissão sobre as vendas. Faça um
	algoritmo que receba o salário fixo de um funcionário e o valor de suas vendas, calcule e mostre a
	comissão e o salário final do funcionário.
*/