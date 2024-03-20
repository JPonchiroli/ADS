package lista_2;

import java.util.Scanner;

public class Exe_13 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int diaSemana;
		
		System.out.println("Selecione o dia da Semana \n 1- Domingo \n 2- Segunda \n 3- Terça \n 4- Quarta \n 5- Quinta \n 6- Sexta \n 7- Sábado");
		diaSemana = s.nextInt();
		
		if(diaSemana == 1) {
			System.out.println("Domingo");
		} else if(diaSemana == 2) {
			System.out.println("Segunda");
		} else if(diaSemana == 3) {
			System.out.println("Terça");
		} else if(diaSemana == 4) {
			System.out.println("Quarta");
		} else if(diaSemana == 5) {
			System.out.println("Quinta");
		} else if(diaSemana == 6) {
			System.out.println("Sexta");
		} else if(diaSemana == 7) {
			System.out.println("Sábado");
		} else {
			System.out.println("Valor Inválido");
		}
	}
}
/*
	13. Faça um Programa que leia um número e exiba o dia correspondente da semana. (1-Domingo, 2-
	Segunda, etc.), se digitar outro valor deve aparecer valor inválido.
*/
