package exercicios;

import java.util.Scanner;

public class Exe_19 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double chipID = 4.00, chipAlimentacao = 3.50;
		double totalGalinhas, totalGasto;
		
		System.out.println("Informr o total de galinhas");
		totalGalinhas = s.nextInt();
		
		totalGasto = (chipID * totalGalinhas) + ((chipAlimentacao * 2) * totalGalinhas);
		
		System.out.println("Gasto Total: " + totalGasto);
		
	}
}
/*
	19. A granja Frangotech possui um controle automatizado de cada frango da sua produção. No pé
	direito do frango há um anel com um chip de identificação; no pé esquerdo são dois anéis para
	indicar o tipo de alimento que ele deve consumir. Sabendo que o anel com chip custa R$4,00 e o
	anel de alimento custa R$3,50, faça um algoritmo para calcular o gasto total da granja para marcar
	todos os seus frangos.
*/