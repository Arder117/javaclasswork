package experiment8;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getName().compareTo(o2.getName()) > 0)
            return -1;
        else if (o1.getName().compareTo(o2.getName()) < 0)
            return 1;
        else if (o1.getBirthday().getYear() > o2.getBirthday().getYear())
            return 1;
        else if (o1.getBirthday().getYear() < o2.getBirthday().getYear())
            return -1;
        else if (o1.getBirthday().getMonth() > o2.getBirthday().getMonth())
            return 1;
        else if (o1.getBirthday().getMonth() < o2.getBirthday().getMonth())
            return -1;
        else return Integer.compare(o1.getBirthday().getDay(), o2.getBirthday().getDay());
    }
}
