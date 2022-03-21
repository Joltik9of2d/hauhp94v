package modle;

import java.time.LocalDate;

public class Employee {
    private String nameEmployee;
    private LocalDate birthday;
    private int identityCardNumber;
    private int phoneNumber;
    private String email;
    private String qualifications;
    private String position;
    private String salary;

    public Employee(String nameEmployee, LocalDate birthday, int identityCardNumber, int phoneNumber, String email, String qualifications, String position, String salary) {
        this.nameEmployee = nameEmployee;
        this.birthday = birthday;
        this.identityCardNumber = identityCardNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.qualifications = qualifications;
        this.position = position;
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
