package comparing;
//hadassah //lab 3:class 4
public class Circle extends GeometricObject{
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public double getLength() {
        return 2 * Math.PI * radius;
    } //circumference
    @Override
    public double getWidth() {
        return radius * 2;
    } // diameter
}
