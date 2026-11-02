package TimeComplexity;

//hadassah lab 3+4
public class LinearTimeComplexity {
    public static void main(String[]args){
        Long startTime = System.nanoTime();
        int stepsTaken = 0;

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 , 20};
        int sumFirstTwentyNum = 0;
        for(int i =0; i< array.length; i++) {
            sumFirstTwentyNum = sumFirstTwentyNum + array[i];
            stepsTaken  = stepsTaken + 1;
        }
        System.out.println("sum of first " + array.length + " numbers is: " + sumFirstTwentyNum);
        Long endTime = System.nanoTime();
        System.out.println("Execution time is : " + (endTime - startTime));
        stepsTaken +=1;
        System.out.println("Steps taken : " + stepsTaken);    }
}
