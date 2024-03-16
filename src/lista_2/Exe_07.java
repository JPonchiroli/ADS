package lista_2;

import java.util.Scanner;

public class Exe_07 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("Informe o número 1");
		num1 = s.nextInt();
		
		System.out.println("Informe o número 2");
		num2 = s.nextInt();
		
		System.out.println("Informe o número 3");
		num3 = s.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("Maior Número: " + num1);
		} else if(num2 > num1 && num2 > num3) {
			System.out.println("Maior Número: " + num2);
		}else if(num3 > num1 && num3 > num2) {
			System.out.println("Maior Número: " + num3);
		} else {
			System.out.println("Os números são iguais");
		}
		
		if(num1 < num2 && num1 < num3) {
			System.out.println("Menor Número: " + num1);
		} else if(num2 < num1 && num2 < num3) {
			System.out.println("Menor Número: " + num2);
		}else if(num3 < num1 && num3 < num2) {
			System.out.println("Menor Número: " + num3);
		} else {
			System.out.println("Os números são iguais");
		}
	}
}
/*
	7. Faça um Programa que leia três números e mostre o maior e o menor deles.
*/