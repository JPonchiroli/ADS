package lista_1;

import java.util.Scanner;

public class Exe_34 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double lado, area;
		
		System.out.println("Informe o valor do lado do quadrado");
		lado = s.nextDouble();
		
		area = lado * lado;
		
		System.out.println("Área do Quadrado: " + area);
	}
}
/*
	34. Faça um algoritmo que calcule e mostre a área de um quadrado.
	Sabe-se que: A = lado * lado;
*/