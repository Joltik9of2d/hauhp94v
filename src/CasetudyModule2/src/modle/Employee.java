package modle;

import java.time.LocalDate;

public class Employee {
    private int idEmployee;
    private String nameEmployee;
    private LocalDate birthday;
    private int identityCardNumber;
    private int phoneNumber;
    private String email;
    private String qualifications;
    private String position;
    private String salary;

    public Employee(int idEmployee, String nameEmployee, LocalDate birthday, int identityCardNumber, int phoneNumber, String email, String qualifications, String position, String salary) {
        this.idEmployee = idEmployee;
        this.nameEmployee = nameEmployee;
        this.birthday = birthday;
        this.identityCardNumber = identityCardNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.qualifications = qualifications;
        this.position = position;
        this.salary = salary;
    }

    public Employee() {
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

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "nameEmployee='" + nameEmployee + '\'' +
                ", birthday=" + birthday +
                ", identityCardNumber=" + identityCardNumber +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", qualifications='" + qualifications + '\'' +
                ", position='" + position + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
