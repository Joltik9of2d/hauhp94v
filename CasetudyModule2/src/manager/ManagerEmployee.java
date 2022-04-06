package manager;

import common.FuncWriteRead;
import comparator.ComparatorByIdCustomer;
import comparator.ComparatorByIdEmployee;
import comparator.ComparatorByNameCustomer;
import comparator.ComparatorByNameEmployee;
import modle.Customer;
import modle.Employee;
import modle.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ManagerEmployee {
    public static final String PATH_EMPLOYEE_CSV = "D:\\C0321G1_HuynhPhuocHau_Module2\\CasetudyModule2\\src\\data\\employee.csv";
    List<Employee> employeeList = new ArrayList<>();

    public void addEmployee(){
        FuncWriteRead<Employee> funcWriteRead = new FuncWriteRead<>();
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
        funcWriteRead.writeToFile(PATH_EMPLOYEE_CSV, employeeList);

    }
    public void editEmployeeName(){
        FuncWriteRead<Employee> funcWriteRead = new FuncWriteRead<>();
         employeeList= funcWriteRead.readDataFromFile(PATH_EMPLOYEE_CSV);
        System.out.print("Nhập id nhân viên cần sửa: ");
        Scanner scanner = new Scanner(System.in);
        int id = Integer.parseInt(scanner.nextLine());
        if(searchIdEmployee(id)){
            System.out.print("Nhập tên mới cho id "+id+": ");
            String newName = scanner.nextLine();
            for (Employee employee: employeeList){
                if(employee.getIdEmployee()==id){
                    employee.setNameEmployee(newName);
                    System.out.println("Đã đổi tên");
                    System.out.println(employee.toString());
                }
            }
        }
        funcWriteRead.writeToFile(PATH_EMPLOYEE_CSV, employeeList);
    }
    public void earseEmployeeById(){
        FuncWriteRead<Employee> funcWriteRead = new FuncWriteRead<>();
        employeeList = funcWriteRead.readDataFromFile(PATH_EMPLOYEE_CSV);
        System.out.print("Nhập id nhân viên cần xóa: ");
        Scanner scanner = new Scanner(System.in);
        int id = Integer.parseInt(scanner.nextLine());
        if(searchIdEmployee(id)){
            System.out.print("Bạn có chắc chắn muốn xóa? yes or no: ");
            String choose = scanner.nextLine();
            if(choose.equals("yes")){
                for(int i=0;i<employeeList.size();i++){
                    if(employeeList.get(i).getIdEmployee()==id){
                        employeeList.remove(i);
                        System.out.println("Đã xóa id "+id);
                    }
                }
            }else {
                System.out.println("Không xóa!");
            }

        }else {
            System.out.println("Không tìm thấy tên này. ");
        }
        funcWriteRead.writeToFile(PATH_EMPLOYEE_CSV, employeeList);
    }
    public static boolean searchIdEmployee(int id){
        List<Employee> employeeList = new ArrayList<>();
        FuncWriteRead<Employee> funcWriteRead = new FuncWriteRead<>();
        employeeList = funcWriteRead.readDataFromFile(PATH_EMPLOYEE_CSV);
        for(Employee employee: employeeList){
            if(employee.getIdEmployee()==id){
                System.out.println(employee);
                return true;
            }
        }
        System.out.println("Không tìm thấy");
        return false;
    }
    public void searchNameEmployeeToDisplay(String name){
        FuncWriteRead<Employee> funcWriteRead = new FuncWriteRead<>();
        employeeList = funcWriteRead.readDataFromFile(PATH_EMPLOYEE_CSV);
        for(Employee employee: employeeList){
            if(employee.getNameEmployee().equals(name)){
                System.out.println(employee);
            }
        }
    }
    public void displayById(){
        FuncWriteRead<Employee> funcWriteRead = new FuncWriteRead<>();
        System.out.println("Hiển thị danh sách nhân viên (sắp xếp theo id): ");
        employeeList = funcWriteRead.readDataFromFile(PATH_EMPLOYEE_CSV);
        Collections.sort(employeeList,new ComparatorByIdEmployee());
        for (Employee employee : employeeList){
            System.out.println(employee);
        }
    }
    public void displayByName(){
        FuncWriteRead<Employee> funcWriteRead = new FuncWriteRead<>();
        System.out.println("Hiển thị danh sách nhân viên (sắp xếp theo tên): ");
        employeeList = funcWriteRead.readDataFromFile(PATH_EMPLOYEE_CSV);
        Collections.sort(employeeList,new ComparatorByNameEmployee());
        for (Employee employee : employeeList){
            System.out.println(employee);
        }
    }
}
