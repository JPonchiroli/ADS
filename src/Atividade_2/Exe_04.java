import java.util.Scanner;

public class Exe_04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double salarioInicial, aumento, salarioFinal = 0;

        System.out.println("Informe seu salário inicial");
        salarioInicial = s.nextDouble();

        if(salarioInicial <= 1500){
            aumento = 0.10;
            salarioFinal += salarioInicial + (salarioInicial * aumento);
            System.out.println("Salário Final: " + salarioFinal);
        }  else {
            aumento = 0.05;
            salarioFinal += salarioInicial + (salarioInicial * aumento);
            System.out.println("Salário Final: " + salarioFinal);
        }
    }
}
