package Hashing;

import java.util.LinkedHashSet;
import java.util.Set;
// hadassah // lab1
public class LinkedHashSetDemo {
    public static void main(String[]args){
        Set<String> set = new LinkedHashSet<>();
        set.add("london");
        set.add("paris");
        set.add("new york");
        set.add("san francisco");
        set.add("beijing");
        set.add("new york");//insertion order is maintained in front

        System.out.println(set);

        for(String element :set){
            System.out.println(element.toLowerCase() + " ");
        }
    }
}
