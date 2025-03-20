package atividades.atividade02a;

import java.util.Scanner;

public class Exe03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para calcular o n-ésimo termo de Fibonacci: ");
        int termo = scanner.nextInt();
        System.out.println("Fibonacci: " + fibonacci(termo));
    }

    public static long fibonacci(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
