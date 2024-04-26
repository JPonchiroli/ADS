import java.util.Scanner;

public class Exe_06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int numero, positivos = 0, media, contImpares = 0, contPositivos = 0;


        System.out.println("Informe um número");
        numero = s.nextInt();

        for (int i = 0; i <= numero; i++){
            if(i > 0){
                positivos += i;
                contPositivos++;
            }

            if(i % 2 == 1){
                contImpares++;
            }
        }

        media = positivos / numero;


        System.out.println("Qtd Números Positivos: " + contPositivos);
        System.out.println("Média: " + media);
        System.out.println("Qtd Números Impares: " + contImpares);


    }
}
