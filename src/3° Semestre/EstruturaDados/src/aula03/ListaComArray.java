package aula03;

import java.util.List;

public class ListaComArray<E> implements Lista<E> {

    private E[]           array;
    private boolean             resizable;
    private int                 initialCapacity;
    private int                 counter;
    private final static int    X = 10;

    public ListaComArray() {
        this(10);
    }

    public ListaComArray(int initialCapacity) {
        this(initialCapacity, true);
    }

    public ListaComArray(int initialCapacity, boolean resizable) {
        this.array = (E[]) new Object[initialCapacity];
        this.initialCapacity = initialCapacity;
        this.resizable = resizable;
        this.counter = 0;
    }

    @Override
    public void add(E element) {

    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public E remove(int index) throws Exception {
        return null;
    }

    @Override
    public boolean removeFirst(E element) throws Exception {
        return false;
    }

    @Override
    public E get(int index) throws Exception {
        return null;
    }

    @Override
    public E set(int index, E element) throws Exception {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(E element) {
        return false;
    }

    @Override
    public int indexOf(E element) {
        return 0;
    }

    @Override
    public int lastIndexOf(E element) {
        return 0;
    }

    @Override
    public E[] toArray() {
        return null;
    }
}
