package src;

import java.util.Scanner;

public class exe_07 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int numero1, numero2, numero3, maiorNumero = 0;

        System.out.println("Informe um número");
        numero1 = s.nextInt();

        System.out.println("Informe outro número");
        numero2 = s.nextInt();

        System.out.println("Informe mais um número");
        numero3 = s.nextInt();

        if (numero1 > numero2 & numero1 > numero3){
            maiorNumero = numero1;
        } else if (numero2 > numero1 & numero2 > numero3){
            maiorNumero = numero1;
        } else {
            maiorNumero = numero3;
        }

        System.out.println("Maior número: " + maiorNumero);
    }
}
