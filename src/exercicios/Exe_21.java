package exercicios;

import java.util.Scanner;

public class Exe_21 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double lataP = 0.35, lataM = 0.6, garrafa = 2.0, totalLitros;
		double qtdlataP = 0.35, qtdlataM = 0.6, qtdgarrafa = 2.0;
		
		System.out.println("Informe a quantidade de latas de 350 ml");
		qtdlataP = s.nextDouble();
		System.out.println("Informe a quantidade de latas de 600 ml");
		qtdlataM = s.nextDouble();
		System.out.println("Informe a quantidade de latas de 2 L");
		qtdgarrafa = s.nextDouble();
		
		totalLitros = (lataP * qtdlataP) + (lataM * qtdlataM) + (garrafa * qtdgarrafa);
		
		System.out.println("O total em litros é de: " + totalLitros + " L");
	}
}
