package homework3;

public class Trianglel {
    private final Point p1;
    private final Point p2;
    private final Point p3;

    public Trianglel() {
        this.p1 = new Point();
        this.p2 = new Point();
        this.p3 = new Point();
    }

    public Trianglel(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public float getArea() {
        float a = (float) Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
        float b = (float) Math.sqrt(Math.pow(p1.getX() - p3.getX(), 2) + Math.pow(p1.getY() - p3.getY(), 2));
        float c = (float) Math.sqrt(Math.pow(p2.getX() - p3.getX(), 2) + Math.pow(p2.getY() - p3.getY(), 2));
        float p = (a + b + c) / 2;
        return (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 1);
        Point p3 = new Point(1, 0);
        Trianglel triangle1 = new Trianglel(p1, p2, p3);
        System.out.println("p1: (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("p2: (" + p2.getX() + ", " + p2.getY() + ")");
        System.out.println("p3: (" + p3.getX() + ", " + p3.getY() + ")");
        System.out.println("area: " + triangle1.getArea());
    }
}



