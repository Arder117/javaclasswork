//3. 定义一个抽象类Shape，它有一个抽象方法calArea代表求图形的面积；
// 分别定义Shape的两个子类Triangle、Rectangle代表三角形、矩形，
//这两个类分别具体实现calArea方法求自己的面积，在main方法里，利用这三个类创建对象，调用方法求各自的面积

package experiment3;

public abstract class Shape {
    public abstract double calArea();
}
