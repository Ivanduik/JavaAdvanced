package hw3.t2;

import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        int c;
        String str = """
                Завдання 2

                Створіть файл, запишіть у нього довільні дані та закрийте файл. Потім знову відкрийте цей файл, прочитайте дані і виведіть їх на консоль.""";
        FileOutputStream fileOut = new FileOutputStream("src\\hw3\\t2\\main.txt");
        FileInputStream fileIn = new FileInputStream("src\\hw3\\t2\\main.txt");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOut);
        InputStreamReader inputStreamReader = new InputStreamReader(fileIn);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        bufferedWriter.write(str);
        bufferedWriter.flush();
        bufferedWriter.close();
        while ((c = bufferedReader.read()) != -1)
            System.out.print((char) c);
        bufferedReader.close();
        fileOut = new FileOutputStream("src\\hw3\\t2\\main1.txt");
        fileIn = new FileInputStream("src\\hw3\\t2\\main1.txt");
        fileOut.write(str.getBytes());
        fileOut.close();
        int size = fileIn.available();
        for (int i = 0; i < size; i++) {
            System.out.printf("%c", fileIn.read());//тут не складуха с с консолью идеа
        }
        fileIn.close();
    }

}
