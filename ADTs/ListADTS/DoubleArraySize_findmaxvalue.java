package ADTs.ListADTS;
import java.util.Scanner;
//hadassah //lab 1
public class DoubleArraySize_findmaxvalue {
    static int max;
    static int[] myList = new int[2];
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("array last index: " + (myList.length-1));

        max = myList[0];
        System.out.println("enter " + myList.length +" values or -1 to end: ");
        for(int i= 0; i<myList.length; i++){
            myList[i] = sc.nextInt();
            if(myList[i] ==-1){
                systemAbort(myList);
            }if(myList.length-1 == i){
                int[] newArr = doublearray(myList);
                myList = newArr;
            }
            System.out.println("array: ");

            for(int e : myList){
                System.out.println(e + " ");
            }
            max(myList);
        }
        sc.close();
    }

    public static void systemAbort(int[] value){
        for(int i= 0; i< value.length; i++) {
            System.out.println("end of input!!");
        }
    }
    public static void max(int[] arr){
        for(int i= 0; i< arr.length; i++) {
            if(arr[i] > max){
                System.out.println("max is: " + max);
            }
        }
    }
    public static int[] doublearray(int[] list){
        int[] newList = new int[list.length*2];
        System.out.println("new array size is: " + (newList.length));
        System.out.println("new array last index: " + (newList.length-1));
        System.out.println("enter " + newList.length + " values: ");
        for(int i = 0; i < myList.length; i++) {
            newList[i] = myList[i];
        }
        myList = newList;
        return myList;
    }

}
