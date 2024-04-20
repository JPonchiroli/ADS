import java.util.Scanner;

public class Exe_04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num, cont = 1;

        System.out.println("Escreva um número");
        num = s.nextInt();

        while(cont <= num){
            System.out.print(cont + ", ");
            cont++;
        }

    }
}
/*
    4) Ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive) e N
    (inclusive). Considere
 */