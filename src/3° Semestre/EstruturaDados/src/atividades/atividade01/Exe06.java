package atividades.atividade01;

import java.util.Scanner;

public class Exe06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        System.out.println("O número é " + (numero % 2 == 0 ? "Par" : "Ímpar"));
    }
}
