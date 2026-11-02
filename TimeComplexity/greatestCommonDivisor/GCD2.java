package TimeComplexity.greatestCommonDivisor;

//hadassah //lab 3
public class GCD2 {
    static long startTime;
    static long endTime;
    public static int gcd(int m, int n){
        int stepsTaken = 0;
        startTime =System.nanoTime();

        int gcd = 1;

        for(int k = n; k>= 1; k--){
            System.out.println("linear time step: " + (++stepsTaken));
            if(m % k == 0 && n % k == 0){
                gcd = k;
                endTime = System.nanoTime();
                break;
            }
        }
        System.out.println("execution time: " + (endTime-startTime));
        return gcd;
    }
    public static void main(String[]args){
        int x = 270;
        int y = 192;
        System.out.println("GCD is: " + gcd(x, y));
    }

}
