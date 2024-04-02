package lista_2;

import java.util.Scanner;

public class Exe_25 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int contCulpado = 0;
        String respostaSuspeito;

        System.out.println("Telefonou para a vítima? \n S- Sim \n N- Não");
        respostaSuspeito = s.next().toUpperCase();

        if(respostaSuspeito.equals("S")){
            contCulpado++;
            respostaSuspeito = " ";
        } else if(respostaSuspeito.equals("N")){
            respostaSuspeito = " ";
        }

        System.out.println("Esteve no local do crime? \n S- Sim \n N- Não");
        respostaSuspeito = s.next().toUpperCase();

        if(respostaSuspeito.equals("S")){
            contCulpado++;
            respostaSuspeito = " ";
        } else if(respostaSuspeito.equals("N")){
            respostaSuspeito = " ";
        }

        System.out.println("Mora perto da vítima? \n S- Sim \n N- Não");
        respostaSuspeito = s.next().toUpperCase();

        if(respostaSuspeito.equals("S")){
            contCulpado++;
            respostaSuspeito = " ";
        } else if(respostaSuspeito.equals("N")){
            respostaSuspeito = " ";
        }

        System.out.println("Devia para a vítima? \n S- Sim \n N- Não");
        respostaSuspeito = s.next().toUpperCase();

        if(respostaSuspeito.equals("S")){
            contCulpado++;
            respostaSuspeito = " ";
        } else if(respostaSuspeito.equals("N")){
            respostaSuspeito = " ";
        }

        System.out.println("Já trabalhou com a vítima? \n S- Sim \n N- Não");
        respostaSuspeito = s.next().toUpperCase();

        if(respostaSuspeito.equals("S")){
            contCulpado++;
            respostaSuspeito = " ";
        } else if(respostaSuspeito.equals("N")){
            respostaSuspeito = " ";
        }

        if(contCulpado == 5){
            System.out.println("Culpado");
        } else if(contCulpado >= 3){
            System.out.println("Cúmplice");
        } else if(contCulpado == 2){
            System.out.println("Suspeito");
        } else {
            System.out.println("Inocente");
        }
    }
}
/*
25. Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
    ° "Telefonou para a vítima?"
    ° "Esteve no local do crime?"
    ° "Mora perto da vítima?"
    ° "Devia para a vítima?"
    ° "Já trabalhou com a vítima?"
    O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
    Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita",
    entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente".
 */