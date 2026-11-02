package Hashing;
//hadassah //lab 6
public class LeftShiftIncreaseFormula {
    public static void main(String[]args){
        int x = 5;
        int n = 3;
        int res = x << n;
        System.out.println("value of x: " + x);
        System.out.println("the shift value: " + n);
        System.out.println("result of x << n: " + res);

        System.out.println("Binary string of x: " + Integer.toBinaryString(x));
        System.out.println("Binary string of x << n: " + Integer.toBinaryString(res));

        int proof = x * (int) Math.pow(2, n);

        System.out.println("justification (x * 2^n): " + proof);


    }
}
