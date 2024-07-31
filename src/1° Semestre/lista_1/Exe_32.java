package lista_1;

import java.util.Scanner;

public class Exe_32 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double pesoPessoaKG, pesoPessoaG;
		
		System.out.println("Informe o peso da pessoa");
		pesoPessoaKG = s.nextDouble();
		
		pesoPessoaG = pesoPessoaKG * 1000;
		
		System.out.println("Peso Pessoa em Gramas: " + pesoPessoaG);
	}
}
/*
	32. Faça um algoritmo que receba o peso de uma pessoa em quilos, calcule e mostre esse peso
	em gramas.
*/