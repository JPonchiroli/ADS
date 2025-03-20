package atividades.atividade02a;

import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para calcular o somatório: ");
        int x = scanner.nextInt();
        System.out.println("Somatório: " + somatorio(x));
    }

    public static int somatorio(int x) {
        if (x == 1) return 1;
        return x + somatorio(x - 1);
    }
}
