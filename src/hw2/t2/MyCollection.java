package hw2.t2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class MyCollection<T> extends ArrayList<T> {
    public void doubleValues() {
        ArrayList<T> tmp=new ArrayList<>();
        for (T str : this) {
            tmp.add(str);
            tmp.add(str);
        }
        addAll(0,tmp);
}

}
