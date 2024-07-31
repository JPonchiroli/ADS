package lista_2;

import java.util.Scanner;

public class Exe_12 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double qtdHoras, valorHoras, percIR, valorIR, percINSS = 0.10, valorINSS, percFGTS = 0.11, valorFGTS, totalDescontos, salarioLiquido, salarioBruto;
		
		System.out.println("Informe a quantidade de horas trabalhadas");
		qtdHoras = s.nextDouble();
		
		System.out.println("Informe o valor das horas");
		valorHoras = s.nextDouble();
		
		salarioBruto = qtdHoras * valorHoras;
		
		if(salarioBruto <= 900) {
			percIR = 0;
			valorIR = salarioBruto * percIR;
			valorINSS = salarioBruto * percINSS;
			valorFGTS = salarioBruto * percFGTS;
			totalDescontos = valorIR + valorINSS;
			salarioLiquido = salarioBruto - totalDescontos;
			System.out.println("\n Salário Bruto: (" + qtdHoras + " * " + valorHoras + ") : R$" + salarioBruto + 
					   		   "\n (-) IR (" + (percIR * 100) + "%) : 		R$" + valorIR + 
					   		   "\n (-) INSS (" + (percINSS * 100) + "%) : 		R$" + valorINSS + 
					   		   "\n FGTS (" + (percFGTS * 100) + "%) : 		R$" + valorFGTS +
					   		   "\n Total de Descontos: 		R$" + totalDescontos + 
					   		   "\n Salário Líquido: 		R$" + salarioLiquido);		
		} else if(salarioBruto <= 1500) {
			percIR = 0.05;
			valorIR = salarioBruto * percIR;
			valorINSS = salarioBruto * percINSS;
			valorFGTS = salarioBruto * percFGTS;
			totalDescontos = valorIR + valorINSS;
			salarioLiquido = salarioBruto - totalDescontos;
			System.out.println("\n Salário Bruto: (" + qtdHoras + " * " + valorHoras + ") : R$" + salarioBruto + 
							   "\n (-) IR (" + (percIR * 100) + "%) : 		R$" + valorIR + 
							   "\n (-) INSS (" + (percINSS * 100) + "%) : 		R$" + valorINSS + 
							   "\n FGTS (" + (percFGTS * 100) + "%) : 		R$" + valorFGTS +
							   "\n Total de Descontos: 		R$" + totalDescontos + 
							   "\n Salário Líquido: 		R$" + salarioLiquido);	
		} else if(salarioBruto <= 2500) {
			percIR = 0.10;
			valorIR = salarioBruto * percIR;
			valorINSS = salarioBruto * percINSS;
			valorFGTS = salarioBruto * percFGTS;
			totalDescontos = valorIR + valorINSS;
			salarioLiquido = salarioBruto - totalDescontos;
			System.out.println("\n Salário Bruto: (" + qtdHoras + " * " + valorHoras + ") : R$" + salarioBruto + 
					   		   "\n (-) IR (" + (percIR * 100) + "%) : 		R$" + valorIR + 
					   		   "\n (-) INSS (" + (percINSS * 100) + "%) : 		R$" + valorINSS + 
					   		   "\n FGTS (" + (percFGTS * 100) + "%) : 		R$" + valorFGTS +
					   		   "\n Total de Descontos: 		R$" + totalDescontos + 
					   		   "\n Salário Líquido: 		R$" + salarioLiquido);	
		} else if(salarioBruto > 2500) {
			percIR = 0.20;
			valorIR = salarioBruto * percIR;
			valorINSS = salarioBruto * percINSS;
			valorFGTS = salarioBruto * percFGTS;
			totalDescontos = valorIR + valorINSS;
			salarioLiquido = salarioBruto - totalDescontos;
			System.out.println("\n Salário Bruto: (" + qtdHoras + " * " + valorHoras + ") : R$" + salarioBruto + 
					   		   "\n (-) IR (" + (percIR * 100) + "%) : 		R$" + valorIR + 
					   		   "\n (-) INSS (" + (percINSS * 100) + "%) : 		R$" + valorINSS + 
					   		   "\n FGTS (" + (percFGTS * 100) + "%) : 		R$" + valorFGTS +
					   		   "\n Total de Descontos: 		R$" + totalDescontos + 
					   		   "\n Salário Líquido: 		R$" + salarioLiquido);	
		}
		
	}
}
/*
	12. Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do
	Imposto de Renda, que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato
	e que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é a empresa que
	deposita). O Salário Líquido corresponde ao Salário Bruto menos os descontos. O programa
	deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
	° Desconto do IR:
	° Salário Bruto até 900 (inclusive) - isento
	° Salário Bruto até 1500 (inclusive) - desconto de 5%
	° Salário Bruto até 2500 (inclusive) - desconto de 10%
	° Salário Bruto acima de 2500 - desconto de 20% Imprima na tela as informações,
	  dispostas conforme o exemplo abaixo. No exemplo o valor da hora é 5 e a quantidade de
	  hora é 220.
	  Exemplo:
	° Salário Bruto: (5 * 220) : R$ 1100,00
	° (-) IR (5%) : R$ 55,00
	° (-) INSS ( 10%) : R$ 110,00
	° FGTS (11%) : R$ 121,00
	° Total de descontos : R$ 165,00
	Salário Liquido : R$ 935,00
*/
