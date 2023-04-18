package hw1.t2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Interface ");
        myList.add("Iterators ");
        myList.add("allow ");
        myList.add("the ");
        myList.add("caller ");
        myList.add("to ");
        myList.add("remove ");
        myList.add("elements ");
        myList.add("from ");
        myList.add("the ");
        myList.add("underlying ");
        myList.add("collection ");
        myList.add("during ");
        myList.add("the ");
        myList.add("iteration ");
        myList.add("with ");
        myList.add("well-");
        myList.add("defined ");
        myList.add("semantics.\n");
        Iterator<String> myIterator = myList.iterator();
        while (myIterator.hasNext()) { //тут говорит, что лучше foreach
            System.out.print(myIterator.next());
        }
        for (String s : myList) {
            System.out.print(s);
        }
    }
}
