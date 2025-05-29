package ordenacao;

public class Ordenacao {

    public static void main(String[] args) {

        int meuVetor[] = {1, 5, 7, 56, 8, 61, 52, 29, 45, 21, 4, 9, 51, 6};

        System.out.println("Iniciando...");
        for (int i = 0; i < meuVetor.length; i++) {
            System.out.print(meuVetor[i] + " ");
        }

        Ordenacao.insertionSort(meuVetor);

        System.out.println("\n Após o processamento...");
        for (int i = 0; i < meuVetor.length; i++) {
            System.out.print(meuVetor[i] + " ");
        }
    }

    public static void bubbleSortIterativoV1(int[] vetor){
        int n = vetor.length;;

        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSortIterativoV2(int[] vetor){
        int n = vetor.length;;

        for (int i = n - 1; i > 0; i--) {
            boolean troca = false;
            for (int j = 0; j < i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                    troca = true;
                }
            }
            if (!troca) return;
        }
    }

    public static void bubbleSortRecursivo(int[] vetor){
        int n = vetor.length;
        bubblesortRecAux(n, vetor);
    }

    private static void bubblesortRecAux(int n, int[] vetor) {
        boolean troca = false;
        for (int j = 0; j < n - 1; j++) {
            if (vetor[j] > vetor[j + 1]) {
                int temp = vetor[j];
                vetor[j] = vetor[j + 1];
                vetor[j + 1] = temp;
                troca = true;
            }
        }

        if (troca) bubblesortRecAux(n - 1, vetor);

    }

    public static void insertionSort(int[] vetor){
        int n = vetor.length, eleito = 0, j = 0;

        for (int i = 1; i < n; i++) {
            eleito = vetor[i];
            j = i - 1;

            while (j >= 0 && eleito < vetor[j]) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }

            vetor[j + 1] = eleito;
        }
    }
}
