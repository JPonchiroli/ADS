package lista_1;

import java.util.Scanner;

public class Exe_28 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double nota1, nota2, peso1 = 2, peso2 = 3, mediaPond;
		
		System.out.println("Informe a nota 1");
		nota1 = s.nextDouble();
		
		System.out.println("Informe a nota 2");
		nota2 = s.nextDouble();
		
		mediaPond = ((nota1 * peso1) + (nota2 * peso2)) / peso1 + peso2;
		
		System.out.println("Média Ponderada: " + mediaPond);
	}
}
/*
	28. Faça um algoritmo que receba duas notas, calcule e mostre a média ponderada dessas notas,
	considerando peso 2 para a primeira nota e peso 3 para a segunda nota.
*/