package Hashing;

import comparing.GeometricObjectComparator;
import comparing.Circle;
import comparing.GeometricObject;
import comparing.Rectangle;

import java.util.Set;
import java.util.TreeSet;

//hadassah //lab 3  (10pm)
public class TreeSetWithComparatorDemo {
    public static void main(String[]args){
        Set<GeometricObject> set =
                new TreeSet<>(new GeometricObjectComparator());

        set.add(new Rectangle(4, 5));
        set.add(new Circle(40));
        set.add(new Circle(40));
        set.add(new Rectangle(4, 1));

        System.out.println("A sorted set of geometric objects");
        for(GeometricObject element : set){
            System.out.println("area = "+ element.getArea());
        }

    }
}
