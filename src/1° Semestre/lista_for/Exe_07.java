import java.util.Scanner;

public class Exe_07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int numero, intervalo1 = 0, intervalo2 = 0, intervalo3 = 0, intervalo4 = 0;


        System.out.println("Informe um número");
        numero = s.nextInt();

        for (int i = 0; i <= numero; i++){
            if(i <= 25) {
                intervalo1++;
            } else if(i <= 50) {
                intervalo2++;
            } else if(i <= 75) {
                intervalo3++;
            } else if(i <= 100) {
                intervalo4++;
            }
        }


        System.out.println("Qtd Números no Primeiro Intervalo: " + intervalo1);
        System.out.println("Qtd Números no Primeiro Intervalo: " + intervalo2);
        System.out.println("Qtd Números no Primeiro Intervalo: " + intervalo3);
        System.out.println("Qtd Números no Primeiro Intervalo: " + intervalo4);


    }
}
