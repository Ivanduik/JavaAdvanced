package hw3.t3;

import java.util.ArrayList;
import java.util.List;

public class MyStringBuilder {
    private StringBuilder str = new StringBuilder();

    public MyStringBuilder(String str) {
        this.str = new StringBuilder(str);
    }

    public StringBuilder subStrings() {
        StringBuilder tmp = new StringBuilder();
        int sizeLine = str.length() / 2;
        while (true) {   // если середина не пробел, то двигаемся до следующего пробела, чтобы не переносить слово
            if (str.charAt(sizeLine) != ' ') sizeLine++;
            else break;
        }
        return tmp.append(str.substring(0, sizeLine)).append("\n").append(str.substring(sizeLine));
    }

    public StringBuilder getStr() {
        return str;
    }
}
