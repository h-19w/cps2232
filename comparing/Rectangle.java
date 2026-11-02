package comparing;
//hadassah //lab 3: class 3
public class Rectangle extends GeometricObject{
    private double length;
    private double width;
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    @Override
    public double getArea() {
        return length * width;
    }
    @Override
    public double getLength() {
        return length;
    }
    @Override
    public double getWidth() {
        return width;
    }

}
