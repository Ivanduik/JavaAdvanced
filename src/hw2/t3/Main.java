package hw2.t3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader readerInteger = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть із клавіатури число N");
        int inInt;

        while (true) {
            try {
                inInt = readerInteger.read();
            } catch (Exception e) {
                System.out.println("Введено не ціле число!!!");
            }
        }

    }

}
