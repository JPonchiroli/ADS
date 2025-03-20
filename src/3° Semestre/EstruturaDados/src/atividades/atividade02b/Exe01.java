package atividades.atividade02b;

import java.util.Scanner;

public class Exe01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[3][3];
        int[][] somaMatriz = new int[3][3];

        System.out.println("Digite os valores da primeira matriz 3x3:");
        preencherMatriz(scanner, matriz1);

        System.out.println("Digite os valores da segunda matriz 3x3:");
        preencherMatriz(scanner, matriz2);

        somarMatrizes(matriz1, matriz2, somaMatriz);

        System.out.println("Matriz resultante da soma:");
        imprimirMatriz(somaMatriz);
    }

    public static void preencherMatriz(Scanner scanner, int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }

    public static void somarMatrizes(int[][] matriz1, int[][] matriz2, int[][] resultado) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
    }
}
