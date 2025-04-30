package aula_filas;

import aula_filas.NoLista;

import java.util.NoSuchElementException;

public class FilaComEncad implements Fila{

    private NoLista first;
    private NoLista last;
    private int counter;

    public FilaComEncad(NoLista first) {
        this.first = first;
    }

    @Override
    public void add(Integer element) {
        NoLista temp = new NoLista(element, null);
        if (counter == 0) {
            first = temp;
        } else {
            last.setNext(temp);
        }
        last = temp;
        counter++;
    }

    @Override
    public Integer remove() {
        if (counter == 0) {
            throw new NoSuchElementException();
        }

        Integer info = first.getInfo();
        first = first.getNext();
        return info;
    }

    @Override
    public void clear() {
        first = null;
        last = null;
        counter = 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() { return counter;}

    @Override
    public String toString() {
        return "FilaComEncad{" +
                "first=" + first +
                ", last=" + last +
                ", counter=" + counter +
                '}';
    }
}
