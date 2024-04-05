package lista_official;

import java.util.Scanner;

public class Exe_09 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double nota1, nota2, nota3, media;
        double peso1 = 2, peso2 = 3, peso3 = 5;

        System.out.println("Informe o valor da nota 1");
        nota1 = s.nextDouble();

        System.out.println("Informe o valor da nota 2");
        nota2 = s.nextDouble();

        System.out.println("Informe o valor da nota 3");
        nota3 = s.nextDouble();

        media = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);

        System.out.println("Média Ponderada " + media);
    }
}
/*
    9). Faça um algoritmo que leia três notas de um aluno, calcule e escreva a média final deste
        aluno. Considerar que a média é ponderada e que o peso das notas é 2, 3 e 5. Fórmula para o
        cálculo da média final é:
 */