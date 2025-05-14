package aula_pilha;

public class PilhaComArray {

    private static final int X = 10;         // Capacidade máxima da pilha
    private Integer[] array;                 // Vetor que armazena os elementos
    private int counter;                     // Contador de elementos
    private int topIndex;                    // Índice do topo da pilha

    // Construtor
    public PilhaComArray() {
        array = new Integer[X];
        counter = 0;
        topIndex = -1;
    }

    // Adiciona um elemento no topo da pilha
    public void push(Integer value) {
        if (counter >= X) {
            throw new StackOverflowError("Pilha cheia.");
        }
        topIndex++;
        array[topIndex] = value;
        counter++;
    }

    // Remove e retorna o elemento do topo
    public Integer pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Pilha vazia.");
        }
        Integer value = array[topIndex];
        array[topIndex] = null;  // Limpa a referência
        topIndex--;
        counter--;
        return value;
    }

    // Retorna o elemento do topo sem remover
    public Integer top() {
        if (isEmpty()) {
            throw new IllegalStateException("Pilha vazia.");
        }
        return array[topIndex];
    }

    // Limpa a pilha
    public void clear() {
        for (int i = 0; i < counter; i++) {
            array[i] = null;
        }
        counter = 0;
        topIndex = -1;
    }

    // Verifica se a pilha está vazia
    public boolean isEmpty() {
        return counter == 0;
    }

    // Retorna o número de elementos na pilha
    public int size() {
        return counter;
    }

    // Retorna uma representação da pilha como string
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = topIndex; i >= 0; i--) {
            sb.append(array[i]);
            if (i > 0) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}

