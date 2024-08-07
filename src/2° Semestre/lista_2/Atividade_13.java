package Aula_02;

import java.util.Scanner;

public class Atividade_13 
{
	public static void main(String[] args) 
	{
		String Nome;
		int Numero;
		
		Scanner Kbd = new Scanner (System.in);

		System.out.printf("Digite o seu nome: ");
		Nome = Kbd.next();
		
		do
		{
			System.out.printf("Digite o número de repetições: ");
			Numero = Kbd.nextInt();
		} while ((Numero < 2) && (Numero > 10));

		for (int i = 0; i < Numero; i++)
			System.out.println(Nome);
		
		Kbd.close();
	}
}
