package ADTs.StackAPI;

//hadassah //lab 4 QUIZ
public class ArrayApplication  {
    public static void main(String[]args) throws StackisEmptyException, StackisFullException, StackisEmptyException {
        ArrayStack<Integer> array = new ArrayStack<>(5);
        array.push(1);
        array.push(2);
        array.push(3);
        array.push(4);
        array.push(5);
//        array.push(6);
        System.out.println(array.size());
        System.out.println(array.pop());
        System.out.println(array.pop());
        System.out.println(array.isEmpty());
        System.out.println(array.pop());
        System.out.println(array.pop());
        System.out.println(array.pop());
        System.out.println(array.pop());
//        System.out.println(array.top());

        array.push(6);


    }
}
