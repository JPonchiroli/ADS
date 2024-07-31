package src;

import java.util.Scanner;

public class exe_14 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int idade;

        System.out.println("Informe a sua idade");
        idade = s.nextInt();

        if (idade > 16) {
            System.out.println("Pode votar");
        } else {
            System.out.println("Não pode votar");
        }
    }
}
