import java.util.Scanner;
public class exe07 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int soma = 0, num = 0;
        boolean continuar = true;
        
        System.out.println("Digite os números (digite 0 para parar):");
        
        while (continuar) {
        num = s.nextInt();
        if (num != 0) {
            soma += num;
        } else {
          continuar = false;
        }
        }
  
        System.out.println("A soma dos números é: " + soma);

		}
	}
