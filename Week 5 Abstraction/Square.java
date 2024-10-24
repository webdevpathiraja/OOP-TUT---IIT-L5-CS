public class Square extends GeometricObject {
    protected double side;

    public Square() {}

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side  =side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    public String getShape() {
        return "Circle";
    }
}
