package hw3.t4;

import java.io.*;

public class Main {
    public static void main(String[] args) {
BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        try {
            File file = new File("src\\hw3\\t4\\main.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            System.out.println("Input line");
            bw.append(reader.readLine());
            bw.flush();
            bw.close();
            System.out.println("Data successfully appended at the end of file");
        } catch (IOException e) {
            System.out.println("Exception occurred: " + e.getMessage());

        }
    }
}

