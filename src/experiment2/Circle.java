//1. 声明一个表示圆的类，包含计算周长和面积的方法，保存在文件Circle.java 中。
// 然后编写测试类，保存在文件ShapeTester.java中，并与Circle.java放在相同的目录下，进行测试。

package experiment2;

public class Circle {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
