package Aula_02;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class Atividade_12 
{
	public static void main(String[] args) 
	{
		final int QtdeNumeros = 20;
		
		int[] Numeros = new int[QtdeNumeros];
		int Auxiliar;
		int Soma;
		int i;
		
		Scanner Kbd = new Scanner (System.in);
		
		i = 0;
		Soma = 0;
		while (i < QtdeNumeros)
		{
			do
			{
				System.out.printf("Digite o " + (i + 1) + "º número: ");
				Numeros[i] = Kbd.nextInt();
			} while (Numeros[i] <= 0);

			Soma += Numeros[i];
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

		System.out.println("O menor número digitado é: " + Numeros[0]);
		System.out.println("O maior número digitado é: " + Numeros[QtdeNumeros - 1]);
		System.out.println("A média dos números digitados é: " + FormataDouble(Soma / QtdeNumeros));
		
		Kbd.close();
	}

	public static String FormataDouble(double Numero)
	{
		DecimalFormat Formato = new DecimalFormat("###,###.00");
		DecimalFormatSymbols Simbolos = new DecimalFormatSymbols();

		Simbolos.setDecimalSeparator(',');
		Simbolos.setGroupingSeparator('.');
		
		Formato.setDecimalFormatSymbols(Simbolos);
		
		return Formato.format(Numero);
	}
}
