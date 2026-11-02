package TimeComplexity.Sorting;
//hadassah //lab 6 + 7
public class InsertionSort {
    static long startTime;
    static long endTime;
    public static void insertionSort(int [] list ){
        int stepsTaken = 0;
        for(int i =1; i < list.length; i++){
            int currElement = list[i];
            int j;
            for (j = i- 1; j >= 0 && list[j] > currElement; j--){
                list[j + 1] = list[j];
                stepsTaken++;
                System.out.println(list[j] + " in index " + j
                        + " : " + stepsTaken + " operations.");
            }
            list[j + 1] = currElement;
        }
        System.out.println("steps taken: " + stepsTaken);
    }

    public static void main(String[]args){
        int[] list = {2, 3, 2, 6, 5, 1, -2, 3, 17, 12, 15, 5 ,7, 8, 10, 1, 0, 4, 8, 45};
        startTime = System.nanoTime();
        insertionSort(list);
        endTime = System.nanoTime();
        System.out.println("execution time: " + (endTime-startTime));

        System.out.print("sorted list: ");
        for(int i =0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }

}
