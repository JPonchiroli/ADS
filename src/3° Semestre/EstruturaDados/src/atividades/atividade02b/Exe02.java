package atividades.atividade02b;

import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz4x4 = new int[4][4];
        System.out.println("Digite os valores da matriz 4x4:");
        preencherMatriz(scanner, matriz4x4);

        System.out.println("A matriz é simétrica? " + (ehSimetrica(matriz4x4) ? "Sim" : "Não"));
    }

    public static void preencherMatriz(Scanner scanner, int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    public static boolean ehSimetrica(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
