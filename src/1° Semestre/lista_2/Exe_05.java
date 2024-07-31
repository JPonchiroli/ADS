package lista_2;

import java.util.Scanner;

public class Exe_05 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int nota1, nota2, media;
		
		System.out.println("Informe o nota 1");
		nota1 = s.nextInt();
		
		System.out.println("Informe o nota 2");
		nota2 = s.nextInt();
		
		media = (nota1 + nota2) / 2;
		
		if(media >= 10) {
			System.out.println("Aprovado com Distinção");
		} else if(media >= 7) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
	}
}
/*
	5. Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a
	média alcançada por aluno e apresentar:
	° A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
	° A mensagem "Reprovado", se a média for menor do que sete;
	° A mensagem "Aprovado com Distinção", se a média for igual a dez.
*/