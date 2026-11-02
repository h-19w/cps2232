package generics;
//lab 7
public class StringGenericStack {

    public static void main(String[] args) {
        GenericStack <String> stack = new GenericStack<>();
        stack.push("London");
        System.out.println(stack.toString());
        stack.push("Paris");
        System.out.println(stack.toString());
        stack.push("Berlin");
        System.out.println(stack.toString());
        stack.push("Ken");
        System.out.println(stack.toString());
        stack.push("Hadassah");
        System.out.println(stack.toString());
        //hadassah
        stack.pop();
        System.out.println(stack.toString());
        stack.pop();
        System.out.println(stack.toString());
        stack.peek();
        System.out.println(stack.toString());
        System.out.println(stack.isEmpty());
        System.out.println(stack.getSize());
    }

}
