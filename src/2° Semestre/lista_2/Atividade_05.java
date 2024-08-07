package Aula_02;

import java.util.Scanner;

public class Atividade_05 
{
	public static void main(String[] args)  
	{
		int Opcao = 0;

		Scanner Kbd = new Scanner (System.in);
		
		while (Opcao != 4)
		{
			System.out.println("Menu de opções");
			System.out.println("---- -- ------\n");
			System.out.println("1 - Sacar");
			System.out.println("2 - Depositar");
			System.out.println("3 - Verificar saldo");
			System.out.println("4 - Sair\n");
			
			System.out.printf("Escolha uma das opções acima: ");
			Opcao = Kbd.nextInt();
			
			switch (Opcao)
			{
				case 01 : System.out.println("Você escolheu a opção sacar.");
                          break;
				case 02 : System.out.println("Você escolheu a opção depositar.");
                          break;
				case 03 : System.out.println("Você escolheu a opção verificar saldo.");
                          break;
				case 04 : break;
				default :
					     System.out.println("Você escolheu uma opção inválida. Tente novamente!!");
			}
		}
		
		Kbd.close();
	}
}
