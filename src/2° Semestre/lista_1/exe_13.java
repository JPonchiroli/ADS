package src;

import java.util.Scanner;

public class exe_13 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int notaFinal;

        System.out.println("Informe a nota final");
        notaFinal = s.nextInt();

        if (notaFinal > 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
