package modle;

import java.time.LocalDate;

public class Customer {
    private String customerName;
    private LocalDate birthday;
    private String genfder;
    private int identityCardNumber;
    private int phoneNumber;
    private String email;
    private String CustomerType;
    private String address;

    public Customer(String customerName, LocalDate birthday, String genfder, int identityCardNumber, int phoneNumber, String email, String customerType, String address) {
        this.customerName = customerName;
        this.birthday = birthday;
        this.genfder = genfder;
        this.identityCardNumber = identityCardNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
        CustomerType = customerType;
        this.address = address;
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

    public String getGenfder() {
        return genfder;
    }

    public void setGenfder(String genfder) {
        this.genfder = genfder;
    }

    public int getIdentityCardNumber() {
        return identityCardNumber;
    }

    public void setIdentityCardNumber(int identityCardNumber) {
        this.identityCardNumber = identityCardNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
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
                "customerName='" + customerName + '\'' +
                ", birthday=" + birthday +
                ", genfder='" + genfder + '\'' +
                ", identityCardNumber=" + identityCardNumber +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", CustomerType='" + CustomerType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
