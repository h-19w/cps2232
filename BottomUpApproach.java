//hadassah //lab 2
public class BottomUpApproach {
    static long stepsTaken;
    public static void main(String[]args){
        long startTime = System.nanoTime();
        int n = 50;
        System.out.println("fib(" + n +") = " + fibBottomUp(n));
        long endTime = System.nanoTime();
        System.out.println("ExcTime: " + (endTime-startTime));
        System.out.println("steps taken: " + stepsTaken);
    }
    public static int fibBottomUp(int num){
        ++stepsTaken;
        if (num == 1 || num == 2)
            return 1;
        else {
            int[] fib = new int[num + 1];
            fib[1] = 1;
            fib[2] = 1;
            for (int i = 3; i < num + 1; i++) {
                fib[i] = fib[i - 1] + fib[i - 2];
                ++stepsTaken;
            }
            return fib[num];
        }
    }
}
