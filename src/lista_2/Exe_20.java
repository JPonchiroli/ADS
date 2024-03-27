package lista_2;

import java.util.Scanner;

public class Exe_20 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
			
		double nota1, nota2, nota3, media;
		
		System.out.println("Informe a nota 1");
		nota1 = s.nextDouble();
		
		System.out.println("Informe a nota 2");
		nota2 = s.nextDouble();
		
		System.out.println("Informe a nota 3");
		nota3 = s.nextDouble();
		
		media = (nota1 + nota2 + nota3) / 3;
		
		if(media == 10) {
			System.out.println("\n Aprovado com Distinção \n Média Final: " + media);
		} else if(media >= 7) {
			System.out.println("\n Aprovado \n Média Final: " + media);
		} else {
			System.out.println("\n Reprovado \n Média Final: " + media);
		}
	}
}
/*
	20. Faça um Programa para leitura de três notas parciais de um aluno. O programa deve calcular a
	média alcançada por aluno e presentar:
	° A mensagem "Aprovado", se a média for maior ou igual a 7, com a respectiva média
	alcançada;
	° A mensagem "Reprovado", se a média for menor do que 7, com a respectiva média
	alcançada;
	° A mensagem "Aprovado com Distinção", se a média for igual a 10.
*/