package exercicios;

import java.util.Scanner;

public class Exe_24 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		double tamanhoTonel, qtdAgua, qtdSuco;
		
		System.out.println("Informe a quantidade de litros do tonel");
		tamanhoTonel = s.nextDouble();
		
		qtdAgua = tamanhoTonel * 0.8;
		qtdSuco = tamanhoTonel * 0.2;
		
		System.out.println("Para um tonel de " + tamanhoTonel + " L será preciso");
		System.out.println(qtdAgua + " L de Água");
		System.out.println(qtdSuco + " L de Suco");
	}
}
/*
	24. Um tonel de refresco é feito com 8 partes de água mineral e 2 partes de suco de maracujá.
	Faça um algoritmo para calcular quantos litros de água e de suco são necessários para se fazer X
	litros de refresco (informados pelo usuário).
*/