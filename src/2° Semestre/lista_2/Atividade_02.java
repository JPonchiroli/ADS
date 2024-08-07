package Aula_02;

public class Atividade_02
{
	public static void main(String[] args) 
	{
		int i = 0;
		int Somados = 0;
		int SomaPares = 0;
		
		while (Somados <= 50)
			if ((++i % 2) == 0)
			{
				SomaPares += i;
				Somados++;
			}
		
		System.out.println("A soma dos primeiros 50 números inteiros pares é: " + SomaPares + " (usando WHILE)");
	}
}
