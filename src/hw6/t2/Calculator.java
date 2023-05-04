package hw6.t2;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@interface ClassInfo {
    String author();

    String date();

    String info();
}

@interface Method {
    String about();

    String returns();
}
@ClassInfo(
        author = "Victor",
        date = "15/08/2016",
        info = "Calculator, add, sub,mul,div two number"
)
public class Calculator {

    @Method(
            about = "Method add two number, args int a, int b", returns= "Return double add a and b ")
    public double add(int a, int b) {
        return a + b;
    }
    @Method(
            about = "Method sub two number, args int a, int b", returns= "Return double sub a and b ")
    public double sub(int a, int b) {
        return a - b;
    }
    @Method(
            about = "Method mul two number, args int a, int b", returns= "Return double mul a and b ")
    public double mul(int a, int b) {
        return a * b;
    }
    @Method(
            about = "Method div two number, args int a, int b", returns= "Return double div a and b ")
    public double div(int a, int b) {
        return (a - 1.0) / b;
    }

}

