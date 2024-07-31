package src;

import java.util.Scanner;

public class exe_18 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int numero;

        System.out.println("Informe um numero");
        numero = s.nextInt();

        String numeroStr = String.valueOf(numero);
        String StrReverso = new StringBuilder(numeroStr).reverse().toString();

        if (numeroStr.equals(StrReverso)) {
            System.out.println(numero + " é um palíndromo.");
        } else {
            System.out.println(numero + " não é um palíndromo.");
        }


    }
}
