package aula03;

public class ListaComEncad {

    private NoLista first;
    private NoLista last;
    private int counter;

    public ListaComEncad(){
        first = null;
        last = null;
        counter = 0;
    }

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

    public void add(int index, Integer element) throws ArrayIndexOutOfBoundsException{
        if (index < 0 || index >= counter) {
            throw new ArrayIndexOutOfBoundsException();
        }

        NoLista novo = new NoLista(element, null);
        if (index == 0){
            novo.setNext(first);
            first = novo;
        } else if (index == counter) {
            last.setNext(novo);
            last = novo;
        } else {
            NoLista aux = first;
            for (int i = 0; i < index - 1; i++) {
                aux = aux.getNext();
            }
            novo.setNext(aux.getNext());
            aux.setNext(novo);
        }
        counter++;
    }

    public Integer remove(int index) throws ArrayIndexOutOfBoundsException{
        if (index < 0 || index >= counter) {
            throw new ArrayIndexOutOfBoundsException();
        }

        Integer info = null;

        if (index == 0) {
            info = first.getInfo();
            first = first.getNext();
        } else {
            NoLista aux = first;
            NoLista ant = null;
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

    public boolean removeFirst(Integer element) throws ArrayIndexOutOfBoundsException{
        NoLista aux = first;
        NoLista ant = null;
        int i = 0;
        boolean removed = false;

        while (aux != null && removed == false) {
            if (aux.getInfo().equals(element)) {
                if (i == 0) {
                    first = first.getNext();
                } else if (i == counter - 1){
                    ant.setNext(null);
                    last = ant;
                } else {
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

    public Integer get(int index) throws ArrayIndexOutOfBoundsException{
        if (index < 0 || index >= counter) {
            throw new ArrayIndexOutOfBoundsException();
        }

        NoLista aux = first;
        for (int i = 0; i < index; i++) {
            aux = aux.getNext();
        }

        return aux.getInfo();
    }

    public void clear() {
        first = null;
        last = null;
        counter = 0;
    }

    public Integer set(int index, Integer element) throws ArrayIndexOutOfBoundsException{
        if (index < 0 || index >= counter) {
            throw new ArrayIndexOutOfBoundsException();
        }

        NoLista aux = first;
        for (int i = 0; i < index; i++) {
            aux = aux.getNext();
        }
        Integer toReturn = aux.getInfo();
        aux.setInfo(element);

        return toReturn;
    }

    public int size() { return counter;}

    public boolean isEmpty() {return  (counter == 0);}

    public boolean contains(Integer element) { return (indexOf(element) != -1); }

    public int indexOf(Integer element) {
        int index = 0;

        NoLista aux = first;
        while(aux != null) {
            if (aux.getInfo().equals(element)) {
                return index;
            }
            aux = aux.getNext();
            index++;
        }
        return -1;
    }

    public int lastIndexOf(Integer element) {
        int index = 0;
        int lastIndex = -1;

        NoLista aux = first;
        while(aux != null) {
            if (aux.getInfo().equals(element)) {
                lastIndex = index;
            }
            aux = aux.getNext();
            index++;
        }
        return lastIndex;
    }

    public Integer[] toArray() {
        Integer[] array = new Integer[counter];

        NoLista aux = first;

        for (int i = 0; i < counter; i++) {
            array[i] = aux.getInfo();
            aux = aux.getNext();
        }

        return array;
    }

    public String toString() {
        String myarray1 = "[";
        NoLista aux = first;
        while(aux != null) {
            myarray1 += aux.getInfo();
            if (aux.getNext() != null) {
                myarray1 += ", ";
            }
            aux = aux.getNext();
        }
        myarray1 += "]";

        return  myarray1;
    }

}
