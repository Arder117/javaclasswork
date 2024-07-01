//1. 编写人类，具有姓名、性别、年龄属性和思考方法。再编写继承人类的教师类，
// 教师类还拥有职工号字段和教学方法。构造人类和教师类的对象，输出有关信息
package experiment3;

public class people {
    String name;
    String sex;
    int age;

    public people(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public void think() {
        System.out.println("思考方法：思考");
    }

    public String toString() {
        System.out.println("姓名：" + name + " 性别：" + sex + " 年龄: " + age);
        think();
        return null;
    }
}


