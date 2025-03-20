package atividades.atividade01;

import java.util.Scanner;

public class Exe09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o custo de fábrica do carro: ");
        double custoFabrica = scanner.nextDouble();

        double custoFinal = custoFabrica + (custoFabrica * 0.28) + (custoFabrica * 0.45);
        System.out.println("Custo final ao consumidor: " + custoFinal);
    }
}
