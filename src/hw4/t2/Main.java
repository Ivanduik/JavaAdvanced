package hw4.t2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        StringBuilder str= new StringBuilder();
        try {
            File file = new File("src\\hw3\\t5\\java.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            Pattern regex = Pattern.compile("\\s+та+\\s|\\s+в+\\s|\\s+з+\\s|\\s+у+\\s|\\s+У+\\s|\\s+б+\\s|\\s+із+\\s");
            Matcher matcher = regex.matcher(str);
            matcher.replaceAll(" java ");
            if (matcher.matches());
        } catch (IOException e) {
            System.out.println("Exception occurred: " + e.getMessage());

        }

    }
}
