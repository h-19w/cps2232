package Assignment1;
import java.util.ArrayList;
//hadassah
public class ArrayVsArrayList {
    public static void main(String[] args) {
        // Array can hold both primitives and objects
        int[] intArray = {1, 2, 3};  // primitive data types
        String[] strArray = {"one", "two", "three"}; // objects (Strings)

        // ArrayList can only hold objects (use wrapper classes for primitives)
        ArrayList<Integer> intArrayList = new ArrayList<>(); // Integer is the wrapper class for int
        intArrayList.add(1);  // Can't add int directly without boxing
        intArrayList.add(2);
        intArrayList.add(3);

        // Output
        System.out.println("Array (primitive (int)): "); //primitive type
        for (int i : intArray) {
            System.out.print(i + " ");
        }

        System.out.println("\nArray (object (String)): ");  //object
        for (String s : strArray) {
            System.out.print(s + " ");
        }

        System.out.println("\nArrayList (object (Integer)): "); //object
        for (int i : intArrayList) {
            System.out.print(i + " ");
        }
    }
}
