package lista_1;

import java.util.Scanner;

public class Exe_06 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double precoKilo = 12.0, precoTotal, pesoPrato;
		
		System.out.println("Informe o peso do seu Prato(KG)");
		pesoPrato = s.nextDouble();
		
		precoTotal = precoKilo * pesoPrato;
		
		System.out.println("O preço do seu almoço será R$" + precoTotal);
	}
}
/*
	6. O restaurante a quilo Bem-Bão cobra R$12,00 por cada quilo de refeição. Escreva um algoritmo
	que leia o peso do prato montado pelo cliente (em quilos) e imprima o valor a pagar. Assuma que a
	balança já desconte o peso do prato.
*/