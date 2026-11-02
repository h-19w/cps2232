package generics;

import generics.GeometricObject;

public class Rectangle  extends GeometricObject {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getLength() {
        // TODO implement here
        return 0.0d;
    }
    public void setLength(double length) {
        // TODO implement here
        return;
    }

    public double getWidth() {
        return 0.0d;
    }
    public void setWidth(double width) {
        // TODO implement here
        return;
    }
    public double getArea(double width, double length) {
        return width * length;
    }
}
