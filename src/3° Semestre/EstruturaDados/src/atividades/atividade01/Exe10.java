package atividades.atividade01;

import java.util.Scanner;

public class Exe10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de carros vendidos: ");
        int carrosVendidos = scanner.nextInt();

        System.out.print("Digite o valor total das vendas: ");
        double totalVendas = scanner.nextDouble();

        System.out.print("Digite o salário fixo: ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Digite o valor por carro vendido: ");
        double valorPorCarro = scanner.nextDouble();

        double salarioFinal = salarioFixo + (carrosVendidos * valorPorCarro) + (totalVendas * 0.05);
        System.out.println("Salário final do vendedor: " + salarioFinal);
    }
}
