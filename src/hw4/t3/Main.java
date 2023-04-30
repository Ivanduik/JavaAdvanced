package hw4.t3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        MyDate myDate = new MyDate();
        System.out.println("Input your date of birthday format : dd-MM-yyyy:");
        String inputDateStr = "04-12-1982";
        try {
            inputDateStr = reader.readLine();
            try {
                System.out.printf("You are %d years old, %d months, %d days, %d hours, %d minutes, %d seconds.",
                        myDate.dateDiff(inputDateStr).get(Calendar.YEAR),
                        myDate.dateDiff(inputDateStr).get(Calendar.MONTH),
                        myDate.dateDiff(inputDateStr).get(Calendar.DATE),
                        myDate.dateDiff(inputDateStr).get(Calendar.HOUR),
                        myDate.dateDiff(inputDateStr).get(Calendar.MINUTE),
                        myDate.dateDiff(inputDateStr).get(Calendar.SECOND)
                );
            } catch (ParseException e) {
                System.out.println(e.getMessage());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
