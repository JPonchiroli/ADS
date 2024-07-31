package src;

import java.util.Scanner;

public class exe_10 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double raio, area = 0;

        System.out.println("Informe o raio do círculo");
        raio = s.nextInt();

        area = 3.14 * (raio * raio);

        System.out.println("A soma dos número é: " + area);
    }
}
