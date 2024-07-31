package src;

import java.util.Scanner;

public class exe_08 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String nome;
        int idade;

        System.out.println("Informe seu nome");
        nome = s.next();

        System.out.println("Informe uma idade");
        idade = s.nextInt();

        if (idade >= 65){
            System.out.println(nome + " você pode aponsentar");
        } else {
            System.out.println(nome + "você não pode aposentar");
        }
    }
}
