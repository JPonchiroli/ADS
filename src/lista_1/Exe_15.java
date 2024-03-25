package lista_1;

import java.util.Scanner;

public class Exe_15 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
        System.out.println("Digite o valor total da conta:");
        double total = s.nextDouble();

        int valorCarlos = (int) total / 3;
        int valorAndre = (int) total / 3;
        double valorFelipe = total - valorCarlos - valorAndre;

        System.out.println("Carlos deve pagar: R$" + valorCarlos + ",00");
        System.out.println("André deve pagar: R$" + valorAndre + ",00");
        System.out.println("Felipe deve pagar: R$" + String.format("%.2f", valorFelipe));
	}
}
/*
	15. Três amigos, Carlos, André e Felipe. decidiram rachar igualmente a conta de um bar. Faça um
	algoritmo para ler o valor total da conta e imprimir quanto cada um deve pagar, mas faça com que
	Carlos e André não paguem centavos. Ex: uma conta de R$101,53 resulta em R$33,00 para
	Carlos, R$33,00 para André e R$35,53 para Felipe.
*/