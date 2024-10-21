public class Circle {
    private double radius;
    private String color;

    public Circle() {
        radius = 1;
        color = "blue";
    }

    // third constructor
    public Circle (double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(double radius) {
        this.radius = radius;
        color = "blue";
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return  Math.PI * radius * radius;
    }

}
