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

    public Integer remove(int index) { return 0;}
    public boolean removeFirst(Integer element) { return false;}

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

    public int indexOf(Integer element) { return 0;}

    public int lastIndexOf(Integer element) {return 0;}
    public Integer[] toArray() { return new Integer[0];}

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
