package ADTs.linkedlist;

import java.util.Collection;
import java.util.ArrayList;

public class ForEach {
//lab6
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Collection<String> collection = new ArrayList<>();
        collection.add("new York");
        collection.add("Sydney");
        collection.add("Johore Bahru");
        collection.add("hadassah");

        collection.forEach(e -> System.out.print(e.toUpperCase() + " "));
    }

}
