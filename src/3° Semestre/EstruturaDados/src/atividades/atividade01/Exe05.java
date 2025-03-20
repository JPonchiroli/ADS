package atividades.atividade01;

import java.util.Scanner;

public class Exe05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu peso (kg): ");
        double peso = scanner.nextDouble();
        System.out.print("Digite sua altura (m): ");
        double alturaIMC = scanner.nextDouble();
        double imc = peso / (alturaIMC * alturaIMC);
        System.out.println("IMC: " + imc);
    }
}
