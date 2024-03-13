package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe_08 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double av1, av2, av3, totalAv, media;
		int pesoAv1 = 1, pesoAv2 = 2, pesoAv3 = 3, totalPeso;
		DecimalFormat df = new DecimalFormat("#.##");
		
		System.out.println("Informe a nota da sua Primeira Avalição");
		av1 = s.nextDouble();
		
		System.out.println("Informe a nota da sua Segunda Avalição");
		av2 = s.nextDouble();
		
		System.out.println("Informe a nota da sua Terceira Avalição");
		av3 = s.nextDouble();
		
		totalAv = (av1 * pesoAv1) + (av2 * pesoAv2) + (av3 * pesoAv3);
		totalPeso = pesoAv1 + pesoAv2 + pesoAv3;
		media = totalAv / totalPeso;
		
		String mediaFormatada = df.format(media);
		
		System.out.println("Sua média ponderada é: " + mediaFormatada);
	}
}
/*
	8. Faça um algoritmo para ler três notas de um aluno em uma disciplina e imprimir a sua média
	ponderada (as notas tem pesos respectivos de 1, 2 e 3).
*/