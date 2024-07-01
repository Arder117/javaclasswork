// 1.类的继承
//题目：在第二次作业第1题员工类的基础上，定义一个管理者类Manager，继承员工类Employee。
//要求：
//（1）将员工类中的name和salary属性修改为保护类型，观察这两个属性与其它私有属性在子类中是否可以访问；
//（2）在管理者类中声明与父类同名的salary属性并填充默认值，增加String类型属性responsibilities；
//（3）在管理者类中覆盖父类的print方法，输出管理者基本信息；
//（4）主函数：创建员工类对象emp1和管理者类对象mng1，并输出emp1和mng1的基本信息

package homework3;

import homework2.employee;
import homework4.Insurable;

public class Manager extends employee implements Insurable {
    protected String name;
    protected float salary;
    private String responsibilities;

    public Manager() {
        this.salary = 0;
        this.responsibilities = "";
    }

    public Manager(String id, String name, int age, float salary) {
        super(id, name, age, salary);
        this.salary = 0;
        this.responsibilities = "";
    }

    public void setResponsibilities(String responsibilities) {
        this.responsibilities = responsibilities;
    }

    public String getResponsibilities() {
        return responsibilities;
    }

    @Override
    public void print()  {
        System.out.println("id: " + getId() + ", name: " + name + ", age: " + getAge() +
                ", salary: " + salary + ", responsibilities: " + responsibilities);
    }

    public static void main(String[] args) {
        employee emp1 = new employee("1", "emp1", 20, 1000);
        emp1.print();

        Manager mng1 = new Manager();
        mng1.setId("2");
        mng1.name = "mng1";
        mng1.setAge(30);
        mng1.salary = 2000;
        mng1.setResponsibilities("manage");
        mng1.print();
    }

    // 在Manager类中实现Insurable接口的calculatePremium方法
    @Override
    public double calculatePremium() {
        return getAge() * 100;
    }
}
