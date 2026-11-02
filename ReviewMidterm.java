import java.util.*;

public class ReviewMidterm{
    public static void print(Object[] list){ //qn 22
        for(int i =0; i<list.length; i++){
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[]args){
        //qn 22
        Object[] mixedArray = { "Hello", 100, 5.5, true };
        print(mixedArray);

        //qn 29
        Object o1 = 1011;
        Object o2 = 1011;
        System.out.println(o1.equals(o2));
        System.out.println(o1.hashCode() == o2.hashCode());

        //qn 30 + qn 28
        Set<Integer> s1 = new HashSet<>();
        s1.add(1);
        s1.add(2);
        s1.add(5);
        Set<Integer> s2 = new HashSet<>();
        s1.add(2);
        s1.add(3);
        s1.add(6);
        s1.addAll(s2);
        System.out.println(s1);
        //28
        System.out.println(s1.iterator());





    }
}
