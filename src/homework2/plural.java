//题目：声明并测试一个复数类（实部a，虚部b），包含toString()方法及复数的加、减、乘运算。
//要求：（1）toString()方法将复数显示为a+bi的形式。（2）在主函数创建两个复数对象，分别测试加、减、乘运算。

package homework2;

public class plural {
    private double a;
    private double b;

    public plural() {
    }

    public plural(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getB() {
        return b;
    }

    public plural add(plural p) {
        return new plural(a + p.getA(), b + p.getB());
    }

    public plural sub(plural p) {
        return new plural(a - p.getA(), b - p.getB());
    }

    public plural mul(plural p) {
        return new plural(a * p.getA() - b * p.getB(), a * p.getB() + b * p.getA());
    }

    public String toString() {
        return a + "+" + b + "i";
    }

    public static void main(String[] args) {
        plural p1 = new plural(1, 2);
        plural p2 = new plural(3, 4);
        plural p3 = p1.add(p2);
        plural p4 = p1.sub(p2);
        plural p5 = p1.mul(p2);
        System.out.println("复数1:" + p1);
        System.out.println("复数2:" + p2);
        System.out.println("相加:" + p3);
        System.out.println("相减:" + p4);
        System.out.println("相乘:" + p5);
    }

}
