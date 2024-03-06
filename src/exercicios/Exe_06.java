package exercicios;

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
