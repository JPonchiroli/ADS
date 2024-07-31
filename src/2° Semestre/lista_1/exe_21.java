package src;

import java.util.Random;
import java.util.Scanner;

public class exe_21 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Random random = new Random();

        int numeroSorteado = random.nextInt(100);
        int numero;

        System.out.println("Informe um número");
        numero = s.nextInt();

        if (numero > numeroSorteado){
            System.out.println("Tente um número menor");
        } else if (numero < numeroSorteado){
            System.out.println("Tente um número maior");
        }

        System.out.println("NUM " + numeroSorteado);

        while(numero != numeroSorteado){
            System.out.println("Informe um número");
            numero = s.nextInt();

            if (numero > numeroSorteado){
                System.out.println("Tente um número menor");
            } else if (numero < numeroSorteado){
                System.out.println("Tente um número maior");
            } else {
                break;
            }
        }

        System.out.println("Parabéns acertou o número sorteado: " + numeroSorteado);

    }
}
