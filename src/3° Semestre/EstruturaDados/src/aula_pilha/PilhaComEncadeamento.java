package aula_pilha;

import java.util.EmptyStackException;

public class PilhaComEncadeamento {
    private int counter;                     // Contador de elementos
    private NoLista topIndex;                    // Índice do topo da pilha

    // Construtor
    public PilhaComEncadeamento() {
        counter = 0;
        topIndex = null;
    }

    // Adiciona um elemento no topo da pilha
    public void push(Integer element) {
        NoLista node = new NoLista(null, null);
        node.setInfo(element);

        if (topIndex != null) {
            node.setNext(topIndex);
        }

        this.topIndex = node;
        counter++;
    }

    // Remove e retorna o elemento do topo
    public Integer pop() {
        if (counter == 0) {
            throw new EmptyStackException();
        }

        Integer info = topIndex.getInfo();
        topIndex = topIndex.getNext();
        counter --;

        return info;
    }

    // Retorna o elemento do topo sem remover
    public Integer top() {
        if (counter == 0) {
            throw new EmptyStackException();
        }

        Integer info = topIndex.getInfo();
        return info;
    }

    // Limpa a pilha
    public void clear() {
        counter = 0;
        topIndex = null;
    }

    // Verifica se a pilha está vazia
    public boolean isEmpty() {
        return (counter == 0);
    }

    // Retorna o número de elementos na pilha
    public int size() {
        return counter;
    }

    // Retorna uma representação da pilha como string
    @Override
    public String toString() {
        String myarray1 = "TOP [";
        NoLista aux = topIndex;
        while (aux != null) {
            myarray1 += aux.getInfo();

            if (aux. getNext() != null) {
                myarray1 += ", ";
            }

            aux = aux.getNext();
        }
        myarray1 += "]";
        return myarray1;
    }
}

