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
