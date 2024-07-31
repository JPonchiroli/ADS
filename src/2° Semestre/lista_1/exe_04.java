package src;

import java.util.Scanner;

public class exe_04 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int numero;

        System.out.println("Informe um número");
        numero = s.nextInt();

        if (numero % 2 == 0){
            System.out.println("Número informado é par");
        } else {
            System.out.println("Número informado é ímpar");
        }
    }
}
