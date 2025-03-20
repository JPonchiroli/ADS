package atividades.atividade01;

import java.util.Scanner;

public class Exe07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numVerificar = scanner.nextInt();

        if (numVerificar > 0) {
            System.out.println("Positivo");
        } else if (numVerificar < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Zero");
        }
    }
}
