import java.util.Scanner;
public class exe11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		 int multiplicadorI = 0, multiplicadorF = 0, multiplicador;
		 
		 System.out.println("multiplicador: ");
		 multiplicador =s.nextInt();
		 System.out.println("multiplicador do inicio: ");
		 multiplicadorI =s.nextInt();
		 System.out.println("multiplicador do fim: ");
		 multiplicadorF =s.nextInt();

	       for (int i = multiplicadorF; i >= multiplicadorI; i--){
	            int conta = i * multiplicador;
	            System.out.println(i + " X " + multiplicador + " = " + conta);
	        }
	}

}
