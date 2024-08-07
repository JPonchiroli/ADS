package Aula_02;

import java.util.Scanner;

public class Atividade_06 
{
	public static void main(String[] args) 
	{
		final int QtdeNumeros = 5;
		
		int[] Numeros = new int[QtdeNumeros];
		int i;
		int Auxiliar;
		
		Scanner Kbd = new Scanner (System.in);

		i = 0;
		while (i < QtdeNumeros)
		{
			System.out.printf("Digite o " + (i + 1) + "º numero.: ");
			Numeros[i] = Kbd.nextInt();
			
			i++;
		}

		for(var j = 0; j < QtdeNumeros; j++)
			for(int k = 0; k < (QtdeNumeros - 1); k++)
				if(Numeros[k] > Numeros[k + 1])
				{
					Auxiliar     = Numeros[k];
					Numeros[k]   = Numeros[k+1];
					Numeros[k+1] = Auxiliar;
				}
		
		System.out.printf("O menor número inserido é: " + Numeros[0]);
		
		Kbd.close();
	}
}
