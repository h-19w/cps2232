package ADTs.Maps;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
//hadassah //lab 8
public class MapClass {
    public static void main(String[]args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Jane");
        map.put(2, "John");
        map.put(3, "Eve");
        map.put(4, "Jane"); //duplicate values but not keys

        System.out.println("initial map: " + map);
        System.out.println("output from lambda expression: ");
        map.forEach((K, V) -> System.out.println(K + ", " + V + " "));
        System.out.println("keyset: " + map.keySet());
        System.out.println("values: " + map.values());
        System.out.println("contains key 5: " + map.containsKey(5));

        System.out.println("output from Map.Entry<K, V>: ");
        Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();

        while (itr.hasNext()) {
            Map.Entry<Integer, String> e = itr.next();
            System.out.println("" + e.getKey() + ", " + e.getValue());
        }

    }
}
