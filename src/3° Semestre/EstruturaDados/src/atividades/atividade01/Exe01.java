package atividades.atividade01;

import java.util.Scanner;

public class Exe01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = scanner.nextInt();
        System.out.println("Antecessor: " + (num - 1));

    }
}
