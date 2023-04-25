package hw2.t3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int n;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть із клавіатури ціле число N");
        while (true)
            try {
                n = Integer.parseInt(reader.readLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Введено не ціле значення !!! " + e.getMessage());
            }
        MinLinkedList<Integer> list = new MinLinkedList<>();
        list.getIntegerList(n);
        System.out.println("LinkedList n елементів " + list.getLinkedList());
        System.out.println("Мінімальне  - " + (list.getMinimum()));
    }
}
