package aula03.com_generalizacao;

import aula03.Lista;

public class ListaComArray<E> implements Lista<E> {

    private E[]			        array;
    private boolean				resizable;
    private int					initialCapacity;
    private int					counter;
    private final static int	X = 10;

    public ListaComArray() {
        this(10);
    }

    public ListaComArray(int initialCapacity) {
        this(initialCapacity, true);
    }

    private ListaComArray(int initialCapacity, boolean resizable) {
        this.initialCapacity = initialCapacity;
        this.resizable		 = resizable;
        this.counter		 = 0;
        this.array			 = (E[]) new Object[initialCapacity];
    }

    public void add(E element) {

        if (counter == array.length) {
            if (resizable) {
                resizeArrayList();
            } else {
                return;
            }
        }

        array[counter] = element;
        counter++;
    }

    public void add(int index, E element) {

        if (index < 0 || index > counter) {
            //return false;
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + counter);
        }

        if (counter == array.length) {
            if (resizable) {
                resizeArrayList();
            } else {
                return;
            }
        }

        for (int i = counter; i > index; i--) {
            array[i] = array[i-1];
        }

        array[index] = element;
        counter++;
    }

    private void resizeArrayList() {

        E novo[] = (E[]) new Object[array.length + X];

        //for(int i = 0; i < array.length; i++){
        //    novo[i] = array[i];
        //}

        System.arraycopy(array, 0, novo, 0, counter);

        array = novo;
    }

    public E remove(int index) {

        if(index < 0  || index >= counter) {
            //return null;
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + counter);
        }

        E aux = array[index];

        for (int i = index; i < (counter - 1); i++) {
            array[i] = array[i + 1];
        }

        counter--;

        return aux;
    }

    public boolean removeFirst(E element) {

        for (int i = 0; i < counter; i++) {

            if (array[i].equals(element)) {
                remove(i);
                return true;
            }
        }

        return false;
    }

    public E get(int index) {

        if (index < 0 || index >= counter) {
            //return null;
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + counter);
        }

        return array[index];
    }

    public void clear() {

        if (resizable) {
            array = (E[]) new Object[initialCapacity];
        }
        counter = 0;
    }

    public E set(int index, E element) {

        if (index < 0 || index >= counter) {
            //return null;
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + counter);
        }

        E aux = array[index];
        array[index] = element;

        return aux;
    }

    public int size() {

        return counter;
    }

    public boolean isEmpty() {

        return (counter == 0);
    }

    public boolean isFull() {

        if (!resizable) {
            return (counter == array.length);
        }

        return false;
    }

    public boolean contains(E element) {

        return (indexOf(element) != -1);
    }

    public int indexOf(E element) {

        for (int i = 0; i < counter; i++) {

            if (array[i].equals(element)) {
                return i;
            }
        }

        return -1;
    }

    public int lastIndexOf(E element) {

        for (int i = counter-1; i >=0; i--) {

            if (array[i].equals(element)) {
                return i;
            }
        }

        return -1;
    }

    public E[] toArray() {

        E[] reduzido = (E[]) new Object[counter];
        System.arraycopy(array, 0, reduzido, 0, counter);
        return reduzido;
    }

    public String toString() {
        String myarray1 = "[";
        for (int i = 0; i < counter; i++) {
            if (i != (counter-1)) {
                myarray1 += array[i] + ", ";
            } else {
                myarray1 += array[i];
            }
        }
        myarray1 += "]";

        String myarray2 = "[ ";
        for (int i = 0; i < array.length; i++) {
            if (i != (array.length-1)) {
                myarray2 += array[i] + ", ";
            } else {
                myarray2 += array[i] + " ]";
            }
        }
        return myarray1;
//		return "@@@\n" + myarray1 + "\n" + myarray2;
    }

}





