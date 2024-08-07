package Aula_02;

import java.util.Scanner;

public class Atividade_10 
{
	public static void main(String[] args) 
	{
		int Numero;
		int Fatorial = 0;
		
		Scanner Kbd = new Scanner (System.in);
		
		do
		{
			System.out.printf("Digite um número inteiro qualquer entre 2 e 5: ");
			Numero = Kbd.nextInt();
		} while ((Numero < 2) || (Numero > 5));
		
		Fatorial = Numero;
		for (int i = Numero - 1; i > 1; i--) 
			Fatorial *= i; 

		System.out.println("O resultado de " + Numero + "! é: " + Fatorial + " (usando FOR)");
		
		Kbd.close();
	}
}
