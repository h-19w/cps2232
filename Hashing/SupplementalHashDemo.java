package Hashing;
//hadassah //lab 1 - 10pm
public class SupplementalHashDemo {
    public static void main(String[]args){
        int x = 67;  int y = 77;
        int a = 8;   int b = -8;
        int c = 5;
        long m = 1234567890000000000L;
        long n = 1234567890000000024L;

        System.out.println("67 >> 3 is: " + (x >> 3));
        System.out.println("77 >> 3 is: " + (y >> 3));
        System.out.println("-8 >> 3 is: " + (b >> 3));
        System.out.println("-8 >>> 3 is: " + (b >>> 3));
        System.out.println("8 << 3 is: " + (a << 2));

        System.out.println("8 to binary, then >> 2 is: " + Integer.toBinaryString(a >> 2));
        System.out.println("8 to binary, then << 2 is: " + Integer.toBinaryString(a << 2));

        System.out.println("-8 to binary is: " + Integer.toBinaryString(b));
        System.out.println("5 to 32bits binary is: " + String.format("%32s", Integer.toBinaryString(c)).replace(' ', '0'));

        System.out.println("1234567890000000000L to 64 bits is: " + String.format("%64s", Long.toBinaryString(m)).replace(' ', '0'));
        System.out.println("1234567890000000024L to 64 bits is: " + String.format("%64s", Long.toBinaryString(n)).replace(' ', '0'));

        System.out.println("1234567890000000000L to 32 bits is: " + String.format("%64s", Long.toBinaryString(m >> 32)).replace(' ', '0'));
        System.out.println("1234567890000000024L to 32 bits is: " + String.format("%64s", Long.toBinaryString(n >> 32)).replace(' ', '0'));

        System.out.println("1234567890000000000L to 32 bits is: " + String.format("%64s", Long.toBinaryString(m << 32)).replace(' ', '0'));
        System.out.println("1234567890000000024L to 32 bits is: " + String.format("%64s", Long.toBinaryString(n << 32)).replace(' ', '0'));

        System.out.println("1234567890000000000L to 32 bits is: " + String.format("%64s", Long.toBinaryString(m >>> 32)).replace(' ', '0'));
        System.out.println("1234567890000000024L to 32 bits is: " + String.format("%64s", Long.toBinaryString(n >>> 32)).replace(' ', '0'));

        System.out.println(" Int z = -8 in binary is: " + Integer.toBinaryString(-8));

        System.out.println("Supplemental Hash method outputs different hashcodes for different objects. ");
        System.out.println("Supplemental hash x = 101 & 3 is: " + (supplementalHash (x) & 3));
        System.out.println("Supplemental hash y = 205 & 3 is : " + (supplementalHash (y) & 3));

        System.out.println("Logical AND outputs same hashcodes for different objects. ");
        System.out.println ("Hash value for logical AND [101 & 3] is: " + (101 & 3) + " , is the same as " );
        System.out.println ("Hash value for logical AND [205 & 3] is: " + (205 & 3));
    }
    public static int supplementalHash(int h){
        h ^= (h >>> 20) ^ (h >>> 12);
        return h ^ (h >>> 7) ^ (h >>> 4);
    }
}
