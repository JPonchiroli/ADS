package lista_1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe_22 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double qtdMoeda1C, qtdMoeda5C, qtdMoeda10C, qtdMoeda25C, qtdMoeda50C, qtdMoeda1R;  
		double valorMoeda1C = 0.01, valorMoeda5C = 0.05, valorMoeda10C = 0.1, valorMoeda25C = 0.25, valorMoeda50C = 0.5, valorMoeda1R = 1.0;
		double totalReais, total1C, total5C, total10C, total25C, total50C, total1R;
		DecimalFormat df = new DecimalFormat("#.##");
		
		System.out.println("Infome a Quantidade de Moedas de 1 Centavo no Cofre");
		qtdMoeda1C = s.nextDouble();
		
		System.out.println("Infome a Quantidade de Moedas de 5 Centavo no Cofre");
		qtdMoeda5C = s.nextDouble();
	
		System.out.println("Infome a Quantidade de Moedas de 10 Centavo no Cofre");
		qtdMoeda10C = s.nextDouble();
		
		System.out.println("Infome a Quantidade de Moedas de 25 Centavo no Cofre");
		qtdMoeda25C = s.nextDouble();
		
		System.out.println("Infome a Quantidade de Moedas de 50 Centavo no Cofre");
		qtdMoeda50C = s.nextDouble();
		
		System.out.println("Infome a Quantidade de Moedas de 1 Centavo no Cofre");
		qtdMoeda1R = s.nextDouble(); 
		
		total1C = (qtdMoeda1C * valorMoeda1C);
		total5C = (qtdMoeda5C * valorMoeda5C);
		total10C = (qtdMoeda10C * valorMoeda10C);
		total25C = (qtdMoeda25C * valorMoeda25C);
		total50C = (qtdMoeda50C * valorMoeda50C);
		total1R = (qtdMoeda1R * valorMoeda1R);
		
		totalReais = (total1C) + (total5C) + (total10C) + (total25C) + (total50C) + (total1R);
		
		String totalReaisFormatado = df.format(totalReais);
		
		System.out.println("Valor total no Cofre: " + totalReaisFormatado);
	}
}
/*
	22. Pedrinho tem um cofrinho com muitas moedas, e deseja saber quantos reais conseguiu
	poupar. Faça um algoritmo para ler a quantidade de cada tipo de moeda, e imprimir o valor total
	economizado, em reais. Considere que existam moedas de 1, 5, 10, 25 e 50 centavos, e ainda
	moedas de 1 real. Não havendo moeda de um tipo, a quantidade respectiva é zero.
*/







