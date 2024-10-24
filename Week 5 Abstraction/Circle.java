public class Circle extends GeometricObject{
    protected double radius;

    public Circle() {}

    public Circle(double r) {
        this.radius  = r;
    }

    public Circle(double r, String color, boolean filled) {
        super(color, filled);
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String getShape() {
        return "Circle";
    }

}
