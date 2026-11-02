//hadassah //lab 3
public class BinetFormula {
    static long stepsTaken;
    public static int fib(int n) {
        double phi = (1 + Math.sqrt(5)) / 2;
        stepsTaken = stepsTaken + 1;
        return (int)Math.round(Math.pow(phi, n) / Math.sqrt(5));
    }

    // Driver Code
    public static void main(String[] args) {
        int n = 11;
        long startTime = System.nanoTime();
        System.out.println("fib(" + n +") = " + fib(n));
        long endTime = System.nanoTime();
        System.out.println("ExecTime: " + (startTime-endTime));
        System.out.println("steps taken: " + stepsTaken);
    }
}
