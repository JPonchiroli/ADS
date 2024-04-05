package lista_oficial;

import java.util.Scanner;

public class Exe_06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double custoFabrica, percDist = 0.28, percImp = 0.45;
        double precoDist, precoImp, custoFinal;

        System.out.println("Informe o preço de fábrica do carro");
        custoFabrica = s.nextDouble();

        precoDist = custoFabrica * percDist;
        precoImp = custoFabrica * percImp;
        custoFinal = custoFabrica + precoDist + precoImp;

        System.out.println("Custo Final R$" + custoFinal);
    }
}
/*
    6). O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem
        do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do
        distribuidor seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de
        fábrica de um carro, calcular e escrever o custo final ao consumidor.

 */