import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Circle circle1 =  new Circle();
//         System.out.println(circle1.setRadius(20));
//         setRadius does not have any return type (void)
//         setRadius is used to modify
//         the instance variable radius not to return it!

        System.out.println("The circle1 has radius of " + circle1.getRadius() +
                " and area of " + circle1.getArea());
        System.out.println("The circle1 is " + circle1.getColor());

//        circle2
        Circle circle2 =  new Circle(20, "pink");

        System.out.println("The circle2 has radius of " + circle2.getRadius() +
                " and area of " + circle2.getArea());
        System.out.println("The circle2 is " + circle2.getColor());


//        circle3
        Circle circle3 = new Circle(12, "purple");

        System.out.println("The circle3 has radius of " + circle3.getRadius() +
                " and area of " + circle3.getArea());
        System.out.println("The circle 3 is " + circle3.getColor());


    

    }





}
