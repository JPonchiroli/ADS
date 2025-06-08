package ordenacao;

import java.util.Arrays;
import java.util.Random;

public class Aprofundamento_01 {

    public static void main(String[] args) {
        int[] smallArray = generateRandomArray(10);
        int[] mediumArray = generateRandomArray(1000);
        int[] largeArray = generateRandomArray(10000);
        int[] nearlySortedArray = generateNearlySortedArray(1000);

        System.out.println("=== TESTE COM ARRAY PEQUENO (10 elementos) ===");
        compareSorts(Arrays.copyOf(smallArray, smallArray.length));

        System.out.println("\n=== TESTE COM ARRAY MÉDIO (1.000 elementos) ===");
        compareSorts(Arrays.copyOf(mediumArray, mediumArray.length));

        System.out.println("\n=== TESTE COM ARRAY GRANDE (10.000 elementos) ===");
        compareSorts(Arrays.copyOf(largeArray, largeArray.length));

        System.out.println("\n=== TESTE COM ARRAY QUASE ORDENADO (1.000 elementos) ===");
        compareSorts(Arrays.copyOf(nearlySortedArray, nearlySortedArray.length));

        System.out.println("\n=== TESTE COM MÚLTIPLOS TAMANHOS ===");
        testMultipleSizes();
    }

    public static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(10000);
        }
        return array;
    }

    public static int[] generateNearlySortedArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }

        Random random = new Random();
        for (int i = 0; i < size/10; i++) {
            int index1 = random.nextInt(size);
            int index2 = random.nextInt(size);
            swap(array, index1, index2);
        }
        return array;
    }

    public static long bubbleSort(int[] array) {
        long startTime = System.nanoTime();
        int n = array.length;
        boolean swapped;

        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    swapped = true;
                }
            }
            n--;
        } while (swapped);

        return System.nanoTime() - startTime;
    }

    public static long insertionSort(int[] array) {
        long startTime = System.nanoTime();
        boolean noSwaps = true;

        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;

            if (noSwaps && array[j] <= current) {
                continue;
            }

            noSwaps = true;

            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j--;
                noSwaps = false;
            }
            array[j + 1] = current;
        }

        return System.nanoTime() - startTime;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void compareSorts(int[] array) {
        int[] arrayForBubble = Arrays.copyOf(array, array.length);
        int[] arrayForInsertion = Arrays.copyOf(array, array.length);

        long bubbleTime = bubbleSort(arrayForBubble);
        System.out.printf("Bubble Sort:    %,d ns | Array ordenado: %s\n",
                bubbleTime, isSorted(arrayForBubble) ? "Sim" : "Não");

        long insertionTime = insertionSort(arrayForInsertion);
        System.out.printf("Insertion Sort: %,d ns | Array ordenado: %s\n",
                insertionTime, isSorted(arrayForInsertion) ? "Sim" : "Não");

        long difference = Math.abs(bubbleTime - insertionTime);
        System.out.printf("Diferença:      %,d ns | Mais rápido: %s\n\n",
                difference, bubbleTime < insertionTime ? "Bubble Sort" : "Insertion Sort");
    }

    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void testMultipleSizes() {
        int[] sizes = {10, 50, 100, 500, 1000, 2000, 5000, 10000};

        System.out.println("Tamanho | Bubble Sort (ns) | Insertion Sort (ns) | Diferença | Mais rápido");
        System.out.println("-----------------------------------------------------------------------");

        for (int size : sizes) {
            int[] array = generateRandomArray(size);
            int[] arrayForBubble = Arrays.copyOf(array, array.length);
            int[] arrayForInsertion = Arrays.copyOf(array, array.length);

            long bubbleTime = bubbleSort(arrayForBubble);
            long insertionTime = insertionSort(arrayForInsertion);

            System.out.printf("%,6d | %,15d | %,18d | %,9d | %s\n",
                    size, bubbleTime, insertionTime,
                    Math.abs(bubbleTime - insertionTime),
                    bubbleTime < insertionTime ? "Bubble" : "Insertion");
        }
    }
}
