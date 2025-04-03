package aula03;

public class ListaComArray {

    private Integer[]           array;
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
        this.array = new Integer[initialCapacity];
        this.initialCapacity = initialCapacity;
        this.resizable = resizable;
        this.counter = 0;
    }

    public boolean add(Integer obj) {
        if (counter == array.length) {
            if (resizable) {
                resizeArrayList();
            } else {
                return false;
            }
        }

        array[counter] = obj;
        counter++;

        return true;
    }

    public boolean add(int index, Integer obj) {
        if (index < 0 || index > counter) {
            return false;
        }

        if (counter == array.length) {
            if (resizable) {
                resizeArrayList();
            } else {
                return false;
            }
        }

        for (int i = counter; i < index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = obj;
        counter++;
        return true;
    }

    private void resizeArrayList() {
        Integer novo[] = new Integer[array.length + X];

        for (int i = 0; i < array.length; i++) {
            novo[i] = array[i];

        }

        array = novo;
    }
    public Integer remove(int index) {  return 0;}
    public boolean removeFirst(Integer element) { return false;}
    public Integer get(int index) { return 0;}
    public void clear() {}
    public Integer set(int index, Integer element) { return 0;}
    public int size() { return 0;}
    public boolean isEmpty() { return false;}
    public boolean isFull() { return false;}
    public int contains(Integer element) { return 0;}
    public int indexOf(Integer element) { return 0;}
    public int lastIndexOf(Integer element) { return 0;}
    public Integer[] toArray() { return new Integer[0];}
    public String toString(){ return "";}
}
