package hw2.t2;

import java.util.ArrayList;


public class MyCollection<T> extends ArrayList<T> {
    public void doubleValues() {
        ArrayList<T> tmp=new ArrayList<>();
        for (T str : this) {
            tmp.add(str);
            tmp.add(str);
        }
        clear();
        addAll(0,tmp);
}

}
