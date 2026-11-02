package TimeComplexity.greatestCommonDivisor;

//hadassah //lab 2
public class GCD1 {
    static long startTime;
    static long endTime;
    public static int gcd(int m, int n){
        int gcd = 1;
        int stepsTaken = 0;
        startTime =System.nanoTime();
        for(int k = 2; k <= m && k <= n; k++){
            System.out.println("linear time step: " +
                    (stepsTaken = stepsTaken + 1));
            if(m % k == 0 && n % k ==0)
                gcd = k;
            endTime = System.nanoTime();
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
