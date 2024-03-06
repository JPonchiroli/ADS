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
