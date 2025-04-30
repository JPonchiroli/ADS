package aula_listas;


public class NoLista<E> {

    private E info;
    private NoLista<E> next;

    public NoLista() {
        this(null, null);
    }

    public NoLista(E info, NoLista<E> next) {
        this.info = info;
        this.next = next;
    }

    public E getInfo() {
        return info;
    }

    public void setInfo(E info) {
        this.info = info;
    }

    public NoLista<E> getNext() {
        return next;
    }

    public void setNext(NoLista<E> next) {
        this.next = next;
    }
}
