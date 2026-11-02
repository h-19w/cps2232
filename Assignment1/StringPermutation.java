package Assignment1;
import java.util.Scanner;
public class StringPermutation {
    public static void displayPermutation(String s){
        displayPermutation(" ", s);
    }
    public static void displayPermutation(String s1, String s2) {
        if (s2.isEmpty()) { //base case: if s2 is empty, print the permutations in s1
            System.out.println(s1);
        } else {
            for (int i = 0; i < s2.length(); i++) {
                // Get the current char
                String currentChar = s2.charAt(i) + "";
                // Create the remaining string excluding the current character
                String remainingString = s2.substring(0, i) + s2.substring(i + 1);
                // Recursive call with updated strings
                displayPermutation(s1 + currentChar, remainingString);
            }
        }//hadassah
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string for permutations: ");
        String str = input.nextLine();
        System.out.println("All permutations of the string \"" + str + "\" are:");
        displayPermutation(str);
        input.close();
    }
}
