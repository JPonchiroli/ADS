package atividades.atividade01;

import java.util.Scanner;

public class Exe08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário atual: ");
        double salario = scanner.nextDouble();

        System.out.print("Digite o percentual de reajuste: ");
        double percentual = scanner.nextDouble();

        double novoSalario = salario + (salario * percentual / 100);
        System.out.println("Novo salário: " + novoSalario);
    }
}
