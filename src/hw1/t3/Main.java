package hw1.t3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car(190, 8000, "BMW", "White");
        Car c11 = new Car(290, 9000, "Mercedes", "Red");
        Car c12 = new Car(190, 8000, "Mercedes", "Red");
        Car c2 = new Car(190, 2000, "Opel", "Black");
        Car c3 = new Car(185, 10000, "Mercedes", "White");
        Car[] c = {c1, c11, c12, c2, c3};
        Arrays.sort(c);

        for (Car temp : c) {
            System.out.println(temp);
        }
        System.out.println("c11.compareTo(c1) - " + c11.compareTo(c1));
        System.out.println("c11.compareTo(c12) - " + c11.compareTo(c12));

    }
}
