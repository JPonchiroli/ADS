import java.util.Scanner;

public class Exe_07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int multiplicador;

        System.out.println("Informe o Multiplicador da Conta");
        multiplicador = s.nextInt();

        if(multiplicador < 1 || multiplicador > 10){
            System.out.println("Número Inválido");
        } else {
            for (int i = 0; i <= 10; i++){
                int conta = i * multiplicador;
                System.out.println(i + " X " + "8 = " + conta);
            }
        }


    }
}
/*
    7) Ler um valor inteiro (aceitar somente valores entre 1 e 10) e escrever a
    tabuada de 1 a 10 do valor lido.
*/
