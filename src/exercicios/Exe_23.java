package exercicios;

import java.util.Scanner;

public class Exe_23 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double compSombraPessoa, compSombraPredio, alturaPessoa, alturaPredio;
		
		System.out.println("Informe o comprimento da sua sombra(cm)");
		compSombraPessoa = s.nextDouble();
		
		System.out.println("Informe o comprimento da sombra do prédio(cm)");
		compSombraPredio = s.nextDouble();
		
		System.out.println("Informe a sua altura(cm)");
		alturaPessoa = s.nextDouble();
		
		
		alturaPredio = (compSombraPredio * alturaPessoa) / compSombraPessoa;
		
		System.out.println("A altura do prédio é " + alturaPredio + " cm");
		
	}
}
/*
	23. Num dia de sol, você deseja medir a altura de um prédio, porém, a trena não é suficientemente
	longa. Assumindo que seja possível medir sua sombra e a do prédio no chão, e que você lembre
	da sua altura, faça um algoritmo para ler os dados necessários e calcular a altura do prédio.
*/