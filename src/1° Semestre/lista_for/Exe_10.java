import java.util.Scanner;

public class Exe_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        double salarioTotal = 0;
        int numeroFilhosTotal = 0;
        double maiorSalario = 0;
        int pessoasAte1500 = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Informe o salário da pessoa " + i + ":");
            double salario = s.nextDouble();
            salarioTotal += salario;

            System.out.println("Informe o número de filhos da pessoa " + i + ":");
            int numeroFilhos = s.nextInt();
            numeroFilhosTotal += numeroFilhos;

            if (salario > maiorSalario) {
                maiorSalario = salario;
            }

            if (salario <= 1500) {
                pessoasAte1500++;
            }
        }

        double mediaSalario = salarioTotal / 10;
        double mediaFilhos = (double) numeroFilhosTotal / 10;
        double percentualAte1500 = (double) (pessoasAte1500 * 100) / 10;

        System.out.println("Média do salário: R$" + mediaSalario);
        System.out.println("Média do número de filhos: " + mediaFilhos);
        System.out.println("Maior salário: R$" + maiorSalario);
        System.out.println("Percentual de pessoas com salário até R$1.500,00: " + percentualAte1500 + "%");

    }
}
