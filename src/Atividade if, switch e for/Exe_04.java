import java.util.Scanner;

public class Exe_04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int mes;

        System.out.println("Informe um mês");
        mes = s.nextInt();

        /*
        if(mes == 2){
            System.out.println("Numero de dias 28");
        } else if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
            System.out.println("Numero de dias 30");
        } else if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
            System.out.println("Numero de dias 31");
        }
        */

        switch(mes){
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("Numero de dias 31");
            case 2 -> System.out.println("Numero de dias 28");
            case 4, 6, 9, 11-> System.out.println("Numero de dias 30");
            default -> System.out.println("Mês Inválido");

        }
    }
}
