// hadassah //lab 1
public class FibonacciRecursiveCalls {
    static long stepsTaken;
    public static void main(String[]args){
        long startTime = System.nanoTime();
        int n = 40;
        System.out.println("fib(" + n +") = " + fib(n));
        long endTime = System.nanoTime();
        System.out.println("ExcTime: " + (endTime-startTime));
        System.out.println("steps taken: " + stepsTaken);
    }
    public static int fib(int num){
        stepsTaken = stepsTaken +1;
        if(num ==0)
            return 0;
        if(num == 1 || num == 2)
            return 1;
        else
            return fib(num - 1) + fib(num - 2);
    }
}
