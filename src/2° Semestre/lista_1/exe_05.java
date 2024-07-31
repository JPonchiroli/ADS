package src;

import java.util.Scanner;

public class exe_05 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int numero;

        System.out.println("Informe um número");
        numero = s.nextInt();

        if (numero > 0){
            System.out.println("Número informado é positivo");
        } else if (numero < 0) {
            System.out.println("Número informado é negativo");
        } else {
            System.out.println("Número é igual a zero");
        }
    }
}
