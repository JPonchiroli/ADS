package lista_2;

import java.util.Scanner;

public class Exe_17 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int ano;
		
		System.out.println("Informe em que ano estamos");
		ano = s.nextInt();
		
		if(ano % 4 == 0) {
			System.out.println("Ano é Bissexto");
		} else {
			System.out.println("Ano não é Bissexto");
		}
	}
}
/*
	17. Faça um Programa que peça um número correspondente a um determinado ano e em seguida
	informe se este ano é ou não bissexto.
*/