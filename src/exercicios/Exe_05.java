package exercicios;

import java.util.Scanner;

public class Exe_05 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double precoLitro, valorPagamento, litroTanque;
		
		System.out.println("Informe o preço do Litro");
		precoLitro = s.nextDouble();
		
		System.out.println("Informe o valor a pagar");
		valorPagamento = s.nextDouble();
		
		litroTanque = valorPagamento / precoLitro;
		
		System.out.println("Você irá encher " + litroTanque + "L de gasolina no tanque");
	}
}
/*
	5. Um motorista deseja colocar no seu tanque X reais de gasolina. Escreva um algoritmo para ler o
	preço do litro da gasolina e o valor do pagamento, e exibir quantos litros ele conseguiu colocar no
	tanque.
*/