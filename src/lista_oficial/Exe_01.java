package lista_oficial;

import java.util.Scanner;

public class Exe_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num, antecessor;

        System.out.println("Informe um número");
        num = s.nextInt();

        antecessor = num - 1;

        System.out.println("O antecessor de " + num + " é " + antecessor);
    }
}
/*
    1). Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor.
 */