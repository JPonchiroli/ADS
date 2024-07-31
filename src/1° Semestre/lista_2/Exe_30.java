package lista_2;

import java.util.Scanner;

public class Exe_30 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String nomeProduto;
        int qtdNoEstoque, qtdComprada;

        System.out.println("Informe o item que você quer comprar");
        nomeProduto = s.next();

        System.out.println("Quanto(a)s " + nomeProduto + " existem no Estoque?");
        qtdNoEstoque = s.nextInt();

        if (qtdNoEstoque == 0) {
            System.out.println("Compra Recusada Produto Esgotado");
        } else {
            System.out.println("Informe a quantidade de " + nomeProduto + " que você deseja comprar");
            qtdComprada = s.nextInt();

            if (qtdComprada > qtdNoEstoque) {
                System.out.println("Compra Recusada por falta no Estoque");
            } else {
                    if(qtdNoEstoque < 10){
                        qtdNoEstoque -= qtdComprada;
                        System.out.println("ALERTA POUCO PRODUTO NO ESTOQUE");
                        System.out.println("Compra Realiza com Sucesso");
                        System.out.println("Quantidade em Estoque " + qtdNoEstoque);
                    } else{
                        qtdNoEstoque -= qtdComprada;
                        System.out.println("Compra Realiza com Sucesso");
                        System.out.println("Quantidade em Estoque " + qtdNoEstoque);
                    }

            }
        }
    }
}
/*
    30. A loja OptimusPrime deseja um sistema de gerenciamento de estoque. O sistema deve controlar
        a quantidade de produtos em estoque e permitir a venda de produtos. Os critérios são os
        seguintes:
     Se a quantidade em estoque for igual a zero, o produto está esgotado e não pode ser
       vendido.
     Se a quantidade em estoque for menor que 10, o sistema deve emitir um aviso sobre
       estoque baixo.
     Se a quantidade em estoque for maior ou igual a 10, a venda é permitida, e a quantidade
       em estoque deve ser atualizada após a venda.
 */