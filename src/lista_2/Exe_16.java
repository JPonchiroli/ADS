package lista_2;

import java.util.Scanner;

public class Exe_16 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double a, b, c, delta, x1, x2;
		
		System.out.println("Informe o valor de a");
		a = s.nextDouble();
		
		if(a < 0) {
			System.out.println("O valor de A não pode ser negatico");
		} else {
			System.out.println("Informe o valor de b");
			b = s.nextDouble();
			
			System.out.println("Informe o valor de c");
			c = s.nextDouble();
			
			delta = (b * b) - (4 * (a * c));
			
			if(delta < 0) {
				System.out.println("O valor do delta é negativo: " + delta);
			} else if(delta == 0) {
				x1 = ((-1 * b) + (Math.sqrt(delta))) / (2 * a);
				System.out.println("A equação possui apenas uma raiz real: " + x1);
			} else if(delta > 1) {
				x1 = ((-1 * b) + (Math.sqrt(delta))) / (2 * a);			
				x2 = ((-1 * b) - (Math.sqrt(delta))) / (2 * a);
				
				System.out.println("A equação possui duas raizes reais: X1: " + x1 + " X2: " + x2);
			}
		}

	}
}
/*
	16. Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax2 + bx + c. 
	O programa deverá pedir os valores de a, b e c e fazer as consistências, informando ao usuário
	nas seguintes situações:
	° Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau e o
	  programa não deve fazer pedir os demais valores, sendo encerrado;
	° Se o delta calculado for negativo, a equação não possui raizes reais. Informe ao usuário
	  e encerre o programa;
	° Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe-a
	  ao usuário;
	° Se o delta for positivo, a equação possui duas raiz reais; informe-as ao usuário;
*/