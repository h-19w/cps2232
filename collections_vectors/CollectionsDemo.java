package collections_vectors;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;
//hadassah // lab 1
public class CollectionsDemo {
    public static void main(String[]args){
        List<String> list = Arrays.asList("red", "blue", "green");
        Collections.sort(list);
        System.out.println(list);

        List<String> list2 = Arrays.asList("yellow", "blue", "green");
        Collections.sort(list2, Collections.reverseOrder());
        System.out.println(list2);
    }

}
