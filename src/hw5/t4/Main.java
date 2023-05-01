package hw5.t4;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Animal animal = new Animal();
        System.out.println("Animal - " + animal);
        Cat c = new Cat("Cat - ", "Barsik", 5);
        System.out.println("Cat" + c);
        c.setCat(animal);
        System.out.println("Animal - " + animal);
    }
}
