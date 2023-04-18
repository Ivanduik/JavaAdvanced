package hw1.t3;

public class Car implements Comparable<Car> { //<Car>{
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

    // Сортируем по скорости/цене
    @Override
    public int compareTo(Car o) {    // public int compareTo(Car o) {
        if ((this.speed - o.speed) == 0) return 0;
        else if ((this.price - o.price) == 0) return 0;
        else if (this.model.compareTo(o.model) == 0) return 0;
        else if (this.color.compareTo(o.color) == 0) return 0;
        return (this.model.compareTo(o.color)
                + this.model.compareTo(o.model)
                + this.price - o.price
                + this.speed - o.speed)
                / 4; // Возвращаем среднеарифметическое разницы, на случай сортировки
    }

    // Сравнение 2-х строковых значений
    // return this.model.compareTo((Car)o).model);
}