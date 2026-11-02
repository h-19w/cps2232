package Hashing;
import java.util.Map;
import java.util.LinkedHashMap;
//hadassah // lab10
public class LinkedHashMapAccessOrder {
    public static void main(String[]args){
    Map<Integer, String> map = new LinkedHashMap<>(16, .75f, true);
    map.put(1, "ken");
    map.put(2, "eva");
    map.put(3, "bob");
    map.put(4, "lisa");
    System.out.println("Insertion order: ");
    for(String value: map.values())
        System.out.println(value);
    String val = map.get(3);
    System.out.println("key 3 is: " + val);
    map.put(2, "Jane");
    System.out.println("access order after changes: ");
    map.get(1); //last one interacted  = newest entry  = last in the list
    for(String value: map.values())
        System.out.println(value);
    }
}
