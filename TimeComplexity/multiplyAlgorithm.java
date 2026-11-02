package TimeComplexity;
//hadassah //lab 6
public class multiplyAlgorithm {
    public static void main(String[]args){
        int a = 10;
        //
        long startTime1 = System.nanoTime();
        for(int i=0;i<5;i++){
            a *= a;
        }
        long endTime1 = System.nanoTime();
        System.out.println("Execution time:"+(endTime1 - startTime1));


        long startTime2 = System.nanoTime();
        for(int i = 0; i < 5; i++){
            a = a * a;
        }
        long endTime2 = System.nanoTime();
        System.out.println("Execution time:"+(endTime2 - startTime2));
    }
}
