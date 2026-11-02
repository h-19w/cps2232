package generics;

//lab 2
public class AnyWildCardDemo {
    //hadassah
    public static void main(String[] args) {
        GenericStack<Integer> intStack = new GenericStack<>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(-2);

        print(intStack);
    }
    public static void print(GenericStack<?> stack) { //<?> - unbounded wild type generics (ANY type)
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}

