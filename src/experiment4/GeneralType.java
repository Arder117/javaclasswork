//1. 编写一泛型类（String、Integer、Double等）的使用，类GeneralType中包含有一泛型类成员变量，
// 构造函数对这一泛型类对象进行初始化，另外一方法对该泛型类对象进行输出

package experiment4;

public class GeneralType<T> {
    T obj;

    public GeneralType(T obj) {
        this.obj = obj;
    }

    public void getObj() {
        System.out.println(obj);
    }

    public static void main(String[] args) {
        GeneralType<String> gt1 = new GeneralType<>("Hello");
        GeneralType<Integer> gt2 = new GeneralType<>(123);
        GeneralType<Double> gt3 = new GeneralType<>(3.14);
        gt1.getObj();
        gt2.getObj();
        gt3.getObj();
    }
}
