import java.util.Scanner;
public class exe10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        
		int num, atual, primeiro = 1, segundo = 1;
		
		System.out.print("Digite o número de elementos da sequência de Fibonacci a serem impressos: ");
        num = s.nextInt();
        
        System.out.println("\nSequência de Fibonacci com " + num + " elementos:");
        System.out.print(primeiro + " " + segundo + " ");
        for (int i = 2; i < num; i++) {
            atual = primeiro + segundo;
            System.out.print(atual + " ");
            primeiro = segundo;
            segundo = atual;
        }

    }
}


