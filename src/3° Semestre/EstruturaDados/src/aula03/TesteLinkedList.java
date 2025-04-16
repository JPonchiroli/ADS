package aula03;

import java.util.LinkedList;

public class TesteLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.add(8);
        linkedList.add(2);
        linkedList.add(-1);

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
    }
}
