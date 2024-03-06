package exercicios;

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
