//2. 编写一个Person类，通过重写toString( )、equals( )、hashcode( )方法，
// 实现可以对Person类实例化出的对象进行equals和==的比较

package experiment3;

import java.util.Objects;

public class Person {
    String name;
    String sex;
    int age;

    public Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String toString() {
        return "姓名：" + name + " 性别：" + sex + " 年龄: " + age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { // 判断是否是同一个对象
            return true;
        }
        if (obj == null) { // 判断是否为空
            return false;
        }
        if (obj instanceof Person p) { // 判断是否是Person类的实例，是则进行比较
            return this.name.equals(p.name) && this.sex.equals(p.sex) && this.age == p.age;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(name, age); // 通过name和age生成hash值
    }

    public static void main(String[] args) {
        Person p1 = new Person("张三", "男", 30);
        Person p2 = new Person("张三", "男", 30);
        Person p3 = new Person("张三", "女", 25);
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
    }
}




