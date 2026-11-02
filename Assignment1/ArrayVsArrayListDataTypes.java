package Assignment1;
import java.util.ArrayList;

public class ArrayVsArrayListDataTypes {
//hadassah
    public static void main(String[] args) {
        // *** Array Example (Primitives) ***
        int[] intArray = new int[3];  // Array of primitive int types
        intArray[0] = 10;  // Primitive int
        intArray[1] = 20;  // Primitive int
        System.out.println("Array with primitive types: ");
        for (int value : intArray) {
            System.out.println(value);  // Accessing primitive int elements
        }

        // *** ArrayList Example (Objects) ***
        ArrayList<Integer> arrayList = new ArrayList<>();  // ArrayList of Integer objects
        arrayList.add(10);  // Adding Integer object
        arrayList.add(20);  // Adding Integer object
        System.out.println("ArrayList with object types (Integer): ");
        for (Integer value : arrayList) {
            System.out.println(value);  // Accessing Integer object elements
        }
    }
}
