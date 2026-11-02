package ADTs.ListADTS;

import java.util.Scanner;
//hadassah //lab 10
public class DoubleArraySize {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[] myList = new int[2];
        System.out.println("last index: " + (myList.length-1));
        System.out.println("enter: " + myList.length + " values: ");
        System.out.println("array is: ");

        for(int i = 0; i < myList.length; i++) {
            myList[i] = sc.nextInt();
            if (myList[i] == -1) {
                System.out.println("end of input!");
                System.exit(0);
            }
            for (int l : myList) {
                System.out.print(l + " ");
            }
            if (myList.length - 1 == i) {
                int[] newList = new int[myList.length * 2];
                System.out.println();
                System.out.println("New Array last index: " + (newList.length - 1));
                System.out.println("enter " + newList.length + " values: ");

                for (int j = 0; j < myList.length; j++) {
                    newList[j] = myList[j];
                }
                myList = newList;
            }
        }sc.close();
    }
}
