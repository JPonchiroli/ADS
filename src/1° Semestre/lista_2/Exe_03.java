package lista_2;

import java.util.Scanner;

public class Exe_03 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String sexo;
		
		System.out.println("Escolha entre M ou F");
		sexo = s.next();

		if(sexo.equals("M")) {
			System.out.println("Masculino");
		} else if(sexo.equals("F")) {
			System.out.println("Feminino");
		} else {
			System.out.println("Sexo Inválido");
		}
	}
}
/*
	3. Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: 
	F- Feminino, M - Masculino, Sexo Inválido.
*/