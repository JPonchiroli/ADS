package exercicios;

import java.util.Scanner;

public class Exe_02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int numCavalos, numFerraduras;
		
		System.out.println("Informe a quantidade de cavalos da fazenda");
		numCavalos = s.nextInt();
		
		numFerraduras = numCavalos * 4;
		
		System.out.println("A quantidade de ferraduras necessárias são: " + numFerraduras);
	}
}
