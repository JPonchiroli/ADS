package exercicios;

import java.util.Scanner;

public class Exe_04 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int idadeAno, idadeDias, anoDias = 365;
		
		System.out.println("Quantos anos você tem?");
		idadeAno = s.nextInt();
		
		idadeDias = idadeAno * anoDias;
		
		System.out.println("Você possui " + idadeDias + " dias de vida");
	}
}
