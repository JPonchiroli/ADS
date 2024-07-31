import java.util.Scanner;
public class exe13 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        
        double resultado = 0, valor;
        int opcao;
        
        while (true) {
            System.out.println("Selecione a operação:( 1. Soma  2. Subtração  3. Multiplicação  4. Divisão  5. Limpar resultado  6. Sair");
            System.out.println("Opção: ");
            opcao = s.nextInt();

            if (opcao == 6) {
                System.out.println("Encerrando a calculadora.");
                break;
            }
            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a ser somado: ");
                    valor = s.nextDouble();
                    resultado += valor;
                    break;
                case 2:
                    System.out.print("Digite o valor a ser subtraído: ");
                    valor = s.nextDouble();
                    resultado -= valor;
                    break;
                case 3:
                    System.out.print("Digite o valor a ser multiplicado: ");
                    valor = s.nextDouble();
                    resultado *= valor;
                    break;
                case 4:
                    System.out.print("Digite o valor pelo qual dividir: ");
                    valor = s.nextDouble();
                    if (valor != 0) {
                        resultado /= valor;
                    } else {
                        System.out.println("Erro: Divisão por zero!");
                    }
                    break;
                case 5:
                    resultado = 0;
                    System.out.println("Resultado limpo.");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

            System.out.println("Resultado atual: " + resultado);
        }

	}

}
