package src;

import java.util.Scanner;

    public class exe_24 {
        public static void main(String[] args) {

            Scanner s = new Scanner(System.in);

            int numero;

            System.out.print("Digite um número inteiro: ");
            numero = s.nextInt();

            String binario = Integer.toHexString(numero);

            System.out.println("O número hexadecimal é: " + binario);
        }
    }
