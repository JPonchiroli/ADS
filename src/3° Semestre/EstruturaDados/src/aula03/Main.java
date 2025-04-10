package aula03;

public class Main {
    public static void main(String[] args) {
        ListaComArray lista = new ListaComArray();

        for (int i = 0; i < 8; i++) {
            lista.add(i);
            System.out.println(lista);
        }
        /*
        lista.add(0, 99);
        System.out.println(lista);
        lista.add(9, 101);
        System.out.println(lista);
        lista.add(9, 555);
        System.out.println(lista); */

        lista.remove(0);
        System.out.println(lista);

    }
}
