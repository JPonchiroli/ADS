package lista_2;

import java.util.Scanner;

public class Exe_29 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double valorEmprestimo, rendaMensal;
        int qtdPontos;

        System.out.println("Informe o valor do emprestimo");
        valorEmprestimo = s.nextDouble();

        if(valorEmprestimo <= 10000){
            System.out.println("Empréstimo no valor de R$" + valorEmprestimo + " Aprovado com Sucesso");
        } else if(valorEmprestimo <= 50000){
            System.out.println("Informe a sua Pontuação de Crédito");
            qtdPontos = s.nextInt();
            if(qtdPontos >= 10000){
                System.out.println("Empréstimo no valor de R$" + valorEmprestimo + " Aprovado com Sucesso");
            } else {
                System.out.println("Empréstimo no valor de R$" + valorEmprestimo + " Negado pela falta de Pontuação");
            }
        } else if(valorEmprestimo > 50000) {
            System.out.println("Informe a sua Pontuação de Crédito");
            qtdPontos = s.nextInt();
            if(qtdPontos >= 10000){
                System.out.println("Informe a sua Renda Mensal");
                rendaMensal = s.nextDouble();
                if(rendaMensal > 5000){
                    System.out.println("Empréstimo no valor de R$" + valorEmprestimo + " Aprovado com Sucesso");
                }  else {
                    System.out.println("Empréstimo no valor de R$" + valorEmprestimo + " Negado por Renda Mensal Insuficiente");
                }
            } else {
                System.out.println("Empréstimo no valor de R$" + valorEmprestimo + " Negado pela falta de Pontuação");
            }

        }

    }
}
/*
    29. O Banco Bumblebee tem um sistema de empréstimos bancários. Os critérios para aprovar um
        empréstimo são os seguintes:
     Se o valor do empréstimo solicitado for menor ou igual a R$ 10.000, o empréstimo é
       aprovado automaticamente.
     Se o valor estiver entre R$ 10.001 e R$ 50.000, o empréstimo é aprovado se o solicitante
    tiver uma boa pontuação de crédito.
     Se o valor do empréstimo for superior a R$ 50.000, o empréstimo é aprovado apenas se
       o solicitante tiver uma excelente pontuação de crédito e uma renda mensal acima de R$
       5.000
    Atenção: Pontuação de crédito para aprovação: >10000 pontos

 */