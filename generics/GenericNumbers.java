package generics;
//lab 3
public class GenericNumbers<E>{
    private E firstNumber;
    private E secondNumber;
    //hadassah
    public GenericNumbers(E first, E second) {
        firstNumber = first;
        secondNumber = second;
    }
    public E getfirstNumber() {
        return firstNumber;

    }
    public E getsecondNumber() {
        return secondNumber;

    }
    public void display() {
        System.out.println("First number is: "+ firstNumber +
                "\n"+"Second number is:"+ secondNumber);

    }

}
