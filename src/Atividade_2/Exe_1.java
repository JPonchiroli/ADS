import java.util.Scanner;

public class Exe_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numero;

        System.out.println("Escreva um numero");
        numero = s.nextInt();

        if(numero < 0 || numero > 200){
            System.out.println("Número não muda");
        } else {
            numero += (numero * 0.3);
            System.out.println("Número Mudado: " + numero);
        }
    }
}