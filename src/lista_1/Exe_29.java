package lista_1;

import java.util.Scanner;

public class Exe_29 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double precoProduto, qtdDesconto = 0.1, precoFinal;
		
		System.out.println("Informe o preço do produto");
		precoProduto = s.nextDouble();
		
		precoFinal = precoProduto - (precoProduto * qtdDesconto);
		
		System.out.println("Preço do Produto com Desconto: " + precoFinal);
	}
}
/*
	29. Faça um algoritmo que receba o preço de um produto, calcule e mostre o novo preço,
	sabendo-se que este sofreu um desconto de 10%.
*/