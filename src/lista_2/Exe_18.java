package lista_2;

import java.util.Scanner;

public class Exe_18 {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		
		int dia, mes, ano;
		
		System.out.println("Informe o dia que você nasceu");
		dia = s.nextInt();
		
		System.out.println("Informe o mês que você nasceu");
		mes = s.nextInt();

		System.out.println("Informe o ano que você nasceu");
		ano = s.nextInt();
		
		if(dia <= 0 || dia > 31) {
			System.out.println("Data Inválida");
		} else if(mes <= 0 || mes > 12) {
			System.out.println("Data Inválida");
		} else if(ano < 0 || ano > 9999) {
			System.out.println("Data Inválida");
		} else {
			System.out.println("Data Válida: " + dia + "/" + mes + "/" + ano);
		}
	}
}
/*
	18. Faça um Programa que peça uma data no formato dd/mm/aaaa e determine se a mesma é uma
	data válida.
*/