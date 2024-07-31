package lista_1;

import java.util.Scanner;

public class Exe_12 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double salario, aumento = 1.15, desconto = 0.08;
		
		System.out.println("Informe quanto é o seu salário");
		salario = s.nextDouble();
		
		System.out.println("Salário Inicial: " + salario);
		
		salario *= aumento;
		
		System.out.println("Salário após Aumento: " + salario);
		
		salario -= (salario *= desconto);
		
		System.out.println("Salário após Desconto: " + salario);
	}
}
/*
	12. Faça um algoritmo para ler o salário de um funcionário e aumentá-Io em 15%. Após o aumento,
	desconte 8% de impostos. Imprima o salário inicial, o salário com o aumento e o salário final.
*/