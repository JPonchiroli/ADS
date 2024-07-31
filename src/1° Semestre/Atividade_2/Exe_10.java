package Atividade_2;

import java.util.Scanner;

public class Exe_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double precoUnitario, qtdProduto, desconto, precoTotal, precoFinal;

        System.out.println("Informe o preço unitário do produto desejado");
        precoUnitario = s.nextDouble();

        System.out.println("Informe a quantidade do produto desejado");
        qtdProduto = s.nextDouble();

        if(qtdProduto > 20){
            precoTotal = precoUnitario * qtdProduto;
            desconto = precoTotal * 0.15;
            precoFinal = precoTotal - desconto;
        } else if(qtdProduto > 15){
            precoTotal = precoUnitario * qtdProduto;
            desconto = precoTotal * 0.13;
            precoFinal = precoTotal - desconto;
        } else if(qtdProduto > 10){
            precoTotal = precoUnitario * qtdProduto;
            desconto = precoTotal * 0.09;
            precoFinal = precoTotal - desconto;
        }  else if(qtdProduto > 5){
            precoTotal = precoUnitario * qtdProduto;
            desconto = precoTotal * 0.03;
            precoFinal = precoTotal - desconto;
        } else {
            desconto = 0.00;
            precoTotal = precoUnitario * qtdProduto;
            precoFinal = precoTotal - desconto;
        }

        System.out.println("Quantidade Comprada: " + qtdProduto);
        System.out.println("Valor Unitário: " + precoUnitario);
        System.out.println("Valor do Desconto: R$" + desconto);
        System.out.println("Valor Final: R$" + precoFinal);
    }
}
