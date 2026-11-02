package TimeComplexity.Sorting;
//hadassah //lab 4
public class QuickSort {
    static long startTime;
    static long endTime;
    static int stepsTaken = 0;

    public static void quicksort(int[] list) {
        quicksort(list, 0, list.length - 1);
    }

    public static void quicksort(int[] list, int first, int last) {
        if (last > first) {
            stepsTaken++;
            int pivotIndex = partition(list, first, last);
            quicksort(list, first, pivotIndex - 1);
            quicksort(list, pivotIndex + 1, last);
        }
    }

    public static int partition(int[] list, int first, int last) {
        int pivot = list[first];
        int low = first + 1;
        int high = last;

        while (high >= low) {
            while (low <= high && list[low] <= pivot)
                low++;

            while (low <= high && list[high] > pivot)
                high--;

            if (low < high) {
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }

        if (pivot > list[high]) {
            list[first] = list[high];
            list[high] = pivot;
            stepsTaken++;
            return high;
        } else {
            stepsTaken++;
            return first;
        }
    }

    public static void main(String[] args) {
        int[] list = {2,3,6,5,1,-2,3,17,0, 8, 3, 5, 6, 2,10, 12, 19, 1, 5, 3};
        startTime = System.nanoTime();
        quicksort(list);
        endTime = System.nanoTime();
        System.out.println("Execution time: " + (endTime - startTime));
        System.out.println("Steps taken: " + stepsTaken);
        System.out.print("Sorted list: ");
        for (int i : list) {
            System.out.print(i + " ");
        }
    }
}
