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
