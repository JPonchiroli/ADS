package Aula_02;

public class Atividade_03
{
	public static void main(String[] args) 
	{
		int i = 0;
		int Somados = 0;
		int SomaImpares = 0;
		
		while (Somados <= 50)
			if ((++i % 2) != 0)
			{
				SomaImpares += i;
				Somados++;
			}
		
		System.out.println("A soma dos primeiros 50 números inteiros impares é: " + SomaImpares + " (usando WHILE)");
	}
}
