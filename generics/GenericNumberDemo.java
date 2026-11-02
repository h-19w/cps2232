package generics;
//lab 4
public class GenericNumberDemo {
    public static void main(String[] args) {
        GenericNumbers <Integer> num = new GenericNumbers<>(4, 9); //generic_number_app <E>
        num.display();
    }

}
