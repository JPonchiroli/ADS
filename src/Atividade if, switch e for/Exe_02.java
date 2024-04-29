import java.util.Scanner;

public class Exe_02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String conceito;

        System.out.println("Informe seu COnceito");
        conceito = s.next().toUpperCase();

        /*
        if(conceito.equals("A")){
            System.out.println("Excelente");
        } else if(conceito.equals("B")){
            System.out.println("Ótimo");
        } else if(conceito.equals("C")){
            System.out.println("Bom");
        } else if(conceito.equals("D")){
            System.out.println("Regular");
        } else if(conceito.equals("E")){
            System.out.println("Ruim");
        } else if(conceito.equals("F")){
            System.out.println("Nos vemos de novo ano que vem");
        } else {
            System.out.println("Conceito Inválido");
        }
         */

        switch(conceito){
            case "A" -> System.out.println("Excelente");
            case "B" -> System.out.println("Ótimo");
            case "C" -> System.out.println("Bom");
            case "D" -> System.out.println("Regular");
            case "E" -> System.out.println("Ruim");
            case "F" -> System.out.println("Nos vemos de novo ano que vem");
            default -> System.out.println("Conceito Inválido");
        }


    }
}
