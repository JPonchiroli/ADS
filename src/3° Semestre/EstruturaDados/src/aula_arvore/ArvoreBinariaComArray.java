package aula_arvore;

import java.util.Arrays;

public class ArvoreBinariaComArray {

    private int h;
    private int counter;
    private Integer[] array;

    public ArvoreBinariaComArray(int h) {
        this.h = h;
        this.counter = 0;
        this.array = new Integer[getQtdMaxNodes()];
    }

    public boolean add(Integer element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = element;
                counter++;
                return true;
            }
        }

        return false;
    }

    public boolean add(int index, Integer element) {
        if (index < 0 || index >= array.length) return false;
        if (array[index] != null) return false;

        array[index] = element;
        counter++;
        return true;
    }

    public Integer remove(int index) {
        if (index < 0 || index >= array.length || array[index] == null) return null;

        Integer removed = array[index];
        array[index] = null;
        counter--;
        return removed;
    }

    public boolean contains(Integer element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return true;
            }
        }

        return false;
    }

    public boolean isEmpty() {
        return counter == 0;
    }

    public boolean isFull() {
        return counter == array.length;
    }

    public int getHeight() {
        return (int) (Math.floor(Math.log(counter) / Math.log(2)));
    }

    public int getNodeLevel(Integer element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].equals(element)) {
                return (int) (Math.floor(Math.log(i + 1) / Math.log(2)));
            }
        }
        return -1;
    }

    public int getQtdMaxNodes() {
        return  ((int)Math.pow(2, h + 1) - 1);
    }

    public int size() {
        return counter;
    }

    public void clear() {
        counter = 0;
    }

    public String toString() {
        return Arrays.toString(array);
    }

    private StringBuilder preOrdem(int index) {
        StringBuilder sb = new StringBuilder();
        if (index < array.length && array[index] != null) {
            sb.append(array[index]).append(" ");
            sb.append(preOrdem(2 * index + 1));
            sb.append(preOrdem(2 * index + 2));
        }
        return sb;
    }

    public String toStringPreOrdem() {
        return preOrdem(0).toString().trim();
    }

    private StringBuilder inOrdem(int index) {
        StringBuilder sb = new StringBuilder();
        if (index < array.length && array[index] != null) {
            sb.append(inOrdem(2 * index + 1));
            sb.append(array[index]).append(" ");
            sb.append(inOrdem(2 * index + 2));
        }
        return sb;
    }

    public String toStringInOrdem() {
        return inOrdem(0).toString().trim();
    }

    private StringBuilder posOrdem(int index) {
        StringBuilder sb = new StringBuilder();
        if (index < array.length && array[index] != null) {
            sb.append(posOrdem(2 * index + 1));
            sb.append(posOrdem(2 * index + 2));
            sb.append(array[index]).append(" ");
        }
        return sb;
    }

    public String toStringPosOrdem() {
        return posOrdem(0).toString().trim();
    }
}
