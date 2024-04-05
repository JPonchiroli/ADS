package lista_oficial;

import java.util.Scanner;

public class Exe_08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double tempCelsius, tempFahrenheit;

        System.out.println("Informe a temperatura em Fahrenheit");
        tempFahrenheit = s.nextDouble();

        tempCelsius = ((tempFahrenheit - 32) * 5) / 9;

        System.out.println("Temperatura em Celsius: "+ tempCelsius + "° C");
    }
}
/*
    8). Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o
        valor correspondente em graus Celsius
 */