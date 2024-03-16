package lista_2;

import java.util.Scanner;

public class Exe_08 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String produto1, produto2, produto3;
		double precoProduto1, precoProduto2, precoProduto3;
		
		System.out.println("Informe o nome do produto 1");
		produto1 = s.next();
		
		System.out.println("Informe o preço do produto 1");
		precoProduto1 = s.nextInt();
		
		System.out.println("Informe o nome do produto 2");
		produto2 = s.next();
		
		System.out.println("Informe o preço do produto 2");
		precoProduto2 = s.nextInt();
		
		System.out.println("Informe o nome do produto 3");
		produto3 = s.next();
		
		System.out.println("Informe o preço do produto 3");
		precoProduto3 = s.nextInt();
		
		if(precoProduto1 < precoProduto2 && precoProduto1 < precoProduto3) {
			System.out.println("Produto mais Barato: " + produto1);
		} else if(precoProduto2 < precoProduto1 && precoProduto2 < precoProduto3) {
			System.out.println("Produto mais Barato: " + produto2);
		}else if(precoProduto3 < precoProduto1 && precoProduto3 < precoProduto2) {
			System.out.println("Produto mais Barato: " + produto3);
		} else {
			System.out.println("Os preços são iguais");
		}
	}
}
/*
	8. Faça um programa que pergunte o preço de três produtos e informe qual produto você deve
	comprar, sabendo que a decisão é sempre pelo mais barato.
*/