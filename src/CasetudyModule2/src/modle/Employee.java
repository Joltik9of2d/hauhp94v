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
    private Double salary;
    private String workingDepartment;

    public Employee(int idEmployee, String nameEmployee, LocalDate birthday, int identityCardNumber, int phoneNumber, String email, String qualifications, String position, Double salary, String workingDepartment) {
        this.idEmployee = idEmployee;
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

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
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

    @Override
    public String toString() {
        return "Employee{" +
                "idEmployee=" + idEmployee +
                ", nameEmployee='" + nameEmployee + '\'' +
                ", birthday=" + birthday +
                ", identityCardNumber=" + identityCardNumber +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", qualifications='" + qualifications + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", workingDepartment='" + workingDepartment + '\'' +
                '}';
    }
}
