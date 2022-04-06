package comparator;

import models.Customer;

import java.util.Comparator;

public class ComparatorByBirthdayCustomer implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.getBirthday().compareTo(o2.getBirthday());
    }
}
