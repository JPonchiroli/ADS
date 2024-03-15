package lista_1;

import java.util.Scanner;

public class Exe_03 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double precoPao = 0.12, precoBroa = 1.50, porcPoup = 0.1, valorPoup;
		int totalVendaPao, totalVendaBroa, totalVendas;
		
		System.out.println("Informe quantos pães foram vendidos hoje");
		totalVendaPao = s.nextInt();
		
		System.out.println("Informe quantas broas foram vendidas hoje");
		totalVendaBroa = s.nextInt();
		
		totalVendaPao *= precoPao;
		totalVendaBroa *= precoBroa;
		totalVendas = totalVendaPao + totalVendaBroa;
		valorPoup = totalVendas * porcPoup;
		
		System.out.println("Total Arrecadados com Pães Vendidos: R$" + totalVendaPao);
		System.out.println("Total Arrecadados com Broas Vendidos: R$" + totalVendaBroa);
		System.out.println("Total Arrecadados Geral: R$" + totalVendas);
		System.out.println("Quantidade para Poupança: R$" + valorPoup);
	}
}

/*
	3. A padaria Hotpão vende uma certa quantidade de pães franceses e uma quantidade de broas a
	cada dia. Cada pãozinho custa R$ 0,12 e a broa custa R$ 1,50. Ao final do dia, o dono quer saber
	quanto arrecadou com a venda dos pães e broas (juntos), e quanto deve guardar numa conta de
	poupança (10% do total arrecadado). Você foi contratado para fazer os cálculos para o dono. Com
	base nestes fatos, faça um algoritmo para ler as quantidades de pães e de broas, e depois calcular
	os dados solicitados.
*/