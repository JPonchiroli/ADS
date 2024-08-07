package Aula_02;

public class Atividade_08 
{
	public static void main(String[] args) 
	{
		int Somados = 0;
		int SomaPares = 0;
		
		for (int i = 1; Somados <= 50; i++)
			if ((++i % 2) == 0)
			{
				SomaPares += i;
				Somados++;
			}
		
		System.out.println("A soma dos primeiros 50 números inteiros pares é: " + SomaPares + " (usando FOR)");
	}
}
