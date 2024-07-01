package experiment3;

public class Rectangle extends Shape{
    private final double length;
    private final double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double calArea(){
        return length * width;
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        Rectangle rectangle = new Rectangle(3, 4);
        System.out.println("Triangle area: " + triangle.calArea());
        System.out.println("Rectangle area: " + rectangle.calArea());
    }
}



