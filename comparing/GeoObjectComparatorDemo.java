package comparing;
import java.util.Comparator;
//hadassah //lab 3: using the compare() method (class 7?)
public class GeoObjectComparatorDemo {
    public static void main(String[]args){
        GeometricObject g1 = new Rectangle(5, 5);
        GeometricObject g2 =new Circle(5);

        GeometricObject g = max(g1, g2, new GeometricObjectComparator());
        System.out.println("the area of the larger object is: " + g.getArea());
    }
    public static GeometricObject max(GeometricObject g1, GeometricObject g2, Comparator<GeometricObject> cmp){
        if(cmp.compare(g1, g2)> 0){
            return g1;
        }
        else {
            return g2;
        }
    }
}
