package manager;

import modle.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerEmployee {
    List<Employee> employeeList = new ArrayList<>();
    public void addEmployee(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập id nhân viên: ");
        int idEmployee = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên nhân viên: ");

    }
}
