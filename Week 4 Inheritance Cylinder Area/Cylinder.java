// A subclass Cylinder is derived from the superclass Circle.
// In the declaration of the class you should use the keyword extends:

import java.util.Objects;

public class Cylinder extends Circle {
    private double height;

    // constructor with default color, radius and height
    public Cylinder() {
        super(); // call the super class Circle constructor with no args
        height = 1.0;
    }

    // constructor with default color, radius but with given height
    public Cylinder(double height) {
        super(); // call again the super class Circle with no args
        this.height = height;
    }

    //  constructor with default color, but given radius and height
    public Cylinder(double radius, double height) {
        super(radius); // call the superclass Circle(r) since thers one parameter
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        double volume = getArea() * height;
        return volume;
    }

    // calculate the surface area of a cylinder
    public double getSurfaceArea() {
        double area1 = 2 * Math.PI * getRadius() * height;
        double baseArea = super.getArea();
        return area1 + baseArea;
    }

}


