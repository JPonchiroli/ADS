package lista_official;

import java.util.Scanner;

public class Exe_04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int totalEleitores, totalVotosBrancos, totalVotosNulos, totalVotosValidos;
        int percVotosBrancos, percVotosNulos, percVotosValidos, somaVotos;

        System.out.println("Informe a quantidade de eleitores do município");
        totalEleitores = s.nextInt();

        System.out.println("Informe a quantidade de votos brancos do município");
        totalVotosBrancos = s.nextInt();

        System.out.println("Informe a quantidade de votos nulos do município");
        totalVotosNulos = s.nextInt();

        System.out.println("Informe a quantidade de votos válidos do município");
        totalVotosValidos = s.nextInt();

        somaVotos = totalVotosBrancos + totalVotosNulos + totalVotosValidos;

        if (somaVotos > totalEleitores) {
            System.out.println("Erro na Quantidade de Participantes");
        } else {
            percVotosBrancos = (100 * totalVotosBrancos) / totalEleitores;
            percVotosNulos = (100 * totalVotosNulos) / totalEleitores;
            percVotosValidos = (100 * totalVotosValidos) / totalEleitores;

            System.out.println("Número de Eleitores: " + totalEleitores);
            System.out.println("Votos Brancos " + percVotosBrancos + "%");
            System.out.println("Votos Nulos " + percVotosNulos + "%");
            System.out.println("Votos Válidos " + percVotosValidos + "%");
        }
    }
}
/*
    4). Escreva um algoritmo para ler o número total de eleitores de um município, o número de
        votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em
        relação ao total de eleitores.
 */