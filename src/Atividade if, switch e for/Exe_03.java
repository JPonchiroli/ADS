import java.util.Scanner;

public class Exe_03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int codigo;

        System.out.println("Informe o código do produto");
        codigo = s.nextInt();

        /*
        if(codigo == 1){
            System.out.println("Alimento não-pericível");
        } else if(codigo == 2){
            System.out.println("Alimento pericível");
        } else if(codigo == 3){
            System.out.println("Vestuário");
        } else if(codigo == 4){
            System.out.println("Limpeza");
        } else {
            System.out.println("Código Inválido");
        }
         */

        switch (codigo){
            case 1 -> System.out.println("Alimento não-pericível");
            case 2 -> System.out.println("Alimento pericível");
            case 3 -> System.out.println("Vestuário");
            case 4 -> System.out.println("Limpeza");
            default -> System.out.println("Código Inválido");

        }
    }
}
