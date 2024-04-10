import java.util.Scanner;

public class Exe_05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double salarioInicial, anosServico, aumento, salarioFinal = 0;

        System.out.println("Informe seu salário inicial");
        salarioInicial = s.nextDouble();

        System.out.println("Informe seus tempos de serviço nesta empresa");
        anosServico = s.nextDouble();

        if(anosServico >= 15){
            aumento = 0.19;
            salarioFinal += salarioInicial + (salarioInicial * aumento);
            System.out.println("Salário Final: " + salarioFinal);
        }  else if(anosServico >= 10) {
            aumento = 0.15;
            salarioFinal += salarioInicial + (salarioInicial * aumento);
            System.out.println("Salário Final: " + salarioFinal);
        } else if(anosServico > 5){
            aumento = 0.1;
            salarioFinal += salarioInicial + (salarioInicial * aumento);
            System.out.println("Salário Final: " + salarioFinal);
        } else {
            salarioFinal += salarioInicial;
            System.out.println("Salário Final: " + salarioFinal);
        }
    }
}
