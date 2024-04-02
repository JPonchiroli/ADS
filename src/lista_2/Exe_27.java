package lista_2;

import java.util.Scanner;

public class Exe_27 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double precoMorango = 2.5, precoMaca = 1.8, qtdMorango, qtdMaca;

        System.out.println("Informe a Quantidade em Kilos de Morango");
        qtdMorango = s.nextDouble();

        System.out.println("Informe a Quantidade em Kilos de Maca");
        qtdMaca = s.nextDouble();

        double pesoTotal = qtdMorango + qtdMaca;
        double precoFinal = (qtdMorango * precoMorango) + (qtdMaca * precoMaca);

        if(pesoTotal >= 8 || precoFinal >= 25){
            precoFinal = precoFinal - (precoFinal * 0.1);
        }

        System.out.println("Preço Final: R$" + precoFinal);
    }
}
/*
    27. Uma fruteira está vendendo frutas com a seguinte tabela de preços:
    Até 5 Kg Acima de 5 Kg
         Morango R$ 2,50 por Kg R$ 2,20 por Kg
         Maçã R$ 1,80 por Kg R$ 1,50 por Kg
    Atenção: Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$
    25,00, receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a
    quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor
    a ser pago pelo cliente.
 */