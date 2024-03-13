package exercicios;

import java.util.Scanner;

public class Exe_09 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int valorCamisaP = 10, valorCamisaM = 12, valorCamisaG = 15;
		int qtdCamisaP, qtdCamisaM, qtdCamisaG;
		int totalVendaP, totalVendaM, totalVendaG, totalVenda;
		
		System.out.println("Informe a quantidade de camisas P vendidas");
		qtdCamisaP = s.nextInt();
		
		System.out.println("Informe a quantidade de camisas M vendidas");
		qtdCamisaM = s.nextInt();
		
		System.out.println("Informe a quantidade de camisas G vendidas");
		qtdCamisaG = s.nextInt();
		
		totalVendaP = valorCamisaP * qtdCamisaP;
		totalVendaM = valorCamisaM * qtdCamisaM;
		totalVendaG = valorCamisaG * qtdCamisaG;
		totalVenda = totalVendaP + totalVendaM + totalVendaG;
		
		System.out.println("O valor Arrecadado será de R$" + totalVenda);
	}
}
/*
	9. Uma fábrica de camisetas produz os tamanhos pequeno, médio e grande, cada uma sendo
	vendida respectivamente por 10, 12 e 15 reais. Construa um algoritmo em que o usuário forneça a
	quantidade de camisetas pequenas, médias e grandes referentes a uma venda, e a máquina
	informe quanto será o valor arrecadado.
*/