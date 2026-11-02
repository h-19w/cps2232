package comparing;
// hadassah // lab 3: class6
// using the compareTo() method
public class ComparableRectangleDemo {
    public static void main(String[]args){
        ComparableRectangle cr1 = new ComparableRectangle(5, 5);
        ComparableRectangle cr2 = new ComparableRectangle(2, 5);

        System.out.println(cr1.compareTo(cr2));
        System.out.println(cr1.toString());
        System.out.println(cr2.toString());
    }
}

