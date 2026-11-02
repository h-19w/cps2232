package Assignment1;
//hadassah
public class summmationForLoop {
    public static void main(String[]args){
        double s = 0;
        for (int i = 1; i <= 4; i++){
            for(int j = 1; j<= 5; j++) {
                double s1 =  (2 * Math.pow(i, 2));
                s += s1;
            }
        }
        System.out.println("the summation of the expression s = ∑ from i = 1 to 4 (∑ from j = 1 to 5 (2*i^2)) is: " + s);
    }
}
