package src;

import java.util.Scanner;

public class exe_15 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int numero;

        System.out.println("Informe um número");
        numero = s.nextInt();

        if (numero <= 1) {
            System.out.println(numero + " não é primo.");
        } else {
            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    System.out.println(numero + " não é primo.");
                    return;
                }
            }
            System.out.println(numero + " é primo.");
        }

    }
}
