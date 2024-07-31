package src;

import java.util.Scanner;

public class exe_19 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double salario = 0;

        System.out.println("Informe um salário");
        salario = s.nextInt();

        if (salario <= 1499){
            salario = salario * 1.15;
        } else {
            salario = salario * 1.10;
        }

        System.out.println("Novo salário: R$" + salario);

    }
}
