package hw2.t4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> list = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Програма визначає, яка родина (прізвище) живе у місті:");
        System.out.println("Введіть із клавіатури 5 пар слів місто призвище :");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + " родина ");
            try {
                list.put(reader.readLine(), reader.readLine());
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(list);
        System.out.println("Введить місто - ");
        try {
            System.out.println(list.get(reader.readLine()));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}