package Aula_02;

public class Atividade_01 
{
	public static void main(String[] args) 
	{
		int i = 0;
		int SomaInteiros = 0;
		
		while (++i <= 50)
			SomaInteiros += i;
		
		System.out.println("A soma dos primeiros 50 números inteiros é: " + SomaInteiros + " (usando WHILE)");
	}
}
