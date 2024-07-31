import java.util.Scanner;

public class Exe_02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int anoNascimento, anoAtual, idade;

        System.out.println("Informe o ano do seu nascimento");
        anoNascimento = s.nextInt();

        System.out.println("Informe o ano atual");
        anoAtual = s.nextInt();

        idade = anoAtual - anoNascimento;

        if (idade <= 12) {
            System.out.println("\n Idade: " + idade + " \nVocê é Criança");
        } else if(idade <= 17){
            System.out.println("\n Idade: " + idade + " \nVocê é Adolescente");
        } else if(idade <= 59){
            System.out.println("\n Idade: " + idade + " \nVocê é Adulto");
        } else {
            System.out.println("\n Idade: " + idade + " \nVocê é Idoso");
        }
    }
}
