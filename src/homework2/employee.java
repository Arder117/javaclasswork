//题目：定义一个员工类employee，满足以下要求：
//（1）包括以下私有属性：id (String)，name (String)，age (int)，salary (float)。
//（2）包括以下成员函数：无参构造函数，带四个参数的构造函数；设置/读取id函数setId和getId；
//设置/读取name函数setName和getName；设置/读取age函数setAge和getAge；
// 设置/读取salary函数setSalary和getSalary；输出员工基本信息的函数print。
//（3）主函数：创建任一员工对象emp1，并输出emp1的基本信息

package homework2;

import homework4.Insurable;

public class employee implements Insurable {
    private String id;
    private String name;
    private int age;
    private float salary;

    public employee() {
    }

    public employee(String id, String name, int age, float salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void print() {
        System.out.println("id: " + id + ", name: " + name + ", age: " + age + ", salary: " + salary);
    }

    public static void main(String[] args) {
        employee emp1 = new employee("007", "北极熊", 20, 2000);
        emp1.print();
    }

    // 在employee类中实现Insurable接口的calculatePremium方法
    @Override
    public double calculatePremium() {
        return getAge() * 150;
    }
}
