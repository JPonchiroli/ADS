package exercicios;

import java.util.Scanner;

public class Exe_13 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int valor = 0;
	
		while(valor < 99 && valor > 999) {
			System.out.println("Informe um número");
			valor = s.nextInt();
			
			if(valor < 99) {
				System.out.println("Insira um Número maior que 100");
			} else if(valor > 999) {
				System.out.println("Insira um Número menor que 1000");
			}
		}
		
		String valorConvertido = Integer.toString(valor);
		char centena = valorConvertido.charAt(0);
		char dezena = valorConvertido.charAt(1);
		char unidade = valorConvertido.charAt(2);
		
		System.out.println("CENTENA: " + centena + 00);
		System.out.println("DEZENA: " + dezena + 0);
		System.out.println("UNIDADE: " + unidade);
	}
}
/*
	13. Ler um número inteiro (assuma até três dígitos) e imprimir a saída da seguinte forma:
	CENTENA = x
	DEZENA = x
	UNIDADE = x
*/