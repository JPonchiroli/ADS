package src;

import java.util.Scanner;

public class exe_11 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String nome;
        double altura, peso, IMC;

        System.out.println("Informe seu nome");
        nome = s.next();

        System.out.println("Informe seu peso");
        peso = s.nextInt();

        System.out.println("Informe sua altura");
        altura = s.nextInt();


        IMC = peso / (altura * altura);

        if (IMC < 16.9){
            System.out.println("Muito abaixo do peso");
        } else if (IMC < 18.4){
            System.out.println("Abaixo do peso");
        } else if (IMC < 24.9){
            System.out.println("Peso Normal");
        } else if (IMC < 29.9){
            System.out.println("Acima do peso");
        } else if (IMC < 34.9){
            System.out.println("Obesidade grau I");
        } else if (IMC < 40){
            System.out.println("Obesidade grau II");
        } else if (IMC > 40){
            System.out.println("Obesidade grau III");
        }
    }
}
