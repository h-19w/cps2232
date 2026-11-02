package counting;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
//hadassah //lab 2 - quiz
public class Duplicatecounting_Map {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text: ");

        while (sc.hasNextLine()) {
            String str = sc.nextLine().toLowerCase().replaceAll("\\s+", "");
            char[] arr = str.toCharArray();

            for (int i = 0; i < arr.length; i++) {
                char ch = str.charAt(i);
                if (map.containsKey(ch)) {
                    map.put(ch, map.get(ch) + 1);
                } else {
                    map.put(ch, 1);
                }
            }

            map.entrySet().stream()
                    .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                    .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
        }

        sc.close();
    }
}
