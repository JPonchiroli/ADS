package ordenacao;

public class Ordenacao {

    public static void main(String[] args) {

        int meuVetor[] = {1, 5, 7, 56, 8, 61, 52, 29, 45, 21, 4, 9, 51, 6};

        System.out.println("Iniciando...");
        for (int i = 0; i < meuVetor.length; i++) {
            System.out.print(meuVetor[i] + " ");
        }

        Ordenacao.quickSort(meuVetor);

        System.out.println("\n Após o processamento...");
        for (int i = 0; i < meuVetor.length; i++) {
            System.out.print(meuVetor[i] + " ");
        }
    }

    public static void bubbleSortIterativoV1(int[] vetor) {
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

    public static void bubbleSortIterativoV2(int[] vetor) {
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

    public static void bubbleSortRecursivo(int[] vetor) {
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

    public static void insertionSort(int[] vetor) {
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

    public static void selectionSort(int[] vetor) {
        int n = vetor.length;;

        for (int i = 0; i < (n - 1); i++) {
            int min = i;
            for (int j = (i + 1); j < n; j++) {
                if (vetor[j] < vetor[min]) {
                    min = j;
                }
            }

            if (i != min) {
                int temp = vetor[i];
                vetor[i] = vetor[min];
                vetor[min] = temp;
            }
        }
    }

    public static void quickSort(int[] vetor) {
        int n = vetor.length;
        quickSortRec(vetor, 0, n - 1);
    }

    private static void quickSortRec(int vetor[], int a, int b) {

        if (a >= b) {
            return;
        }

        int pivo = particionar(vetor, a, b);
        quickSortRec(vetor, a, pivo - 1);
        quickSortRec(vetor, pivo + 1, b);
    }

    public static int particionar(int vetor[], int a, int b) {
        int pivo = vetor[a];

        while (a < b) {
            while (vetor[a] < pivo) {
                a = a + 1;
            }

            while (vetor[b] > pivo) {
                b = b - 1;
            }

            int temp = vetor[a];
            vetor[a] = vetor[b];
            vetor[b] = temp;
        }

        return a;
    }

}
