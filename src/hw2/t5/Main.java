package hw2.t5;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ввeдить з клавіатури рядки, кінець вв оду 'end':");
        List<String> list = new ListString<>();
        String str = "";
        while (list.add(str)) {
            try {
                str = reader.readLine();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(list);
    }

}
