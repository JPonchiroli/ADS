import java.util.Scanner;

public class Exe_17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int escolhaUsuario, tamanhoLinha, tamanhoLinhaReduzida = 0;

        System.out.println("Informe se deseja 1- Triângulos  2- Losangos");
        escolhaUsuario = s.nextInt();

        System.out.println("Informe o tamanho da linha da figura a ser desenhada");
        tamanhoLinha = s.nextInt();

        if(escolhaUsuario == 1){
            for (int i = 1; i <= tamanhoLinha; i++){
                System.out.print("%");
            }

            System.out.println("");
            tamanhoLinhaReduzida = tamanhoLinha - 2;

            while (tamanhoLinhaReduzida > 0){
                for (int i = 1; i <= tamanhoLinhaReduzida; i++){
                    System.out.print("%");
                }
                System.out.println("");
                tamanhoLinhaReduzida -= 2;
            }
        } else if(escolhaUsuario == 2){
            for (int i = 1; i <= tamanhoLinha; i += 2) {
                System.out.print(" ".repeat((tamanhoLinha - i) / 2));
                System.out.println("%".repeat(i));
            }
            // Lower half of the diamond
            for (int i = tamanhoLinha - 2; i >= 1; i -= 2) {
                System.out.print(" ".repeat((tamanhoLinha - i) / 2));
                System.out.println("%".repeat(i));
            }
        }

    }
}
