import java.util.Scanner;

public class Exe_07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double salario, parcelasDesejadas, valorParcela, valorEmprestimo;

        System.out.println("Informe seu salário inicial");
        salario = s.nextDouble();

        System.out.println("Informe o valor do empréstimo");
        valorEmprestimo = s.nextDouble();

        System.out.println("Informe o número de parcelas desejadas");
        parcelasDesejadas = s.nextDouble();

        valorParcela = valorEmprestimo / parcelasDesejadas;

        if(valorParcela >= (salario * 0.3)){
            System.out.println("Crédito Negado");
        }  else{
            System.out.println("Crédito Aprovado");
            System.out.println("Valor Empréstimo: " + valorEmprestimo);
            System.out.println("Quantidade Parcelas: " + parcelasDesejadas);
            System.out.println("Valor das Parcelas: R$" + valorParcela);
        }
    }
}
