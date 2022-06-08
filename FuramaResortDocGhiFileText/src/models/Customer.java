package models;

import java.io.Serializable;
import java.time.LocalDate;

public class Customer implements Serializable {
    private String idCustomer;
    private String customerName;
    private LocalDate birthday;
    private String gender;
    private String identityCardNumber;
    private String phoneNumber;
    private String email;
    private String CustomerType;
    private String address;
    Services serviceOfCustomer;

    public Customer() {
    }

    public Customer(String idCustomer, String customerName) {
        this.idCustomer = idCustomer;
        this.customerName = customerName;
    }

    public Customer(String idCustomer, String customerName, LocalDate birthday, String gender,
                    String identityCardNumber, String phoneNumber,
                    String email, String customerType, String address, Services serviceOfCustomer) {
        this.idCustomer = idCustomer;
        this.customerName = customerName;
        this.birthday = birthday;
        this.gender = gender;
        this.identityCardNumber = identityCardNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
        CustomerType = customerType;
        this.address = address;
        this.serviceOfCustomer = serviceOfCustomer;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
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

    public String getIdentityCardNumber() {
        return identityCardNumber;
    }

    public void setIdentityCardNumber(String identityCardNumber) {
        this.identityCardNumber = identityCardNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
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

    public Services getServiceOfCustomer() {
        return serviceOfCustomer;
    }

    public void setServiceOfCustomer(Services serviceOfCustomer) {
        this.serviceOfCustomer = serviceOfCustomer;
    }

    public String showInfor() {
        return "Customer{" +
                "idCustomer=" + idCustomer +
                ", customerName='" + customerName + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                ", identityCardNumber=" + identityCardNumber +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", CustomerType='" + CustomerType + '\'' +
                ", address='" + address + '\'' +
                ", serviceOfCustomer=" + serviceOfCustomer +
                '}';
    }
    public String showInforServiceNull() {
        return "Customer{" +
                "idCustomer=" + idCustomer +
                ", customerName='" + customerName + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                ", identityCardNumber=" + identityCardNumber +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", CustomerType='" + CustomerType + '\'' +
                ", address='" + address + '\'' +
                ", serviceOfCustomer=" + "Chưa đặt dịch vụ" +
                '}';
    }

    @Override
    public String toString() {
        return idCustomer +
                "," + customerName +
                "," + birthday +
                "," + gender +
                "," + identityCardNumber +
                "," + phoneNumber +
                "," + email +
                "," + CustomerType +
                "," + address +
                "," + serviceOfCustomer;
    }
}
