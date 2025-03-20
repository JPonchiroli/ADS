package atividades.atividade03;

import java.io.*;
import java.util.Scanner;

public class Exe01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de valores: ");
        int n = scanner.nextInt();
        Integer[] valores = new Integer[n];

        System.out.println("Digite os valores:");
        for (int i = 0; i < n; i++) {
            valores[i] = scanner.nextInt();
        }

        String userHome = System.getProperty("user.home");
        String filePath = userHome + "/Desktop/valores.dat";

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))) {
            dos.writeInt(n);
            for (int valor : valores) {
                dos.writeInt(valor);
            }
            System.out.println("Valores salvos no arquivo: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
