package aula03.com_generalizacao;

import aula03.Lista;
import aula03.NoLista;

public class ListaComEncad<E> implements Lista<E> {

    private NoLista<E> first;
    private NoLista<E> last;
    private int     counter;

    public ListaComEncad() {

        this.first   = null;
        this.last    = null;
        this.counter = 0;
    }

    public void add(E element) {

        NoLista<E> node = new NoLista<E>(element, null);

        if (first == null) {
            this.first = node;
        } else {
            this.last.setNext(node);
        }

        this.last = node;
        counter++;
    }
    public void add(int index, E element) {

        if (index < 0 || index > counter) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + counter);
        }

        NoLista<E> novo = new NoLista<E>(element, null);

        if (index == 0) {
            // adicionando na primeira posição
            novo.setNext(first);
            first = novo;
        } else if (index == counter) {
            // adicionando na última posição
            last.setNext(novo);
            last = novo;
        } else {
            // adicionando em outras posições
            NoLista<E> aux = first;
            for (int i = 0; i < index-1; i++) {
                aux = aux.getNext();
            }
            novo.setNext(aux.getNext());
            aux.setNext(novo);

        }

        counter++;
    }
    public E remove(int index) {

        if (index < 0 || index >= counter) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + counter);
        }

        E info = null;

        if (index == 0) {
            // removendo da primeira posição
            info = first.getInfo();
            first = first.getNext();
        }  else {
            // removendo de outras posições (inclusive a última)
            NoLista<E> aux = first;
            NoLista<E> ant = null;
            for (int i = 0; i < index; i++) {
                ant = aux;
                aux = aux.getNext();
            }
            info = aux.getInfo();
            ant.setNext(aux.getNext());
        }

        counter--;
        return info;
    }
    public boolean removeFirst(E element) {

        NoLista<E> aux = first;
        NoLista<E> ant = null;
        int		i   = 0;

        boolean removed = false;

        while (aux != null && removed == false) {

            if (aux.getInfo().equals(element)) {

                if (i == 0) {
                    // 1ª posição
                    first = first.getNext();
                } else if (i == counter-1) {
                    // última posição
                    ant.setNext(null);
                    last = ant;
                } else {
                    // outras posições
                    ant.setNext(aux.getNext());
                }
                removed = true;
            }
            i++;
            ant = aux;
            aux = aux.getNext();
        }

        counter--;
        return removed;
    }
    public E get(int index) {

        if (index < 0 || index >= counter) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + counter);
        }

        NoLista<E> aux = first;

        for (int i = 0; i < index; i++) {
            aux = aux.getNext();
        }

        return aux.getInfo();
    }
    public void clear() {

        first   = null;
        last    = null;
        counter = 0;
    }
    public E set(int index, E element) {

        if (index < 0 || index >= counter) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + counter);
        }

        NoLista<E> aux = first;

        for (int i = 0; i < index; i++) {
            aux = aux.getNext();
        }

        E toReturn = aux.getInfo();
        aux.setInfo(element);

        return toReturn;
    }
    public int size() {

        return counter;
    }
    public boolean isEmpty() {

        return (counter == 0);
    }
    public boolean contains(E element) {

        return (indexOf(element) != -1);
    }
    public int indexOf(E element) {

        int index = 0;
        NoLista<E> aux = first;

        while (aux != null) {

            if(aux.getInfo().equals(element)) {
                return index;
            }
            aux = aux.getNext();
            index++;
        }

        return -1;
    }
    public int lastIndexOf(E element) {

        int index = 0;
        int last  = -1;
        NoLista<E> aux = first;

        while (aux != null) {

            if(aux.getInfo().equals(element)) {
                last = index;
            }
            aux = aux.getNext();
            index++;
        }

        return last;
    }
    public E[] toArray() {

        E[] array = (E[]) new Object[counter];

        NoLista<E> aux = first;

        for (int i = 0; i < counter; i++) {

            array[i] = aux.getInfo();
            aux = aux.getNext();
        }

        return array;
    }
    public String toString() {

        String myarray1 = "[";

        NoLista<E> aux = first;

        while (aux != null) {

            myarray1 += aux.getInfo();

            if (aux.getNext() != null) {
                myarray1 += ", ";
            }

            aux = aux.getNext();
        }
        myarray1 += "]";

        return myarray1;
    }
}