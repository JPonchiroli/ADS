package src;

import java.util.Scanner;

public class exe_06 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int idade;

        System.out.println("Informe uma idade");
        idade = s.nextInt();

        if (idade > 18){
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }
}
