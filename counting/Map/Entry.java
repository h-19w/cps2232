package counting.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//hadassah //lab 6
public class Entry {
    public static void main(String[]args) {
        Map<String, Integer> hmap = new HashMap<>();
        String sentence = "the lazy dog jumped over the cat when the lazy cat wanted to jump.";

        String[] words = sentence.toLowerCase().split(" ");

        for (String word : words) {
            if (hmap.containsKey(word)) {
                hmap.put(word, hmap.get(word) + 1);
            } else
                hmap.put(word, 1);
        }
        Set<Map.Entry<String, Integer>> keyset = hmap.entrySet();
        System.out.println("MapEntry<K, V> : ");
        for(Map.Entry<String, Integer> me: keyset){
            System.out.println(me.getKey() + "\t: "+ me.getValue());
        }
    }
}
