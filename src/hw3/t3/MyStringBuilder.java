package hw3.t3;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    public StringBuilder subStringsRegex() {
        StringBuilder tmp = new StringBuilder();
        int sizeLine = str.length() / 2;
        Pattern regex = Pattern.compile("(.{" + sizeLine + "}\\w* )(.*)");
        Matcher matcher = regex.matcher(str);
        if (matcher.matches())
            return tmp.append(matcher.group(1)).append("\n").append(matcher.group(2));
        else return null;
    }

    public StringBuilder getStr() {
        return str;
    }
}
