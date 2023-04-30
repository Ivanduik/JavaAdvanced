package hw4.t2;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder str = new StringBuilder();
        File file = new File("src\\hw4\\t2\\java.txt");
        if (!file.exists()) {
            System.out.println("File not found !!!");
        } else {
            FileInputStream fileIn = new FileInputStream("src\\hw4\\t2\\java.txt");
            FileOutputStream fileOut = new FileOutputStream("src\\hw4\\t2\\java_desh.txt");
            InputStreamReader inputStreamReader = new InputStreamReader(fileIn);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOut);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            int ch;
            while ((ch = bufferedReader.read()) != -1) {
                str.append((char) ch);
            }
            bufferedReader.close();
            Pattern regex = Pattern.compile("\\s+та+\\s|\\s+в+\\s|\\s+з+\\s|\\s+у+\\s|\\s+У+\\s|\\s+б+\\s|\\s+із+\\s");
            Matcher matcher = regex.matcher(str);
            if (matcher.find()) {
                System.out.println(matcher.replaceAll(" java "));
                bufferedWriter.write(matcher.replaceAll(" java "));
                bufferedWriter.flush();
                bufferedWriter.close();
            }
        }
    }
}
