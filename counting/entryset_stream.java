package counting;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
//hadassah //lab 7 & 8
public class entryset_stream {
    public static void main(String[]args){
        Map<Character, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a word: ");
        while (sc.hasNextLine()){
            String str = sc.nextLine().replaceAll("\\s+", ""
                    .replaceAll("\\r\\n+", ""));
            char[] arr = str.toCharArray();

            for (int i  =0; i< arr.length; i++){
             char ch  = str.charAt(i);
             if (map.containsKey(ch))
                 map.put(ch, map.get(ch)+1);
             else
                 map.put(ch, 1);
            }
            map.entrySet().stream()
                    .sorted(Map.Entry.<Character, Integer> comparingByValue().reversed())
                    .limit(5) //.limit(10) //lab 8//
                    .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
        }
        sc.close();
    }
}
