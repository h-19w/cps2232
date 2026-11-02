package TimeComplexity.Sorting;
//hadassah //lab 9
public class BubbleSort {
    static long startTime;
    static long endTime;

    static void bubblesort(int[] arr){
        int n = arr.length;
        int temp = 0;
        int stepsTaken = 0;
        for(int i = 0; i < n; i++){
            for(int j = 1; j < (n-i); j++){
                if(arr[j - 1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    stepsTaken++;
                }
            }
        }System.out.println("steps taken: " + stepsTaken);
    }
    public static void main(String[]args) {
        int arr[] = {2,3,6,5,1,-2,3,17,12, 8, 3, 5, 6, 2,10, 45, 12, 56,23, 19};
        startTime = System.nanoTime();
        bubblesort(arr);
        endTime = System.nanoTime();
        System.out.println("execution time: " + (endTime-startTime));
        System.out.print("sorted (bubble) list: ");
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
