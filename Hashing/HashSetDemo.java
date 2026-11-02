package Hashing;

import java.util.HashSet;
import java.util.Set;
// hadassah // lab 5
public class HashSetDemo {
    public static void main(String[]args){
        Set<String> set = new HashSet<>();
        set.add("london");
        set.add("paris");
        set.add("new york");
        set.add("san francisco");
        set.add("beijing");
        set.add("new york");

        System.out.println(set);

        for(String s: set){
            System.out.println(s.toUpperCase() + " ");
        }
        System.out.println();
        set.forEach(e -> System.out.println(e.toLowerCase() + " "));
    }
}
