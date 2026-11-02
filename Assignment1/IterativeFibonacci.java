package Assignment1;
//hadassah
public class IterativeFibonacci {
    public static long fib(long n) {
        long current = 0;
        long F1 = 0;
        long F2 = 1;

        if (n <= 1) {//if the input is 0
            return n;
        }
        for (long i = 2; i <= n; i++) {
            current = F1 + F2;  // Current Fibonacci number
            F1 = F2;  // Update F1 to F2
            F2 = current;  // Update F2 to current
        }
        return current;
    }
    public static void main(String[]args){
        System.out.println("fibonacci series with number 11: "+fib(11));
        System.out.println("fibonacci series with number 100: "+fib(100));
    }
}
