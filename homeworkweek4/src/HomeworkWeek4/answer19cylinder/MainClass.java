package answer19cylinder;

public class MainClass {

    public static void main(String[] args) {

        Circle circle = new Circle(3.75);
        System.out.println("Circle.radius = " + circle.getRadius());
        System.out.println("Circle.area =" + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius = " + cylinder.getRadius());
        System.out.println("cylinder.height = " + cylinder.getHeight());
        System.out.println("cylinder.are = " + cylinder.getArea());
        System.out.println("cylinder.volumer = " + cylinder.getVolume());

    }
}