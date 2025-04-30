package aula_listas.sem_generalizacao;

public class ListaComArray_Antigo {

    private Integer[]           array;
    private boolean             resizable;
    private int                 initialCapacity;
    private int                 counter;
    private final static int    X = 10;

    public ListaComArray_Antigo() {
        this(10);
    }

    public ListaComArray_Antigo(int initialCapacity) {
        this(initialCapacity, true);
    }

    public ListaComArray_Antigo(int initialCapacity, boolean resizable) {
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

        for (int i = counter; i > index; i--) {
            array[i] = array[i - 1];
        }

        array[index] = obj;
        counter++;
        return true;
    }

    private void resizeArrayList() {
        Integer novo[] = new Integer[array.length + X];

        System.arraycopy(array, 0, novo, 0, counter);

        array = novo;
    }

    public Integer remove(int index) throws ArrayIndexOutOfBoundsException{
        if (index < 0 || index >= counter) {
            throw new ArrayIndexOutOfBoundsException();
        }

        Integer temp = get(index);

        for (int i = (counter - 1); i >= index; i--) {
            array[i - 1] = array[i];
        }

        counter--;

        return temp;
    }

    public boolean removeFirst(Integer element) {
        int num = indexOf(element);
        remove(num);
        return true;
    }

    public Integer get(int index) throws ArrayIndexOutOfBoundsException{
        if (index < 0 || index >= counter) {
            throw new ArrayIndexOutOfBoundsException();
        }

        return array[index];
    }

    public void clear() {
        if (resizable) {
            array = new Integer[initialCapacity];
        }

        counter = 0;
    }

    public Integer set(int index, Integer element) throws ArrayIndexOutOfBoundsException{
        if (index < 0 || index >= counter) {
            throw new ArrayIndexOutOfBoundsException();
        }

        Integer temp = get(index);
        array[index] = element;

        return  temp;
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

    public boolean contains(Integer element) {
        return indexOf(element) != -1;
    }

    public int indexOf(Integer element) {
        for (int i = 0; i < counter; i++) {
            if (array[i] == element) {
                return  i;
            }
        }

        return -1;
    }

    public int lastIndexOf(Integer element) {
        for (int i = (counter - 1); i >= 0; i--) {
            if (array[i] == element) {
                return  i;
            }
        }

        return -1;
    }

    public Integer[] toArray() { return new Integer[0];}

    public String toString(){
        String myarray1 = "[ ";

        for (int i = 0; i < counter; i++) {
            if (i != (counter - 1)) {
                myarray1 += array[i] + ", ";
            } else {
                myarray1 += array[i] + " ]";
            }
        }

        String myarray2 = "[";

        for (int i = 0; i < array.length; i++) {
            if (i != (array.length - 1)) {
                myarray2 += array[i] + ", ";
            } else {
                myarray2 += array[i] + " ]";
            }
        }

        return myarray1;
    }
}
