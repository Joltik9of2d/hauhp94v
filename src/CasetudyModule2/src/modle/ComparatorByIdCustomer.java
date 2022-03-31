package modle;

import java.util.Comparator;

public class ComparatorByIdCustomer implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.getIdCustomer()-o2.getIdCustomer();
    }
}
