package iteration;

import java.util.*;
import java.util.Iterator;

public class TestIterator {

    public static void main(String[] args) {
        // hadassah
        Collection<String> collection = new ArrayList<>();
        collection.add("new York");
        collection.add("Sydney");
        collection.add("Johore Bahru");
        collection.add("hadassah");

        Iterator <String> iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next().toUpperCase() + " ");
        }
        System.out.println();
    }

}
