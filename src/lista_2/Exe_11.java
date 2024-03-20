package lista_2;

import java.util.Scanner;

public class Exe_11 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double salario, valorAumento, percAumento, salarioFinal;
		
		System.out.println("Informe o seu salário");
		salario = s.nextDouble();
		
		if(salario <= 280) {
			percAumento = 0.2;
			valorAumento = salario * percAumento;
			salarioFinal = salario + valorAumento;
			System.out.println("\n Salário antes do reajuste: R$" + salario + "\n Percentual de Aumento: " + (percAumento * 100) + "% \n Valor do Aumento: R$" + valorAumento + "\n Novo Salário: R$" + salarioFinal);	
		} else if(salario <= 700) {
			percAumento = 0.15;
			valorAumento = salario * percAumento;
			salarioFinal = salario + valorAumento;
			System.out.println("\n Salário antes do reajuste: R$" + salario + "\n Percentual de Aumento: " + (percAumento * 100) + "% \n Valor do Aumento: R$" + valorAumento + "\n Novo Salário: R$" + salarioFinal);	
		} else if(salario <= 1500) {
			percAumento = 0.10;
			valorAumento = salario * percAumento;
			salarioFinal = salario + valorAumento;
			System.out.println("\n Salário antes do reajuste: R$" + salario + "\n Percentual de Aumento: " + (percAumento * 100) + "% \n Valor do Aumento: R$" + valorAumento + "\n Novo Salário: R$" + salarioFinal);	
		} else if(salario > 1500) {
			percAumento = 0.05;
			valorAumento = salario * percAumento;
			salarioFinal = salario + valorAumento;
			System.out.println("\n Salário antes do reajuste: R$" + salario + "\n Percentual de Aumento: " + (percAumento * 100) + "% \n Valor do Aumento: R$" + valorAumento + "\n Novo Salário: R$" + salarioFinal);
		}
	}
}
/*
  11. As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe
	contratam para desenvolver o programa que calculará os reajustes.
	° Faça um programa que recebe o salário de um colaborador e o reajuste segundo o
	  seguinte critério, baseado no salário atual:
	° Salários até R$ 280,00 (incluindo) : aumento de 20%
	° Salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
	° Salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
	° Salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser realizado,
	  informe na tela:
	° o salário antes do reajuste;
	° o percentual de aumento aplicado;
	° o valor do aumento;
	° o novo salário, após o aumento.
*/
