package lista_2;

import java.util.Scanner;

public class Exe_04 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String letra;
		
		System.out.println("Informe uma Letra");
		letra = s.next();
		
		letra = letra.toUpperCase();
		
		if(letra.equals("A") || letra.equals("E") || letra.equals("I")  || letra.equals("O")  || letra.equals("U")) {
			System.out.println("Vogal");
		} else {
			System.out.println("Consoante");
		}
	}
}
/*
	4. Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
*/