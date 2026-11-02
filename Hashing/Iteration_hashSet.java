package Hashing;

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
//hadassah //lab 4
public class Iteration_hashSet {
    public static void main(String[]args){
        Set<String> myset = new HashSet<>();
        myset.add("london");
        myset.add("new york");
        myset.add("kiev");
        myset.add("beijing");
        myset.add("london"); //repetiton of data but no

        myset.add("paris");
        myset.add("java");
        Iterator<String> iter = myset.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
