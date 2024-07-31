package src;

import java.util.Scanner;

public class exe_02 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int numero1, numero2, soma;

        System.out.println("Informe um número");
        numero1 = s.nextInt();

        System.out.println("Informe outro número");
        numero2 = s.nextInt();

        soma = numero1 + numero2;

        System.out.println("A soma dos número é: " + soma);
    }
}
