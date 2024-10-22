public class Circle {
    private double radius;
    private String color;

    // Default constructor
    public Circle() {
        // no arg
    }

    // constructor with radius parameter
    public Circle(double r) {
        this.radius = r;
    }

    // constructor with radius and color parameters
    public Circle(double r, String color) {
        this.radius = r;
        this.color = color;
    }

    // getters
    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    //setters
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // method to calculate the area of a circle
    public double getArea() {
        return Math.PI * radius * radius;

    }

    // toString
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}