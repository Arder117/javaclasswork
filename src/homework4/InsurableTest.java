package homework4;

import homework2.employee;
import homework3.Manager;

public class InsurableTest {
    public static void main(String[] args) {
        employee[] employees = new employee[5];
        employees[0] = new employee("1", "emp1", 20, 1000);
        employees[1] = new employee("2", "emp2", 21, 2000);
        employees[2] = new employee("3", "emp3", 22, 3000);
        employees[3] = new employee("4", "emp4", 23, 4000);
        employees[4] = new employee("5", "emp5", 24, 5000);

        for (int i = 0; i < employees.length; i++) {
            int random = (int) (Math.random()*2);
            if (random == 1){
                employees[i] = new Manager(employees[i].getId(), employees[i].getName(),
                        employees[i].getAge(), employees[i].getSalary());
            }
            System.out.println(employees[i].calculatePremium());
        }
    }
}
