import java.util.Scanner;

public class Exe_08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int numero;


        System.out.println("Informe um número a ser multiplicado");
        numero = s.nextInt();

        for (int i = 0; i <= 10; i++){
            int multiplicacao = numero * i;
            System.out.println(i + " X " + i + "= " + multiplicacao);
        }



    }
}
