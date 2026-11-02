package collections_vectors;

import java.util.Vector;
//hadassah //lab 4
public class VectorDemo {
    public static void main(String [] args){
        Vector<Integer> vect = new Vector<>(3, 2);
        vect.addElement(5);
        vect.addElement(7);
        vect.addElement(9);

        vect.insertElementAt(0, 2);
        vect.removeElementAt(1);

        for (int i: vect){
            System.out.println(i);
        }

        System.out.println();
        //quiz - lab 5
        Vector<Integer> v = new Vector<>();
        v.add(2);
        v.add(4);
        v.add(6);

        for (int i: v){
            System.out.println(i);
        }
    }
}


//
