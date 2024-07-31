package lista_1;
import java.util.Scanner;

public class Exe_01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int altura, largura, area;
		
		System.out.println("Informe a altura do retângulo");
		altura = s.nextInt();	
		
		System.out.println("Informe a altura do largura");
		largura = s.nextInt();
		
		area = altura * largura;
		
		System.out.println("A área do seu retângulo é: " + area);
	}
}

/*
 	1. A imobiliária Imóbilis vende apenas terrenos retangulares. Faça um algoritmo para ler as
	dimensões de um terreno e depois exibir a área do terreno. 
*/
