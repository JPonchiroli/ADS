package src;

import java.util.Scanner;

public class exe_12 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int numero;

        System.out.println("Informe um número");
        numero = s.nextInt();

        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("Número é divisível por 3 e 5");
        } else {
            System.out.println("Número não é divisível por 3 e 5");
        }
    }
}
