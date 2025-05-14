package aula_filas;

public class FilaComArray {
    private static final int X = 10;
    private Integer[] array;
    private int counter;
    private int startIndex;

    public FilaComArray() {
        this.array = new Integer[X];
        this.counter = 0;
        this.startIndex = 0;
    }

    public void add(Integer value) {
        if (counter == X) {
            throw new IllegalStateException("Fila cheia");
        }
        int endIndex = (startIndex + counter) % X;
        array[endIndex] = value;
        counter++;
    }

    public Integer remove() {
        if (isEmpty()) {
            throw new IllegalStateException("Fila vazia");
        }
        Integer value = array[startIndex];
        array[startIndex] = null; // Libera a posição
        startIndex = (startIndex + 1) % X;
        counter--;
        return value;
    }

    public void clear() {
        for (int i = 0; i < X; i++) {
            array[i] = null;
        }
        counter = 0;
        startIndex = 0;
    }

    public boolean isEmpty() {
        return counter == 0;
    }

    public int size() {
        return counter;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < counter; i++) {
            int index = (startIndex + i) % X;
            sb.append(array[index]);
            if (i < counter - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
