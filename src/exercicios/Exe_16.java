package exercicios;

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
