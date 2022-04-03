package modle;

import manager.IdExistException;
import manager.ManagerCustomer;

import java.io.Serializable;
import java.time.LocalDate;

public class Customer implements Comparable<Customer>, Serializable {
    private int idCustomer;
    private String customerName;
    private LocalDate birthday;
    private String gender;
    private long identityCardNumber;
    private long phoneNumber;
    private String email;
    private String CustomerType;
    private String address;

    public Customer(int idCustomer, String customerName, LocalDate birthday, String gender, long identityCardNumber,
                    long phoneNumber, String email, String customerType, String address) throws IdExistException {
        if(ManagerCustomer.searchIdCustomer(idCustomer)){
            throw new IdExistException("id đã tồn tại");
        }else {
            this.idCustomer = idCustomer;
            this.customerName = customerName;
            this.birthday = birthday;
            this.gender = gender;
            this.identityCardNumber = identityCardNumber;
            this.phoneNumber = phoneNumber;
            this.email = email;
            this.CustomerType = customerType;
            this.address = address;
        }

    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getIdentityCardNumber() {
        return identityCardNumber;
    }

    public void setIdentityCardNumber(long identityCardNumber) {
        this.identityCardNumber = identityCardNumber;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustomerType() {
        return CustomerType;
    }

    public void setCustomerType(String customerType) {
        CustomerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "idCustomer=" + idCustomer +
                ", customerName='" + customerName + '\'' +
                ", birthday=" + birthday +
                ", genfder='" + gender + '\'' +
                ", identityCardNumber=" + identityCardNumber +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", CustomerType='" + CustomerType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int compareTo(Customer o) {
        return this.idCustomer - o.idCustomer;
    }
}
