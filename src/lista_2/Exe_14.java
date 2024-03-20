package lista_2;

import java.util.Scanner;

public class Exe_14 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double nota1, nota2, media;
		String conceito, status;
		
		System.out.println("Informe a nota 1");
		nota1 = s.nextDouble();
		
		System.out.println("Informe a nota 2");
		nota2 = s.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		if(media <= 4) {
			conceito = "E";
			status = "Reprovado";
			System.out.println("\n Nota 1: " + nota1 + "\n Nota 2: " + nota2 + "\n Média: " + media + "\n Conceito: " + conceito + "\n Status: " + status);
		} else if(media <= 6) {
			conceito = "D";
			status = "Reprovado";
			System.out.println("\n Nota 1: " + nota1 + "\n Nota 2: " + nota2 + "\n Média: " + media + "\n Conceito: " + conceito + "\n Status: " + status);
		} else if(media <= 7.5) {
			conceito = "C";
			status = "APROVADO";
			System.out.println("\n Nota 1: " + nota1 + "\n Nota 2: " + nota2 + "\n Média: " + media + "\n Conceito: " + conceito + "\n Status: " + status);
		} else if(media <= 9) {
			conceito = "B";
			status = "APROVADO";
			System.out.println("\n Nota 1: " + nota1 + "\n Nota 2: " + nota2 + "\n Média: " + media + "\n Conceito: " + conceito + "\n Status: " + status);
		} else if(media <= 10) {
			conceito = "A";
			status = "APROVADO";
			System.out.println("\n Nota 1: " + nota1 + "\n Nota 2: " + nota2 + "\n Média: " + media + "\n Conceito: " + conceito + "\n Status: " + status);
		}

	}
}
/*
	14. Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo
	de um semestre, e calcule a sua média. A atribuição de conceitos obedece à tabela abaixo:
	Média de Aproveitamento Conceito
	° Entre 9.0 e 10.0 	A
	° Entre 7.5 e 9.0   B
	° Entre 6.0 e 7.5   C
	° Entre 4.0 e 6.0   D
	° Entre 4.0 e zero  E
	Atenção: O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e a
	mensagem “APROVADO” se o conceito for A, B ou C ou “REPROVADO” se o conceito for D ou E.
*/