package Hashing;

// hadassah // lab1
public class hashcode {
    public static void main(String[]args){
        System.out.println("a".hashCode()=="b".hashCode());
        System.out.println("a".hashCode());
        System.out.println("?".hashCode());
        System.out.println("8".hashCode());

        int x = (int)"89".hashCode(); //boxing
        System.out.println(x);

        System.out.println("lazy".hashCode());//lab 2
//        System.out.println( % );

    }
}
