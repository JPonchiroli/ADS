package lista_1;

import java.util.Scanner;

public class Exe_07 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int dia, mes, qntDiasPassados;
		
		System.out.println("Informe em que mês estamos(em números)");
		mes = s.nextInt();
		
		System.out.println("Informe em que dia do mês estamos");
		dia = s.nextInt();
		
		mes *= 30;
		qntDiasPassados = mes + dia;
		
		System.out.println("A quantidade de dias passados no ano foram " + qntDiasPassados + " dias");
	}
}
/*
	7. Entrar com o dia e o mês de uma data e informar quantos dias se passaram desde o início do
	ano. Esqueça a questão dos anos bissextos e considere sempre que um mês possui 30 dias.
*/