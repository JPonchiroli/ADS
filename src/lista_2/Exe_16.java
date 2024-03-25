package lista_2;

import java.util.Scanner;

public class Exe_16 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double a, b, c, delta;
		
		System.out.println("Informe o valor de a");
		a = s.nextDouble();
		
		System.out.println("Informe o valor de b");
		b = s.nextDouble();
		
		System.out.println("Informe o valor de c");
		c = s.nextDouble();
		
		delta = (b * b) - (4 * (a * c));
		
		System.out.println("Delta" + delta);
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