package Aula_02;

public class Atividade_09 
{
	public static void main(String[] args) 
	{
		int Somados = 0;
		int SomaImpares = 0;
		
		for (int i = 1; Somados <= 50; i++)
			if ((++i % 2) != 0)
			{
				SomaImpares += i;
				Somados++;
			}
		
		System.out.println("A soma dos primeiros 50 números inteiros impares é: " + SomaImpares + " (usando WHILE)");
	}
}
