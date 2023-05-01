package hw5.t4;

import java.lang.reflect.Field;

public class Cat {
    private final String animal;
    private final String name;
    private final int age;

    public Cat(String animal, String name, int age)  {

        this.animal = animal;
        this.name = name;
        this.age = age;
    }
    void setCat(Animal anim) throws NoSuchFieldException, IllegalAccessException {
        Class<?> animalClass=Animal.class;
        Field field = animalClass.getDeclaredField("animal");
        field.setAccessible(true);
        field.set(anim,animal);
        field = animalClass.getDeclaredField("name");
        field.setAccessible(true);
        field.set(anim,name);
        field = animalClass.getDeclaredField("age");
        field.setAccessible(true);
        field.set(anim,age);
    }
    @Override
    public String toString(){
        return  animal+" "+name+" "+age;
    }
}
