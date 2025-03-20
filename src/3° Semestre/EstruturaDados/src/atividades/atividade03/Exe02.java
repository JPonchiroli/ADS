package atividades.atividade03;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userHome = System.getProperty("user.home");
        String filePath = userHome + "/Desktop/valores.dat";

        try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath))) {
            int n = dis.readInt();
            ArrayList<Integer> valores = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                valores.add(dis.readInt());
            }

            System.out.println("Valores lidos do arquivo:");
            for (int valor : valores) {
                System.out.print(valor + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
