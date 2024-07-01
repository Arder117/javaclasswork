//2.类的组合
//题目：定义一个三角形类，包含三角形的三个顶点坐标，并求三角形面积。
//要求：（1）定义Point类，成员包括x, y坐标，方法包括构造函数，set，get等；
//（2）定义三角形类，成员包括三个Point类对象，方法包括构造函数，求面积等；
//（3）主函数：创建点对象p1 , p2 , p3 , 三角形对象triangle1，输出三角形的三个顶点坐标及三角形面积。

package homework3;

public class Point {
    private float x;
    private float y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getX() {
        return x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getY() {
        return y;
    }
}
