package lista_1;

import java.util.Scanner;

public class Exe_40 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double catetoAd, catetoOp, hipot;
		
		System.out.println("Informe o valor do Cateto Oposto");
		catetoOp = s.nextDouble();
		
		System.out.println("Informe o valor do Cateto Adjacente");
		catetoAd = s.nextDouble();
		
		hipot = (catetoOp * catetoOp) + (catetoAd * catetoAd);
		hipot = Math.sqrt(hipot);
		
		System.out.println("A hipotenusa vale: " + hipot);
	}
}
/*
	40. Faça um algoritmo que receba o valor dos catetos de um triângulo, calcule e mostre o valor da
	hipotenusa.
*/