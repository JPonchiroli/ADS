package lista_2;

import java.util.Scanner;

public class Exe_15 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int lado1, lado2, lado3, triangulo;
		
		System.out.println("Informe o valor do lado do triângulo 1");
		lado1 = s.nextInt();
		
		System.out.println("Informe o valor do lado do triângulo 2");
		lado2 = s.nextInt();
		
		System.out.println("Informe o valor do lado do triângulo 3");
		lado3 = s.nextInt();
		
		if(lado1 == lado2 && lado1 == lado3 && lado2 == lado1 && lado2 == lado3 && lado3 == lado1 && lado3 == lado1) {
			System.out.println("Triângulo Equilátero");
		} else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado1 || lado2 == lado3 || lado3 == lado1 || lado3 == lado1) {
			System.out.println("Triângulo Isósceles");
		} else if(lado1 != lado2 && lado1 != lado3 && lado2 != lado1 && lado2 != lado3 && lado3 != lado1 && lado3 != lado1) {
			System.out.println("Triângulo Escaleno");
		}
	}
}
/*
	15. Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores
	podem ser um triângulo. Indique, caso os lados formem um triângulo, se o mesmo é: equilátero,
	isósceles ou escaleno.
	Dicas:
	° Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o
	  terceiro;
	° Triângulo Equilátero: três lados iguais;
	° Triângulo Isósceles: quaisquer dois lados iguais;
	° Triângulo Escaleno: três lados diferentes;
*/