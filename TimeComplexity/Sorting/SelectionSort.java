package TimeComplexity.Sorting;
//hadassah //lab 8
public class SelectionSort {
    static long startTime;
    static long endTime;
    public static void selectionsort(double[] list){
        int stepsTaken  = 0;
        for(int i =0; i< list.length; i++){
            double currMin = list[i];
            int currMinIndex = i;
            System.out.println("Curr min: " + currMin);

            for(int j  = i +1; j < list.length; j ++){
                if(currMin > list[j]) {
                    stepsTaken++;
                    currMin = list[j];
                    currMinIndex = j;
                    System.out.println("New curr min: " + currMin);
                }
            }
            if(currMinIndex != i){
                list[currMinIndex] = list[i];
                list[i] = currMin;
            }
        }
        System.out.println("steps taken: " + stepsTaken);
        System.out.print("sorted list: ");
        for(double element : list)
            System.out.print( element + ", ");
        System.out.println();
    }
    public static void main(String[]args){
        double[] arr = {5.5, 3.7, 1.8, 2.4, 4.1, 6.9, 3.8, 2.0, 6.1, 8.3, 4.6, 3.6, 2.7, 1.9, 4.5 };
        startTime = System.nanoTime();
        selectionsort(arr);
        endTime = System.nanoTime();
        System.out.println("execution time: " + (endTime-startTime));
    }
}
