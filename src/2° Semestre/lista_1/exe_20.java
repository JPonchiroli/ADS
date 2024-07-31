package src;

import java.util.Arrays;
import java.util.Scanner;

public class exe_20 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] numeros = {3, 7, 5, 2, 9};

        Arrays.sort(numeros);

        System.out.println("Números ordenados: " + Arrays.toString(numeros));

    }
}
