package manager;

import modle.Employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerEmployee {
    public void addEmployee(){
        List<Employee> employeeList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập id nhân viên: ");
        int idEmployee = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên nhân viên: ");
        String nameEmployee = scanner.nextLine();
        System.out.println("Nhập ngày sinh nhân viên: ");
        System.out.print("Ngày: ");
        int day = Integer.parseInt(scanner.nextLine());
        System.out.print("Tháng: ");
        int month = Integer.parseInt(scanner.nextLine());
        System.out.print("Năm: ");
        int year = Integer.parseInt(scanner.nextLine());
        LocalDate birthday = LocalDate.of(year,month,day);
        System.out.print("Nhập số CMND: ");
        int sCMND = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập số điện thoại: ");
        int phoneNumber = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập email: ");
        String email = scanner.nextLine();
        System.out.print("Nhập trình độ (Trung cấp, Cao đẳng, Đại học và sau đại học) : ");
        String qualifications = scanner.nextLine();
        System.out.print("Nhập vị trí (Lễ tân, phục vụ, chuyên viên, giám sát, quản lý, giám đốc): ");
        String position = scanner.nextLine();
        System.out.print("Nhập mức lương: ");
        double salary =Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập bộ phận làm việc (Sale – Marketing, Hành Chính, Phục vụ, Quản lý): ");
        String workingDepartment = scanner.nextLine();
        Employee employee = new Employee(idEmployee, nameEmployee, birthday, sCMND, phoneNumber, email, qualifications, position, salary, workingDepartment);
        System.out.println(employee.toString());
        employeeList.add(employee);
    }
    public void searchEmployeeById(){
    }
}
