package Hashing;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
//hadassah //lab2
public class TreeSetDemo {
    public static void main(String[] args){
        Set<String> set = new HashSet<>();
        set.add("london");
        set.add("paris");
        set.add("new york");
        set.add("san francisco");
        set.add("beijing");
        set.add("new york");

        TreeSet<String> treeSet = new TreeSet<>(set);
        System.out.println("first in TreeSet: " + treeSet.first());
        System.out.println("last in TreeSet: " + treeSet.last());
        System.out.println("headSet(\"new york\"): " + treeSet.headSet("new york"));
        System.out.println("tailSet(\"new york\"): " + treeSet.tailSet("new york"));

        System.out.println("lower(\"P\"): " + treeSet.lower("P"));
        System.out.println("higher(\"P\"): " + treeSet.higher("P"));
        System.out.println("floor(\"P\"): " + treeSet.floor("P"));
        System.out.println("ceiling(\"P\"): " + treeSet.ceiling("P"));
        System.out.println("pollFirst(): " + treeSet.pollFirst());
        System.out.println("pollLast(): " + treeSet.pollLast());
        System.out.println("New TreeSet: " + treeSet);
    }
}
