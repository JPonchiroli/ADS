package lista_2;

import java.util.Scanner;

public class Exe_09 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num1, num2, num3;
		int maiorNum = 0, menorNum = 0, numInt = 0;
		
		System.out.println("Informe o número 1");
		num1 = s.nextInt();
		
		System.out.println("Informe o número 2");
		num2 = s.nextInt();
		
		System.out.println("Informe o número 3");
		num3 = s.nextInt();
		
		
		if(num1 > num2 && num1 > num3 && num2 > num3) {
			maiorNum = num1;
			menorNum = num3;
			numInt = num2;
			System.out.println("Ordem Decrecente: " + maiorNum + " " + numInt + " " + menorNum);
		} else if(num1 > num2 && num1 > num3 && num2 < num3) {
			maiorNum = num1;
			menorNum = num2;
			numInt = num3;
			System.out.println("Ordem Decrecente: " + maiorNum + " " + numInt + " " + menorNum);
		} else if(num2 > num1 && num2 > num3 && num3 > num1) {
			maiorNum = num2;
			menorNum = num1;
			numInt = num3;
			System.out.println("Ordem Decrecente: " + maiorNum + " " + numInt + " " + menorNum);
		} else if(num2 > num1 && num2 > num3 && num3 < num1) {
			maiorNum = num2;
			menorNum = num3;
			numInt = num1;
			System.out.println("Ordem Decrecente: " + maiorNum + " " + numInt + " " + menorNum);
		} else if(num3 > num1 && num3 > num2 && num2 > num1) {
			maiorNum = num3;
			menorNum = num1;
			numInt = num2;
			System.out.println("Ordem Decrecente: " + maiorNum + " " + numInt + " " + menorNum);
		} else if(num3 > num1 && num3 > num2 && num2 < num1) {
			maiorNum = num3;
			menorNum = num2;
			numInt = num1;
			System.out.println("Ordem Decrecente: " + maiorNum + " " + numInt + " " + menorNum);
		}
	}
}
/*
	9. Faça um Programa que leia três números e mostre-os em ordem decrescente.
 */
