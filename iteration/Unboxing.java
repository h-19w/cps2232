package iteration;

import java.util.ArrayList;
import java.util.List;
//lab1
public class Unboxing {

    public static void main(String[] args) {
        Integer i = new Integer (-8);

        int absVal  = absoluteValue(i);//hadassah
        System.out.println("absolute value of "+ i +" = "+ absVal);

        List<Double> id = new ArrayList<>();
        id.add(3.1416);

        // hadassah
        double pi = id.get(0);
        System.out.println("pi = " + pi);
    }
    public static int absoluteValue(int i) {
        return (i < 0) ? -i : i;
    }

}
