package lista_1;

import java.util.Scanner;

public class Exe_25 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double alturaCilindro, raioCilindro, pi = 3.14, volumeCilindro;
		
		System.out.println("Informe a altura do cilindro");
		alturaCilindro = s.nextDouble();
		
		System.out.println("Informe o raio do cilindro");
		raioCilindro = s.nextDouble();
		
		volumeCilindro = pi * (raioCilindro * raioCilindro);
		volumeCilindro *= alturaCilindro;
		
		System.out.println("Volume do Cilindro: " + volumeCilindro);
	}
}
/*
	25. Calcule o volume de uma caixa d'água cilíndrica.
*/