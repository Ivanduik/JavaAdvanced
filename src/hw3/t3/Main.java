package hw3.t3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String str = "Appends a subsequence of the specified CharSequence to this sequence.";
        MyStringBuilder myStringBuilder = new MyStringBuilder(str);
        System.out.println(myStringBuilder.getStr());
        System.out.println("append(CharSequence s, int start, int end) "+myStringBuilder.subStrings());
        System.out.println("Regular expression "+myStringBuilder.subStringsRegex());
    }
}
