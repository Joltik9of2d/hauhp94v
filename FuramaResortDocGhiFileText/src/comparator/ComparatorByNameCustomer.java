package comparator;

import libs.ValidateData;
import models.Customer;

import java.util.Comparator;

public class ComparatorByNameCustomer implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        if(o1.getCustomerName().equals(o2.getCustomerName())){
            return ValidateData.stringBirthdayToLocadateBirthday(o1.getBirthday())
                    .compareTo(ValidateData.stringBirthdayToLocadateBirthday(o2.getBirthday()));
        }else {
            return o1.getCustomerName().compareTo(o2.getCustomerName());
        }
    }


}
