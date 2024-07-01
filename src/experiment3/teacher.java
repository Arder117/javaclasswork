package experiment3;

public class teacher extends people {
    String jobNumber;

    public teacher(String name, String sex, int age, String number) {
        super(name, sex, age);
        this.jobNumber = number;
    }

    public void teach() {
        System.out.println("教学方法：教学");
    }

    public String toString() {
        System.out.println("姓名：" + name + " 性别：" + sex + " 年龄：" + age + " 职工号：" + jobNumber);
        teach();
        return null;
    }

    public static void main(String[] args) {
        people p = new people("张三", "男", 30);
        p.toString();
        teacher t = new teacher("李四", "女", 25, "123456");
        t.toString();
    }
}
