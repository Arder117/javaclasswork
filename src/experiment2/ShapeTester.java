package experiment2;

public class ShapeTester {
    public static void main(String[] args) {
        Circle c = new Circle(3);
        System.out.println("Perimeter: " + String.format("%.2f", c.getPerimeter()));
        System.out.println("Area: " + String.format("%.2f", c.getArea()));
    }
}
