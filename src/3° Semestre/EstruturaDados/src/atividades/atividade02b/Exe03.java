package atividades.atividade02b;

import java.util.Scanner;

public class Exe03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz4x4 = new int[4][4];
        System.out.println("Digite os valores da matriz 4x4:");
        preencherMatriz(scanner, matriz4x4);

        calcularMatriz4x4(matriz4x4);
    }

    public static void preencherMatriz(Scanner scanner, int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    public static void calcularMatriz4x4(int[][] matriz) {
        double somaTotal = 0;
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        int[] somaLinhas = new int[linhas];
        int[] menorColuna = new int[colunas];

        for (int i = 0; i < colunas; i++) {
            menorColuna[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                somaTotal += matriz[i][j];
                somaLinhas[i] += matriz[i][j];
                if (matriz[i][j] < menorColuna[j]) {
                    menorColuna[j] = matriz[i][j];
                }
            }
        }

        double media = somaTotal / (linhas * colunas);
        System.out.println("Média dos valores da matriz: " + media);
        for (int i = 0; i < linhas; i++) {
            System.out.println("Soma da linha " + (i + 1) + ": " + somaLinhas[i]);
        }
        for (int j = 0; j < colunas; j++) {
            System.out.println("Menor valor da coluna " + (j + 1) + ": " + menorColuna[j]);
        }
    }
}
