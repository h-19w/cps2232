package ADTs.ListADTS;
import java.util.Scanner;
//hadassah //lab 11
public class doublearraysize_method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] myList = new int[2];

        System.out.println("Last index: " + (myList.length - 1));
        System.out.println("Enter " + myList.length + " values: ");
        readValues(myList, sc);
        sc.close();
    }
    public static void readValues(int[] myList, Scanner sc) {
        for (int i = 0; i < myList.length; i++) {
            myList[i] = sc.nextInt();
            if (myList[i] == -1) {
                System.out.println("End of input!");
                System.exit(0);
            }
            printArray(myList);
            if (myList.length - 1 == i) {
                myList = doubleArraySize(myList, sc);
            }
        }
    }
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    public static int[] doubleArraySize(int[] myList, Scanner sc) {
        int[] newList = new int[myList.length * 2]; //create the doubled size array
        System.out.println();
        System.out.println("New Array last index: " + (newList.length - 1));
        System.out.println("Enter " + newList.length + " values: ");

        for (int j = 0; j < myList.length; j++) {
            newList[j] = myList[j]; //Copy
        }
        return newList;
    }
}
