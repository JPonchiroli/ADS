package ordenacao;

public class Aprofundamento_03 {

    public static void shellSort(int[] arr) {
        int n = arr.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j;

                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }

                arr[j] = temp;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] vetor = {34, 8, 64, 51, 32, 21, 5, 13};

        System.out.println("Vetor original:");
        printArray(vetor);

        shellSort(vetor);

        System.out.println("Vetor ordenado com ShellSort:");
        printArray(vetor);
    }
}
