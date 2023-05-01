package hw5.t3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
    private static String getModifier(int mod){
        String str = null;
        if (Modifier.isPublic(mod))
            str="public";
      if (Modifier.isPrivate(mod))
            str="private";
        if (Modifier.isAbstract(mod))
            str="abstract";
        if (Modifier.isFinal(mod))
            str="final ";
        return  str;
}
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        MyClass myClass = new MyClass("Victor", "ivictorv1982@gmail.com", "+380668024739");
        Class<?> classInfo = Class.forName("hw5.t3.MyClass");
        System.out.println("Class name - " + classInfo.getSimpleName());
        System.out.println("Constructors - ");
        Constructor<?>[] constructor = classInfo.getConstructors();
        for (Constructor<?> tmpConstructor : constructor) {
            System.out.println("    "+tmpConstructor);
        }
        System.out.println("Public fields - ");
        Field[] field = classInfo.getFields();
        for (Field tmp : field) {
            System.out.println("    "+tmp.getName()+" - "+tmp.getType().getSimpleName());
        }
        System.out.println("All fields - ");
        field = classInfo.getDeclaredFields();
        for (Field tmp : field) {
            System.out.println("    "+tmp.getName()+" - "+tmp.getType().getSimpleName());
        }
        System.out.println("All methods - ");
        Method[]  methods= classInfo.getDeclaredMethods();
        for (Method tmp : methods) {
            System.out.println("    "+getModifier(tmp.getModifiers())+" - "+tmp.getName()+" - "+tmp.getReturnType());
            for (Class<?> methPar: tmp.getParameterTypes() ){
                System.out.println("        arg - "+methPar);
            }
        }
    }
}
