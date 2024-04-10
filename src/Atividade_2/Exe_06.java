import java.util.Scanner;

public class Exe_06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double precoInicial, aumento, precoFinal = 0;
        int idade;

        System.out.println("Informe seu preço inicial do produto");
        precoInicial = s.nextDouble();

        System.out.println("Informe a sua idade");
        idade = s.nextInt();

        if(idade >= 65){
            aumento = 0.15;
            precoFinal += precoInicial + (precoInicial * aumento);
            System.out.println("Preço Final: " + precoFinal);
        }  else if(idade >= 18) {
            precoFinal += precoInicial;
            System.out.println("Salário Final: " + precoFinal);
        } else {
            aumento = 0.1;
            precoFinal += precoInicial + (precoInicial * aumento);
            System.out.println("Preço Final: " + precoFinal);
        }
    }
}
