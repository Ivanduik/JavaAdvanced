package hw1.t3;

public class Car implements Comparable<Car> {
    int speed;
    int price;
    String model;
    String color;

    Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return this.model + " " + this.color + " " + this.speed + " " + this.price;
    }

    @Override
    public int compareTo(Car o) {
        int temp = this.speed - o.speed;   // int temp = this.speed - o.speed;
        if (temp == 0) {
            if ((this.price - o.price) == 0) {
                if (this.model.compareTo(o.model) == 0) {
                    if (this.color.compareTo(o.color) != 0) {
                        return this.color.compareTo(o.color);
                    } else return temp;
                } else return this.model.compareTo(o.model);
            } else return this.price - o.price;
        } else {
            return temp;
        }

    }

}