package comparator;

import models.Customer;

import java.util.Comparator;

public class ComparatorByNamCustomer implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.getCustomerName().compareTo(o2.getCustomerName());
    }
}
