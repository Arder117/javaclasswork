package experiment8;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Tom", new MyDate(1990, 1, 1));
        Employee employee2 = new Employee("Jerry", new MyDate(1991, 2, 2));
        Employee employee3 = new Employee("Alice", new MyDate(1992, 3, 3));
        Employee employee4 = new Employee("Bob", new MyDate(1993, 4, 4));
        Employee employee5 = new Employee("Cathy", new MyDate(1994, 5, 5));
        Employee employee6 = new Employee("David", new MyDate(1995, 6, 6));

        ArrayList<Employee> employees = new ArrayList<>(); // 创建ArrayList集合，泛型为Employee，存放Employee对象
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);

        System.out.println("排序前：");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("自然排序后：");
        Collections.sort(employees);
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("重新添加元素：");
        employees.clear();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("客户化排序后：");
        employees.sort(new EmployeeComparator());
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
