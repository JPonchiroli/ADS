package atividades.atividade02b;

import java.util.Random;
import java.util.Scanner;

public class Exe04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de linhas da matriz MxN: ");
        int m = scanner.nextInt();

        System.out.print("Digite o número de colunas da matriz MxN: ");
        int n = scanner.nextInt();

        int[][] imagem = gerarMatrizBinaria(m, n);

        System.out.println("Matriz gerada:");
        imprimirMatriz(imagem);

        int[][] padrao = new int[3][3];

        System.out.println("Digite os valores do padrão 3x3:");
        preencherMatriz(scanner, padrao);

        int ocorrencias = contarPadrao(imagem, padrao);
        System.out.println("O padrão apareceu " + ocorrencias + " vezes na matriz.");
    }

    public static long fibonacci(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int[][] gerarMatrizBinaria(int m, int n) {
        Random random = new Random();
        int[][] matriz = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = random.nextInt(2);
            }
        }
        return matriz;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }

    public static void preencherMatriz(Scanner scanner, int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    public static int contarPadrao(int[][] matriz, int[][] padrao) {
        int contagem = 0;
        int linhas = matriz.length;
        int colunas = matriz[0].length;

        for (int i = 0; i <= linhas - 3; i++) {
            for (int j = 0; j <= colunas - 3; j++) {
                if (verificarPadrao(matriz, padrao, i, j)) {
                    contagem++;
                }
            }
        }
        return contagem;
    }

    public static boolean verificarPadrao(int[][] matriz, int[][] padrao, int x, int y) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[x + i][y + j] != padrao[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
