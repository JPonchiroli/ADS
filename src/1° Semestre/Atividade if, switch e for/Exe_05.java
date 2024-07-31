import java.util.Scanner;

public class Exe_05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int numero1, numero2, operacao, conta = 0;

        for (int i = 0; i <= 4; i++){
            System.out.println("Informe o primeiro numero do " + (i + 1) + "° laço");
            numero1 = s. nextInt();

            System.out.println("Informe o segundo numero do " + (i + 1) + "° laço");
            numero2 = s. nextInt();

            System.out.println("Informe a operação do " + (i + 1) + "° laço \n 1- +   3- *  \n 2- -  4- /");
            operacao = s. nextInt();

            switch (operacao){
                case 1 : conta = numero1 + numero2;
                         System.out.println("Resultado: " + numero1 + " + " + numero2 + " = " + conta);
                         break;
                case 2 : conta = numero1 - numero2;
                         System.out.println("Resultado: " + numero1 + " - " + numero2 + " = " + conta);
                         break;
                case 3 : conta = numero1 * numero2;
                         System.out.println("Resultado: " + numero1 + " * " + numero2 + " = " + conta);
                         break;
                case 4 : conta = numero1 / numero2;
                         System.out.println("Resultado: " + numero1 + " / " + numero2 + " = " + conta);
                         break;
            }


        }
    }
}
