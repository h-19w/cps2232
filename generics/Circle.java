package generics;

import java.util.*;

public class Circle extends GeometricObject {

    private double radius;

    public Circle(double r) {
        this.radius = r;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

}