package exercicios;

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
