package lista_1;

import java.util.Scanner;

public class Exe_16 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double pesoQueijo = 0.05, pesoPresunto = 0.05, pesoHamburguer = 0.1, pesoTotal;
		double pesoTotalQueijo, pesoTotalPresunto, pesoTotalHamburguer;
		int qtdSanduiche;
		
		System.out.println("Informe a Quantidade de Sanduíches");
		qtdSanduiche = s.nextInt();
		
		pesoTotalQueijo = pesoQueijo * qtdSanduiche;
		pesoTotalPresunto = pesoPresunto * qtdSanduiche;
		pesoTotalHamburguer = pesoHamburguer * qtdSanduiche;
		
		System.out.println("O peso necessario de Queijo: " + pesoTotalQueijo + " KG");
		System.out.println("O peso necessario de Presunto: " + pesoTotalPresunto + " KG");
		System.out.println("O peso necessario de Hamburguer: " + pesoTotalHamburguer + " KG");
				
	}
}
/*
	16. A lanchonete Gostosura vende apenas um tipo de sanduíche, cujo recheio inclui duas fatias de
	queijo, uma fatia de presunto e uma rodela de hambúrguer. Sabendo que cada fatia de queijo ou
	presunto pesa 50 gramas, e que a rodela de hambúrguer pesa 100 gramas, faça um algoritmo em
	que o dono forneça a quantidade de sanduíches a fazer, e a máquina informe as quantidades (em
	quilos) de queijo, presunto e carne necessários para compra.
*/