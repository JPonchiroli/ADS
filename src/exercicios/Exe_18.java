package exercicios;

import java.util.Scanner;

public class Exe_18 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double valorHora = 10, valorHoraExtra = 15, qtdHoras, qtdHorasExtras;
		double salarioBruto, salarioLiquido;
		
		
		System.out.println("Informe a quantidade de horas trabalhadas");
		qtdHoras = s.nextDouble();
		
		System.out.println("Informe a quantidade de horas extras trabalhadas");
		qtdHorasExtras = s.nextDouble();
		
		salarioBruto = (qtdHoras * 10) + (qtdHorasExtras * 15);
		salarioLiquido = salarioBruto - (salarioBruto * 0.1);
		
		System.out.println("Salário Bruto: " + salarioBruto);
		System.out.println("Salário Líquido: " + salarioLiquido);
	}
}
/*
	18. A empresa Hipotheticus paga R$10,00 por hora normal trabalhada, e R$15,00 por hora extra.
	Faça um algoritmo para calcular e imprimir o salário bruto e o salário líquido de um determinado
	funcionário. Considere que o salário líquido é igual ao salário bruto descontando-se 10% de
	impostos.
*/