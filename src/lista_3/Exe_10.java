import java.util.Scanner;

public class Exe_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double notas = 0, media;
        int cont = 0;

        while(cont < 10){
            System.out.println("Informe a nota da prova " + (cont + 1));
            notas += s.nextInt();
            cont++;
        }

        media = notas / 10;

        System.out.println("A média do aluno:" + media);
    }
}
