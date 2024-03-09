package exercicios;

import java.util.Scanner;

public class Exe_20 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int qtdCamisas, qtdNovelos = 2;
		
		System.out.println("Informe a quantidade de Camisas");
		qtdCamisas = s.nextInt();
		
		qtdNovelos *= 5;
		
		System.out.println("A quantidade de Novelos necessária para produzir " + qtdCamisas + " camisasa é de: " + qtdNovelos);
	}
}
