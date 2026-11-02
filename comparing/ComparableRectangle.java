package comparing;
//hadassah //lab 3:class 5
public class ComparableRectangle extends Rectangle implements Comparable<ComparableRectangle>{
    public ComparableRectangle(double length, double width){
        super(length, width); //calling rectangle class
    }
    public int compareTo(ComparableRectangle o){
        if(getArea()> o.getArea()){
            return 1;
        }
        else if(getArea()< o.getArea()){
            return -1;
        }
        else{
            return 0;
        }
    }
    public String toString(){
        return "length: " + getLength() + "| width: " + getWidth()+ "| area: "+getArea();
    }
}
