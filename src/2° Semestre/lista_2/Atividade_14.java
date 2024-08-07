package Aula_02;

import java.util.Scanner;

public class Atividade_14 
{
	public static void main(String[] args) 
	{
		int Quantidade;
		int Penultimo;
		int Ultimo;
		int Elemento;
		String Sequencia;
		
		Scanner Kbd = new Scanner (System.in);
		
		do
		{
			System.out.printf("Mostrar quantos elementos da série de Fibonacci: ");
			Quantidade = Kbd.nextInt();
		} while (Quantidade < 5);

		Sequencia = "";
		Penultimo = 0;
		Ultimo    = 0;
		for (int i = 0; i < Quantidade; i++)
		{
			Elemento  = Ultimo + Penultimo;
			if (Elemento == 0)
				Elemento++;
			
			Penultimo = Ultimo;
			Ultimo    = Elemento;
			
			if (!Sequencia.isEmpty())
				Sequencia += ", ";

			Sequencia += Elemento; 
		}

		System.out.println("Os primeiros " + Quantidade + 
				           " números da série de Fibonacci são: ");
		System.out.println(Sequencia);
		
		Kbd.close();
	}
}
