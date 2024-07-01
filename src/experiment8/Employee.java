// 1.定义Employee类
//(1)包含：private成员变量name、birthday，其中birthday为MyDate类的对象；
//(2)为每一个属性定义getter、setter方法；
//(3)重写toString方法输出name、birthday；
//(4)MyDate类包含：private成员变量year、month、day；并为每一个属性定义getter、setter方法；
//(5)创建该类的6个对象，把这些对象放入ArrayList集合中（ArrayList需使用泛型来定义），对集合中的元素进行排序，并遍历输出。
// 排序规则：先按照name降序排序，如果name相同，则按生日日期的先后排序。要求：分别使用自然排序和客户化排序实现。

package experiment8;

public class Employee implements Comparable<Employee> {
    private String name;
    private MyDate birthday;

    public Employee(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "name: " + name + ", birthday: " + birthday;
    }

    @Override
    public int compareTo(Employee o) {
        if (this.name.compareTo(o.name) > 0)
            return -1;
        else if (this.name.compareTo(o.name) < 0)
            return 1;
        else if (this.birthday.getYear() > o.birthday.getYear())
            return 1;
        else if (this.birthday.getYear() < o.birthday.getYear())
            return -1;
        else if (this.birthday.getMonth() > o.birthday.getMonth())
            return 1;
        else if (this.birthday.getMonth() < o.birthday.getMonth())
            return -1;
        else return Integer.compare(this.birthday.getDay(), o.birthday.getDay());
    }

    public MyDate getBirthday() {
        return birthday;
    }
}
