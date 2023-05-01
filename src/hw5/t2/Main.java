package hw5.t2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

public class Main {
    private static void showInfo(Member[] tmp) {

        for (Member mem : tmp) {
            if (mem.getDeclaringClass() == Object.class)
                continue;
            String inf = mem.toString();
            System.out.print("   ");
            System.out.println(inf);
        }
    }
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String className;
        Class<?> classInfo;
        System.out.println("Input Class name (Enter - java.io.InputStreamReader):");
        try {
            className = reader.readLine();
            if (className.length() == 0) className = "java.io.InputStreamReader";
            try {
                classInfo = Class.forName(className);
                System.out.println(classInfo);
                System.out.println("Class name : " + classInfo.getSimpleName());
                System.out.println("Constructors : ");
                showInfo(classInfo.getConstructors());
                System.out.println("Fields : ");
                showInfo(classInfo.getFields());
                System.out.println("Methods : ");
                showInfo(classInfo.getMethods());
            } catch (ClassNotFoundException e) {
                System.out.println("No Class name.");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
