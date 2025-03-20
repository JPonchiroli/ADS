package atividades.atividade02a;

import java.util.Scanner;

public class Exe01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para impressão iterativa e recursiva: ");
        int n = scanner.nextInt();
        System.out.print("Iterativo: ");
        imprimirIterativo(n);
        System.out.println();
        System.out.print("Recursivo: ");
        imprimirRecursivo(0, n);
    }

    public static void imprimirIterativo(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.print(i + " ");
        }
    }

    public static void imprimirRecursivo(int atual, int n) {
        if (atual > n) return;
        System.out.print(atual + " ");
        imprimirRecursivo(atual + 1, n);
    }
}
