package Aula_02;

public class Atividade_07 
{
	public static void main(String[] args) 
	{
		int SomaInteiros = 0;
		
		for (int i = 1; i <= 50; i++)
			SomaInteiros += i;
		
		System.out.println("A soma dos primeiros 50 números inteiros é: " + SomaInteiros + " (usando FOR)");
	}
}
