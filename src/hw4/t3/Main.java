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
                myDate.setDateOfBirthday(inputDateStr);
                System.out.printf("You are %d years old, %d months, %d days, %d hours, %d minutes, %d seconds.",
                        myDate.dateDiff().get(Calendar.YEAR),
                        myDate.dateDiff().get(Calendar.MONTH),
                        myDate.dateDiff().get(Calendar.DATE),
                        myDate.dateDiff().get(Calendar.HOUR),
                        myDate.dateDiff().get(Calendar.MINUTE),
                        myDate.dateDiff().get(Calendar.SECOND)
                );
            } catch (ParseException e) {
                System.out.println(e.getMessage());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
