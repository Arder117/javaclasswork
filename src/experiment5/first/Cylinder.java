package experiment5.first;

public class Cylinder implements C {
    private final double radius;
    private final double height;
    String color;

    public Cylinder(double r, double h, String c) {
        this.radius = r;
        this.height = h;
        this.color = c;
    }

    @Override
    public void volume() {
        System.out.println("Volume: " + PI * radius * radius * height);
    }

    @Override
    public void setColor(String c) {
        this.color = c;
    }

    @Override
    public double area() {
        return PI * radius * radius * 2 + 2 * PI * radius * height;
    }
}
