package lista_1;

import java.util.Scanner;

public class Exe_38 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int anoNasc, anoAtual;
		int idadeAnos, idadeMeses, idadeSemanas, idadeDias;
		
		System.out.println("Informe o ano que você nasceu");
		anoNasc = s.nextInt();
		
		System.out.println("Informe o ano atual");
		anoAtual = s.nextInt();
		
		idadeAnos = anoAtual - anoNasc;
		idadeMeses = (anoAtual - anoNasc) * 12;
		idadeSemanas = (anoAtual - anoNasc) * 48;
		idadeDias = (anoAtual - anoNasc) * 365;
		
		System.out.println("Idade em Anos: " + idadeAnos + " Anos");
		System.out.println("Idade em Meses: " + idadeMeses + " Meses");
		System.out.println("Idade em Semanas: " + idadeSemanas + " Semanas");
		System.out.println("Idade em Dias: " + idadeDias + " Dias");
		
	}
}
/*
	38. Faça um algoritmo que receba o ano de nascimento de uma pessoa e o ano atual, calcule e
	mostre:
	a) a idade dessa pessoa em anos;
	b) a idade dessa pessoa em meses;
	c) a idade dessa pessoa em dias;
	d) a idade dessa pessoa em semanas.
*/