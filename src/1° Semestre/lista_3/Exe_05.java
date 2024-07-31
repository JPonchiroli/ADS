import java.util.Scanner;

public class Exe_05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num , cont = 1;

        System.out.println("Informe um número");
        num = s.nextInt();

        while(num == 0){
            System.out.println("Número Inválido");
            System.out.println("Informe outro número");
            num = s.nextInt();
        }

        while(cont <= num){
            System.out.print(cont + ", ");
            cont++;
        }


    }
}
/*
    5) Modifique o exercício anterior para aceitar somente valores maiores que 0
    para N. Caso o valor informado (para N) não seja maior que 0, deverá ser lido
    um novo valor para N.
 */