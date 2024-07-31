package src;

import java.util.Scanner;

public class exe_03 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double nota1, nota2, nota3, media;

        System.out.println("Informe a nota 1");
        nota1 = s.nextInt();

        System.out.println("Informe a nota 2");
        nota2 = s.nextInt();

        System.out.println("Informe a nota 3");
        nota3 = s.nextInt();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A média das notas é: " + media);
    }
}
