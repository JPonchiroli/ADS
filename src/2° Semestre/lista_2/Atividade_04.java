package Aula_02;

import java.util.Scanner;

public class Atividade_04 
{
	public static void main(String[] args) 
	{
		int Numero;
		int Auxiliar;
		int Fatorial = 0;
		
		Scanner Kbd = new Scanner (System.in);
		
		do
		{
			System.out.printf("Digite um número inteiro qualquer entre 2 e 5: ");
			Numero = Kbd.nextInt();
		} while ((Numero < 2) || (Numero > 5));
		
		Fatorial = Numero;
		Auxiliar = Numero - 1;
		
		while (Auxiliar > 1)
			Fatorial *= Auxiliar--; 

		System.out.println("O resultado de " + Numero + "! é: " + Fatorial + " (usando WHILE)");
		
		Kbd.close();
	}
}
