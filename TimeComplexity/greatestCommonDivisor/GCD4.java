package TimeComplexity.greatestCommonDivisor;
//hadassah //lab 5
public class GCD4 {
    static long startTime;
    static long endTime;
    static int stepsTaken = 0;
    public static int gcd(int m, int n){
        startTime = System.nanoTime();

        if(m % n ==0){
            System.out.println("Linear Time Step: " + (++stepsTaken));
            return n;
        }else{
            System.out.println("Linear Time Step: " + (++stepsTaken));
            return gcd(n, m % n);
        }
    }
    public static void main(String[]args){
        int x = 270;
        int y = 192;
        System.out.println("GCD is: " + gcd(x, y));
        endTime = System.nanoTime();
        System.out.println("execution time: " + (endTime-startTime));

    }
}
