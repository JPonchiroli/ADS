package lista_oficial;

import java.util.Scanner;

public class Exe_03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int idade, idadeMeses, idadeDias;

        System.out.println("Informe sua idade");
        idade = s.nextInt();

        idadeMeses = idade * 12;
        idadeDias = idade * 365;

        System.out.println("Idade Em Anos " + idade);
        System.out.println("Idade Em Meses " + idadeMeses);
        System.out.println("Idade Em Dias " + idadeDias);
    }
}
/*
    3). Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
        escreva a idade dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês
        com 30 dias.
 */