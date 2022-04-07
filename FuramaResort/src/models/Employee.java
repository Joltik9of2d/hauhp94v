package models;

import java.io.Serializable;
import java.time.LocalDate;

public class Employee implements Serializable {
    private String idEmployee;
    private String nameEmployee;
    private LocalDate birthday;
    private String identityCardNumber;
    private String phoneNumber;
    private String email;
    private String qualifications;
    private String position;
    private Double salary;
    private String workingDepartment;

    public Employee() {
    }

    public Employee(String idEmployee,String nameEmployee, LocalDate birthday, String identityCardNumber, String phoneNumber, 
                    String email, String qualifications, String position, Double salary, String workingDepartment) {
        this.idEmployee=idEmployee;
        this.nameEmployee = nameEmployee;
        this.birthday = birthday;
        this.identityCardNumber = identityCardNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.qualifications = qualifications;
        this.position = position;
        this.salary = salary;
        this.workingDepartment = workingDepartment;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "idEmployee=" + idEmployee +
                ", nameEmployee='" + nameEmployee + '\'' +
                ", birthday=" + birthday +
                ", identityCardNumber='" + identityCardNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", qualifications='" + qualifications + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", workingDepartment='" + workingDepartment + '\'' +
                '}';
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
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

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getWorkingDepartment() {
        return workingDepartment;
    }

    public void setWorkingDepartment(String workingDepartment) {
        this.workingDepartment = workingDepartment;
    }
}
