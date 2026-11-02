package Hashing;

//hadassah //lab 3
public class HashcodeLongType {
    public static void main(String[]args){
        int x = 3;
        int y = 5;
        System.out.println("Bitwise x ^ y: " + (x ^ y));
        System.out.println("Bitwise x | y: " + (x | y));

        long key1 = 1234567890000000000L;
        long key2 = 1234567890000000024L;

        int hashcode1 =(int) (key1^(key1>>32));
        int hashcode2 =(int) (key2^(key2>>32));

        System.out.println("hashcode for key 1 as int type: " + hashcode1);
        System.out.println("hashcode for key 2 as int type: " + hashcode2);
    }
}
