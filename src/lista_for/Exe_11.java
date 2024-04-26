import java.util.Scanner;

public class Exe_11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int homensCastanhos = 0;
        int mulheresAzuisLouros = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Informe o sexo da " + i + "° pessoa (M para masculino, F para feminino):");
            char sexo = s.next().charAt(0);

            System.out.println("Informe a cor dos olhos da " + i + "° pessoa (azuis, verdes ou castanhos):");
            String corOlhos = s.next();

            System.out.println("Informe a cor dos cabelos da " + i + "° pessoa (louros, castanhos ou pretos):");
            String corCabelos = s.next();

            if (sexo == 'M' && corOlhos.equals("castanhos") && corCabelos.equals("castanhos")) {
                homensCastanhos++;
            }

            if (sexo == 'F' && corOlhos.equals("azuis") && corCabelos.equals("louros")) {
                mulheresAzuisLouros++;
            }
        }

        System.out.println("Quantidade de homens com olhos e cabelos castanhos: " + homensCastanhos);
        System.out.println("Quantidade de mulheres com olhos azuis e cabelos louros: " + mulheresAzuisLouros);

    }
}
