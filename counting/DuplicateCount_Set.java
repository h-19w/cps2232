package counting;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
//hadassah //lab 3
public class DuplicateCount_Set {
    public static void main(String[]args){
        Map<String, Integer> hmap = new HashMap<>();
        String sentence = "the lazy dog jumped over the cat when the lazy cat wanted to jump.";

        String[] words = sentence.toLowerCase().split(" ");

        for(String word:words) {
            if (hmap.containsKey(word)) {
                hmap.put(word, hmap.get(word) + 1);
            } else
                hmap.put(word, 1);
        }
        Set<String> set = hmap.keySet();
        for(String word : set){
            if(hmap.get(word) >=1 ){
                System.out.println(word + "\t:" +hmap.get(word));
            }
        }
    }
}
