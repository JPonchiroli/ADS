package lista_oficial;

import java.util.Scanner;

public class Exe_02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double base, altura, area;

        System.out.println("Informe a base do Retângulo");
        base = s.nextDouble();

        System.out.println("Informe a altura do Retângulo");
        altura = s.nextDouble();

        area = base * altura;

        System.out.println("Área do Retângulo " + area);
    }
}
/*
    2). Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e
        escrever a área do retângulo.
 */