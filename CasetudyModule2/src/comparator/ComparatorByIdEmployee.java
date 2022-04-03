package comparator;

import modle.Employee;

import java.util.Comparator;

public class ComparatorByIdEmployee implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getIdEmployee()-o2.getIdEmployee();
    }
}
