import java.util.Scanner;
public class exe09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

        int totalPessoas = 0, faixa0a17 = 0, faixa18a35 = 0, faixa36a50 = 0, faixa51a65 = 0, faixa65mais = 0, idade = 0;

        while (true) {
            System.out.print("Digite a idade da pessoa (ou digite -1 para parar): ");
            idade = s.nextInt();

            if (idade == -1) {
                break;
            }

            totalPessoas++;

            if (idade >= 0 && idade <= 17) {
                faixa0a17++;
            } else if (idade >= 18 && idade <= 35) {
                faixa18a35++;
            } else if (idade >= 36 && idade <= 50) {
                faixa36a50++;
            } else if (idade >= 51 && idade <= 65) {
                faixa51a65++;
            } else {
                faixa65mais++;
            }
        }

        System.out.println("Percentual de pessoas por faixa etária:");
        System.out.printf("0-17 anos: %.2f%%\n", (faixa0a17 / (double) totalPessoas) * 100);
        System.out.printf("18-35 anos: %.2f%%\n", (faixa18a35 / (double) totalPessoas) * 100);
        System.out.printf("36-50 anos: %.2f%%\n", (faixa36a50 / (double) totalPessoas) * 100);
        System.out.printf("51-65 anos: %.2f%%\n", (faixa51a65 / (double) totalPessoas) * 100);
        System.out.printf("65+ anos: %.2f%%\n", (faixa65mais / (double) totalPessoas) * 100);

	}

}
