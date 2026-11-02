package TimeComplexity.greatestCommonDivisor;

//hadassah //lab 1
public class BruteForceMethod {
    public static void main(String[]args){
        int[]array = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512};
        int num = 512;
        bruteForce(array, num);
    }
    public static void bruteForce(int[] a, int n){
        for(int i = 0; i < a.length; i++){
            if(a[i] == n){
                System.out.println("Found " + a[i] + " at index " + i);
            }
        }
    }
}
