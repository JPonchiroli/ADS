package exercicios;

import java.util.Scanner;

public class Exe_11 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int diasSemAcidentes, qtdAno, qtdMes;
		
		System.out.println("Informe quantos dias não ocorreram acidentes");
		diasSemAcidentes = s.nextInt();
		
		qtdAno = diasSemAcidentes / 365;
		qtdMes = diasSemAcidentes / 30;
		
		System.out.println("Dias sem Acidentes em Anos: " + qtdAno);
		System.out.println("Dias sem Acidentes em Meses: " + qtdMes);
		System.out.println("Dias sem Acidentes em Dias: " + diasSemAcidentes);
		
	}
}
/*
	11. Uma fábrica controla o tempo de trabalho sem acidentes pela quantidade de dias. Faça um
	algoritmo para converter este tempo em anos, meses e dias. Assuma que cada mês possui sempre
	30 dias.
*/