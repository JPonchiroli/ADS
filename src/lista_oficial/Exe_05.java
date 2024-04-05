package lista_oficial;

import java.util.Scanner;

public class Exe_05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double salarioInicial, percAumento, salarioFinal;

        System.out.println("Informe o salário do funcionário");
        salarioInicial = s.nextInt();

        System.out.println("Informe o percentual de aumento do salário");
        percAumento = s.nextInt();

        salarioFinal = salarioInicial + (salarioInicial * (percAumento / 100));

        System.out.println("Salário Final: " + salarioFinal);
    }
}
/*
    5). Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de
        reajuste. Calcular e escrever o valor do novo salário.
 */