package aula_recursividade;

import java.util.Scanner;

public class Recursivo {
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
        // Caso Base
        if (numero == 0)
            return 0;

        // Caso de rcursao
        return numero + somarAte(numero - 1);
    }

    public static int fatorial(int numero){
        // Caso Base
        if (numero == 0)
            return 1;

        // Caso de rcursao
        return numero * fatorial(numero - 1);
    }
}
