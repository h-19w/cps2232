package generics;

//lab3
public class SuperWhiteCarDemo {

    public static void main(String[] args) {
        GenericStack<String> stack1 = new GenericStack();
        GenericStack<Object> stack2 = new GenericStack();
        //hadassah
        stack2.push("JAVA");
        stack2.push(2);
        stack1.push("Sun");
        add(stack1, stack2);
        AnyWildCardDemo.print(stack2);

    }
    public static <T> void add(GenericStack <T> stack1, GenericStack <? super T> stack2) {
        while(!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
    }
}
