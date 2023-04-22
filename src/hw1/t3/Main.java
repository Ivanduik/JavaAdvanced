package hw1.t3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car(190, 8000, "BMW", "White");
        Car c2 = new Car(190, 8000, "Mercedes", "Red");
        Car c3 = new Car(190, 8000, "Mercedes", "Red");
        Car c4 = new Car(190, 2000, "Opel", "Black");
        Car c5 = new Car(185, 10000, "Mercedes", "White");
        Car c6 = new Car(190, 8000, "BMW", "White");
        Car c7 = new Car(190, 8000, "Mercedes", "Red");
        Car c8 = new Car(190, 8000, "Mercedes", "Red");
        Car c9 = new Car(190, 2000, "Opel", "Black");
        Car c10 = new Car(185, 10000, "Mercedes", "White");
        Car[] c = {c1, c2, c3, c4, c5,c6,c7,c8,c9,c10};
        Arrays.sort(c);
        for (Car temp : c) {
            System.out.println(temp);
        }
        for (int i=0; i<c.length;i++){
            for (int j=i+1;j<c.length-1;j++)
                System.out.println(c[i]+" compareTo "+c[j]+" = "+c[i].compareTo(c[j]));
        }
    }
}
