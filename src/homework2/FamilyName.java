//题目：编写FamilyName类，包含String类型的静态变量surName存储姓氏、String类型的实例变量givenName存储名字。
//主函数中首先用类名访问surName并赋值，然后创建三个FamilyName对象，命名为father，sonOne和sonTwo，
//并分别为这三个对象的成员变量givenName赋值，最后分别输出三个对象的姓氏和名字

package homework2;

public class FamilyName {
    private static String surName;
    private String givenName;

    public FamilyName() {
    }

    public FamilyName(String givenName) {
        this.givenName = givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getGivenName() {
        return givenName;
    }

    public static void setSurName(String surName) {
        FamilyName.surName = surName;
    }

    public static String getSurName() {
        return surName;
    }

    public static void main(String[] args) {
        FamilyName.setSurName("张");
        FamilyName father = new FamilyName("一一");
        FamilyName sonOne = new FamilyName("二二");
        FamilyName sonTwo = new FamilyName("三丰");
        System.out.println("father: " + FamilyName.getSurName() + father.getGivenName());
        System.out.println("sonOne: " + FamilyName.getSurName() + sonOne.getGivenName());
        System.out.println("sonTwo: " + FamilyName.getSurName() + sonTwo.getGivenName());
    }
}
