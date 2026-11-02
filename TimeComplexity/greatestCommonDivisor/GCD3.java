package TimeComplexity.greatestCommonDivisor;

//hadassah //lab 4
public class GCD3 {
    static long startTime;
    static long endTime;
    public static int gcd(int m, int n){
        startTime = System.nanoTime();
        int gcdRes = 1;
        int stepsTaken = 0;

        if(m == n)
            return m;

        for(int k = m/2; k >= 1; k--){
            System.out.println("linear time step: " + (++stepsTaken));
            if(m % k == 0 && n % k ==0) {
                gcdRes = k;
                break;
            }
        }
        endTime = System.nanoTime();
        System.out.println("execution time: " + (endTime-startTime));
        return gcdRes;
    }
    public static void main(String[]args){
        int x = 270;
        int y = 192;
        System.out.println("GCD is: " + gcd(x, y));
    }

}
