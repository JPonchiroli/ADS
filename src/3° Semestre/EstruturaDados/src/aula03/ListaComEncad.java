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
            this.first = temp;
        } else {
            this.last.setNext(temp);
        }
        this.last = temp;
        counter++;
    }

    public void add(int index, Integer element) throws ArrayIndexOutOfBoundsException{
        if (index < 0 || index >= counter) {
            throw new ArrayIndexOutOfBoundsException();
        }



    }
    public Integer remove(int index) { return 0;}
    public boolean removeFirst(Integer element) { return false;}
    public Integer get(int index) { return 0;}
    public void clear() {}
    public Integer set(int index, Integer element) { return 0;}
    public int size() { return 0;}
    public boolean isEmpty() {return false;}
    public boolean contains(Integer element) { return false;}
    public int indexOf(Integer element) { return 0;}
    public int lastIndexOf(Integer element) {return 0;}
    public Integer[] toArray() { return new Integer[0];}
    public String toString() { return "";}

}
