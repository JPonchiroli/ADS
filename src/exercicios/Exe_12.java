package exercicios;

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
