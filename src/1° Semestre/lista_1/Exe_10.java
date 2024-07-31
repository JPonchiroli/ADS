package lista_1;

import java.util.Scanner;

public class Exe_10 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double x1, x2, y1, y2;
		double coordPonto1, coordPonto2;
		double elevadoPonto1 = 0, elevadoPonto2 = 0, raizQuadrada;
		
		System.out.println("Informe o valor do ponto X1");
		x1 = s.nextDouble();
		
		System.out.println("Informe o valor do ponto X2");
		x2 = s.nextDouble();
		
		System.out.println("Informe o valor do ponto Y1");
		y1 = s.nextDouble();
		
		System.out.println("Informe o valor do ponto Y1");
		y2 = s.nextDouble();
		
		coordPonto1 = x2 - x1;
		coordPonto2 = y2 - y1;
		elevadoPonto1 = coordPonto1 * coordPonto1;
		elevadoPonto2 = coordPonto2 * coordPonto2;
		raizQuadrada = Math.sqrt(elevadoPonto1 + elevadoPonto2);
		
		System.out.println("Distância entre os pontos é " + raizQuadrada);
	}
}
/*
	10. Construa um algoritmo para calcular a distância entre dois pontos do plano cartesiano. Cada
	ponto é um par ordenado (x,y).
*/