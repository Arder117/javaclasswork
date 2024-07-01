package experiment5.first;

public class CylinderTest extends Cylinder {
    public CylinderTest(double r, double h, String c) {
        super(r, h, c);
    }

    public static void main(String[] args) {
        CylinderTest cylinder = new CylinderTest(1.0, 2.0, "red");
        System.out.println("Area: " + cylinder.area());
        cylinder.setColor("blue");
        System.out.println("Color: " + cylinder.color);
        cylinder.volume();
    }
}
