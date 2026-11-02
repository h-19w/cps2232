package Assignment1;
//hadassah
class Multiply <T extends Number> {
    public double multiply(T x, T y) { //converts Number objects into Double
        return x.doubleValue() * y.doubleValue(); //get & multiply double values
    }
}
public class GenericMultiplication {
    public static void main(String[] args) {
        Multiply<Double> xy = new Multiply<>(); //initialize with the Double type
        double result = xy.multiply(5.5, 7.7); //method call with values

        System.out.println("the product of x and y whose values are 5.5 and 7.7 respectively is: " + result);
    }
}
