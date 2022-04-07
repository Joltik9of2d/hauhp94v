package comparator;

import models.Customer;

import java.util.Comparator;

public class ComparatorByNameCustomer implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        if(o1.getCustomerName().equals(o2.getCustomerName())){
            return o1.getBirthday().compareTo(o2.getBirthday());
        }else {
            return o1.getCustomerName().compareTo(o2.getCustomerName());
        }
    }


}
