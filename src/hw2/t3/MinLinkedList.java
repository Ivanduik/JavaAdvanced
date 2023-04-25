package hw2.t3;

import java.util.LinkedList;
import java.util.ListIterator;

public class MinLinkedList<T> {
    private int n;
    private final LinkedList<Integer> linkedList = new LinkedList<>();
    public void getIntegerList(T n) {
        for (int i = 0; i < (Integer) n; i++)
            linkedList.add((int) (Math.random() * 100));
    }

    public int getMinimum() {
        int min = Integer.MAX_VALUE;
        ListIterator<Integer> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.next() < min)
                min = listIterator.previous();
        }
        return min;
    }

    public LinkedList<Integer> getLinkedList() {
        return linkedList;
    }

}
