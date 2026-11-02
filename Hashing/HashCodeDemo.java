package Hashing;
//hadassah //lab 10
public class HashCodeDemo {
    public static void main(String[]args){
        String hi = "hi";
        System.out.println("hashcode of the string hi = " + hi.hashCode());

        String post = "post";
        System.out.println("hashcode of the string post = " + post.hashCode());
        System.out.println("hashcode of the string stop = " + "stop".hashCode());
        System.out.println("hashcode of the string tops = " + "tops".hashCode());

        System.out.println("hashcode of the string Hello World = " + "Hello World".hashCode());
        System.out.println("hashcode of the string London = " + "London".hashCode());
    }
}
