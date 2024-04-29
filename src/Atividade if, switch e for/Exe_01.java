import java.util.Scanner;

public class Exe_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String letra;

        System.out.println("Informe uma letra");
        letra = s.next();

        /*
        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
            System.out.println("Vogal");
        } else{
            System.out.println("Consoante ou Letra Inválida");
        }
        */

        switch (letra){
            case "a", "e", "i", "o", "u" -> System.out.println("Vogal");
            default -> System.out.println("Consoante ou Letra Inválida");

        }


    }
}