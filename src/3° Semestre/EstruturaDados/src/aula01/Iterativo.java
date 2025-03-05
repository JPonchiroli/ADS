package aula01;

import java.util.Scanner;

public class Iterativo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Exe 01");
        System.out.print("Informe um numero: ");
        int numeroEscolhidoSomarAte = s.nextInt();


        System.out.print("Soma Até: " + somarAte(numeroEscolhidoSomarAte));

        System.out.println();
        System.out.println("------------------------------------------------------------");

        System.out.println("Exe 02");
        System.out.print("Informe um numero: ");
        int numeroEscolhidoFatorial = s.nextInt();


        System.out.print("Fatorial de " + numeroEscolhidoFatorial + ": " + fatorial(numeroEscolhidoFatorial));


    }

    public static int somarAte(int numero){
        int somaNumeros = 0;

        for (int i = 0; i <= numero; i++) {
            somaNumeros += i;
        }

        return somaNumeros;
    }

    public static int fatorial(int numero){
        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        return fatorial;
    }

}