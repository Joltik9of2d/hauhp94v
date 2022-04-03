package comparator;

import modle.Employee;

import java.util.Comparator;

public class ComparatorByNameEmployee implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getNameEmployee().compareTo(o2.getNameEmployee());
    }
}