package TimeComplexity.Sorting;
//hadassah // lab 2
public class MergeSort {
    static long startTime;
    static long endTime;
    static int stepsTaken = 0;
    public static void mergesort(int[]list){
        if(list.length > 1){
            stepsTaken++;
            int[] firsthalf = new int [list.length/2];
            System.arraycopy(list, 0, firsthalf, 0,
                    list.length/2);
            mergesort(firsthalf);
            int secondhalflength = list.length - list.length/2;
            int[] secondhalf = new int[secondhalflength];
            System.arraycopy(list, list.length/2, secondhalf,
                    0, secondhalflength);

            mergesort(secondhalf);
            merge(firsthalf, secondhalf, list);
        }
    }
    public static void merge(int[] left, int[] right, int[] merged) {
        int LcurrIndex = 0;
        int RcurrIndex = 0;
        int mergedCurrIndex = 0;

        while (LcurrIndex < left.length && RcurrIndex < right.length) {
            if (left[LcurrIndex] < right[RcurrIndex]) {
                merged[mergedCurrIndex++] = left[LcurrIndex++];
                stepsTaken++;
            } else {
                merged[mergedCurrIndex++] = right[RcurrIndex++];
                stepsTaken++;
            }
        }
        while (LcurrIndex < left.length){
            stepsTaken++;
            merged[mergedCurrIndex++] = left[LcurrIndex++]; }
        while(RcurrIndex < right.length){
            stepsTaken++;
            merged[mergedCurrIndex++] = right[RcurrIndex++]; }
    }

    public static void main(String[]args){
        int[] list = {2,3,6,5,1,-2,3,17,0, 8, 3, 5, 6, 2,10, 12, 19, 1, 5, 3};
        startTime = System.nanoTime();
        mergesort(list);
        endTime = System.nanoTime();
        System.out.println("execution time: " + (endTime-startTime));
        System.out.println("steps taken: " + stepsTaken);
        System.out.print("sorted (merge) list: ");
        for(int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
