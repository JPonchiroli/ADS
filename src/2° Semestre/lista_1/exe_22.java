package src;

import java.util.Scanner;

public class exe_22 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int numero;

        System.out.print("Digite um número inteiro: ");
        numero = s.nextInt();

        int soma = 0;
        int numeroAbsoluto = Math.abs(numero);

        while (numeroAbsoluto > 0) {
            int digito = numeroAbsoluto % 10;

            soma += digito;

            numeroAbsoluto /= 10;
        }
        System.out.println("A soma dos dígitos é: " + soma);
    }
}
