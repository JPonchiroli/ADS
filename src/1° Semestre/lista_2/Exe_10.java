package lista_2;

import java.util.Scanner;

public class Exe_10 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String turno;
		
		System.out.println("Informe o turno da sua aula \n M- Matutino \n V- Vespertino \n N- Noturno");
		turno = s.next();
		
		if(turno.toLowerCase().equals("m")) {
			System.out.println("Bom dia!");
		} else if(turno.toLowerCase().equals("v")) {
			System.out.println("Boa Tarde!");
		} else if(turno.toLowerCase().equals("n")) {
			System.out.println("Boa Noite!");
		} else {
			System.out.println("Valor Inválido");
		}

	}

}
/*
	10. Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-
	Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou
	"Valor Inválido!", conforme o caso.
*/