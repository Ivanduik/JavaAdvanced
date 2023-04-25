package hw2.t5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListString<T> extends ArrayList<String> {
    @Override
    public boolean add(String str) {
        if (str.equals("end"))
            return false;
        else super.add(str);
        return true;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (String s : this) str.append(s).append("\n");
        return str.toString();
    }
}
