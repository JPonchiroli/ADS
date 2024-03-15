package lista_1;

import java.util.Scanner;

public class Exe_35 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double diagMaior, diagMenor, area;
		
		System.out.println("Informe a diagonal menor");
		diagMenor = s.nextDouble();
		
		System.out.println("Informe a diagonal maior");
		diagMaior = s.nextDouble();
		
		area = (diagMaior * diagMenor) / 2;
		
		System.out.println("A área do losango vale: " + area);
	}
}
/*
	35. Faça um algoritmo que calcule e mostre a área de um losango. Sabe-se que: A =
	(diagonal_maior * diagonal_menor)/2;
*/