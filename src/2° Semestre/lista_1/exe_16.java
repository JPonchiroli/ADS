package src;

import java.util.Scanner;

public class exe_16 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        char caractere;

        System.out.print("Digite um caractere: ");
        caractere = s.next().charAt(0);

        if (Character.isDigit(caractere)) {
            System.out.println("O caractere é um dígito numérico.");
        }

        else if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u' ||
                caractere == 'A' || caractere == 'E' || caractere == 'I' || caractere == 'O' || caractere == 'U') {
            System.out.println("O caractere é uma vogal.");
        }
        else if ((Character.isLetter(caractere) && !Character.isDigit(caractere))) {
            System.out.println("O caractere é uma consoante.");
        }
        else {
            System.out.println("O caractere é um caractere especial.");
        }


    }
}
