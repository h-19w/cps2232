package Hashing;

import java.util.*;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
//hadassah //lab 9

public class Hashmap {
    public static void main(String[]args){
        Map<String, Integer> hashmap = new HashMap<>();
        hashmap.put("Seth", 30);
        hashmap.put("Anderson", 31);
        hashmap.put("Lewis", 29);
        hashmap.put("Cook", 29);

        System.out.println("display series in HashMap: ");
        System.out.println(hashmap + "\n");
        Map<String, Integer> treemap = new TreeMap<>(hashmap);
        System.out.println("display entries in ascending order of key: ");
        System.out.println(treemap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Seth", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("\n The age for "+ "lewis is: "+ linkedHashMap.get("lewis"));
        System.out.println("display series in linkedHashMap: ");
        System.out.println(linkedHashMap);

        System.out.println("\nNames and ages are: ");
        treemap.forEach((name, age) -> System.out.println("name: "+ name + " | age: " + age));
    }
}
