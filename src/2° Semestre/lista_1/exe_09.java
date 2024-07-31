package src;

import java.util.Scanner;

public class exe_09 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int numero1, numero2, soma, subtracao, multplicacao, divisao;

        System.out.println("Informe um número");
        numero1 = s.nextInt();

        System.out.println("Informe outro número");
        numero2 = s.nextInt();

        soma = numero1 + numero2;
        subtracao = numero1 - numero2;
        multplicacao = numero1 * numero2;
        divisao = numero1 / numero2;

        System.out.println("A soma dos número é: " + soma);
        System.out.println("A subtração dos número é: " + subtracao);
        System.out.println("A multiplicação dos número é: " + multplicacao);
        System.out.println("A divisão dos número é: " + divisao);
    }
}
