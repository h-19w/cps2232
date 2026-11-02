package iteration;

import java.util.Arrays;
import java.util.List;
//lab 13

public class AutoBoxing {
    //hadassah
    public static void main(String[] args) {
        Integer[] l = {1, 2, 4, 8, 10};

        List<Integer> even = Arrays.asList(l);
        int S = sumEven(even);

        System.out.println("sum of even number is: "+ S);
    }
    public static int sumEven(List<Integer>li) {
        int sum = 0;
        for (Integer i: li) {
            if(i % 2 == 0)
                sum += i;
        }
        return sum;
    }
}
