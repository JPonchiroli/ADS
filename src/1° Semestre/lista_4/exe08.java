import java.util.Scanner;
public class exe08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

        int soma = 0, contMaiores = 0, idade = 0;
        
        System.out.println("Digite as idades das pessoas (digite 0 para finalizar):");
        
        do {
            idade = s.nextInt();
            if (idade > 0) {
                if (idade >= 18) {
                    soma += idade;
                    contMaiores++;
                }
            } else if (idade < 0) {
                System.out.println("Idade inválida. Digite novamente.");
            }
        } while (idade != 0);
        
        if (contMaiores > 0) {
            double mediaIdades = (double) soma / contMaiores;
            System.out.println("Soma das idades das pessoas maiores de idade: " + soma);
            System.out.println("Média de idade das pessoas maiores de idade: " + mediaIdades);
        } else {
            System.out.println("Nenhuma pessoa maior de idade foi informada.");
        }
	}

}
