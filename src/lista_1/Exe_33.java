package lista_1;

import java.util.Scanner;

public class Exe_33 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double baseMaior, baseMenor, altura, areaTrapezio;
		
		System.out.println("Informe a base maior do trapézio");
		baseMaior = s.nextDouble();
		
		System.out.println("Informe a base menor do trapézio");
		baseMenor = s.nextDouble();
		
		System.out.println("Informe a altura do trapézio");
		altura = s.nextDouble();
		
		areaTrapezio = ((baseMaior + baseMenor) * altura) / 2;
		
		System.out.println("Área do Trapézio: " + areaTrapezio);
	}
}
/*
	33. Faça um algoritmo que calcule e mostre a área de um trapézio. Sabe-se que: A = (base maior +
	base menor)* altura)/2 ;
*/