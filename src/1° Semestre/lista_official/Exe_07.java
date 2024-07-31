package lista_official;

import java.util.Scanner;

public class Exe_07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double salarioFixo, qtdCarrosVendidos, totalVendas, comissaoPorCarro;
        double valorComissao, valorVendas, salarioFinal;

        System.out.println("Informe o salário fixo do funcionário");
        salarioFixo = s.nextDouble();

        System.out.println("Informe a quantidade de Carros Vendidos");
        qtdCarrosVendidos = s.nextDouble();

        System.out.println("Informe a comissão por cada carro vendido");
        comissaoPorCarro = s.nextDouble();

        System.out.println("Informe o total de vendas realizadas");
        totalVendas = s.nextDouble();

        valorComissao = qtdCarrosVendidos * comissaoPorCarro;
        valorVendas = totalVendas * 0.05;
        salarioFinal = salarioFixo + valorComissao + valorVendas;

        System.out.println("Salário Final R$" + salarioFinal);

    }
}
/*
    7). Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo
        por mês, mais uma comissão também fixa para cada carro vendido e mais 5% do valor das
        vendas por ele efetuadas. Escrever um algoritmo que leia o número de carros por ele
        vendidos, o valor total de suas vendas, o salário fixo e o valor que ele recebe por carro
        vendido. Calcule e escreva o salário final do vendedor.
 */