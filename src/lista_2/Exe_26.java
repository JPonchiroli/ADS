package lista_2;

import java.util.Scanner;

public class Exe_26 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double qtdLitrosVendidos, precoLitroGasolina = 2.50, precoLitroAlcool = 1.90, precoFinal = 0;
        String tipoCombustivel;

        System.out.println("Informe a Quantidade de Litros Vendida");
        qtdLitrosVendidos = s.nextDouble();

        System.out.println("Informe o tipo de Combústivel \n A-Álcool  G-Gasolina");
        tipoCombustivel = s.next().toUpperCase();

        if(tipoCombustivel.equals("A")){
            if(qtdLitrosVendidos <= 20){
                double qtdDesconto = 0.03;
                double valorAplicado = qtdLitrosVendidos * precoLitroAlcool;
                System.out.println(qtdDesconto + " " + valorAplicado);
                precoFinal = valorAplicado - (valorAplicado * qtdDesconto);
            } else {
                double qtdDesconto = 0.05;
                double valorAplicado = qtdLitrosVendidos * precoLitroAlcool;
                precoFinal = valorAplicado - (valorAplicado * qtdDesconto);
            }
        } else if(tipoCombustivel.equals("G")){
            if(qtdLitrosVendidos <= 20){
                double qtdDesconto = 0.04;
                double valorAplicado = qtdLitrosVendidos * precoLitroGasolina;
                precoFinal = qtdLitrosVendidos - (valorAplicado * qtdDesconto);
            } else {
                double qtdDesconto = 0.06;
                double valorAplicado = qtdLitrosVendidos * precoLitroGasolina;
                precoFinal = valorAplicado - (valorAplicado * qtdDesconto);
            }
        }

        System.out.println("Preço total: R$" + precoFinal);
    }
}
/*
    26. Um posto está vendendo combustíveis com a seguinte tabela de descontos:
     Álcool:
     até 20 litros, desconto de 3% por litro
     acima de 20 litros, desconto de 5% por litro
     Gasolina:
     até 20 litros, desconto de 4% por litro
     acima de 20 litros, desconto de 6% por litro
    Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível
    (codificado da seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a
    ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço
    do litro do álcool é R$ 1,90.
 */