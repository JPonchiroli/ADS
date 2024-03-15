package lista_1;

import java.util.Scanner;

public class Exe_39 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double salarioCliente = 1200, valorConta1 = 200, valorConta2 = 120;
		
		double valorMulta1 = valorConta1 + (valorConta1 * 0.02);
		double valorMulta2 = valorConta2 + (valorConta2 * 0.02);
		double restoSalario = salarioCliente - (valorMulta1 +  valorMulta2);
		
		System.out.println("João ainda tem R$" + restoSalario);
	}
}
/*
	39. João recebeu seu salário de R$ 1200,00 e precisa pagar duas contas (C1=R$ 200,00 e
	C2=R$120,00) que estão atrasadas. Como as contas estão atrasadas, João terá de pagar multa de
	2% sobre cada conta. Faça um algoritmo que calcule e mostre quanto restará do salário do João
*/