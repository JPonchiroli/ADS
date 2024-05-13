import java.util.Scanner;
public class exe05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int priTerm, razao, num = 0;  
		
		System.out.print("Digite o primeiro termo da PA: ");
        priTerm = s.nextInt();
        System.out.print("Digite a razão da PA: ");
        razao = s.nextInt();
        System.out.print("Digite o número de termos a serem impressos: ");
        num = s.nextInt();

        int atual = priTerm;
        for (int i = 0; i < num; i++) {
            System.out.print(atual + " ");
            atual += razao;
        }
    }

}
