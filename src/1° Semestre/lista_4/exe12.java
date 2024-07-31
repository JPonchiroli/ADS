import java.util.Scanner;
public class exe12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		double vlrAnt, vlrAtual, diferenca = 0;
		boolean PA = true;
		
		  System.out.println("Digite os 9 valores da sequência:");
		  vlrAnt = s.nextDouble();
	        
	        for (int i = 1; i < 9; i++) {
	        	vlrAtual = s.nextDouble();

	            if (i == 1) {
	                diferenca = vlrAtual - vlrAnt;
	            } else {
	                if (vlrAtual - vlrAnt != diferenca) {
	                	PA = false;
	                    break;
	                }
	            }

	            vlrAnt = vlrAtual;
	        }

	        if (PA) {
	            System.out.println("A sequência representa uma progressão aritmética.");
	        } else {
	            System.out.println("A sequência não representa uma progressão aritmética.");
	        }
	}

}
