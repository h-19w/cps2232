package comparing;
import java.util.Comparator;
//hadassah //lab 3: class 2
public class GeometricObjectComparator implements Comparator<GeometricObject>, java.io.Serializable{
    @Override
//    public int compare(GeometricObject o1, GeometricObject o2){
//        if(o1.getArea()> o2.getArea()){
//            return 1;
//        } else if(o1.getArea()< o2.getArea()){
//            return -1;
//        } else {
//            return 0;
//        }
//    }
    public int compare(GeometricObject o1, GeometricObject o2) {
        double area1 = o1.getArea();
        double area2 = o2.getArea();
        if (area1 < area2)
            return -1;
       else if (area1 == area2)
            return 0;
        else
            return 1;
    }
}
