package hw2.t2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) {
        MyCollection<String> myCollection = new MyCollection<>();
        String str = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть із клавіатури 5 слів:");
        for (int i=0;i<5;i++){
            System.out.println((i+1) + "слово ");            
        try {
            str = reader.readLine();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }             
        myCollection.add(str);
            }
        myCollection.doubleValues();
                System.out.println(myCollection);
    }
}
