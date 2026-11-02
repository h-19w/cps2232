package Hashing;
//hadassah //lab 11
public class SupplementalHashMethod {
    public static void main(String[]args){
        long h = 1234567890000000024L;

        System.out.println("binary string: " + Long.toBinaryString(h));
        System.out.println("supplemental hash: " + suplementalHash((int)h));
    }
    private static int suplementalHash(int h){
        h ^= (h >>> 20) ^ (h >>> 12);
        return h ^ (h >>> 7) ^ (h >>> 4);
    }
    //⇧ h(hashcode) = supplementalhash(hashcode) & (N-1)
}
