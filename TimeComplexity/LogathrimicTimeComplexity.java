package TimeComplexity;
//hadassah //lab 7
public class LogathrimicTimeComplexity {
    static int stepsTaken = 0;
    public static void main(String[]args){
        Long startTime = System.nanoTime();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 , 20};
        int num = 8;

        System.out.println("Search index: " + binarySearch(array, num));
        Long endTime = System.nanoTime();
        System.out.println("Execution time is : " + (endTime - startTime) + " nanoseconds");
        System.out.println("Steps taken : " + stepsTaken);
    }
    public static int binarySearch( int[] arr, int search) {
        int low = 0;
        int high = arr.length-1;
         while(low <= high){
             int mid = (low + high)/2;
             if(search == arr[mid]){
                 stepsTaken +=1;
                 return mid;}
             else if(search < arr[mid]){
                 stepsTaken +=1;
                 high = mid -1;}
             else {
                 stepsTaken += 1;
                 low = mid + 1; }
         }
         System.out.println("search not found");
         return - low - 1;
    }
}
