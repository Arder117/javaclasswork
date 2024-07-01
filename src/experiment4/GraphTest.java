package experiment4;

public class GraphTest {
    public static void main(String[] args) {
        Graph circle = new Circle(1.0);
        Graph rectangle = new Rectangle(1.0, 1.0);
        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Circle perimeter: " + circle.getPerimeter());
        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());
    }
}
