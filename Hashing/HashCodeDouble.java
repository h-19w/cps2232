package Hashing;
//hadassah //lab 4
public class HashCodeDouble {
    public static void main(String[]args){
        long key1 = 1234567890000000000L;
        long key2 = 1234567890000001024L;

        long bits1 = Double.doubleToLongBits(key1);
        long bits2 = Double.doubleToLongBits(key2);

        int hashcode1 =(int) (key1^(key1>>32));
        int hashcode2 =(int) (key2^(key2>>32));

        System.out.println("hashcode for key 1 " +
                "from long to double to int type: " + hashcode1);
        System.out.println("hashcode for key 2  " +
                "from long to double to int type: " + hashcode2);
    }
}
