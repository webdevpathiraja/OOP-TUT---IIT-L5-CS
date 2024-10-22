public class Test {
    public static void main(String[] args) {

        // new object of cylinder
         Cylinder c1 = new Cylinder();

        System.out.println("Cylinder 1: " +
                " radius = " + c1.getRadius() +
                " height = " + c1.getHeight() +
                " base area = " + c1.getArea() +
                " volume = " + c1.getVolume());

        // new object c2 , specifying height
        Cylinder c2 = new Cylinder(5.0);

        System.out.println("Cylinder 2: " +
                " radius = " + c2.getRadius() +
                " height = " + c2.getHeight() +
                " base area = " + c2.getArea() +
                " volume = " + c2.getVolume());

        // new object c3 , specifying height and radius
        Cylinder c3 = new Cylinder(5.0, 12.0);

        System.out.println("Cylinder 3: " +
                " radius = " + c3.getRadius() +
                " height = " + c3.getHeight() +
                " base area = " + c3.getArea() +
                " volume = " + c3.getVolume());

        // new object c4
        Cylinder c4 = new Cylinder(6.0,12.0);
        System.out.println("The total surfaceArea of c4 is = " + c4.getSurfaceArea());
    }


}
