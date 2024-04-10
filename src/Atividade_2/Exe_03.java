import java.util.Scanner;

public class Exe_03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num1, num2, operacao, conta;

        System.out.println("Informe o número 1");
        num1 = s.nextInt();

        System.out.println("Informe o número 2");
        num2 = s.nextInt();

        System.out.println("Informe a Operação Desejada \n 1- Soma  2- Subtração  \n 3- Multiplicação  4- Divisão");
        operacao = s.nextInt();

        switch (operacao) {
            case 1: conta = num1 + num2;
                System.out.println("Resultado da Conta: " + conta);
            break;

            case 2:  conta = num1 - num2;
                System.out.println("Resultado da Conta: " + conta);
            break;

            case 3: conta = num1 * num2;
                System.out.println("Resultado da Conta: " + conta);
            break;

            case 4: conta = num1 / num2;
                System.out.println("Resultado da Conta: " + conta);
            break;

            default:
                System.out.println("Operação Inválida");
        }

    }
}
