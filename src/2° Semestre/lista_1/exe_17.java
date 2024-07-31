package src;

import java.util.Scanner;

public class exe_17 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int ano;

        System.out.println("Informe um ano");
        ano = s.nextInt();

        if (ano % 4 == 0){
            System.out.println("Ano bissexto");
        } else {
            System.out.println("Não é bissexto");
        }


    }
}
